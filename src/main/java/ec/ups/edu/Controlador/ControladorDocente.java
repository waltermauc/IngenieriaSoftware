/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Docente;
import java.sql.PreparedStatement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 59396
 */
public class ControladorDocente {
    
    private Conexion c;

    public ControladorDocente() {
        c = new Conexion();

    }

    public String crearDocente(Docente docente) {
        String sql = "INSERT INTO PERSONA(ID_PERSONA, NOMBRE_PERSONA, APELLIDO_PERSONA) VALUES (?,?,?)";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setString(1, docente.getCedula());
            consulta.setString(2, docente.getNombre());
            consulta.setString(3, docente.getApellido());

            if (consulta.executeUpdate() == 1) {
                String sqlEst = "INSERT INTO DOCENTE(DOCENTE_ID, DOCENTE_TITULO, DOCENTES_PERSONA) VALUES (?,?,?)";
                PreparedStatement consultaEst = c.conectado().prepareStatement(sqlEst);
                consultaEst.setInt(1, docente.getCodigo());
                consultaEst.setString(2, docente.getTitulo());
                consultaEst.setString(3, docente.getCedula());
                consultaEst.executeUpdate();
            }
        } catch (Exception e) {
            c.desconectar();
        }
        return "Docente creado";
    }
    
    public String modificarDocente(Docente docente, String cedula) {
        
        String sql2 = "UPDATE PERSONY(ID_PERSONA, NOMBRE_PERSONA, APELLIDO_PERSONA) VALUES (?,?,?)";
        String sql = "UPDATE PERSONA"
                + " SET CEDULA = " + " ' " + docente.getCedula() + " ' " + ","
                + "  NOMBRES =" + " ' " + docente.getNombre() + " ' " + ","
                + "  APELLIDO =  " + " ' " + docente.getApellido() + " ' " + ","
                + "WHERE CEDULA =" + " ' " + cedula + " ' ";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setString(1, docente.getCedula());
            consulta.setString(2, docente.getNombre());
            consulta.setString(3, docente.getApellido());

            if (consulta.executeUpdate() == 1) {
                String sqlEst = "INSERT INTO DOCENTE(DOCENTE_ID, DOCENTE_TITULO, DOCENTES_PERSONA) VALUES (?,?,?)";
                PreparedStatement consultaEst = c.conectado().prepareStatement(sqlEst);
                consultaEst.setInt(1, docente.getCodigo());
                consultaEst.setString(2, docente.getTitulo());
                consultaEst.setString(3, docente.getCedula());
                consultaEst.executeUpdate();
            }
        } catch (Exception e) {
            c.desconectar();
        }
        return "Docente creado";
    }
    
    
    
    
    
    
    

    public int registrarNota() {
        return (0);
    }

    public String verificarUsuario() {
        return "Usuario Valido";
    }

    public String validarCedula() {
        return "Cedula Docente valida";
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
