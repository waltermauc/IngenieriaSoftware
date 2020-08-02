/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;



import ec.ups.edu.Modelo.FacturaCab;
import ec.ups.edu.Modelo.FormadePago;
import ec.ups.edu.Modelo.LibroDetalle;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rayner
 */
public class ControladorLibroDetalle {
    private Conexion c;
    public ControladorLibroDetalle(Conexion c){
        this.c = c;
    }
    public ControladorLibroDetalle (){}
    
    public String crearLibroDetalle(LibroDetalle libro_Detalle)
    {
        String res = "";
        String sql = "INSERT INTO LIBRODETALLE"
                + "(LIBRODETALLE_CODIGO, LIBRODETALLE_FECHA, LIBRODETALLE_DESCRIPCION,"
                + " LIBRODETALLE_FACTURACABECERA,LIBRODETALLE_FORMAPAGO) "
                + "VALUES (?,?,?,?,?)";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setInt(1, libro_Detalle.getCodigo());
            consulta.setDate(2, (java.sql.Date) libro_Detalle.getFecha());
            consulta.setString(3, libro_Detalle.getDescripcion());
            consulta.setInt(4, libro_Detalle.getFactCabecera().getCodigo());
            consulta.setInt(5, libro_Detalle.getFormaPago().getCodigo());
            
        } catch (Exception e) {
                return "error en la creacion del libro diario";
        }
        return res;
    }
    
    public LibroDetalle buscarLibroDetalle(int codigo, ControladorFacturaCab controladorFactura, ControladorFormaPago controladorFormaPago){
        LibroDetalle nuevoLibroDetalle = new LibroDetalle();
        
       try {
            String sql = "SELECT * FROM LIBRODETALLE "
                    + "WHERE LIBRODETALLE_CODIGO = " + "'" + codigo + "'";
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                ControladorFacturaDet controladorFacturaDetalle = new ControladorFacturaDet();
                ControladorEstudiante controladorEstudianteN = new ControladorEstudiante();
                ControladorMatricula controladorMatricula = new ControladorMatricula();
                
                nuevoLibroDetalle.setCodigo(resultado.getInt("LIBRODETALLE_CODIGO".trim()));
                nuevoLibroDetalle.setFecha(resultado.getDate("LIBRODETALLE_FECHA".trim()));
                nuevoLibroDetalle.setDescripcion(resultado.getString("LIBRODETALLE_DESCRIPCION".trim()));
                
                int codigoFacturaCabezera = resultado.getInt("LIBRODETALLE_FACTURACABECERA".trim());
                FacturaCab facturaCabezera = controladorFactura.buscarFacturaCabecera(codigoFacturaCabezera, controladorFacturaDetalle, controladorEstudianteN, controladorMatricula);
                nuevoLibroDetalle.setFactCabecera(facturaCabezera);
                int codigoFormaPago = resultado.getInt("LIBRODETALLE_FORMAPAGO".trim());
                FormadePago formadePago = controladorFormaPago.buscarFormaPago(codigoFormaPago);
                nuevoLibroDetalle.setFormaPago(formadePago);
            }
        } catch (Exception e) {
            c.desconectar();
            return null;
        }
        return nuevoLibroDetalle;
    }
    public String eliminarLibroDetalle(int codigo){
        String res = "";
        String sql = "DELETE FROM LIBRODETALLE"
                + " WHERE LIBRODETALLE_CODIGO = " + "'" + codigo + "'";
        try {

            PreparedStatement ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "LIBRO DETALLE ELIMINADO";
        } catch (Exception ex) {
            res = " ERROR ";
            c.desconectar();
        }

        return res;
    }
     public String modificarLibroDetalle(int codigo, LibroDetalle libroDetalle){
         String res = "";
        String sql = "UPDATE LIBRODETALLE"
                + " SET LIBRODETALLE_CODIGO = " + " ' " + libroDetalle.getCodigo()+ " ' " + ","
                + "  LIBRODETALLE_FECHA =" + " ' " + libroDetalle.getFecha() + " ' " + ","
                + "  LIBRODETALLE_DESCRIPCION =  " + " ' " + libroDetalle.getDescripcion() + " ' " + ","
                + "  LIBRODETALLE_FACTURACABECERA = " + " ' " + libroDetalle.getFactCabecera() + " ' "
                + "  LIBRODETALLE_FORMAPAGO = " + " ' " + libroDetalle.getFormaPago() + " ' "
                + "WHERE LIBRODETALLE_CODIGO =" + " ' " + codigo + " ' ";
        try {

            PreparedStatement ps;
            ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "LIBRO DETALLE ACTUALIZADO";

        } catch (Exception ex) {
            res = "ERROR ";
            c.desconectar();
        }
        return res;
    }
     
    public List<LibroDetalle > listarLibroDetalle(ControladorFacturaCab controladorFactura, ControladorFormaPago controladorPago){
        List<LibroDetalle> libroDetalle = new ArrayList();
        String sql = "SELECT LIBRODETALLE_CODIGO,"
                + "LIBRODETALLE_FECHA,"
                + "LIBRODETALLE_DESCRIPCION, "
                + "LIBRODETALLE_FACTURACABECERA,"
                + "  LIBRODETALLE_FORMAPAGO,"
                + " FROM GRUPO";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                ControladorFacturaDet controlFacturaDetalle = new ControladorFacturaDet();
                ControladorEstudiante controlEstudiante = new  ControladorEstudiante();
                ControladorMatricula controlMatri = new ControladorMatricula();
                LibroDetalle libro = new LibroDetalle();
                libro.setCodigo(resultado.getInt("LIBRODETALLE_CODIGO".trim()));
                libro.setFecha(resultado.getDate("".trim()));
                libro.setDescripcion(resultado.getString("".trim()));
                int codigoFacturaCabecera = resultado.getInt("".trim());
                FacturaCab factura = controladorFactura.buscarFacturaCabecera(codigoFacturaCabecera, controlFacturaDetalle, controlEstudiante, controlMatri);
                libro.setFactCabecera(factura);
                int codigoFormaPago = resultado.getInt("".trim());
                FormadePago pago = controladorPago.buscarFormaPago(codigoFormaPago);
                libro.setFormaPago(pago);
                libroDetalle.add(libro);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            c.desconectar();

        }
        return libroDetalle;
    }
}
