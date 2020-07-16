/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 59396
 */
public class Conexion {

    Connection conect = null;

    public Connection conexion() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/citasmedicas", "root", "");

        } catch (Exception e) {
            System.out.println("ERROR BASE DE DATOS");
        }
        return conect;
    }

}
