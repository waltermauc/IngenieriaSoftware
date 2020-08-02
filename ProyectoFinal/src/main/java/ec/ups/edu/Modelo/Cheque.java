/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Modelo;

import java.util.Date;

/**
 *
 * @author rayner
 */
public class Cheque {
    private int codigo;
    private Persona personaCheque;
    private int  numeroCheque;
    private Date fechaVencimientoCheque;
    private int valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Persona getPersonaCheque() {
        return personaCheque;
    }

    public void setPersonaCheque(Persona personaCheque) {
        this.personaCheque = personaCheque;
    }

    public int getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(int numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public Date getFechaVencimientoCheque() {
        return fechaVencimientoCheque;
    }

    public void setFechaVencimientoCheque(Date fechaVencimientoCheque) {
        this.fechaVencimientoCheque = fechaVencimientoCheque;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
