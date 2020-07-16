/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Modelo;

/**
 *
 * @author rayner
 */
public class Asignatura {
    private int codigoAsignatura;
    private String descripcion;
    private int costoCreditos;
    private NivelAsignatura codigoNivelAsignatura;

    public int getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(int codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCostoCreditos() {
        return costoCreditos;
    }

    public void setCostoCreditos(int costoCreditos) {
        this.costoCreditos = costoCreditos;
    }

    public NivelAsignatura getCodigoNivelAsignatura() {
        return codigoNivelAsignatura;
    }

    public void setCodigoNivelAsignatura(NivelAsignatura codigoNivelAsignatura) {
        this.codigoNivelAsignatura = codigoNivelAsignatura;
    }
    
}
