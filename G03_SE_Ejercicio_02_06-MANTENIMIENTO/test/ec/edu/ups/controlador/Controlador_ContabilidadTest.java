/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

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
public class Controlador_ContabilidadTest {
    
    public Controlador_ContabilidadTest() {
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
     * Test of calcularTotalIngresos method, of class Controlador_Contabilidad.
     */
    @Test
    public void testCalcularTotalIngresos() {
        System.out.println("calcularTotalIngresos");
        Controlador_Contabilidad instance = new Controlador_Contabilidad();
        instance.calcularTotalIngresos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularTotalEgresos method, of class Controlador_Contabilidad.
     */
    @Test
    public void testCalcularTotalEgresos() {
        System.out.println("calcularTotalEgresos");
        Controlador_Contabilidad instance = new Controlador_Contabilidad();
        instance.calcularTotalEgresos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarReporte method, of class Controlador_Contabilidad.
     */
    @Test
    public void testGenerarReporte() {
        System.out.println("generarReporte");
        Controlador_Contabilidad instance = new Controlador_Contabilidad();
        instance.generarReporte();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
