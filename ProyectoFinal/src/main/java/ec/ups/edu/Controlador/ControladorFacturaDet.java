/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.FacturaDet;
import ec.ups.edu.Modelo.Matricula;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class ControladorFacturaDet {

    private Conexion c;
   
    public ControladorFacturaDet(Conexion c) {
        this.c = c;
    }

    public ControladorFacturaDet() {

    }

    public String crearFactDet(FacturaDet detalle) {
        String res = "";
        String sql = "INSERT INTO `proyecto_final`.`facturadetalle`"
                + "(`FACTURADETALLE_ID`,"
                + "`FACTURADETALLE_DESCRIPCION`,"
                + "`FACTURADETALLE_SUBTOTAL`,"
                + "`FACTURADETALLE_TOTAL`,"
                + "`FACTURADETALLE_IVA`,"
                + "`FACTURADETALLE_MATRICULA`)"
                + "VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setInt(1, detalle.getCodigo());
            consulta.setString(2, detalle.getDescripcion());
            consulta.setDouble(3, detalle.getSubtotal());
            consulta.setDouble(4, detalle.getTotal());
            consulta.setDouble(5, detalle.getIva());
            consulta.setInt(6, detalle.getMatricula().getCodigo());

        } catch (Exception e) {
            res = "ERROR";
            c.desconectar();
        }

        return res;
    }
      
    public FacturaDet buscarFacturaDetalle(int codigo, ControladorMatricula controlMatricu) {
      
        String res = "";
        FacturaDet facturaD = new FacturaDet();
      try  
           

        {

            
            String sql = "SELECT * FROM FACTURADETALLE "
                    + "WHERE FACTURADETALLE_ID = " + "'" + codigo + "'";
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
          
            ResultSet resultado = consulta.executeQuery();
       
            ControladorPeriodoLectivo cpl = new ControladorPeriodoLectivo ();
            ControladorModalidad cm = new ControladorModalidad();
            ControladorEspecialidad ce = new ControladorEspecialidad();
         
            while (resultado.next()) {

                facturaD.setCodigo(resultado.getInt("FACTURADETALLE_ID".trim()));
                facturaD.setDescripcion(resultado.getString("FACTURADETALLE_DESCRIPCION".trim()));
                facturaD.setSubtotal(resultado.getDouble("FACTURADETALLE_SUBTOTAL".trim()));
                facturaD.setTotal(resultado.getDouble("FACTURADETALLE_TOTAL".trim()));
                facturaD.setIva(resultado.getDouble("FACTURADETALLE_IVA"));
                int codigoMatricula = resultado.getInt("FACTURADETALLE_MATRICUAL".trim());
                Matricula matric = controlMatricu.buscarMatricula(codigoMatricula, cpl, cm, ce);
                facturaD.setMatricula(matric);
            }
        } catch (Exception e) {
            c.desconectar();
            return null;
        }
        return facturaD;
    }
    
    
    public String modificarFactDet(int codigo, FacturaDet detalle) {
        String res = "";
        String sql = "UPDATE `proyecto_final`.`facturadetalle`"
                + " SET FACTURADETALLE_ID = " + " ' " + detalle.getCodigo() + " ' " + ","
                + "FACTURADETALLE_DESCRIPCION = " + " ' " + detalle.getDescripcion() + " ' " + ","
                + "FACTURADETALLE_SUBTOTAL = " + " ' " + detalle.getSubtotal() + " ' " + ","
                + "FACTURADETALLE_TOTAL = " + " ' " + detalle.getTotal() + " ' " + ","
                + "FACTURADETALLE_IVA = " + " ' " + detalle.getIva() + " ' " + ","
                + "FACTURADETALLE_MATRICULA= " + " ' " + detalle.getMatricula().getCodigo() + " ' "
                + "WHERE MATRICULA_ID =" + " ' " + codigo + " ' ";

        try {

            PreparedStatement ps;
            ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "MATRICUAL ACTUALIZADA";

        } catch (Exception ex) {
            res = "ERROR ";
            c.desconectar();
        }

        return res;

    }

    public List<FacturaDet> listarFactDet(ControladorMatricula controladorMatricula, ControladorPeriodoLectivo cpl, ControladorModalidad cm,
            ControladorEspecialidad ce, ControladorGrupo cg, ControladorEstudiante ces, ControladorAsignatura ca,
            ControladorDocente cd, ControladorEspacioFisico cef, ControladorNivelAsignatura cn) {
        List<FacturaDet> listFacturaDet = new ArrayList<>();
        String sql = " SELECT * FROM proyecto_final.facturadetalle";
        FacturaDet facturaDet = new FacturaDet();
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                facturaDet.setCodigo(resultado.getInt("FACTURADETALLE_ID".trim()));
                facturaDet.setDescripcion(resultado.getString("FACTURADETALLE_DESCRIPCION".trim()));
                facturaDet.setSubtotal(resultado.getDouble("FACTURADETALLE_SUBTOTAL".trim()));
                facturaDet.setTotal(resultado.getDouble("FACTURADETALLE_TOTAL".trim()));
                facturaDet.setIva(resultado.getDouble("FACTURADETALLE_IVA".trim()));
                int codigoMatricula = resultado.getInt("FACTURADETALLE_MATRICULA".trim());
                facturaDet.setMatricula(controladorMatricula.buscarMatricula(codigoMatricula, cpl, cm, ce));
                listFacturaDet.add(facturaDet);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
            c.desconectar();
            return null;
        }

        return listFacturaDet;
    }

    public String eliminarFactDet(int codigo) {
        String res = "";
        String sql = "DELETE FROM `proyecto_final`.`facturadetalle`"
                + " WHERE FACTURADETALLE_ID = " + "'" + codigo + "'";
        try {

            PreparedStatement ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "ELIMINADA";
        } catch (Exception ex) {
            res = " ERROR ";
            c.desconectar();
        }

        return res;

    }

    
}
