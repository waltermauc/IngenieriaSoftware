/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;
import ec.ups.edu.Modelo.EspacioFisico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    public String editarEspacioFisico(EspacioFisico espacioFisico, int nombre) {
        String res = "";
        String sql = "UPDATE ESPACIOFISICO"
                + " SET ESPACIOFISICO_ID = " + " ' " + espacioFisico.getCodigoEspacioFisico()+ " ' " + ","
                + "  ESPACIOFISICO_NUMEROAULA =" + " ' " + espacioFisico.getNumeroDesignadoAula()+ " ' " + ","
                + "  ESPACIOFISICO_EDIFICIO =  " + " ' " + espacioFisico.getNombreEdificio()+ " ' " + ","
                + " WHERE ESPACIOFISICO_ID =" + " ' " + nombre + " ' ";
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
        String sql = "SELECT * FROM proyecto_final.espaciofisico;";
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
    public EspacioFisico buscaEspacioFisico (int nombre){
         EspacioFisico espacioFisico = new EspacioFisico();

        String sql = "SELECT * from ESPACIOFISICO"
                + " WHERE ESPACIOFISICO_ID = " + "'" + nombre + "'";
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
    public int obtenerCodigo() {
        int n = 0;
        String sql = "select max(ESPACIOFISICO_ID) as Codigo from espaciofisico;";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                n = resultado.getInt("Codigo".trim());
            }

        } catch (Exception e) {

        }
        return n;
    }
    
   public String obtenerNombreEdificio(String d){
       String nombre = "";
        String sql = "select ESPACIOFISICO_EDIFICIO as nombre from espaciofisico where ESPACIOFISICO_EDIFICIO LIKE  " + "'" + d + "'";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                nombre = resultado.getString("Nombre".trim());
            }

        } catch (SQLException e) {
              
        }
        return nombre;
   }
    public int obtenerCodigoEdifico(String d) {
        int n = 0;
        String sql = "select ESPACIOFISICO_EDIFICIO as nombre from espaciofisico where ESPACIOFISICO_EDIFICIO LIKE  " + "'" + d + "'";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                n = resultado.getInt("Codigo".trim());
            }

        } catch (Exception e) {

        }
        return n;
    }
}
