/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;


import ec.ups.edu.Modelo.LibroDetalle;
import ec.ups.edu.Modelo.LibroDiario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 59396
 */
public class ControladorLibroDiario {
    private Conexion c;
    
    public ControladorLibroDiario(Conexion c)
    {
        this.c = c;
    }
    public ControladorLibroDiario(){
        
    }
    public String crearLibro(LibroDiario libroDiario){
        String res = "";
        String sql = "INSERT INTO LIBRODIARIO"
                + "(LIBRO_CODIGO, LIBRO_EMPRESANOMBRE, LIBRO_DESCRIPCION, LIBRO_LIBRODETALLE) "
                + "VALUES (?,?,?,?)";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setInt(1, libroDiario.getCodigo());
            consulta.setString(2, libroDiario.getNombreEmpresa());
            consulta.setString(3, libroDiario.getDescripcion());
            consulta.setInt(4, libroDiario.getLibroDetalle().getCodigo());
            
        } catch (Exception e) {
               return "error en la creacion del libro diario";
        }
        return res;    }
    public LibroDiario buscarLibro(int codigo){
        ControladorLibroDetalle controlLibro = new ControladorLibroDetalle();
        ControladorFacturaCab controlFactura = new ControladorFacturaCab();
        ControladorFormaPago controladorFormaPago = new ControladorFormaPago();
        LibroDiario libro = new LibroDiario();
         try {
            String sql = "SELECT * FROM LIBRODIARIO "
                    + "WHERE LIBRO_CODIGO = " + "'" + codigo + "'";
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {

                libro.setCodigo(resultado.getInt("LIBRO_CODIGO".trim()));
                libro.setNombreEmpresa(resultado.getString("LIBRO_EMPRESANOMBRE".trim()));
                libro.setDescripcion(resultado.getString("LIBRO_DESCRIPCION".trim()));
                int codigoLibroDetalle = resultado.getInt("LIBRO_LIBRODETALLE".trim());
                LibroDetalle asig =controlLibro.buscarLibroDetalle(codigoLibroDetalle, controlFactura, controladorFormaPago);
                libro.setLibroDetalle(asig);
            }
        } catch (Exception e) {
            c.desconectar();
            return null;
        }
        return libro;
    }
    public String eliminarLibro(int codigo){
         String res = "";
        String sql = "DELETE FROM LIBRODIARIO"
                + " WHERE LIBRO_CODIGO = " + "'" + codigo + "'";
        try {

            PreparedStatement ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "LIBRO DIARIO ELIMINADO";
        } catch (Exception ex) {
            res = " ERROR ";
            c.desconectar();
        }

        return res;
    }
     public String modificarLibro(int codigo, LibroDiario libro){
         
      String res = "";
        String sql = "UPDATE LIBRODIARIO"
                + " SET LIBRO_CODIGO = " + " ' " + libro.getCodigo()+ " ' " + ","
                + "  LIBRO_EMPRESANOMBRE =" + " ' " + libro.getNombreEmpresa()+ " ' " + ","
                + "  LIBRO_DESCRIPCION =  " + " ' " + libro.getDescripcion()+ " ' " + ","
                + "  LIBRO_LIBRODETALLE = " + " ' " + libro.getLibroDetalle()+ " ' "
                + "WHERE LIBRO_CODIGO =" + " ' " + codigo + " ' ";
        try {

            PreparedStatement ps;
            ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "LIBRO DIARIO EDITADA";

        } catch (Exception ex) {
            res = "ERROR ";
            c.desconectar();
        }
        return res;
    }
    public List<LibroDiario > listarCalificacion(ControladorLibroDetalle controladorLibro){
        List<LibroDiario> libroDiario = new ArrayList<>();
        ControladorFacturaCab controlFactura = new ControladorFacturaCab();
        ControladorFormaPago controladorFormaPago = new ControladorFormaPago();
       
        String sql = "SELECT GRUPO_ID,"
                + "GRUPO_ASIGNTURA,"
                + "GRUPO_ESPACIOFISICO, "
                + "GRUPO_DOCENTE,"
                + " FROM GRUPO";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
             while (resultado.next()) {
             LibroDiario nuevoLibro = new LibroDiario();
             nuevoLibro.setCodigo(resultado.getInt("".trim()));
             nuevoLibro.setNombreEmpresa(resultado.getString("".trim()));
             nuevoLibro.setDescripcion(resultado.getString("".trim()));
             int codigoLibroDetalle = resultado.getInt("".trim());
             LibroDetalle libroDetalle = controladorLibro.buscarLibroDetalle(codigoLibroDetalle, controlFactura, controladorFormaPago);
             nuevoLibro.setLibroDetalle(libroDetalle);
             
             libroDiario.add(nuevoLibro);
             }
            
        }catch (Exception e){
             e.printStackTrace();
            c.desconectar();
           
        }
        
        return libroDiario ;
    }
}
