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

        String retur = "";
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
        String res = " ";
        String sql = "DELETE FROM DOCENTE"
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

    public Docente buscarDocente(String codigo) {
        Docente docente = new Docente();
        String sql = "SELECT `persona`.`PERSONA_ID`,"
                + "    `persona`.`PERSONA_NOMBRE`,"
                + "    `persona`.`PERSONA_APELLIDO`,"
                + "    `persona`.`PERSONA_DIRECCION`,"
                + "    `persona`.`PERSONA_CORREO`,"
                + "    `persona`.`PERSONA_CELULAR`,"
                + "    `persona`.`PERSONA_SEXO`,"
                + "    `persona`.`PERSONA_FECHANACIMIENTO`"
                + "FROM `proyecto_final`.`persona`,`proyecto_final`.`dccente`"
                + " WHERE `persona`.`PERSONA_ID`=`docente`.`DOCENTE_PERSONA` AND `persona`.`PERSONA_ID`=" + "'" + codigo + "';";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                docente.setCedula(resultado.getString("PERSONA_ID".trim()));
                docente.setNombre(resultado.getString("PERSONA_NOMBRE".trim()));
                docente.setApellido(resultado.getString("PERSONA_APELLIDO".trim()));
                docente.setDireccion(resultado.getString("PERSONA_DIRECCION".trim()));
                docente.setCorreo(resultado.getString("PERSONA_CORREO".trim()));
                docente.setTelefono(resultado.getInt("PERSONA_CELULAR".trim()));
                docente.setSexo(resultado.getString("PERSONA_SEXO".trim()));
                docente.setFechaNacimiento(resultado.getDate("PERSONA_FECHANACIMIENTO".trim()));
                docente.setTitulo(resultado.getString("DOCENTE_TITULO".trim()));

            }

        } catch (Exception e) {
            c.desconectar();
            return null;
        }
        return docente;
    }

    public List<Docente> listarDocente() {
        List<Docente> docenteList = new ArrayList<>();
        String sql = "SELECT `persona`.`PERSONA_ID`,"
                + "    `persona`.`PERSONA_NOMBRE`,"
                + "    `persona`.`PERSONA_APELLIDO`,"
                + "    `persona`.`PERSONA_DIRECCION`,"
                + "    `persona`.`PERSONA_CORREO`,"
                + "    `persona`.`PERSONA_CELULAR`,"
                + "    `persona`.`PERSONA_SEXO`,"
                + "    `persona`.`PERSONA_FECHANACIMIENTO`,"
                + "    `dccente`.`DOCENTE_TITULO` "
                + "FROM `proyecto_final`.`persona`,`proyecto_final`.`dccente`"
                + " WHERE `persona`.`PERSONA_ID`=`docente`.`DOCENTE_PERSONA` ;";
        Docente docente = new Docente();
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                docente.setCedula(resultado.getString("PERSONA_ID".trim()));
                docente.setNombre(resultado.getString("PERSONA_NOMBRE".trim()));
                docente.setApellido(resultado.getString("PERSONA_APELLIDO".trim()));
                docente.setDireccion(resultado.getString("PERSONA_DIRECCION".trim()));
                docente.setCorreo(resultado.getString("PERSONA_CORREO".trim()));
                docente.setTelefono(resultado.getInt("PERSONA_CELULAR".trim()));
                docente.setSexo(resultado.getString("PERSONA_SEXO".trim()));
                docente.setFechaNacimiento(resultado.getDate("PERSONA_FECHANACIMIENTO".trim()));
                docente.setTitulo(resultado.getString("DOCENTE_TITULO".trim()));
                docenteList.add(docente);

            }

        } catch (Exception e) {
            c.desconectar();
            return null;
        }

        return docenteList;
    }

    public String modificarDocente(String codigo, Docente docente) {
        String res = "";
        String sql = "UPDATE DOCENTE"
                + " SET `persona`.`PERSONA_ID` = " + docente.getCedula() + " ' " + ","
                + " `persona`.`PERSONA_NOMBRE`" + docente.getNombre() + " ' " + ","
                + " `persona`.`PERSONA_APELLIDO`" + docente.getApellido() + " ' " + ","
                + " `persona`.`PERSONA_DIRECCION`" + docente.getDireccion() + " ' " + ","
                + " `persona`.`PERSONA_CORREO`" + docente.getCorreo() + " ' " + ","
                + " `persona`.`PERSONA_CELULAR`" + docente.getTelefono() + " ' " + ","
                + " `persona`.`PERSONA_SEXO`" + docente.getSexo() + " ' " + ","
                + " `persona`.`PERSONA_FECHANACIMIENTO`" + docente.getFechaNacimiento() + " ' " + ","
                + " `dccente`.`DOCENTE_TITULO``" + docente.getTitulo() + " ' " + ","
                + "WHERE codigo =" + " ' " + codigo + " ' ";
        try {

            PreparedStatement ps;
            ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = " DOCENTE MODIFICADO";

        } catch (Exception ex) {
            res = "ERROR";
            c.desconectar();
        }
        return res;
    }
    public Docente buscarEsCodigo(int codigo) {
        Docente docente = new Docente();
        String sql = "SELECT * FROM ESTUDIANTE "
                + "WHERE DOCENTE_ID  =" + " ' " + codigo + " ' ";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                docente.setCodigo(resultado.getInt("DOCENTE_ID".trim()));
                docente.setTitulo(resultado.getString("DOCENTE_TITULO".trim()));
                String cedula = resultado.getString("DOCENTE_PERSONA".trim());
                docente.setPersona(buscarDocente(cedula));
            }
        } catch (Exception e) {
            c.desconectar();
            return null;
        }

        return docente;

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
