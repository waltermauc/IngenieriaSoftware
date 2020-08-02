/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;
import ec.ups.edu.Modelo.Estudiante;
import ec.ups.edu.Modelo.FacturaCab;
import ec.ups.edu.Modelo.FacturaDet;
import java.io.IOException;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DELL
 */
public class ControladorFacturaCab implements AutoCloseable{
    private Conexion c;

    public ControladorFacturaCab() {
    }

    public ControladorFacturaCab(Conexion c) {
        this.c = c;
    }

    public String crearFactCab( FacturaCab factura) {
       String res = "";
        String sql = "INSERT INTO facturacabecera"
                + "(FACTURACABECERA_ID, FACTURACABECERA_FECHA, FACTURACABECERA_DETALLE, FACTURACABECERA_ESTUDIANTE) "
                + "VALUES (?,?,?,?)";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            consulta.setInt(1, factura.getCodigo());
            consulta.setDate(2, (java.sql.Date) factura.getFecha());
            consulta.setInt(3, factura.getDetalleFact().getCodigo());
            consulta.setString(4, factura.getEstudiante().getCedula());
            
        } catch (Exception e) {
           return "error codigo";

        }
        return res;
    }
    public FacturaCab buscarFacturaCabecera(int codigo, ControladorFacturaDet controlFacturaDetalle, ControladorEstudiante controlEstudiante,ControladorMatricula controlMatri)throws IOException {
        String res = "";
        FacturaCab facturaL = new FacturaCab();
        try {
            String sql = "SELECT * FROM facturacabecera "
                    + "WHERE FACTURACABECERA_ID = " + "'" + codigo + "'";
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {
                
                facturaL.setCodigo(resultado.getInt("FACTURACABECERA_ID".trim()));
                facturaL.setFecha(resultado.getDate("FACTURACABECERA_FECHA".trim()));
                FacturaDet detalle = controlFacturaDetalle.buscarFacturaDetalle(codigo, controlMatri);
                facturaL.setDetalleFact(detalle);
                Estudiante estudiante = controlEstudiante.buscarEstudiante(Integer.toString(codigo));
                facturaL.setEstudiante(estudiante);
            }
        } catch (Exception e) {
            c.desconectar();
            return null;
        }
        return facturaL;
    }

    public String modificarFactCab(int codigo, FacturaCab modificarFacturaCabecera) {
        String res = "";
        String sql = "UPDATE facturacabecera"
                + " SET FACTURACABECERA_ID = " + " ' " + modificarFacturaCabecera.getCodigo()+ " ' " + ","
                + "  FACTURACABECERA_FECHA =" + " ' " + modificarFacturaCabecera.getFecha()+ " ' " + ","
                + "  FACTURACABECERA_DETALLE =  " + " ' " + modificarFacturaCabecera.getDetalleFact()+ " ' " + ","
                + "  FACTURACABECERA_ESTUDIANTE = " + " ' " + modificarFacturaCabecera.getEstudiante()+ " ' "
                + "WHERE FACTURACABECERA_ID =" + " ' " + codigo + " ' ";
        try {

            PreparedStatement ps;
            ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "CABECERA FACTURA EDITADA";

        } catch (Exception ex) {
            res = "ERROR ";
            c.desconectar();
        }
        return res;
    }
    public String eliminarFactCab(int codigo) {
        String res = "";
        String sql = "DELETE FROM facturacabecera"
                + " WHERE FACTURACABECERA_ID = " + "'" + codigo + "'";
        try {

            PreparedStatement ps = c.conectado().prepareStatement(sql);
            ps.executeUpdate();
            res = "CABECERA FACTURA ELIMINADO";
        } catch (Exception ex) {
            res = " ERROR ";
            c.desconectar();
        }

        return res;
    }

    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public List <FacturaCab> listarFactCab(ControladorFacturaDet controlFacturaDetalle, ControladorEstudiante controlEstudiante,ControladorMatricula controlMatri) {
        List<FacturaCab> grupoList = new ArrayList<>();
        String sql = "SELECT FACTURACABECERA_ID,"
                + "FACTURACABECERA_FECHA,"
                + "FACTURACABECERA_DETALLE, "
                + "FACTURACABECERA_ESTUDIANTE,"
                + " FROM FACTURACABECERA";
        try {
            PreparedStatement consulta = c.conectado().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();    
               while (resultado.next()) {
                   FacturaCab facutra = new FacturaCab();
                   facutra.setCodigo(resultado.getInt("FACTURACABECERA_ID".trim()));
                   facutra.setFecha(resultado.getDate("FACTURACABECERA_FECHA".trim()));
                   int codigoFacturaDetalle = resultado.getInt("FACTURACABECERA_DETALLE".trim());
                   FacturaDet factu = controlFacturaDetalle.buscarFacturaDetalle(codigoFacturaDetalle, controlMatri);
                   facutra.setDetalleFact(factu);
                   int codigoEstudiante = resultado.getInt("FACTURACABECERA_ESTUDIANTE".trim());
                   String s=Integer.toString(codigoEstudiante);
                   Estudiante estudiante = controlEstudiante.buscarEstudiante(s);
                   grupoList.add(facutra);
                   
               }          
        } catch (Exception ex) {
            ex.printStackTrace();
            c.desconectar();

        }
        return grupoList;
    }

}