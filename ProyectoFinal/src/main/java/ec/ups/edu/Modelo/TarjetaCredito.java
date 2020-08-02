/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Modelo;

import java.util.Date;

/**
 *
 * @author rayner
 */
public class TarjetaCredito {
    private int codigo;
    private Persona personaDuenio;
    private int nuemeroTarjeta;
    private Date fechaVencimiento;
    private int codigoSeguridad;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Persona getPersonaDuenio() {
        return personaDuenio;
    }

    public void setPersonaDuenio(Persona personaDuenio) {
        this.personaDuenio = personaDuenio;
    }

    public int getNuemeroTarjeta() {
        return nuemeroTarjeta;
    }

    public void setNuemeroTarjeta(int nuemeroTarjeta) {
        this.nuemeroTarjeta = nuemeroTarjeta;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }
    
    
}
