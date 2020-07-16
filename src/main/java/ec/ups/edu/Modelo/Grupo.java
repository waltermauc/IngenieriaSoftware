/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Modelo;

import java.util.List;

/**
 *
 * @author rayner
 */
public class Grupo {
    private int codigoGrupo;
    private List <Asignatura> Asignatura;
    private EspacioFisico codigoEspacioFisico;
    private Modalidad codigoModalidad;
    private List <Persona> docente;

    public int getCodigo() {
        return codigoGrupo;
    }

    public void setCodigo(int codigo) {
        this.codigoGrupo = codigo;
    }

    public List<Asignatura> getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(List<Asignatura> Asignatura) {
        this.Asignatura = Asignatura;
    }

    public EspacioFisico getCodigoEspacioFisico() {
        return codigoEspacioFisico;
    }

    public void setCodigoEspacioFisico(EspacioFisico codigoEspacioFisico) {
        this.codigoEspacioFisico = codigoEspacioFisico;
    }

    public Modalidad getCodigoModalidad() {
        return codigoModalidad;
    }

    public void setCodigoModalidad(Modalidad codigoModalidad) {
        this.codigoModalidad = codigoModalidad;
    }

    public List<Persona> getDocente() {
        return docente;
    }

    public void setDocente(List<Persona> docente) {
        this.docente = docente;
    }
    
    
    
}
