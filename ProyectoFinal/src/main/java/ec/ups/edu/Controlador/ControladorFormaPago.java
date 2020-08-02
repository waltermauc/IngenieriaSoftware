/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.FormadePago;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rayner
 */
public class ControladorFormaPago {

    private Conexion c;

    public ControladorFormaPago(Conexion c) {
        this.c = c;
    }

    public ControladorFormaPago() {

    }

    public String crearFormadePago(FormadePago formaPago) {
        String res = "";
        String sql = "INSERT INTO FORMADEPAGO"
                + "(FORMAPAGO_CODIGO, FORMAPAGO_VALOR, FORMAPAGO_COMISION) "
                + "VALUES (?,?,?)";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setInt(1, formaPago.getCodigo());
            consulta.setInt(2, formaPago.getValor());
            consulta.setInt(3, formaPago.getComision());

        } catch (Exception e) {
            return "error en la creacion de la forma de pago";
        }
        return res;
     }
    public FormadePago buscarFormaPago (int codigo){
       String resulta ="";
         FormadePago forma = new FormadePago() {
           @Override
           public int calcularComision() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public int calcularTotal() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
         };
         
       try {
            String sql = "SELECT * FROM FORMADEPAGO "
                    + "WHERE FORMAPAGO_ID = " + "'" + codigo + "'";
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

                forma.setCodigo(resultado.getInt("FORMAPAGO_ID".trim()));
                forma.setValor(resultado.getInt("FORMAPAGO_VALOR".trim()));
                forma.setComision(resultado.getInt("FORMAPAGO_COMISION".trim()));

            }
        } catch (Exception e) {
            c.desconectar();
            return null;
        }
         
         
        return forma;  
    }
    public String actualizarFormaPago (FormadePago forma, int codigoActualizar){
        String resultado = "";
        String sql = "UPDATE FORMAPAGO"
                + " SET FORMAPAGO_ID = " + " ' " + forma.getCodigo()+ " ' " + ","
                + "  FORMAPAGO_VALOR =" + " ' " + forma.getValor()+ " ' " + ","
                + "  FORMAPAGO_COMISION =  " + " ' " + forma.getComision()+ " ' " + ","
                + "WHERE FORMAPAGO_ID =" + " ' " + codigoActualizar + " ' ";
        try {

            PreparedStatement ps;
            ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            resultado= "exito al actualizar";

        } catch (Exception ex) {
            c.desconectar();
            resultado=  "ERROR ";
            
        }
        return resultado;
    } 
    
    public String elimiarFormaPago (int codigoEliminar){
        String resultadoElimiar= "";
        String sql = "DELETE FROM FORMAPAGO"
                + " WHERE FORMAPAGO_ID = " + "'" + codigoEliminar + "'";
        try {

            PreparedStatement ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            resultadoElimiar = "FORMAPAGO ELIMINADO";
        } catch (Exception ex) {
            resultadoElimiar = " ERROR ";
            c.desconectar();
        }

        return resultadoElimiar;
    }
   public List <FormadePago> listarFormaPago(){
       List<FormadePago> listaForma = new ArrayList<>();
       String sql = "SELECT GRUPO_ID,"
                + "GRUPO_ASIGNTURA,"
                + "GRUPO_ESPACIOFISICO, "
                + "GRUPO_DOCENTE,"
                + " FROM GRUPO";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
        }catch (Exception ex) {
            ex.printStackTrace();
            c.desconectar();

        }
    return listaForma;   
   }
    
    }

     

