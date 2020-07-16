/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Especialidad;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class ControladorEspecialidad {
    private Conexion c ;

    public ControladorEspecialidad(Conexion c) {
        this.c = c;
    }

    public ControladorEspecialidad() {
    }
    

    public String crearEspecialidad(Especialidad especialidad) {
        String res = "";
        try {
            String sql = "INSERT INTO proyecto_final.especialidad(MODALIDAD_ID, MODALIDAD_DESCRIPCION)VALUES (?,?)";
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setInt(1, especialidad.getCodigo());
            consulta.setString(2, especialidad.getDescripcion());
            consulta.executeUpdate();
            res = "ESPECILIADAD CREADA";

        } catch (Exception e) {
            res = "ERROR";
            c.desconectar();
        }
        return res;
    }

    public String modificarEspecialidad(int codigo, Especialidad especialidad) {
        String res = "";
        String sql = "UPDATE  proyecto_final.especialidad"
                + " SET ESPECIALIDAD_ID = " + " ' " + especialidad.getCodigo() + " ' " + ","
                + "  ESPECIALIDAD_DESCRIPCION =" + " ' " + especialidad.getDescripcion() + " ' "
                + "WHERE ESPECIALIDAD_ID  =" + " ' " + codigo + " ' ";
        try {

            PreparedStatement ps;
            ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "ESPECIALIDAD EDITADA";

        } catch (Exception ex) {
            res = "ERROR ";
            c.desconectar();
        }

        return res;

    }

    public List<Especialidad> listarEspecialidad() {
         List<Especialidad> listPeriodoLectivo = new ArrayList<>();
        String sql = "SELECT * FROM proyecto_final.modalidad;";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                Especialidad especialidad = new Especialidad();
                especialidad.setCodigo(resultado.getInt("MODALIDAD_ID".trim()));
                especialidad.setDescripcion(resultado.getString("MODALIDAD_DESCRIPCION".trim()));
                listPeriodoLectivo.add(especialidad);
            }

        } catch (Exception e) {
            c.desconectar();
            return null;
        }
        return listPeriodoLectivo;

    }

      public Especialidad buscarEspecialidad(int codigo) {
        Especialidad especialidad = new Especialidad();
        String sql = "SELECT * FROM proyecto_final.especialidad;";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                especialidad.setCodigo(resultado.getInt("ESPECIALIDAD_ID".trim()));
                especialidad.setDescripcion(resultado.getString("ESPECIALIDAD_DESCRIPCION ".trim()));
            }

        } catch (Exception e) {
            c.desconectar();
            return null;
        }
        return especialidad;
    }

}
