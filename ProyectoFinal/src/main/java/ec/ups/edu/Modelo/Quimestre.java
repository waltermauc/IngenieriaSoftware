/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Modelo;


/**
 *
 * @author 59396
 */
public class Quimestre {
    private int codigo;
    private Matricula matricula;
    private double primerParcial;
    private double segundoParcial;
    private double tercerParcial;
    private double aprovechamiento;
    private double examen;
    private double notaFinal;
    private String estado;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public double getPrimerParcial() {
        return primerParcial;
    }

    public void setPrimerParcial(double primerParcial) {
        this.primerParcial = primerParcial;
    }

    public double getSegundoParcial() {
        return segundoParcial;
    }

    public void setSegundoParcial(double segundoParcial) {
        this.segundoParcial = segundoParcial;
    }

    public double getTercerParcial() {
        return tercerParcial;
    }

    public void setTercerParcial(double tercerParcial) {
        this.tercerParcial = tercerParcial;
    }

    public double getAprovechamiento() {
        return aprovechamiento;
    }

    public void setAprovechamiento(double aprovechamiento) {
        this.aprovechamiento = aprovechamiento;
    }

    public double getExamen() {
        return examen;
    }

    public void setExamen(double examen) {
        this.examen = examen;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
            
    
}
