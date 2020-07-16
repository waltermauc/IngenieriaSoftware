/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modulogrupo;

import ec.ups.edu.Controlador.ControladorFacturaDet;
import ec.ups.edu.Modelo.FacturaDet;
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
public class ControladorFacturaDetTest {
    
    public ControladorFacturaDetTest() {
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
     * Test of crearFactDet method, of class ControladorFacturaDet.
     */
    @Test
    public void testCrearFactDet() {
        System.out.println("crearFactDet");
        FacturaDet detalle = null;
        ControladorFacturaDet instance = new ControladorFacturaDet();
        String expResult = "crear Det";
        String result = instance.crearFactDet(detalle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarFactDet method, of class ControladorFacturaDet.
     */
    @Test
    public void testModificarFactDet() {
        System.out.println("modificarFactDet");
        int codigo = 0;
        ControladorFacturaDet instance = new ControladorFacturaDet();
        String expResult = "modi Det";
        String result = instance.modificarFactDet(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarFactDet method, of class ControladorFacturaDet.
     */
    @Test
    public void testListarFactDet() {
        System.out.println("listarFactDet");
        ControladorFacturaDet instance = new ControladorFacturaDet();
        String expResult = "listar Det";
        String result = instance.listarFactDet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarFactDet method, of class ControladorFacturaDet.
     */
    @Test
    public void testEliminarFactDet() {
        System.out.println("eliminarFactDet");
        int codigo = 0;
        ControladorFacturaDet instance = new ControladorFacturaDet();
        String expResult = "eliminar De";
        String result = instance.eliminarFactDet(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
