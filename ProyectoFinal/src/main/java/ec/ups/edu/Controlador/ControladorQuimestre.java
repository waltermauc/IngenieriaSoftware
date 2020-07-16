/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;


import ec.ups.edu.Modelo.Quimestre;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 59396
 */
public class ControladorQuimestre {
    public String crearQuimestre(Quimestre q){
        return("Quimestre creado");
    }
    public String buscarQuimestre(int codigo){
        return("Quimestre");
    }
    public String eliminarQuimestre(Quimestre q){
        return("Quimestre eliminado");
    }
    public List<Quimestre> listarQuimestre(){
       return (new ArrayList<>());
    }
    public String calcularNotaFinal(){
        return("Nota");
    }
    public String cambiarEstado(){
        return("Aprovado");
    }
    
}
