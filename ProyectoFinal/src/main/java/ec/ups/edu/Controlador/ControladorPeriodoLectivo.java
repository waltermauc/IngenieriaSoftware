/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Controlador;

import ec.ups.edu.Modelo.PeriodoLectivo;
import ec.ups.edu.Modelo.Persona;

/**
 *
 * @author DELL
 */
public class ControladorPeriodoLectivo {

   
    public String crearPeriLect(PeriodoLectivo pLectivo) {
        String periodo = "crear Peri";

        return periodo;
    }

    public String editarPeriLect(int codigo) {
        String periodoEdit = "editar Peri";
       
        return periodoEdit;
    }

    public String buscarPeriLect(int codigo) {
        String periodo = "buscar Peri";
        return periodo;
    }

    public boolean eliminarPeriLect(int codigo) {
        return true;
    }

    public String validarCed(Persona cedula) {
        String ced = "validar cedula";
        return ced;
    }

}
