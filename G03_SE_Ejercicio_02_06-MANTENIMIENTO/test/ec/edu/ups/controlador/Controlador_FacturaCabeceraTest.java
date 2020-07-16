/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.FacturaDetalle;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class Controlador_FacturaCabeceraTest {
    
    public Controlador_FacturaCabeceraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of generarFactura method, of class Controlador_FacturaCabecera.
     */
    @Test
    public void testGenerarFactura() {
        System.out.println("generarFactura");
        Controlador_FacturaCabecera instance = new Controlador_FacturaCabecera();
        instance.generarFactura();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaFacturadetalle method, of class Controlador_FacturaCabecera.
     */
    @Test
    public void testListaFacturadetalle() {
        System.out.println("listaFacturadetalle");
        Controlador_FacturaCabecera instance = new Controlador_FacturaCabecera();
        ArrayList<FacturaDetalle> expResult = null;
        ArrayList<FacturaDetalle> result = instance.listaFacturadetalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
