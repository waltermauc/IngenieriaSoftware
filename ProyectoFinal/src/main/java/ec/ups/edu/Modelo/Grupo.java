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
    private Asignatura asignaturaCodigo;
    private EspacioFisico codigoEspacioFisico;
    private Docente docente;
    private Horario horario;

    public int getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(int codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public Asignatura getAsignaturaCodigo() {
        return asignaturaCodigo;
    }

    public void setAsignaturaCodigo(Asignatura asignaturaCodigo) {
        this.asignaturaCodigo = asignaturaCodigo;
    }

    public EspacioFisico getCodigoEspacioFisico() {
        return codigoEspacioFisico;
    }

    public void setCodigoEspacioFisico(EspacioFisico codigoEspacioFisico) {
        this.codigoEspacioFisico = codigoEspacioFisico;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
 

 

}
