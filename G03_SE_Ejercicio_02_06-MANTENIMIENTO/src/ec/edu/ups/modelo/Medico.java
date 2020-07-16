/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Medico extends Persona{

    private String especialidad;
    private String numeroConsultorio;
    private String contrasena;

    public Medico(String especialidad, String numeroConsultorio, String contrasena, int codigoPersona, String cedula, String nombres, String apellidos, String direccion, String correo, Date fechaNacimiento, String sexo) {
        super(codigoPersona, cedula, nombres, apellidos, direccion, correo, fechaNacimiento, sexo);
        this.especialidad = especialidad;
        this.numeroConsultorio = numeroConsultorio;
        this.contrasena = contrasena;
    }
    
    public Medico(){
        
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(String numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    @Override
    public int calcularEdad() {
        return 0;
    }
    
    
    
    
}

