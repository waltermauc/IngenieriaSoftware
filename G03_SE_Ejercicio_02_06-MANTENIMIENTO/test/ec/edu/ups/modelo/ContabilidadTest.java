/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;
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
public class ContabilidadTest {
    
    public ContabilidadTest() {
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
     * Test of getCodigoLibroD method, of class Contabilidad.
     */
    @Test
    public void testGetCodigoLibroD() {
        System.out.println("getCodigoLibroD");
        Contabilidad instance = new Contabilidad();
        int expResult = 0;
        int result = instance.getCodigoLibroD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoLibroD method, of class Contabilidad.
     */
    @Test
    public void testSetCodigoLibroD() {
        System.out.println("setCodigoLibroD");
        int codigoLibroD = 0;
        Contabilidad instance = new Contabilidad();
        instance.setCodigoLibroD(codigoLibroD);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Contabilidad.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Contabilidad instance = new Contabilidad();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Contabilidad.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Contabilidad instance = new Contabilidad();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIngresos method, of class Contabilidad.
     */
    @Test
    public void testGetIngresos() {
        System.out.println("getIngresos");
        Contabilidad instance = new Contabilidad();
        double expResult = 0.0;
        double result = instance.getIngresos();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIngresos method, of class Contabilidad.
     */
    @Test
    public void testSetIngresos() {
        System.out.println("setIngresos");
        double ingresos = 0.0;
        Contabilidad instance = new Contabilidad();
        instance.setIngresos(ingresos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEgresos method, of class Contabilidad.
     */
    @Test
    public void testGetEgresos() {
        System.out.println("getEgresos");
        Contabilidad instance = new Contabilidad();
        double expResult = 0.0;
        double result = instance.getEgresos();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEgresos method, of class Contabilidad.
     */
    @Test
    public void testSetEgresos() {
        System.out.println("setEgresos");
        double egresos = 0.0;
        Contabilidad instance = new Contabilidad();
        instance.setEgresos(egresos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularTotalIngresos method, of class Contabilidad.
     */
    @Test
    public void testCalcularTotalIngresos() {
        System.out.println("calcularTotalIngresos");
        Contabilidad instance = new Contabilidad();
        instance.calcularTotalIngresos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularTotalEgresos method, of class Contabilidad.
     */
    @Test
    public void testCalcularTotalEgresos() {
        System.out.println("calcularTotalEgresos");
        Contabilidad instance = new Contabilidad();
        instance.calcularTotalEgresos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarReporte method, of class Contabilidad.
     */
    @Test
    public void testGenerarReporte() {
        System.out.println("generarReporte");
        Contabilidad instance = new Contabilidad();
        instance.generarReporte();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
