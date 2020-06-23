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
public class EspacioFisico {
    private int codigoEspacioFisico;
    private int numeroDesignadoAula;
    private String nombreEdificio;

    public int getCodigoEspacioFisico() {
        return codigoEspacioFisico;
    }

    public void setCodigoEspacioFisico(int codigoEspacioFisico) {
        this.codigoEspacioFisico = codigoEspacioFisico;
    }

    public int getNumeroDesignadoAula() {
        return numeroDesignadoAula;
    }

    public void setNumeroDesignadoAula(int numeroDesignadoAula) {
        this.numeroDesignadoAula = numeroDesignadoAula;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }
    
}
