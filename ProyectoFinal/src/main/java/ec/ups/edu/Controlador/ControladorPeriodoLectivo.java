/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;


import ec.ups.edu.Modelo.PeriodoLectivo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class ControladorPeriodoLectivo {
    private Conexion c ;
    public ControladorPeriodoLectivo(Conexion conexion){
        this.c = conexion;
    }

    public ControladorPeriodoLectivo() {
    }

   
    public String crearPeriLect(PeriodoLectivo pLectivo) {
         String res = "";
        try {
            String sql = "INSERT INTO proyecto_final.periodolectivo(MODALIDAD_ID, MODALIDAD_DESCRIPCION)VALUES (?,?)";
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setInt(1, pLectivo.getCodigo());
            consulta.setString(2, pLectivo.getDescripcion());
            consulta.executeUpdate();
            res = "PERIODO CREADA";

        } catch (Exception e) {
            res = "ERROR";
            c.desconectar();
        }
        return res;

    }

    public String editarPeriLect(int codigo, PeriodoLectivo pLectivo) {
          String res = "";
        String sql = "UPDATE proyecto_final.periodolectivo"
                + " SET PERIODOLECTIVO_ID = " + " ' " + pLectivo.getCodigo() + " ' " + ","
                + "  PERIODOLECTIVO_DESCRIPCION =" + " ' " + pLectivo.getDescripcion() + " ' "
                + "WHERE PERIODOLECTIVO_ID  =" + " ' " + codigo + " ' ";
        try {

            PreparedStatement ps;
            ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "PERIODO EDITADA";

        } catch (Exception ex) {
            res = "ERROR ";
            c.desconectar();
        }

        return res;

    }

    public PeriodoLectivo buscarPeriLect(int codigo) {
         PeriodoLectivo modalidad = new PeriodoLectivo();
        String sql = "SELECT * FROM proyecto_final.periodolectivo;";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                modalidad.setCodigo(resultado.getInt("PERIODOLECTIVO_ID".trim()));
                modalidad.setDescripcion(resultado.getString("PERIODOLECTIVO_DESCRIPCION".trim()));
            }

        } catch (Exception e) {
            c.desconectar();
            return null;
        }
        return modalidad;
    }

    public List<PeriodoLectivo> listar(){
          List<PeriodoLectivo> listPeriodoLectivo = new ArrayList<>();
        String sql = "SELECT * FROM proyecto_final.modalidad;";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                PeriodoLectivo pLectivo = new PeriodoLectivo();
                pLectivo.setCodigo(resultado.getInt("MODALIDAD_ID".trim()));
                pLectivo.setDescripcion(resultado.getString("MODALIDAD_DESCRIPCION".trim()));
                listPeriodoLectivo.add(pLectivo);
            }

        } catch (Exception e) {
            c.desconectar();
            return null;
        }
        return listPeriodoLectivo;
        
    }
}
