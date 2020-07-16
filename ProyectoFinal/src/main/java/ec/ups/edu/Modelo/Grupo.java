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
    private Docente docenteCodigo;

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

    public int getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(int codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public Asignatura getC() {
        return asignaturaCodigo;
    }

    public void setC(Asignatura c) {
        this.asignaturaCodigo = c;
    }

    public Docente getDocenteCodigo() {
        return docenteCodigo;
    }

    public void setDocenteCodigo(Docente docenteCodigo) {
        this.docenteCodigo = docenteCodigo;
    }

}
