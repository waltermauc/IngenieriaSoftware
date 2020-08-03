/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Vista;

import ec.ups.edu.Controlador.Conexion;
import ec.ups.edu.Controlador.ControladorAsignatura;
import ec.ups.edu.Controlador.ControladorDocente;
import ec.ups.edu.Controlador.ControladorHorario;
import ec.ups.edu.Controlador.ControladorNivelAsignatura;
import ec.ups.edu.Modelo.Asignatura;
import ec.ups.edu.Modelo.Docente;
import ec.ups.edu.Modelo.Horario;

/**
 *
 * @author 59396
 */
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion c = new Conexion();
        ControladorNivelAsignatura controladorNivelAsignatura = new ControladorNivelAsignatura(c);
        ControladorAsignatura controladorAsignatura = new ControladorAsignatura(c);
        ControladorDocente controladorDocente = new ControladorDocente(c);
        ControladorHorario controladorHorario = new ControladorHorario(c);
        for (Horario h : controladorHorario.listar()){
            System.out.println(h);
        }
    }

}
