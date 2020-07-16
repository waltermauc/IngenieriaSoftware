/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;



/**
 *
 * @author 59396
 */
public class ControladorUsuario {
   private Conexion c;

    public ControladorUsuario() {
        c = new Conexion();

    }

    public String crearEstudiante(Usuario es) throws SQLException {
 
          
                String sqlEst = "INSERT INTO USUARIO(ID_CODIGO, NOMBRE_ESTUDIANTE, CONTRASENIA) VALUES (?,?,?)";
                PreparedStatement consultaEst = c.conectado().prepareStatement(sqlEst);
                consultaEst.setInt(1, es.getCodigo());
                consultaEst.setString(2, es.getNombreUsuario());
                consultaEst.setString(2, es.getContrasenia());
                consultaEst.executeUpdate();
           
        return "Usuario creado";
    }
    public String verificarUsuario() {
        return "Usuario crado";
    }

    
}
