/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Modalidad;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author rayner
 */
public class ControladorModalidad {

    private Conexion c;

    public ControladorModalidad() {
        c = new Conexion();

    }

    public String crearModalidadCarrera(Modalidad modalidad) {
        String res = "";
        try {
            String sql = "INSERT INTO ASIGNATURA(MODALIDAD_ID, MODALIDAD_DESCRIPCION)VALUES (?,?)";
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consultaEst.setInt(1, modalidad.getCodigoModalidad());
            consultaEst.setString(2, modalidad.getDescripcionModalidad());
            consultaEst.executeUpdate();
            res = " MODALIDAD CREADA";

        } catch (Exception e) {
            res = "ERROR";
            c.desconectar();
        }
        return res;

    }

    public String editarModalidadCarrera(int codigo, Modalidad modalidad) {
        Strin sql 

    }

    public Modalidad buscar() {

    }

    public String eliminarModalidadCarrera(int codigo) {

    }

    public List<Modalidad> listarModalidadCarrera() {

    }
}
