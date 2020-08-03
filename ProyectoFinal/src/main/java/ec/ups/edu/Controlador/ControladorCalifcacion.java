/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;


import ec.ups.edu.Modelo.Calificacion;
import ec.ups.edu.Modelo.Estudiante;
import ec.ups.edu.Modelo.Persona;
import ec.ups.edu.Modelo.Quimestre;
import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author 59396
 */
public class ControladorCalifcacion {
    
    private Conexion c;
    
    public ControladorCalifcacion(Conexion c){
        this.c =c;
    }
    
    
    public ControladorCalifcacion(){
        
        
    }
    
    public String crearCalificacion(Calificacion calificacion){
         String res = "";
        String sql = "INSERT INTO CALIFICACION"
                + "(CALIFICACION_CODIGO, CALIFICACION_CODIGOESTUDIANTE,CALIFICACION_PROMEDIO ,CALIFICACION_CODIGOQUIMESTRE) "
                + "VALUES (?,?,?,?)";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setInt(1, calificacion.getCodigo());
            consulta.setArray(2, (Array) calificacion.getEstudiantes());
            consulta.setInt(3, calificacion.getPromedio());
            consulta.setArray(4, (Array) calificacion.getQuimestre());
        } catch (Exception e) {
            return "error al crear calificacion";
        }
        return res;
    }
    public Calificacion   buscarCalificacion(int codigo){
        ControladorEstudiante controlEstudiante = new ControladorEstudiante();
        ControladorQuimestre controlQuimestre = new ControladorQuimestre();
        ControladorMatricula controlMatricula = new ControladorMatricula();
      Calificacion calificacionNueva = new Calificacion();
      try {
            String sql = "SELECT * FROM CALIFICACION "
                    + "WHERE CALIFICACION_ID = " + "'" + codigo + "'";
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                calificacionNueva.setCodigo(resultado.getInt("CALIFICACION_CODIGO".trim()));
                int codigoEstudiante = resultado.getInt("CALIFICACION_CODIGOESTUDIANTE".trim());
                String codigoV = Integer.toString(codigoEstudiante);
                Estudiante estudiante = controlEstudiante.buscarEstudiante(codigoV);
                calificacionNueva.setEstudiantes((List<Persona>) estudiante);
                calificacionNueva.setPromedio(resultado.getInt("CALIFICACION_PROMEDIO".trim()));
                int codigoQuimestre = resultado.getInt("CALIFICACION_CODIGOQUIMESTRE".trim());
                Quimestre quimestre = controlQuimestre.buscarQuimestre(codigoQuimestre, controlMatricula);
                calificacionNueva.setQuimestre((List<Quimestre>) quimestre);
            }
        } catch (Exception e) {
            c.desconectar();
            return null;
        }
        return calificacionNueva;
    }
    public String eliminarCalificacion(int codigo){
        String res = "";
        String sql = "DELETE FROM CALIFICACION"
                + " WHERE CALIFICACION_ID = " + "'" + codigo + "'";
        try {

            PreparedStatement ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "CALIFICACION ELIMINADA ELIMINADO";
        } catch (Exception ex) {
            res = " ERROR AL ELIMINAR CALIFICACION";
            c.desconectar();
        }

        return res;    }
    public String modificarCalificacion(Calificacion calificacion, int codigo ){
       String res = "";
        String sql = "UPDATE CALIFICACION"
                + " SET CALIFICACION_CODIGO = " + " ' " + calificacion.getCodigo()+ " ' " + ","
                + "  CALIFICACION_CODIGOESTUDIANTE =" + " ' " +calificacion.getEstudiantes() + " ' " + ","
                + "  CALIFICACION_PROMEDIO =  " + " ' " + calificacion.getPromedio() + " ' " + ","
                + "  CALIFICACION_CODIGOQUIMESTRE = " + " ' " + calificacion.getQuimestre() + " ' "
                + "WHERE CALIFICACION_CODIGO =" + " ' " + codigo + " ' ";
        try {

            PreparedStatement ps;
            ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "CALIFICACION EDITADA";

        } catch (Exception ex) {
            res = "ERROR ";
            c.desconectar();
        }
        return res;
    }
    public List <Calificacion> listarCalificacion(){
       ControladorEstudiante controlEstudiante = new ControladorEstudiante();
       ControladorQuimestre controlQuimestre = new ControladorQuimestre();
        ControladorMatricula controlMatricula = new ControladorMatricula();
       List <Calificacion> calificacion = new ArrayList();
       
       String sql = "SELECT CALIFICACION_CODIGO,"
                + "CALIFICACION_CODIGOESTUDIANTE,"
                + "CALIFICACION_PROMEDIO, "
                + "CALIFICACION_CODIGOQUIMESTRE,"
                + " FROM CALIFICACION";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {

                Calificacion calificac  = new Calificacion();
                calificac.setCodigo(resultado.getInt("ASIGNATURA_ID".trim()));
                int codigoPersona = resultado.getInt("GRUPO_ASIGNTURA".trim());
                 String codigoV = Integer.toString(codigoPersona);
                Estudiante asig = controlEstudiante.buscarEstudiante(codigoV);
                calificac.setEstudiantes((List<Persona>) asig);
                
                calificac.setPromedio(resultado.getInt("CALIFICACION_PROMEDIO".trim()));
                int codigoQuimestre = resultado.getInt("CALIFICACION_CODIGOQUIMESTRE".trim());
                Quimestre quimestre = controlQuimestre.buscarQuimestre(codigoQuimestre, controlMatricula);
                calificac.setQuimestre((List<Quimestre>) quimestre);

                calificacion.add(calificac);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            c.desconectar();

        }
       return calificacion;
    }
}
