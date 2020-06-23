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
public class Secretaria extends Persona {

    private String contrasena;

    public Secretaria() {
    }

    public Secretaria(String contrasena, int codigoPersona, String cedula, String nombres, String apellidos, String direccion, String correo, Date fechaNacimiento, String sexo) {
        super(codigoPersona, cedula, nombres, apellidos, direccion, correo, fechaNacimiento, sexo);
        this.contrasena = contrasena;
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
