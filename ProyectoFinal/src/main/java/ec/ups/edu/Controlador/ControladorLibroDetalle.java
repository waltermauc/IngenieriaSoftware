/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;



import ec.ups.edu.Modelo.LibroDetalle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 59396
 */
public class ControladorLibroDetalle {
    public String crearDetalle(LibroDetalle l){
        return("Detalle creado");
    }
    public String buscarDetalle(int codigo){
        return("Detalle");
    }
    public String eliminarDetalle(int codigo){
        return("Detalle eliminado");
    }
     public String modificarDetalle(int codigo){
        return("Detalle modificado");
    }
    public List<LibroDetalle > listarDetalle(){
        List libroDetalle = new ArrayList();
        return libroDetalle;
    }
}
