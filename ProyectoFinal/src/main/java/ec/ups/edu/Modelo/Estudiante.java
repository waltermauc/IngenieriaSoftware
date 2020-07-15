/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author 59396
 */
public class Estudiante extends Persona{
    private int codigo;
    private Date inscripcion;
    private Persona persona;

    public Estudiante(){
        
    }

    public Estudiante(int codigo, Date inscripcion, Persona persona) {
        this.codigo = codigo;
        this.inscripcion = inscripcion;
        this.persona = persona;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(Date inscripcion) {
        this.inscripcion = inscripcion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
   
     
   
    
            
}
