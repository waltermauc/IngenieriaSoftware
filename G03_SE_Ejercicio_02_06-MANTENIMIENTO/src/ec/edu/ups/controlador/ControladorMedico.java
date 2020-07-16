/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

/**
 *
 * @author rober
 */
import com.mysql.jdbc.PreparedStatement;
import ec.edu.ups.modelo.Medico;
import java.sql.Date;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class ControladorMedico {

    private Conexion con = new Conexion();

    public String crearMedico(Medico personaMedico) {

        String sql = "INSERT INTO `medico` (`especialidad`, `numeroConsultorio`, "
                + "`contrasenia`, `codigoPersona`, `cedula`, `nombre`, `apellido`, "
                + "`direccion`, `correo`, `fechaNacimiento`, `sexo`) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        try {
            java.sql.PreparedStatement preparacionBase = con.conexion().prepareStatement(sql);
            preparacionBase.setString(1, personaMedico.getEspecialidad());
            preparacionBase.setString(2, personaMedico.getNumeroConsultorio());
            preparacionBase.setString(3, personaMedico.getContrasena());
            preparacionBase.setInt(4, personaMedico.getCodigoPersona());
            preparacionBase.setString(5, personaMedico.getCedula());
            preparacionBase.setString(6, personaMedico.getNombres());
            preparacionBase.setString(7, personaMedico.getApellidos());
            preparacionBase.setString(8, personaMedico.getDireccion());
            preparacionBase.setString(9, personaMedico.getCorreo());
            preparacionBase.setDate(10, (java.sql.Date) personaMedico.getFechaNacimiento());
            preparacionBase.setString(11, personaMedico.getSexo());
            preparacionBase.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return ("medicoCreado");
    }

    public String borrarMedico(String cedula) {

        String sql = "DELETE FROM MEDICO"
                + " WHERE CEDULA = " + "'" + cedula + "'";
        try {
            java.sql.PreparedStatement preparacionBase = con.conexion().prepareStatement(sql);
            preparacionBase.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return ("medicoEliminado");
    }

    public String actualizar(Medico actualizarMedico, String cedula) {

        String sql = "UPDATE `medico` "
                + "SET `especialidad`= " + " ' " + actualizarMedico.getEspecialidad() + " ' " + ","
                + "`numeroConsultorio` = " + " ' " + actualizarMedico.getNumeroConsultorio() + " ' " + ","
                + "`contrasenia` = " + " ' " + actualizarMedico.getContrasena() + " ' " + ","
                + "`codigoPersona` = " + actualizarMedico.getCodigoPersona() + ","
                + "`cedula` = " + " '" + actualizarMedico.getCedula() + "' " + ","
                + "`nombre` = " + " ' " + actualizarMedico.getNombres() + " ' " + ","
                + "`apellido` = " + " ' " + actualizarMedico.getApellidos() + " ' " + ","
                + "`direccion` = " + " ' " + actualizarMedico.getDireccion() + " ' " + ","
                + "`correo` = " + " ' " + actualizarMedico.getCorreo() + " ' " + ","
                + "`fechaNacimiento` = " + " ' " + actualizarMedico.getFechaNacimiento() + " ' " + ","
                + "`sexo`= " + " ' " + actualizarMedico.getSexo() + " ' "
                + " WHERE CEDULA = " + "'" + cedula + "'";

        try {
            java.sql.PreparedStatement preparacionBase = con.conexion().prepareStatement(sql);
            preparacionBase.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return ("medicoActualizado");
    }

    public String buscar(String cedula) {
        String sql = "SELECT * FROM `medico` WHERE CEDULA = " + "'" + cedula + "'";
        Medico m = new Medico();
        try {
            java.sql.PreparedStatement preparacionBase = con.conexion().prepareStatement(sql);
            ResultSet resultado = preparacionBase.executeQuery();
            while (resultado.next()) {

                m.setEspecialidad(resultado.getString("especialidad".trim()));
                m.setNumeroConsultorio(resultado.getString("numeroConsultorio".trim()));
                m.setContrasena(resultado.getString("contrasenia".trim()));
                m.setCodigoPersona(resultado.getInt("codigoPersona".trim()));
                m.setCedula(resultado.getString("cedula".trim()));
                m.setNombres(resultado.getString("nombre".trim()));
                m.setApellidos(resultado.getString("apellido".trim()));
                m.setDireccion(resultado.getString("direccion".trim()));
                m.setCorreo(resultado.getString("correo".trim()));
                m.setFechaNacimiento(resultado.getDate("fechaNacimiento"));
                m.setSexo(resultado.getString("sexo".trim()));

            }
            System.out.println(m.getNombres() + " " + m.getApellidos() + "" + m.getEspecialidad()+""+m.getCorreo());

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return ("persona");

    }

}
