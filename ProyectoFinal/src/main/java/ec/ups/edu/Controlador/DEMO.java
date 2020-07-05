/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

/**
 *
 * @author 59396
 */
public class DEMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion c = new  Conexion();
        c.conectado();
        c.desconectar();
    }
    
}
