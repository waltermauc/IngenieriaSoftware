/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Calificacion;
import ec.ups.edu.Modelo.Estudiante;
import ec.ups.edu.Modelo.Persona;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 59396
 */
public class ControladorEstudiante {

    private Conexion c;

    public ControladorEstudiante() {
        c = new Conexion();

    }

    public String crearEstudiante(Estudiante es) {
        String sql = "INSERT INTO PERSONA(ID_PERSONA, NOMBRE_PERSONA, APELLIDO_PERSONA) VALUES (?,?,?)";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setString(1, es.getCedula());
            consulta.setString(2, es.getNombre());
            consulta.setString(3, es.getApellido());

            if (consulta.executeUpdate() == 1) {
                String sqlEst = "INSERT INTO ESTUDIANTE(ID_ESTUDIANTE, INSCRIPCION_ESTUDIANTE, ID_PERSONA) VALUES (?,?,?)";
                PreparedStatement consultaEst = c.conectado().prepareStatement(sqlEst);
                consultaEst.setInt(1, es.getCodigo());
                consultaEst.setDate(2, (java.sql.Date) es.getInscripcion());
                consultaEst.setString(3, es.getCedula());
                consultaEst.executeUpdate();
            }
        } catch (Exception e) {
            c.desconectar();
        }
        return "Estudiante creado";
    }
    public String verificarUsuario() {
        return "Usuario Valido";
    }

    public String validarCedula() {
        return "Cedula Docente valida";
    }

    

    public String eliminarEstudiante(int codigo) {
        return "Estudiante eliminado";
    }

    public String buscarEstudiante(int codigo) {
        return "Docente encontrado";
    }

    public List<Estudiante> listarDocente() {
        return new ArrayList<>();
    }

    public String modificarEstudiante(int codigo) {
        return "Docente modificado";
    }
    
    public String realizarMatricula(){
        return  "Matricula Realizada";
    }
     public List<Calificacion> listarCalificaciones() {
        return new ArrayList<>();
    }

    

}


