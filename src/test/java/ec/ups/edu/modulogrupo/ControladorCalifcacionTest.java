/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modulogrupo;

import ec.ups.edu.Controlador.ControladorCalifcacion;
import ec.ups.edu.Modelo.Calificacion;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 59396
 */
public class ControladorCalifcacionTest {
    
    public ControladorCalifcacionTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    

    /**
     * Test of crearCalificacion method, of class ControladorCalifcacion.
     */
    @org.junit.jupiter.api.Test
    public void testCrearCalificacion() {
        System.out.println("crearCalificacion");
        Calificacion c = null;
        ControladorCalifcacion instance = new ControladorCalifcacion();
        String expResult = "Calificacion creada";
        String result = instance.crearCalificacion(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCalificacion method, of class ControladorCalifcacion.
     */
    @org.junit.jupiter.api.Test
    public void testBuscarCalificacion() {
        System.out.println("buscarCalificacion");
        int codigo = 0;
        ControladorCalifcacion instance = new ControladorCalifcacion();
        String expResult = "Calificacion";
        String result = instance.buscarCalificacion(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarCalificacion method, of class ControladorCalifcacion.
     */
    @org.junit.jupiter.api.Test
    public void testEliminarCalificacion() {
        System.out.println("eliminarCalificacion");
        int codigo = 0;
        ControladorCalifcacion instance = new ControladorCalifcacion();
        String expResult = "Calificacion eliminado";
        String result = instance.eliminarCalificacion(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarCalificacion method, of class ControladorCalifcacion.
     */
    @org.junit.jupiter.api.Test
    public void testModificarCalificacion() {
        System.out.println("modificarCalificacion");
        int codigo = 0;
        ControladorCalifcacion instance = new ControladorCalifcacion();
        String expResult = "Calificacion modificada";
        String result = instance.modificarCalificacion(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of listarCalificacion method, of class ControladorCalifcacion.
     */
    @org.junit.jupiter.api.Test
    public void testListarCalificacion() {
        System.out.println("listarCalificacion");
        ControladorCalifcacion instance = new ControladorCalifcacion();
        List expResult = new ArrayList() ;
        List<Calificacion> result = instance.listarCalificacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
