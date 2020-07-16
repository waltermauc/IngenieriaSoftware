/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Asignatura;
import ec.ups.edu.Modelo.Docente;
import ec.ups.edu.Modelo.EspacioFisico;
import ec.ups.edu.Modelo.Grupo;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import ec.ups.edu.Modelo.Grupo;
import java.sql.ResultSet;

/**
 *
 * @author rayner
 */
public class ControladorGrupo {

    private Conexion c;

    public ControladorGrupo(Conexion c) {
        this.c = c;
    }

    public String crearGrupo(Grupo grupo, ControladorAsignatura controlAsig, ControladorDocente controlDocen, ControladorEspacioFisico controlEspacio, ControladorNivelAsignatura nivel) {
        String res = "";

        try {

            String sqlEst = "INSERT INTO GRUPO"
                    + "(GRUPO_ID, GRUPO_ASIGNTURA, GRUPO_ESPACIOFISICO, GRUPO_DOCENTE) "
                    + "VALUES (?,?,?,?)";
            PreparedStatement consulta = c.conectado().prepareStatement(sqlEst);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {
                grupo.setCodigoGrupo(resultado.getInt("GRUPO_ID".trim()));
                int codigoAsignatura = resultado.getInt("GRUPO_ASIGNTURA".trim());
                Asignatura asig = controlAsig.buscarAsignatura(codigoAsignatura, nivel);
                grupo.setC(asig);
                int codigoEspacio = resultado.getInt("GRUPO_ESPACIOFISICO".trim());
                EspacioFisico esp = controlEspacio.buscaEspacioFisico(codigoEspacio);
                grupo.setCodigoEspacioFisico(esp);
                int codigoDoccente = resultado.getInt("GRUPO_DOCENTE".trim());
                Docente docne = controlDocen.buscarEsCodigo(codigoEspacio);
                grupo.setDocenteCodigo(docne);

                consulta.executeUpdate();
            }
        } catch (Exception e) {
            res = "ERROR";
            c.desconectar();
        }
        return "GRUPO CREADO";
    }

    public String buscarGrupo(Grupo grupo, int codigo) {
        String res = "";
        String sql = "UPDATE GRUPO"
                + " SET GRUPO_ID = " + " ' " + grupo.getCodigoGrupo() + " ' " + ","
                + "  GRUPO_ASIGNTURA =" + " ' " + grupo.getC() + " ' " + ","
                + "  GRUPO_ESPACIOFISICO =  " + " ' " + grupo.getCodigoEspacioFisico() + " ' " + ","
                + "  GRUPO_DOCENTE = " + " ' " + grupo.getDocenteCodigo() + " ' "
                + "WHERE GRUPO_ID =" + " ' " + codigo + " ' ";
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

    public String eliminarGrupo(int codigo) {
        String res = "";
        String sql = "DELETE FROM GRUPO"
                + " WHERE GRUPO_ID = " + "'" + codigo + "'";
        try {

            PreparedStatement ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "GRUPO ELIMINADO";
        } catch (Exception ex) {
            res = " ERROR ";
            c.desconectar();
        }

        return res;
    }

    public List<Grupo> listarGrupo(ControladorAsignatura controlAsig, ControladorDocente controlDocen, ControladorEspacioFisico controlEspacio, ControladorNivelAsignatura nivel) {
        List<Grupo> grupoList = new ArrayList<>();
        String sql = "SELECT GRUPO_ID,"
                + "GRUPO_ASIGNTURA,"
                + "GRUPO_ESPACIOFISICO, "
                + "GRUPO_DOCENTE,"
                + " FROM GRUPO";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {

                Grupo grupo = new Grupo();
                grupo.setCodigoGrupo(resultado.getInt("ASIGNATURA_ID".trim()));
                int codigoAsignatura = resultado.getInt("GRUPO_ASIGNTURA".trim());
                Asignatura asig = controlAsig.buscarAsignatura(codigoAsignatura, nivel);
                grupo.setC(asig);
                int codigoEspacio = resultado.getInt("GRUPO_ESPACIOFISICO".trim());
                EspacioFisico esp = controlEspacio.buscaEspacioFisico(codigoEspacio);
                grupo.setCodigoEspacioFisico(esp);
                int codigoDoccente = resultado.getInt("GRUPO_DOCENTE".trim());
                Docente docne = controlDocen.buscarEsCodigo(codigoEspacio);
                grupo.setDocenteCodigo(docne);

                grupoList.add(grupo);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            c.desconectar();

        }
        return grupoList;
    }

    public Grupo buscarGrupo(int codigo) {
        Grupo grupo = new Grupo();
        return grupo;

    }

}
