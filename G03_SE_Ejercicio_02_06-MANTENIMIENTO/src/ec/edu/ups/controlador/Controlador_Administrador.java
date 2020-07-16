/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Contabilidad;
import ec.edu.ups.modelo.Insumos;
import java.util.ArrayList;

/**
 *
 * @author rober
 */
public class Controlador_Administrador {
    private Insumos insumos;
    private Contabilidad contabilidad;

    public Controlador_Administrador() {
    }

    public Controlador_Administrador(Insumos insumos, Contabilidad contabilidad) {
        this.insumos = insumos;
        this.contabilidad = contabilidad;
    }
        
    private int calcularEdad(){
        return 0;
    }
    
    public ArrayList<Insumos> listarInsumos(){
        return null;  
    }
    
    public ArrayList<Contabilidad> listarContabilidad(){
        return null; 
    }
}
