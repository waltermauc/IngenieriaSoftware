/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author hp
 */
public class Insumos {
    
    public int codigoInsumo;
    public String descripcion;
    public int stock;
    public double precio;
    public String marca;

    public Insumos() {
    }

    public Insumos(int codigoInsumo, String descripcion, int stock, double precio, String marca) {
        this.codigoInsumo = codigoInsumo;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.marca = marca;
    }

    public int getCodigoInsumo() {
        return codigoInsumo;
    }

    public void setCodigoInsumo(int codigoInsumo) {
        this.codigoInsumo = codigoInsumo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    public void agregarInsumos(){
        
    }
    
    public void actualizarInsumos(){
        
    }
    
    public void buscarInsumos(){
        
    }
}
