/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Asignatura;
import ec.ups.edu.Modelo.Docente;
import ec.ups.edu.Modelo.EspacioFisico;
import ec.ups.edu.Modelo.Grupo;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import ec.ups.edu.Modelo.Grupo;
import java.sql.ResultSet;

/**
 *
 * @author rayner
 */
public class ControladorGrupo {

    
     private Conexion c ;
     public ControladorGrupo (Conexion c) {
         this.c =c;
     }
     
    public  String crearGrupo(Grupo grupo,ControladorAsignatura controlAsig, ControladorDocente controlDocen, ControladorEspacioFisico controlEspacio, ControladorNivelAsignatura nivel){
         String res = "";

        try {
            
             String sqlEst = "INSERT INTO GRUPO"
                    + "(GRUPO_ID, GRUPO_ASIGNTURA, GRUPO_ESPACIOFISICO, GRUPO_DOCENTE) "
                    + "VALUES (?,?,?,?)";
            PreparedStatement consulta = c.conectado().prepareStatement(sqlEst);
            ResultSet resultado = consulta.executeQuery();
           
         while (resultado.next()) {
             grupo.setCodigoGrupo(resultado.getInt("GRUPO_ID".trim()));
             int codigoAsignatura = resultado.getInt("GRUPO_ASIGNTURA".trim());
             Asignatura asig = controlAsig.buscarAsignatura(codigoAsignatura,nivel);
             grupo.setC(asig);
             int codigoEspacio = resultado.getInt("GRUPO_ESPACIOFISICO".trim());
             EspacioFisico esp = controlEspacio.buscaEspacioFisico(codigoEspacio);
             grupo.setCodigoEspacioFisico(esp);
             int codigoDoccente = resultado.getInt("GRUPO_DOCENTE".trim());
             Docente docne = controlDocen.buscarEsCodigo(codigoEspacio);
             grupo.setDocenteCodigo(docne);
             
                consulta.executeUpdate();

         }
        } catch (Exception e) {
            res = "ERROR";
            c.desconectar();
        }
            return "GRUPO CREADO";
    } 
    public String crearGrupo(int codigoGrupo, String asignatura, int codigoEspacio, int codigoModalidad, String nombreDocente) {
        String resultado = "";

        return resultado;

    }

    public Grupo buscarGrupo(int codigo) {
        Grupo grupo = new Grupo();
        return grupo;

    }

}
