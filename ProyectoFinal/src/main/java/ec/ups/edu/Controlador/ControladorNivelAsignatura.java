/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.NivelAsignatura;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rayner
 */
public class ControladorNivelAsignatura {
     
        private Conexion c;

    public ControladorNivelAsignatura(Conexion c){
        this.c = c;
    }
       
    public String crearNivelAsignatura (NivelAsignatura nivelAsignatura){
       
          String res = "";
        try {
            String sqlEst = "INSERT INTO NIVELASIGNATURA"
                    + "(NIVELASIGNATURA_ID, NIVELASIGNATURA_DESCRIPCION) "
                    + "VALUES (?,?)";
            PreparedStatement consultaEst = c.conectado().prepareStatement(sqlEst);
            consultaEst.setInt(1, nivelAsignatura.getCodigoNivelAsignatura());
            consultaEst.setString(2, nivelAsignatura.getDescripcionNivelAsignatura());
           
            consultaEst.executeUpdate();
            res = "NIVEL ASIGNATURA CREADA";

        } catch (Exception e) {
            res = "ERROR";
            c.desconectar();
    }
        
        return "";
    }
     public String editarNivelAsignatura (NivelAsignatura nivelAsignature,int codigo){
        String res = "";
        String sql = "UPDATE NIVELASIGNATURA"
                + " SET NIVELASIGNATURA_ID = " + " ' " + nivelAsignature.getCodigoNivelAsignatura()+ " ' " + ","
                + "  NIVELASIGNATURA_DESCRIPCION =" + " ' " + nivelAsignature.getDescripcionNivelAsignatura()+ " ' " + ","
                + "WHERE NIVELASIGNATURA_ID =" + " ' " + codigo + " ' ";
        try {

            PreparedStatement ps;
            ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "NIVEL ASIGNATURA EDITADA";

        } catch (Exception ex) {
            res = "ERROR ";
            c.desconectar();
        }

        return res;
    }
     
     
      public String eliminarAsignatura(int codigo) {
        String res = "";
        String sql = "DELETE FROM NIVELASIGNATURA"
                + " WHERE NIVELASIGNATURA_ID = " + "'" + codigo + "'";
        try {

            PreparedStatement ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "NIVEL ASIGNATURA ELIMINADA";
        } catch (Exception ex) {
            res = " ERROR ";
            c.desconectar();
        }

        return res;
    }

    public List<NivelAsignatura> listarAsignatura() {
        List<NivelAsignatura> asignaturaList = new ArrayList<>();
        String sql = "SELECT NIVELASIGNATURA_ID,"
                + "NIVELASIGNATURA_DESCRIPCION,"
                + " FROM NIVELASIGNATURA";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {

                NivelAsignatura asignature = new NivelAsignatura();
                asignature.setCodigoNivelAsignatura(resultado.getInt("NIVELASIGNATURA_ID".trim()));
                asignature.setDescripcionNivelAsignatura(resultado.getString("NIVELASIGNATURA_DESCRIPCION".trim()));
                asignaturaList.add(asignature);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            c.desconectar();
        }

        return asignaturaList;

    }
    
    public String buscarAsignatura (int codigo){
        
        String sql = "SELECT NIVELASIGNATURA_ID,"
                + " NIVELASIGNATURA_DESCRIPCION,"
                + "FROM NIVELASIGNATURA"
                + "WHERE NIVELASIGNATURA_ID = " + "'" + codigo + "'";
         try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {

                NivelAsignatura asignature = new NivelAsignatura();
                asignature.setCodigoNivelAsignatura(resultado.getInt("NIVELASIGNATURA_ID".trim()));
                asignature.setDescripcionNivelAsignatura(resultado.getString("NIVELASIGNATURA_DESCRIPCION".trim()));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            c.desconectar();

        }
        return "";
    }
}
