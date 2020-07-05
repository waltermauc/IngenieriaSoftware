/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Docente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 59396
 */
public class ControladorDocente {

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
        return "Docente creado";
    }
    public String eliminarDocente(int codigo){
        return "Docente eliminado";
    }
    public String buscarDocente(int codigo){
        return "Docente encontrado";
    }
    public List<Docente> listarDocente(){
        return new ArrayList<>();
    }
    public String modificarDocente(int codigo){
        return "Docente modificado";
    }
}
