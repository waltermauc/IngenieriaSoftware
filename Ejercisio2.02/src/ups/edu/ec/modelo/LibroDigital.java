/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author 59396
 */
public class LibroDigital extends Libro {

    private int cod_libD;
    private double comision;

    public LibroDigital(int cod_libD, double comision) {
        this.cod_libD = cod_libD;
        this.comision = comision;
    }

    public LibroDigital() {
    }

    public int getCod_libD() {
        return cod_libD;
    }

    public void setCod_libD(int cod_libD) {
        this.cod_libD = cod_libD;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String calcularBase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double calcularEnvio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double calcularTotalDigital(ArrayList<DetalleVenta> listaDetalle) {
        String total = "";
        for (int i = 0; i < listaDetalle.size(); i++) {
            System.out.println("Cliente = " + listaDetalle.get(i).getCompra().getCliente().getNombre());
            System.out.println("Libro = " + listaDetalle.get(i).getProducto().getTitulo());
            System.out.println("Cantidad = " + listaDetalle.get(i).getCantidad());
            System.out.println("Precio Unitario= " + listaDetalle.get(i).getPrecio());

            double comision_print = (listaDetalle.get(i).getProducto().calcularEnvio()) * listaDetalle.get(i).getCantidad();
            System.out.println("Comision = " + (listaDetalle.get(i).getProducto().calcularEnvio()) * listaDetalle.get(i).getCantidad());

            double subtotal_print = listaDetalle.get(i).getCantidad() * listaDetalle.get(i).getPrecio();
            System.out.println("Subtotal = " + listaDetalle.get(i).getCantidad() * listaDetalle.get(i).getPrecio());

            double total_print = comision_print + subtotal_print;
            total = String.format(Locale.US, "%.2f", total_print);
            System.out.println("TOTAL = " + Double.parseDouble(total));
        }
        return Double.parseDouble(total);
    }
}
