/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Modelo;


/**
 *
 * @author 59396
 */
public abstract class FormadePago {
    private int codigo;
    private int valor;
    private int comision;
    
    public abstract int calcularComision();
    public abstract int calcularTotal();
    
    
    
}
