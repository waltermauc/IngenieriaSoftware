/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.FormadePago;
import java.sql.PreparedStatement;

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

    public FormadePago buscarFormaPago(int codigo) {
        String resultad0 = "";
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
return null;
    }
}
