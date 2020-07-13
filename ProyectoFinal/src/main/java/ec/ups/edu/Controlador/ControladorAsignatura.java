/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Asignatura;
import ec.ups.edu.Modelo.NivelAsignatura;
import java.sql.PreparedStatement;

/**
 *
 * @author rayner
 */
public class ControladorAsignatura {
     private Conexion c;
    
    public ControladorAsignatura(){
        c = new Conexion();
        
    }
    
    int []numeros = {1,2,3,4,5,6,7,8,9,0};
    String [] letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
       
    
     public String crearAsignatura (Asignatura asignatura, NivelAsignatura nivel){
       
           String sql = "INSERT INTO NIVEL_ASIGNATURA(ID_NIVEL_ASIGNATURA, DESCRIPCION_NIVEL_ASIGNATURA) VALUES (?,?)";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setString(1, nivel.getDescripcionNivelAsignatura());
            if (consulta.executeUpdate() == 1) {   
                    String sqlEst = "INSERT INTO ASIGNATURA(ID_ASIGNATURA, ASIGNATURA_DESCRIPCION, COSTO_CREDITOS, NIVEL_ASIGNATURA) VALUES (?,?,?),?";
                    PreparedStatement consultaEst = c.conectado().prepareStatement(sqlEst);
                    consultaEst.setInt(1, asignatura.getCodigoAsignatura());
                    consultaEst.setString(2, asignatura.getDescripcion());
                    consultaEst.setInt(3, asignatura.getCostoCreditos());
                    consultaEst.setObject(4, asignatura.getCodigoNivelAsignatura());
                    consultaEst.executeUpdate();
            }
        } catch (Exception e) {
            c.desconectar();
        }
        return "Asignatura creada";
         
     }
    public String editarAsignatura (Asignatura asignatura, NivelAsignatura nivel){
       
         String sql = "SELECT * ASIGNATURA (ID_ASIGNATURA, ASIGNATURA_DESCRIPCION,COSTO_CREDITOS, NI) VALUES (?,?)";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setString(1, nivel.getDescripcionNivelAsignatura());
            if (consulta.executeUpdate() == 1) {   
                    String sqlEst = "INSERT INTO ASIGNATURA(ID_ASIGNATURA, ASIGNATURA_DESCRIPCION, COSTO_CREDITOS, NIVEL_ASIGNATURA) VALUES (?,?,?,?)";
                    PreparedStatement consultaEst = c.conectado().prepareStatement(sqlEst);
                    consultaEst.setInt(1, asignatura.getCodigoAsignatura());
                    consultaEst.setString(2, asignatura.getDescripcion());
                    consultaEst.setInt(3, asignatura.getCostoCreditos());
                    consultaEst.setObject(4, asignatura.getCodigoNivelAsignatura());
                    consultaEst.executeUpdate();
            }
        } catch (Exception e) {
            c.desconectar();
        }
        return "Asignatura creada";
       
    }
    public String eliminarAsignatura (String descripcionAsignatura){
        String eliminarAsignatura = "";
        if (descripcionAsignatura.equals("matematicas")){
            eliminarAsignatura = "asignatura eliminada";
        }else {
            eliminarAsignatura = "No existe asignatura con ese nombre";
            
        }
        return eliminarAsignatura;
    }
    public String listarAsignatura ( String descripcionAsignatura){
        String listarAsignatura = "";
        if (descripcionAsignatura.equals("Lengua")){
            listarAsignatura = "mostrar datos de la asignatura";
        }else {
            listarAsignatura = "No existe asignatura con ese nombre";
        }
        return listarAsignatura;
    }
}
