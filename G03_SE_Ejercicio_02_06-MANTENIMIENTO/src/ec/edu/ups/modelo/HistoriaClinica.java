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
public class HistoriaClinica {
    
    private int codigoHistoria;
    private String descripcion;
    private String numeroConsultorio;
    private Date fecha;

    public HistoriaClinica() {
    }

    public HistoriaClinica(int codigoHistoria, String descripcion, String numeroConsultorio, Date fecha) {
        this.codigoHistoria = codigoHistoria;
        this.descripcion = descripcion;
        this.numeroConsultorio = numeroConsultorio;
        this.fecha = fecha;
    }

    public int getCodigoHistoria() {
        return codigoHistoria;
    }

    public void setCodigoHistoria(int codigoHistoria) {
        this.codigoHistoria = codigoHistoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(String numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void agregarPaciente() {

    }

    public void eliminarPaciente() {

    }

    public void buscarPaciente() {

    }

    public void actualizarPaciente() {

    }
}
