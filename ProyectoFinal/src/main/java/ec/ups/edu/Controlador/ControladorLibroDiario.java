/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;


import ec.ups.edu.Modelo.LibroDiario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 59396
 */
public class ControladorLibroDiario {
    public String crearLibro(LibroDiario l){
        return("Detalle creado");
    }
    public String buscarLibro(int codigo){
        return("Detalle");
    }
    public String eliminarLibro(int codigo){
        return("Detalle eliminado");
    }
     public String modificarLibro(int codigo){
        return("Detalle modificado");
    }
    public List<LibroDiario > listarCalificacion(){
       return (new ArrayList<>());
    }
}
