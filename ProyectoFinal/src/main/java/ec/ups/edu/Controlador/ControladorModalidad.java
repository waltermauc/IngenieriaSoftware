/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.Modalidad;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author rayner
 */
public class ControladorModalidad {
    private Conexion c;

    public ControladorModalidad() {
        c = new Conexion();

    }

    public String crearModalidadCarrera (Modalidad modalidad){
       String res = "";
        String sql = "INSERT INTO NIVEL_ASIGNATURA(NIVELASIGNATURA_ID, NIVELASIGNATURA_DESCRIPCION) VALUES (?,?)";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setString(1, nivel.getDescripcionNivelAsignatura());
            if (consulta.executeUpdate() == 1) {
                String sqlEst = "INSERT INTO ASIGNATURA(ASIGNATURA_ID, ASIGNATURA_DESCRIPCION, COSTO_CREDITOS, ASIGNATURA_NIVELASIGNATURA) VALUES (?,?,?),?";
                PreparedStatement consultaEst = c.conectado().prepareStatement(sqlEst);
                consultaEst.setInt(1, asignatura.getCodigoAsignatura());
                consultaEst.setString(2, asignatura.getDescripcion());
                consultaEst.setInt(3, asignatura.getCostoCreditos());
                consultaEst.setObject(4, asignatura.getCodigoNivelAsignatura());
                consultaEst.executeUpdate();
                res = " ASIGNATURA CREADA";
            }
        } catch (Exception e) {
            res = "ERROR";
            c.desconectar();
        }
        return res;
    }
    public String editarModalidadCarrera (int codigo, Modalidad modalidad){
       
       
    }
    public String eliminarModalidadCarrera (int  codigo ){
        
        
    }
    public List<Modalidad>listarModalidadCarrera (){
        
    }
}
