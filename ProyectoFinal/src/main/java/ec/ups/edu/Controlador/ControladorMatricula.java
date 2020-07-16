/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Matricula;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class ControladorMatricula {

    private Conexion c;

    public ControladorMatricula() {
    }

    public ControladorMatricula(Conexion c) {
        this.c = c;
    }

    public String crearMatricula(Matricula matricula) {
        String res = "";
        String sql = "INSERT INTO `proyecto_final`.`matricula`"
                + "(`MATRICULA_ID`,"
                + "`MATRICULA_PERIODO`,"
                + "`MATRICULA_MODALIDAD`,"
                + "`MATRICULA_ESPECIALIDAD`,"
                + "`MATRICULA_GRUPO`,"
                + "`MATRICULA_ESTUDIANTE`)"
                + "VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setInt(1, matricula.getCodigo());
            consulta.setInt(2, matricula.getPeriodoLectivo().getCodigo());
            consulta.setInt(3, matricula.getModalidad().getCodigoModalidad());
            consulta.setInt(4, matricula.getEspecialidad().getCodigo());
            consulta.setInt(5, matricula.getGrupo().getCodigoGrupo());
            consulta.setString(6, matricula.getEstudiante().getCedula());

        } catch (Exception e) {
            res = "ERROR";
            c.desconectar();
        }

        return res;
    }

    public String modificarMatricula(int codigo, Matricula matricula) {
        String res = "";
        String sql = "UPDATE `proyecto_final`.`matricula`"
                + " SET MATRICULA_ID = " + " ' " + matricula.getCodigo() + " ' " + ","
                + "MATRICULA_PERIODO = " + " ' " + matricula.getCodigo() + " ' " + ","
                + "MATRICULA_MODALIDAD = " + " ' " + matricula.getCodigo() + " ' " + ","
                + "MATRICULA_ESPECIALIDAD = " + " ' " + matricula.getCodigo() + " ' " + ","
                + "MATRICULA_GRUPO = " + " ' " + matricula.getCodigo() + " ' " + ","
                + "MATRICULA_ESTUDIANTE = " + " ' " + matricula.getCodigo() + " ' "
                + "WHERE MATRICULA_ID =" + " ' " + codigo + " ' ";
        try {

            PreparedStatement ps;
            ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "MATRICUAL ACTUALIZADA";

        } catch (Exception ex) {
            res = "ERROR ";
            c.desconectar();
        }

        return res;

    }

    public Matricula buscarMatricula(int codigo, ControladorPeriodoLectivo cpl, ControladorModalidad cm,
            ControladorEspecialidad ce, ControladorGrupo cg, ControladorEstudiante ces) {
        Matricula matricula = new Matricula();
        String sql = " SELECT * FROM proyecto_final.matricula"
                + "WHERE MATRICULA_ID  =" + " ' " + codigo + " ' ";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

                matricula.setCodigo(resultado.getInt("MATRICULA_ID".trim()));
                int codigoPeridoLectivo = resultado.getInt("MATRICULA_PERIODO".trim());
                matricula.setPeriodoLectivo(cpl.buscarPeriLect(codigoPeridoLectivo));
                int codigoModalidad = resultado.getInt("MATRICULA_MODALIDAD".trim());
                matricula.setModalidad(cm.buscarModalidad(codigoModalidad));
                int codigoEspecialida = resultado.getInt("MATRICULA_ESPECIALIDAD".trim());
                matricula.setEspecialidad(ce.buscarEspecialidad(codigoEspecialida));
                int codigoGrupo = resultado.getInt("MATRICULA_GRUPO");
                matricula.setGrupo(cg.buscarGrupo(codigoGrupo));
                int codigoEst = resultado.getInt("MATRICULA_ESTUDIANTE");
                //matricula.setEstudiante(ces.buscarEstudiante());

            }

        } catch (Exception ex) {
            ex.printStackTrace();
            c.desconectar();
            return null;
        }
        return matricula;
    }

    public List<Matricula> listarMatricula() {
        List<Matricula> listMatricula = new ArrayList<>();
        return listMatricula;
    }

    public String eliminarMatricula(int codigo) {
        String matricula = "eliminar Mat";

        return matricula;

    }

}
