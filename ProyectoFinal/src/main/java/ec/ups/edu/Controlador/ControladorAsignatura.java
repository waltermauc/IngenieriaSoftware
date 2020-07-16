/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Asignatura;
import ec.ups.edu.Modelo.NivelAsignatura;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rayner
 */
public class ControladorAsignatura {

    private Conexion c;

    public ControladorAsignatura(Conexion c) {
         this.c = c;

    }

    public ControladorAsignatura() {
    }

    public String crearAsignatura(Asignatura asignatura) {
        String res = "";
        try {
            String sqlEst = "INSERT INTO ASIGNATURA"
                    + "(ASIGNATURA_ID, ASIGNATURA_DESCRIPCION, COSTO_CREDITOS, ASIGNATURA_NIVELASIGNATURA) "
                    + "VALUES (?,?,?,?)";
            PreparedStatement consultaEst = c.conectado().prepareStatement(sqlEst);
            consultaEst.setInt(1, asignatura.getCodigoAsignatura());
            consultaEst.setString(2, asignatura.getDescripcion());
            consultaEst.setInt(3, asignatura.getCostoCreditos());
            consultaEst.setInt(4, asignatura.getCodigoNivelAsignatura().getCodigoNivelAsignatura());
            consultaEst.executeUpdate();
            res = " ASIGNATURA CREADA";

        } catch (Exception e) {
            res = "ERROR";
            c.desconectar();
        }
        return res;

    }

    public String editarAsignatura(Asignatura asignatura, int codigo) {
        String res = "";
        String sql = "UPDATE ASIGNATURA"
                + " SET ASIGNATURA_ID = " + " ' " + asignatura.getCodigoAsignatura() + " ' " + ","
                + "  ASIGNATURA_DESCRIPCION =" + " ' " + asignatura.getDescripcion() + " ' " + ","
                + "  COSTO_CREDITOS =  " + " ' " + asignatura.getCostoCreditos() + " ' " + ","
                + "  ASIGNATURA_NIVELASIGNATURA = " + " ' " + asignatura.getCodigoNivelAsignatura() + " ' " 
                + "WHERE ASIGNATURA_ID =" + " ' " + codigo + " ' ";
        try {

            PreparedStatement ps;
            ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "ASIGNATURA EDITADA";

        } catch (Exception ex) {
            res = "ERROR ";
            c.desconectar();
        }

        return res;

    }

    public String eliminarAsignatura(int codigo) {
        String res = "";
        String sql = "DELETE FROM ASIGNATURA"
                + " WHERE ASIGNATURA_ID = " + "'" + codigo + "'";
        try {

            PreparedStatement ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "ASGINATURA ELIMINADA";
        } catch (Exception ex) {
            res = " ERROR ";
            c.desconectar();
        }

        return res;
    }

    public List<Asignatura> listarAsignatura() {
        List<Asignatura> asignaturaList = new ArrayList<>();
        String sql = "SELECT ASIGNATURA_ID,"
                + "ASIGNATURA_DESCRIPCION,"
                + "COSTO_CREDITOS, "
                + "ASIGNATURA_NIVELASIGNATURA,"
                + " FROM ASIGNATURA";

        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

                Asignatura asignature = new Asignatura();
                asignature.setCodigoAsignatura(resultado.getInt("ASIGNATURA_ID".trim()));
                asignature.setDescripcion(resultado.getString("ASIGNATURA_DESCRIPCION".trim()));
                asignature.setCostoCreditos(resultado.getInt("COSTO_CREDITOS".trim()));
                asignaturaList.add(asignature);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            c.desconectar();

        }

        return asignaturaList;

    }
    public String buscarAsignatura (int codigo){
        
        String sql = "SELECT ASIGNATURA_ID,"
                + " ASIGNATURA_DESCRIPCION,"
                + "COSTO_CREDITO, "
                + "ASIGNATURA_NIVELASIGNATURA "
                + "from ASIGNATURA"
                + "WHERE ASIGNATURA_ID = " + "'" + codigo + "'";
         try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

                Asignatura asignature = new Asignatura();
                asignature.setCodigoAsignatura(resultado.getInt("ASIGNATURA_ID".trim()));
                asignature.setDescripcion(resultado.getString("ASIGNATURA_DESCRIPCION".trim()));
                asignature.setCostoCreditos(resultado.getInt("COSTO_CREDITOS".trim()));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            c.desconectar();

        }
        return "";
    }
}
