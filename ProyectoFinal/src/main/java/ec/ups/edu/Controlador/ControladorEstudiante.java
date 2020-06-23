/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;


import ec.ups.edu.Modelo.Calificacion;
import ec.ups.edu.Modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 59396
 */
public class ControladorEstudiante extends Persona{

    @Override
    public String verificarUsuario() {
      return("Usuario valido");
    }

    @Override
    public String validarCedula() {
          return("Cedula Estudiante valida");
    }

    @Override
    public String crarPersona(Persona p) {
        return("Estudiante creado");
    }

    @Override
    public String eliminarPersona(int codigo) {
        return("Estudiante eliminado");
    }

    @Override
    public String buscarPersona(int codigo) {
        return("Estudiante encontrado");
    }

    @Override
    public String modificarPersona(int codigo) {
        return("Estudiante modificado");
    }

    @Override
    public List<Persona> listarPersona() {
        List estudiante = new ArrayList();
        return estudiante;
    }
    public String realizarMatricula(){
        return ("Matricula Realizada");
    }
    
    public List<Calificacion> listarCalificaciones(){
        List calificaciones = new ArrayList();
        return calificaciones;
    }

   
    
  

   

    
    
}
