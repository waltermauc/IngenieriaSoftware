/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;


import ec.ups.edu.Modelo.Calificacion;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author 59396
 */
public class ControladorCalifcacion {
    public String crearCalificacion(Calificacion c){
        return("Calificacion creada");
    }
    public String buscarCalificacion(int codigo){
        return("Calificacion");
    }
    public String eliminarCalificacion(int codigo){
        return("Calificacion eliminado");
    }
    public String modificarCalificacion(int codigo ){
        return("Calificacion modificada");
    }
    public List <Calificacion> listarCalificacion(){
       List calificacion = new ArrayList();
       return calificacion;
    }
}
