/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Diagnostico;
import ec.edu.ups.modelo.Medico;
import ec.edu.ups.modelo.Paciente;

/**
 *
 * @author rober
 */
public class Controlador_Receta {
    private Medico medico;
    private Paciente paciente;
    private Diagnostico diagnostico;

    public Controlador_Receta(Medico medico, Paciente paciente, Diagnostico diagnostico) {
        this.medico = medico;
        this.paciente = paciente;
        this.diagnostico = diagnostico;
    }

    public Controlador_Receta() {
    }
    
    
}
