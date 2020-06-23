/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Contabilidad {

    private int codigoLibroD;
    private Date fecha;
    private double ingresos;
    private double egresos;

    public Contabilidad() {
    }

    public Contabilidad(int codigoLibroD, Date fecha, double ingresos, double egresos) {
        this.codigoLibroD = codigoLibroD;
        this.fecha = fecha;
        this.ingresos = ingresos;
        this.egresos = egresos;
    }

    public int getCodigoLibroD() {
        return codigoLibroD;
    }

    public void setCodigoLibroD(int codigoLibroD) {
        this.codigoLibroD = codigoLibroD;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getEgresos() {
        return egresos;
    }

    public void setEgresos(double egresos) {
        this.egresos = egresos;
    }

    public void calcularTotalIngresos() {
    }

    public void calcularTotalEgresos() {
    }

    public void generarReporte() {

    }
}
