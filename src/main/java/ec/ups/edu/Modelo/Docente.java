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
public class Docente extends Persona{
    private int codigo;
    private String titulo;
    private Persona persona;

    public Docente() {
    }

    public Docente(int codigo, String titulo, Persona persona) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.persona = persona;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
