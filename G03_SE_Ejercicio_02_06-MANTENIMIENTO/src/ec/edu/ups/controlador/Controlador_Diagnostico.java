/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.CitaMedica;
import ec.edu.ups.modelo.HistoriaClinica;
import java.util.ArrayList;

/**
 *
 * @author rober
 */
public class Controlador_Diagnostico {
    private CitaMedica citaMedica; 
    
    private ArrayList<HistoriaClinica> historiaClinicaList;

    public Controlador_Diagnostico(CitaMedica citaMedica, ArrayList<HistoriaClinica> historiaClinicaList) {
        this.citaMedica = citaMedica;
        this.historiaClinicaList = historiaClinicaList;
    }

    public Controlador_Diagnostico() {
    }
    
    public void mostrarDiagnostico(){
        
    }
    
    public void nuevaHostoriaClinica(HistoriaClinica historiaClinica){
        
    }
    
}
