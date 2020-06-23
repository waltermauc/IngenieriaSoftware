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
public class LibroImpreso extends Libro{
    private int cod_libI;
    private double comisionLibI;
    private double envio;
    
    double precio=0;

    public LibroImpreso() {
        this.comisionLibI = 0;
        this.envio = 20;
    }
    

    public LibroImpreso(int cod_libI,String titulo, String autor, String edicion, double precio) {
        super(cod_libI,titulo, autor, edicion, precio);
    }

    @Override
    public String calcularBase() {
        precio=super.getPrecio();
        return "comision ="+(super.getPrecio()*0.02);
    }

    @Override
    public Double calcularEnvio() {
        comisionLibI = precio * 0.02;
        return comisionLibI;
    }
    public double calcularTotalImpreso(ArrayList<DetalleVenta> listaDetalle){
        int gEnvio=20;
        String total="";
        for (int i = 0; i < listaDetalle.size(); i++) {
            System.out.println("Cliente = " + listaDetalle.get(i).getCompra().getCliente().getNombre());
            System.out.println("Libro = " + listaDetalle.get(i).getProducto().getTitulo());
            System.out.println("Cantidad = " + listaDetalle.get(i).getCantidad());
            System.out.println("Precio Unitario= " + listaDetalle.get(i).getPrecio());
            double comision_print = (listaDetalle.get(i).getProducto().calcularEnvio()) * listaDetalle.get(i).getCantidad();
            System.out.println("Comision = " + (listaDetalle.get(i).getProducto().calcularEnvio()) * listaDetalle.get(i).getCantidad());
            System.out.println("Gastos envio = " + gEnvio);

            double subtotal_print = listaDetalle.get(i).getCantidad() * listaDetalle.get(i).getPrecio();
            System.out.println("Subtotal = " + listaDetalle.get(i).getCantidad() * listaDetalle.get(i).getPrecio());

            double total_print = comision_print + gEnvio + subtotal_print;
            total= String.format(Locale.US,"%.2f", total_print);
            System.out.println("TOTAL = " + Double.parseDouble(total));
        }
        return Double.parseDouble(total);
    }
}
