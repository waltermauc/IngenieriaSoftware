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
            String sql = "INSERT INTO `proyecto_final`.`asignatura`"
                    + "(`ASIGNATURA_ID`,"
                    + "`ASIGNATURA_DESCRIPCION`,"
                    + "`ASIGNATURA_NIVELASIGNATURA`,"
                    + "`ASIGNATURA_COSTO`)"
                    + "VALUES (?,?,?,?)";
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setInt(1, asignatura.getCodigoAsignatura());
            consulta.setString(2, asignatura.getDescripcion());
            consulta.setInt(3, asignatura.getCodigoNivelAsignatura().getCodigoNivelAsignatura());
            consulta.setDouble(4, asignatura.getCostoCreditos());
            consulta.executeUpdate();
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
                + "  ASIGNATURA_NIVELASIGNATURA =  " + " ' " +  asignatura.getCodigoNivelAsignatura() + " ' " + ","
                + "  ASIGNATURA_COSTO = " + " ' " + asignatura.getCostoCreditos() + " ' "
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
        String sql = "SELECT * FROM proyecto_final.asignatura;";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {

                Asignatura asignature = new Asignatura();
                asignature.setCodigoAsignatura(resultado.getInt("ASIGNATURA_ID".trim()));
                asignature.setDescripcion(resultado.getString("ASIGNATURA_DESCRIPCION".trim()));
                asignature.setCostoCreditos(resultado.getInt("ASIGNATURA_COSTO".trim()));
                asignaturaList.add(asignature);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            c.desconectar();

        }
        return asignaturaList;
    }

    public Asignatura buscarAsignatura(int codigo, ControladorNivelAsignatura controladorNivelAsignatura) {
        Asignatura asignature = new Asignatura();
        String sql = "SELECT * FROM proyecto_final.asignatura"
                + "WHERE ASIGNATURA_ID = " + "'" + codigo + "'";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

                asignature.setCodigoAsignatura(resultado.getInt("ASIGNATURA_ID".trim()));
                asignature.setDescripcion(resultado.getString("ASIGNATURA_DESCRIPCION".trim()));
                int codigoNivelAsignatura = resultado.getInt("ASIGNATURA_NIVELASIGNATURA".trim());
                NivelAsignatura nivelAsig = controladorNivelAsignatura.buscarAsignatura(codigoNivelAsignatura);
                asignature.setCodigoNivelAsignatura(nivelAsig);
                asignature.setCostoCreditos(resultado.getDouble("ASIGNATURA_COSTO".trim()));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            c.desconectar();
            return null;
        }
        return asignature;
    }

    public int obtenerCodigo() {
        int n = 0;
        String sql = "select max(asignatura_id) as Codigo from ASIGNATURA;";
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
