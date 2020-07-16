/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Calificacion;
import ec.ups.edu.Modelo.Estudiante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 59396
 */
public class ControladorEstudiante {

    private Conexion c;

    public ControladorEstudiante(Conexion c) {
        this.c = c;

    }

    public ControladorEstudiante() {

    }

    public String crearEstudiante(Estudiante es) {
        String res = " ";
        String sql = "INSERT INTO `proyecto_final`.`persona`"
                + "(`PERSONA_ID`,"
                + "`PERSONA_NOMBRE`,"
                + "`PERSONA_APELLIDO`,"
                + "`PERSONA_DIRECCION`,"
                + "`PERSONA_CORREO`,"
                + "`PERSONA_CELULAR`,"
                + "`PERSONA_SEXO`,"
                + "`PERSONA_FECHANACIMIENTO`)"
                + "VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setString(1, es.getCedula());
            consulta.setString(2, es.getNombre());
            consulta.setString(3, es.getApellido());
            consulta.setString(4, es.getDireccion());
            consulta.setString(5, es.getCorreo());
            consulta.setInt(6, es.getTelefono());
            consulta.setString(7, es.getSexo());
            consulta.setDate(8, (java.sql.Date) es.getFechaNacimiento());
            if (consulta.executeUpdate() == 1) {
                String sqlEst = "INSERT INTO `proyecto_final`.`estudiante`"
                        + "(`ESTUDIANTE_ID`,"
                        + "`ESTUDIANTE_INSCRIPCION`,"
                        + "`ESTUDIANTE_PERSONA`) VALUES (?,?,?)";
                PreparedStatement consultaEst = c.conectado().prepareStatement(sqlEst);
                consultaEst.setInt(1, es.getCodigo());
                consultaEst.setDate(2, (java.sql.Date) es.getInscripcion());
                consultaEst.setString(3, es.getCedula());
                consultaEst.executeUpdate();
                res = "ESTUDIANTE CREADO";
            }
        } catch (Exception e) {
            c.desconectar();
            res = "ERROR";
        }
        return res;
    }

    public Estudiante buscarEstudiante(String codigo) {

        Estudiante estudiante = new Estudiante();
        String sql = "SELECT `persona`.`PERSONA_ID`,"
                + "    `persona`.`PERSONA_NOMBRE`,"
                + "    `persona`.`PERSONA_APELLIDO`,"
                + "    `persona`.`PERSONA_DIRECCION`,"
                + "    `persona`.`PERSONA_CORREO`,"
                + "    `persona`.`PERSONA_CELULAR`,"
                + "    `persona`.`PERSONA_SEXO`,"
                + "    `persona`.`PERSONA_FECHANACIMIENTO`"
                + "FROM `proyecto_final`.`persona`,`proyecto_final`.`estudiante`"
                + " WHERE `persona`.`PERSONA_ID`=`estudiante`.`ESTUDIANTE_PERSONA` AND `persona`.`PERSONA_ID`=" + "'" + codigo + "';";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                estudiante.setCedula(resultado.getString("PERSONA_ID".trim()));
                estudiante.setNombre(resultado.getString("PERSONA_NOMBRE".trim()));
                estudiante.setApellido(resultado.getString("PERSONA_APELLIDO".trim()));
                estudiante.setDireccion(resultado.getString("PERSONA_DIRECCION".trim()));
                estudiante.setCorreo(resultado.getString("PERSONA_CORREO".trim()));
                estudiante.setTelefono(resultado.getInt("PERSONA_CELULAR".trim()));
                estudiante.setSexo(resultado.getString("PERSONA_SEXO".trim()));
                estudiante.setFechaNacimiento(resultado.getDate("PERSONA_FECHANACIMIENTO".trim()));
                estudiante.setInscripcion(resultado.getDate("ESTUDIANTE_INSCRIPCION".trim()));

            }

        } catch (Exception e) {
            c.desconectar();
            return null;

        }
        return estudiante;

    }

    public String modificarEstudiante(String codigo, Estudiante es) {
        String res = " ";
        String sql = "UPDATE ESTUDIANTE"
                + " SET `persona`.`PERSONA_ID` = " + es.getCedula() + " ' " + ","
                + " `persona`.`PERSONA_NOMBRE`" + es.getNombre() + " ' " + ","
                + " `persona`.`PERSONA_APELLIDO`" + es.getApellido() + " ' " + ","
                + " `persona`.`PERSONA_DIRECCION`" + es.getDireccion() + " ' " + ","
                + " `persona`.`PERSONA_CORREO`" + es.getCorreo() + " ' " + ","
                + " `persona`.`PERSONA_CELULAR`" + es.getTelefono() + " ' " + ","
                + " `persona`.`PERSONA_SEXO`" + es.getSexo() + " ' " + ","
                + " `persona`.`PERSONA_FECHANACIMIENTO`" + es.getFechaNacimiento() + " ' " + ","
                + " `estudiante`.`ESTUDIANTE_INSCRIPCION`" + es.getInscripcion() + " ' " + ","
                + "WHERE codigo =" + " ' " + codigo + " ' ";
        try {

            PreparedStatement ps;
            ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "ESTUDIANTE ACTUALIZADO";

        } catch (Exception ex) {

            c.desconectar();
            res = "ERROR";
        }

        return res;
    }

    public String eliminarEstudiante(String codigo) {
        String res = " ";
        String sql = "DELETE FROM ESTUDIANTE"
                + " WHERE ASIGNATURA_ID = " + "'" + codigo + "'";
        try {

            PreparedStatement ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception ex) {
            c.desconectar();
            res = "ERROR";
        }

        return res;
    }

    public List<Estudiante> listarDocente() {
        List<Estudiante> estudianteList = new ArrayList<>();
        String sql = "SELECT `persona`.`PERSONA_ID`,"
                + "    `persona`.`PERSONA_NOMBRE`,"
                + "    `persona`.`PERSONA_APELLIDO`,"
                + "    `persona`.`PERSONA_DIRECCION`,"
                + "    `persona`.`PERSONA_CORREO`,"
                + "    `persona`.`PERSONA_CELULAR`,"
                + "    `persona`.`PERSONA_SEXO`,"
                + "    `persona`.`PERSONA_FECHANACIMIENTO`,"
                + "    `estudiante`.`ESTUDIANTE_INSCRIPCION` "
                + "FROM `proyecto_final`.`persona`,`proyecto_final`.`estudiante`"
                + " WHERE `persona`.`PERSONA_ID`=`estudiante`.`ESTUDIANTE_PERSONA` ;";
        Estudiante estudiante = new Estudiante();
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                estudiante.setCedula(resultado.getString("PERSONA_ID".trim()));
                estudiante.setNombre(resultado.getString("PERSONA_NOMBRE".trim()));
                estudiante.setApellido(resultado.getString("PERSONA_APELLIDO".trim()));
                estudiante.setDireccion(resultado.getString("PERSONA_DIRECCION".trim()));
                estudiante.setCorreo(resultado.getString("PERSONA_CORREO".trim()));
                estudiante.setTelefono(resultado.getInt("PERSONA_CELULAR".trim()));
                estudiante.setSexo(resultado.getString("PERSONA_SEXO".trim()));
                estudiante.setFechaNacimiento(resultado.getDate("PERSONA_FECHANACIMIENTO".trim()));
                estudiante.setInscripcion(resultado.getDate("ESTUDIANTE_INSCRIPCION".trim()));
                estudianteList.add(estudiante);

            }

        } catch (Exception e) {
            c.desconectar();
            return null;

        }

        return estudianteList;

    }

    

    public String realizarMatricula() {
        return "Matricula Realizada";
    }

    public List<Calificacion> listarCalificaciones() {
        return new ArrayList<>();
    }

    public String verificarUsuario() {
        return "Usuario Valido";
    }

    public String validarCedula() {
        return "Cedula Docente valida";
    }

    public int obtenerCodigo() {
        int n = 0;
        String sql = "select max(ESTUDIANTE_ID) as Codigo from ESTUDIANTE";
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
