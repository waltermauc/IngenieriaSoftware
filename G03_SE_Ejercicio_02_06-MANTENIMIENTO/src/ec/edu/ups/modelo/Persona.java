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
public abstract class Persona {

    protected int codigoPersona;
    protected String cedula;
    protected String nombres;
    protected String apellidos;
    protected String direccion;
    protected String correo;
    protected Date fechaNacimiento;
    protected String sexo;

    public Persona(int codigoPersona, String cedula, String nombres, String apellidos, String direccion, String correo, Date fechaNacimiento, String sexo) {
        this.codigoPersona = codigoPersona;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public Persona() {
    }
    

    public int getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(int codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

 public abstract int calcularEdad();
     
}

