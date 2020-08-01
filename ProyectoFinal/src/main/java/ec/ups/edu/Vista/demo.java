/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Vista;

import ec.ups.edu.Controlador.Conexion;
import ec.ups.edu.Controlador.ControladorNivelAsignatura;
import ec.ups.edu.Modelo.NivelAsignatura;

/**
 *
 * @author 59396
 */
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion c = new Conexion();
        ControladorNivelAsignatura controladorNivelAsignatura = new ControladorNivelAsignatura(c);
        for(NivelAsignatura a : controladorNivelAsignatura.listarAsignatura()){
            System.out.println(a);
        }
    }
    
}
