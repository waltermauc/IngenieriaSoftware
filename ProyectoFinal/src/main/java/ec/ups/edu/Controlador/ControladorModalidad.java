/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Modalidad;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rayner
 */
public class ControladorModalidad {

    private Conexion c;

    public ControladorModalidad(Conexion c) {
        this.c = c;

    }

    public ControladorModalidad() {

    }

    public String crearModalidadCarrera(Modalidad modalidad) {
        String res = "";
        try {
            String sql = "INSERT INTO MODALIDAD(MODALIDAD_ID, MODALIDAD_DESCRIPCION)VALUES (?,?)";
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setInt(1, modalidad.getCodigoModalidad());
            consulta.setString(2, modalidad.getDescripcionModalidad());
            consulta.executeUpdate();
            res = " MODALIDAD CREADA";

        } catch (Exception e) {
            res = "ERROR";
            c.desconectar();
        }
        return res;

    }

    public String editarModalidadCarrera(int codigo, Modalidad modalidad) {
        String res = "";
        String sql = "UPDATE ASIGNATURA"
                + " SET MODALIDAD_ID = " + " ' " + modalidad.getCodigoModalidad() + " ' " + ","
                + "  MODALIDAD_DESCRIPCION =" + " ' " + modalidad.getDescripcionModalidad() + " ' "
                + "WHERE MODALIDAD_ID =" + " ' " + codigo + " ' ";
        try {

            PreparedStatement ps;
            ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "MODALIDAD EDITADA";

        } catch (Exception ex) {
            res = "ERROR ";
            c.desconectar();
        }

        return res;

    }

    public Modalidad buscarModalidad(int codigo) {
        Modalidad modalidad = new Modalidad();

        String sql = "SELECT * FROM proyecto_final.modalidad"
                + "WHERE MODALIDAD_ID =" + " ' " + codigo + " ' ";

        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                modalidad.setCodigoModalidad(resultado.getInt("MODALIDAD_ID".trim()));
                modalidad.setDescripcionModalidad(resultado.getString("MODALIDAD_DESCRIPCION".trim()));
            }

        } catch (Exception e) {
            c.desconectar();
            return null;
        }
        return modalidad;
    }

    public String eliminarModalidadCarrera(int codigo) {
        String res = "";
        String sql = "DELETE FROM MODALIDAD "
                + " WHERE MODALIDAD_ID = " + "'" + codigo + "'";
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

    public List<Modalidad> listarModalidadCarrera() {
        List<Modalidad> listModalidad = new ArrayList<>();
        String sql = "SELECT * FROM proyecto_final.modalidad;";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                Modalidad modalidad = new Modalidad();
                modalidad.setCodigoModalidad(resultado.getInt("MODALIDAD_ID".trim()));
                modalidad.setDescripcionModalidad(resultado.getString("MODALIDAD_DESCRIPCION".trim()));
                listModalidad.add(modalidad);
            }

        } catch (Exception e) {
            c.desconectar();
            return null;
        }
        return listModalidad;
    }
}
