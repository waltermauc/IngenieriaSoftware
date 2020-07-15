/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Docente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 59396
 */
public class ControladorDocente {

    private Conexion c;

    public ControladorDocente(Conexion c) {
        this.c = c;
    }

    public ControladorDocente() {

    }

    public int registrarNota() {
        return (0);
    }

    public String verificarUsuario() {
        return "Usuario Valido";
    }

    public String validarCedula() {
        return "Cedula Docente valida";
    }

    public String crearDocente(Docente docente) {

        String retur = null;
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
            consulta.setString(1, docente.getCedula());
            consulta.setString(2, docente.getNombre());
            consulta.setString(3, docente.getApellido());
            consulta.setString(4, docente.getDireccion());
            consulta.setString(5, docente.getCorreo());
            consulta.setInt(6, docente.getTelefono());
            consulta.setString(7, docente.getSexo());
            consulta.setDate(8, (java.sql.Date) docente.getFechaNacimiento());
            if (consulta.executeUpdate() == 1) {
                String sqlEst = "INSERT INTO `proyecto_final`.`docente`"
                        + "(`DOCENTE_ID`,"
                        + "`DOCENTE_TITULO`,"
                        + "`DOCENTE_PERSONA`) VALUES (?,?,?)";
                PreparedStatement consultaEst = c.conectado().prepareStatement(sqlEst);
                consultaEst.setInt(1, docente.getCodigo());
                consultaEst.setString(2, docente.getTitulo());
                consultaEst.setString(3, docente.getCedula());
                consultaEst.executeUpdate();
                retur = "DOCENTE CREADO";
            }
        } catch (Exception e) {
            c.desconectar();
            retur = "ERROR";
        }
        return retur;
    }

    public String eliminarDocente(int codigo) {
        return "Docente eliminado";
    }

    public String buscarDocente(int codigo) {
        return "Docente encontrado";
    }

    public List<Docente> listarDocente() {
        return new ArrayList<>();
    }

    public String modificarDocente(int codigo) {
        return "Docente modificado";
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
