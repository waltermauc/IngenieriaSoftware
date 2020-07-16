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
public class Credito {

    private int codigo;
    private double precio;
    private Cliente cliente;

    public Credito(int codigo, double precio, Cliente cliente) {
        this.codigo = codigo;
        this.precio = precio;
        this.cliente = cliente;
    }

    public Credito() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void debitarCredito(double monto, ArrayList<Credito> listaCredito,int codigoCliente,double total_print) {
        String montoRecorte = "";
        for (int k = 0; k < listaCredito.size(); k++) {
            if (listaCredito.get(k).getCliente().getCod_cliente() == codigoCliente) {
                monto = (listaCredito.get(k).getPrecio() - total_print);
                montoRecorte = String.format(Locale.US, "%.2f", monto);
                listaCredito.get(k).setPrecio(Double.parseDouble(montoRecorte));

            }
        }
    }

}

