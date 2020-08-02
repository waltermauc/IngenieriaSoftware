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
public class LibroDiario {
    private int codigo;
    private String nombreEmpresa;
    private String descripcion;
    private LibroDetalle libroDetalle;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LibroDetalle getLibroDetalle() {
        return libroDetalle;
    }

    public void setLibroDetalle(LibroDetalle libroDetalle) {
        this.libroDetalle = libroDetalle;
    }
    
    
}
