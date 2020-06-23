/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author hp
 */
public class FacturaDetalle {
    private int codigoFacD;
    private double costo;
    private double iva;
    private double subtotal;
    private double total;

    public FacturaDetalle() {
    }

    public FacturaDetalle(int codigoFacD, double costo, double iva, double subtotal, double total) {
        this.codigoFacD = codigoFacD;
        this.costo = costo;
        this.iva = iva;
        this.subtotal = subtotal;
        this.total = total;
    }

    public int getCodigoFacD() {
        return codigoFacD;
    }

    public void setCodigoFacD(int codigoFacD) {
        this.codigoFacD = codigoFacD;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void calcularTotal(){
        
    }
}
