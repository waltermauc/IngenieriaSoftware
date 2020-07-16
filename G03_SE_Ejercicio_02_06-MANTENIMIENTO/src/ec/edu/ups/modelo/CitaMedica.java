/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author hp
 */
public class CitaMedica {

    private int codigoCita;
    private Date fechaCita;
    private Time horaCita;
    private Paciente paciente;
    private Medico medico;
    private String motivoCita;

    public CitaMedica() {
    }

    public CitaMedica(int codigoCita, Date fechaCita, Time horaCita, Paciente paciente, Medico medico, String motivoCita) {
        this.codigoCita = codigoCita;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.paciente = paciente;
        this.medico = medico;
        this.motivoCita = motivoCita;
    }

    public int getCodigoCita() {
        return codigoCita;
    }

    public void setCodigoCita(int codigoCita) {
        this.codigoCita = codigoCita;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public Time getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(Time horaCita) {
        this.horaCita = horaCita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getMotivoCita() {
        return motivoCita;
    }

    public void setMotivoCita(String motivoCita) {
        this.motivoCita = motivoCita;
    }

    public void agregarCita() {

    }

    public void eliminarCita() {

    }

    public void buscarCita() {

    }

    public void actualizar() {

    }
}
