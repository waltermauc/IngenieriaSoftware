/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

import java.util.ArrayList;

/**
 *
 * @author 59396
 */
public class RecargarCredito {
     private int codigo;
    private double valorRecarga;
    private Credito credito;

    public RecargarCredito(int codigo, double valorRecarga, Credito credito) {
        this.codigo = codigo;
        this.valorRecarga = valorRecarga;
        this.credito = credito;
    }

    

    public RecargarCredito() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorRecarga() {
        return valorRecarga;
    }

    public void setValorRecarga(double valorRecarga) {
        this.valorRecarga = valorRecarga;
    }

    public Credito getCredito() {
        return credito;
    }

    public void setCredito(Credito credito) {
        this.credito = credito;
    }
    
    public void recargarCredito(double monto, ArrayList<Credito> listaCredito,int codigoCliente) {
        for (int k = 0; k < listaCredito.size(); k++) {
            if (listaCredito.get(k).getCliente().getCod_cliente() == codigoCliente) {
                System.out.println("Saldo Anterior = " + listaCredito.get(k).getPrecio());
                monto = monto + listaCredito.get(k).getPrecio();
                listaCredito.get(k).setPrecio(monto);
            }
        }
    }
}
