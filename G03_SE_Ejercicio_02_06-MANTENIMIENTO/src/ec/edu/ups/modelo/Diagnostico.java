/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.List;

/**
 *
 * @author hp
 */
public class Diagnostico {
    private int codigoDiagnostico;
    private String enfermedadActual;
    private String tratamiento;
    private CitaMedica citamedica;

    public Diagnostico() {
    }

    public Diagnostico(int codigoDiagnostico, String enfermedadActual, String tratamiento, CitaMedica citamedica) {
        this.codigoDiagnostico = codigoDiagnostico;
        this.enfermedadActual = enfermedadActual;
        this.tratamiento = tratamiento;
        this.citamedica = citamedica;
    }

    public int getCodigoDiagnostico() {
        return codigoDiagnostico;
    }

    public void setCodigoDiagnostico(int codigoDiagnostico) {
        this.codigoDiagnostico = codigoDiagnostico;
    }

    public String getEnfermedadActual() {
        return enfermedadActual;
    }

    public void setEnfermedadActual(String enfermedadActual) {
        this.enfermedadActual = enfermedadActual;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public CitaMedica getCitamedica() {
        return citamedica;
    }

    public void setCitamedica(CitaMedica citamedica) {
        this.citamedica = citamedica;
    }

 
    public void mostrarDiagnostico(){
        
    }
    public void nuevaHistoriaClinica(){
        
    }
    
}
