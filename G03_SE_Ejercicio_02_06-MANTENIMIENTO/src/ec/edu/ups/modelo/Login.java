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
public class Login  {

    private Persona persona;
    private String correo;
    private String contrasena;

    public Login() {
    }

    public Login(Persona persona, String correo, String contrasena) {
        this.persona = persona;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
 
    
    public void validarCorreo(){
        
    }
    
    public void validarContrasena(){
        
    }

}
