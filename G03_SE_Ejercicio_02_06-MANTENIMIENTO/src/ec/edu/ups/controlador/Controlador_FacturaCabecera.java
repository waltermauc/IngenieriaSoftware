/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.FacturaDetalle;
import ec.edu.ups.modelo.Paciente;
import ec.edu.ups.modelo.Secretaria;
import java.util.ArrayList;

/**
 *
 * @author rober
 */
public class Controlador_FacturaCabecera {
    private Paciente paciente;
    private Secretaria secretaria;
    private ArrayList<FacturaDetalle> facturaDetalleList;

    public Controlador_FacturaCabecera() {
    }

    public Controlador_FacturaCabecera(Paciente paciente, Secretaria secretaria, ArrayList<FacturaDetalle> facturaDetalleList) {
        this.paciente = paciente;
        this.secretaria = secretaria;
        this.facturaDetalleList = facturaDetalleList;
    }
    public void generarFactura(){
        
    }
    public ArrayList<FacturaDetalle> listaFacturadetalle(){
        return null; 
    }  
}
