/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Asignatura;
import ec.ups.edu.Modelo.Grupo;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rayner
 */
public class ControladorGrupo {
    
     private Conexion c ;
     public ControladorGrupo (Conexion c) {
         this.c =c;
     }
     
    public  String crearGrupo(Grupo grupo,ControladorAsignatura controlAsig){
        String resultado = "";
         String res = "";
        List<Asignatura> asignaturaList = new ArrayList<>();

        try {
            String sqlEst = "INSERT INTO GRUPO"
                    + "(GRUPO_ID, GRUPO_ASIGNTURA, GRUPO_ESPACIOFISICO, GRUPO_DOCENTE) "
                    + "VALUES (?,?,?,?)";
            PreparedStatement consultaEst = c.conectado().prepareStatement(sqlEst);
            consultaEst.setInt(1, grupo.getCodigo());
            consultaEst.setString(2, grupo.getAsignatura());
            consultaEst.setInt(3, grupo.getCostoCreditos());
            consultaEst.setInt(4, grupo.getCodigoNivelAsignatura().getCodigoNivelAsignatura());
            consultaEst.executeUpdate();
            res = " ASIGNATURA CREADA";

        } catch (Exception e) {
            res = "ERROR";
            c.desconectar();
        }
          
        return resultado;
        
    }   
    
}
