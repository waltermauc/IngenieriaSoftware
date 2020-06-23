/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author hp
 */
public class FacturaCabecera {

    private int codigoFacC;
    private Date fecha;
    private Paciente paciente;
    private Secretaria secretaria;

    public FacturaCabecera() {
    }

    public FacturaCabecera(int codigoFacC, Date fecha, Paciente paciente, Secretaria secretaria) {
        this.codigoFacC = codigoFacC;
        this.fecha = fecha;
        this.paciente = paciente;
        this.secretaria = secretaria;
    }

    public int getCodigoFacC() {
        return codigoFacC;
    }

    public void setCodigoFacC(int codigoFacC) {
        this.codigoFacC = codigoFacC;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    public void generarFactura() {

    }

    public void nuevaFacturaDetalle() {

    }
}
