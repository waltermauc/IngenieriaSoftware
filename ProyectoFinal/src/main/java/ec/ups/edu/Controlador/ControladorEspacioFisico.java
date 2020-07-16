/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;
import ec.ups.edu.Modelo.EspacioFisico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rayner
 */
public class ControladorEspacioFisico {
    private Conexion c;
    
    public ControladorEspacioFisico(Conexion c){
        this.c = c;
    }

    public ControladorEspacioFisico() {
    }
    
    public String crearEspacioFisico (EspacioFisico espacio){
        String res = "";
        try {
            String sqlEst = "INSERT INTO ESPACIOFISICO"
                    + "(ESPACIOFISICO_ID, ESPACIOFISICO_NUMEROAULA, ESPACIOFISICO_EDIFICIO) "
                    + "VALUES (?,?,?)";
            PreparedStatement consultaEst = c.conectado().prepareStatement(sqlEst);
            consultaEst.setInt(1, espacio.getCodigoEspacioFisico());
            consultaEst.setInt(2, espacio.getNumeroDesignadoAula());
            consultaEst.setString(3, espacio.getNombreEdificio());
            consultaEst.executeUpdate();
            res = " ESPACIO FISICO CREADA";
        } catch (Exception e) {
            res = "ERROR";
            c.desconectar();
        }
        return res;
    }
    public String editarEspacioFisico(EspacioFisico espacioFisico, int codigo) {
        String res = "";
        String sql = "UPDATE ESPACIOFISICO"
                + " SET ESPACIOFISICO_ID = " + " ' " + espacioFisico.getCodigoEspacioFisico()+ " ' " + ","
                + "  ESPACIOFISICO_NUMEROAULA =" + " ' " + espacioFisico.getNumeroDesignadoAula()+ " ' " + ","
                + "  ESPACIOFISICO_EDIFICIO =  " + " ' " + espacioFisico.getNombreEdificio()+ " ' " + ","
                + "WHERE ESPACIOFISICO_ID =" + " ' " + codigo + " ' ";
        try {
            PreparedStatement ps;
            ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "ESPACIO FISICO EDITADO";
        } catch (Exception ex) {
            res = "ERROR ";
            c.desconectar();
        }
        return res;
    }

    public String eliminarEspacioFisico(int codigo) {
        String res = "";
        String sql = "DELETE FROM ESPACIOFISICO"
                + " WHERE ESPACIOFISICO_ID = " + "'" + codigo + "'";
        try {
            PreparedStatement ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "ESPACIO FISICO ELIMINADA";
        } catch (Exception ex) {
            res = " ERROR ";
            c.desconectar();
        }
        return res;
    }

    public List<EspacioFisico> listarEspacioFisico() {
        List<EspacioFisico> espacioList = new ArrayList<>();
        String sql = "SELECT ESPACIOFISICO_ID,"
                + "ESPACIOFISICO_NUMEROAULA, "
                + "ESPACIOFISICO_EDIFICIO,"
                + " FROM ESPACIOFISICO";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                EspacioFisico espacioF = new EspacioFisico();
                espacioF.setCodigoEspacioFisico(resultado.getInt("ESPACIOFISICO_ID".trim()));
                espacioF.setNumeroDesignadoAula(resultado.getInt("ESPACIOFISICO_NUMEROAULA".trim()));
                espacioF.setNombreEdificio(resultado.getString("ESPACIOFISICO_EDIFICIO".trim()));
                espacioList.add(espacioF);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            c.desconectar();

        }
        return espacioList;
    }
    public EspacioFisico buscaEspacioFisico (int codigo){
         EspacioFisico espacioFisico = new EspacioFisico();

        String sql = "SELECT * from ESPACIOFISICO"
                + "WHERE ESPACIOFISICO_ID = " + "'" + codigo + "'";
         try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

                espacioFisico.setCodigoEspacioFisico(resultado.getInt("ESPACIOFISICO_ID".trim()));
                espacioFisico.setNumeroDesignadoAula(resultado.getInt("ESPACIOFISICO_NUMEROAULA".trim()));
                espacioFisico.setNombreEdificio(resultado.getString("ESPACIOFISICO_EDIFICIO".trim()));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            c.desconectar();
        }
        return espacioFisico;
    }
}
