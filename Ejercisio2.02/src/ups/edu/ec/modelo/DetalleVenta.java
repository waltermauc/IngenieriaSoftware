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
public class DetalleVenta {
     private int cod_detalle;
    private Libro producto;
    private Venta compra;
    private double cantidad;
    private double precio;

    public DetalleVenta(int cod_detalle, Libro producto, Venta compra, double cantidad, double precio) {
        this.cod_detalle = cod_detalle;
        this.producto = producto;
        this.compra = compra;
        this.cantidad = cantidad;
        this.precio = precio;
    }
   

    public DetalleVenta() {
    }
    

    public int getCod_detalle() {
        return cod_detalle;
    }

    public void setCod_detalle(int cod_detalle) {
        this.cod_detalle = cod_detalle;
    }

    public Libro getProducto() {
        return producto;
    }

    public void setProducto(Libro producto) {
        this.producto = producto;
    }

    public Venta getCompra() {
        return compra;
    }

    public void setCompra(Venta compra) {
        this.compra = compra;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularTotalImpreso(ArrayList<DetalleVenta> listaDetalle){
        int gEnvio= 10 ;
        String total="";
        for (int i = 0; i < listaDetalle.size(); i++) {
            System.out.println("Cliente = " + listaDetalle.get(i).getCompra().getCliente().getNombre());
            System.out.println("Libro = " + listaDetalle.get(i).getProducto().getTitulo());
            System.out.println("Cantidad = " + listaDetalle.get(i).getCantidad());
            System.out.println("Precio Unitario= " + listaDetalle.get(i).getPrecio());
            double comision = (listaDetalle.get(i).getPrecio()*(6.4/100)+0.30);
            System.out.println("Comision = " + comision );
            System.out.println("Gastos envio = " + gEnvio);
            double subtotal_print = listaDetalle.get(i).getCantidad() * listaDetalle.get(i).getPrecio();
            System.out.println("Subtotal = " + listaDetalle.get(i).getCantidad() * listaDetalle.get(i).getPrecio());
            double total_print = comision + gEnvio + subtotal_print;
            total= String.format(Locale.US,"%.2f", total_print);
            System.out.println("TOTAL = " + Double.parseDouble(total));
            System.out.println("\n");
        }
        return Double.parseDouble(total);
    }
    
    public double calcularTotalDigital(ArrayList<DetalleVenta> listaDetalle){
        String total="";
        for (int i = 0; i < listaDetalle.size(); i++) {
            System.out.println("Libro = " + listaDetalle.get(i).getProducto().getTitulo());
            System.out.println("Cantidad = " + listaDetalle.get(i).getCantidad());
            System.out.println("Precio Unitario= " + listaDetalle.get(i).getPrecio());
            double comision = (listaDetalle.get(i).getPrecio()*(5.4/100)+0.30);
            System.out.println("Comision = " +comision);
            double subtotal_print = listaDetalle.get(i).getCantidad() * listaDetalle.get(i).getPrecio();
            System.out.println("Subtotal = " + listaDetalle.get(i).getCantidad() * listaDetalle.get(i).getPrecio());
            double total_print = comision + subtotal_print;
            total= String.format(Locale.US,"%.2f", total_print);
            System.out.println("TOTAL = " + Double.parseDouble(total));
            System.out.println("\n");
        }
        return Double.parseDouble(total);
    }
    
}
