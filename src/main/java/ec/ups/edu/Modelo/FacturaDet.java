/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Modelo;

import ec.ups.edu.Controlador.*;

/**
 *
 * @author DELL
 */
public class FacturaDet {
    int codigo;
    String descripcion;
    Double subtotal;
    Double total;
    Double iva;
    Matricula matricula;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public ec.ups.edu.Modelo.Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(ec.ups.edu.Modelo.Matricula matricula) {
        this.matricula = matricula;
    }
    
    
}
