/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

/**
 *
 * @author 59396
 */
public class Cliente {

    private int cod_cliente;
    private String nombre;

    public Cliente() {
    }

    public Cliente(int cod_cliente, String nombre) {
        this.cod_cliente = cod_cliente;
        this.nombre = nombre;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cod_cliente=" + cod_cliente + ", nombre=" + nombre + '}';
    }

}
