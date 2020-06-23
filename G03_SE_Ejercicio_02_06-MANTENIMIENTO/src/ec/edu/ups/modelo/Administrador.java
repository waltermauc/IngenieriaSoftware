/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Administrador extends Persona {

    private String contrasena;
    private Insumos insumos;
    private Contabilidad contabilidad;

    public Administrador() {
    }

    public Administrador(String contrasena, Insumos insumos, Contabilidad contabilidad, ArrayList<Insumos> listarInsumos, ArrayList<Contabilidad> listarContabilidad) {
        this.contrasena = contrasena;
        this.insumos = insumos;
        this.contabilidad = contabilidad;
        this.listarInsumos = listarInsumos;
        this.listarContabilidad = listarContabilidad;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Insumos getInsumos() {
        return insumos;
    }

    public void setInsumos(Insumos insumos) {
        this.insumos = insumos;
    }

    public Contabilidad getContabilidad() {
        return contabilidad;
    }

    public void setContabilidad(Contabilidad contabilidad) {
        this.contabilidad = contabilidad;
    }

    public ArrayList<Insumos> getListarInsumos() {
        return listarInsumos;
    }

    public void setListarInsumos(ArrayList<Insumos> listarInsumos) {
        this.listarInsumos = listarInsumos;
    }

    public ArrayList<Contabilidad> getListarContabilidad() {
        return listarContabilidad;
    }

    public void setListarContabilidad(ArrayList<Contabilidad> listarContabilidad) {
        this.listarContabilidad = listarContabilidad;
    }
    
    

    @Override
    public int calcularEdad() {
        return 0;
    }

    public ArrayList<Insumos> listarInsumos;
    public ArrayList<Contabilidad> listarContabilidad;

}
