/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Modelo;


import java.util.Date;


/**
 *
 * @author 59396
 */
public class LibroDetalle {
    private int codigo;
    private Date fecha;
    private String descripcion;
    private FacturaCabecera factCabecera;
    private FormadePago formaPago;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public FacturaCabecera getFactCabecera() {
        return factCabecera;
    }

    public void setFactCabecera(FacturaCabecera factCabecera) {
        this.factCabecera = factCabecera;
    }

    public FormadePago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormadePago formaPago) {
        this.formaPago = formaPago;
    }
    
}
