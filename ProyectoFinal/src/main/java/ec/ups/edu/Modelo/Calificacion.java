/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.ups.edu.Modelo;

import java.util.List;


/**
 *
 * @author 59396
 */
public class Calificacion {
    private int codigo;
    private List<Persona> estudiantes;
    private int promedio;
    private List<Quimestre> quimestre;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Persona> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Persona> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public List<Quimestre> getQuimestre() {
        return quimestre;
    }

    public void setQuimestre(List<Quimestre> quimestre) {
        this.quimestre = quimestre;
    }
    
    
    
}
