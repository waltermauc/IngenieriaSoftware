/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Modelo;

import ec.ups.edu.Controlador.*;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class FacturaCab {

    int codigo;
    int numeroFact;
    Date fecha;
    FacturaDet detalleFact;
    Persona estudiante;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroFact() {
        return numeroFact;
    }

    public void setNumeroFact(int numeroFact) {
        this.numeroFact = numeroFact;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ec.ups.edu.Modelo.FacturaDet getDetalleFact() {
        return detalleFact;
    }

    public void setDetalleFact(ec.ups.edu.Modelo.FacturaDet detalleFact) {
        this.detalleFact = detalleFact;
    }

    public Persona getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Persona estudiante) {
        this.estudiante = estudiante;
    }

   

}
