/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modulogrupo;

import ec.ups.edu.Controlador.ControladorFacturaCab;
import ec.ups.edu.Modelo.FacturaCab;
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
public class ControladorFacturaCabTest {
    
    public ControladorFacturaCabTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of crearFactCab method, of class ControladorFacturaCab.
     */
    @Test
    public void testCrearFactCab() {
        System.out.println("crearFactCab");
        FacturaCab f = null;
        ControladorFacturaCab instance = new ControladorFacturaCab();
        String expResult = "crear Fac";
        String result = instance.crearFactCab(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarFactCab method, of class ControladorFacturaCab.
     */
    @Test
    public void testModificarFactCab() {
        System.out.println("modificarFactCab");
        int codigo = 0;
        ControladorFacturaCab instance = new ControladorFacturaCab();
        String expResult = "modificar Fac";
        String result = instance.modificarFactCab(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarFactCab method, of class ControladorFacturaCab.
     */
    @Test
    public void testListarFactCab() {
        System.out.println("listarFactCab");
        ControladorFacturaCab instance = new ControladorFacturaCab();
        String expResult = "listar Fact";
        String result = instance.listarFactCab();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarFactCab method, of class ControladorFacturaCab.
     */
    @Test
    public void testEliminarFactCab() {
        System.out.println("eliminarFactCab");
        int codigo = 0;
        ControladorFacturaCab instance = new ControladorFacturaCab();
        String expResult = "eliminar Fact";
        String result = instance.eliminarFactCab(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
