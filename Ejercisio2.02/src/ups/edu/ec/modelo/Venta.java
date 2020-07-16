/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

import java.util.Date;

/**
 *
 * @author 59396
 */
public class Venta {
    private int cod_compra;
    private Date fecha;
    private Cliente cliente;

  public Venta() {
  }

    public Venta(int cod_compra, Date fecha, Cliente cliente) {
        this.cod_compra = cod_compra;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getCod_compra() {
        return cod_compra;
    }

    public void setCod_compra(int cod_compra) {
        this.cod_compra = cod_compra;
    }

 

public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}

