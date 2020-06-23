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
public class Receta {

    private int codigoReceta;
    private Date fecha;
    private String indicaciones;
    private Medico medico;
    private Paciente paciente;
    private Diagnostico diagnostico;

    public Receta() {
    }

    public Receta(int codigoReceta, Date fecha, String indicaciones, Medico medico, Paciente paciente, Diagnostico diagnostico) {
        this.codigoReceta = codigoReceta;
        this.fecha = fecha;
        this.indicaciones = indicaciones;
        this.medico = medico;
        this.paciente = paciente;
        this.diagnostico = diagnostico;
    }

    public int getCodigoReceta() {
        return codigoReceta;
    }

    public void setCodigoReceta(int codigoReceta) {
        this.codigoReceta = codigoReceta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void imprimirReceta() {

    }
}
