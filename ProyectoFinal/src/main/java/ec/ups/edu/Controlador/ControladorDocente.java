/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;



import ec.ups.edu.Modelo.Persona;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author 59396
 */
public class ControladorDocente extends Persona{
    

    public int registrarNota(){
        return(0);
    }

    @Override
    public String verificarUsuario() {
        return("Usuario valido");
    }

    @Override
    public String validarCedula() {
        return("Cedula Docente valida");
    }

    @Override
    public String crarPersona(Persona p) {
        return("Docente creado");
    }

    @Override
    public String eliminarPersona(int codigo) {
        return("Docente eliminado");
    }

    @Override
    public String buscarPersona(int codigo) {
       return("Docente encontrado");
    }

    @Override
    public List<Persona> listarPersona() {
       List docente = new ArrayList();
       return docente;
    }

    @Override
    public String modificarPersona(int codigo) {
        return("Docente modificado");
    }

}