/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

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
public class FacturaDetalleTest {
    
    public FacturaDetalleTest() {
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
     * Test of getCodigoFacD method, of class FacturaDetalle.
     */
    @Test
    public void testGetCodigoFacD() {
        System.out.println("getCodigoFacD");
        FacturaDetalle instance = new FacturaDetalle();
        int expResult = 0;
        int result = instance.getCodigoFacD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoFacD method, of class FacturaDetalle.
     */
    @Test
    public void testSetCodigoFacD() {
        System.out.println("setCodigoFacD");
        int codigoFacD = 0;
        FacturaDetalle instance = new FacturaDetalle();
        instance.setCodigoFacD(codigoFacD);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCosto method, of class FacturaDetalle.
     */
    @Test
    public void testGetCosto() {
        System.out.println("getCosto");
        FacturaDetalle instance = new FacturaDetalle();
        double expResult = 0.0;
        double result = instance.getCosto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCosto method, of class FacturaDetalle.
     */
    @Test
    public void testSetCosto() {
        System.out.println("setCosto");
        double costo = 0.0;
        FacturaDetalle instance = new FacturaDetalle();
        instance.setCosto(costo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIva method, of class FacturaDetalle.
     */
    @Test
    public void testGetIva() {
        System.out.println("getIva");
        FacturaDetalle instance = new FacturaDetalle();
        double expResult = 0.0;
        double result = instance.getIva();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIva method, of class FacturaDetalle.
     */
    @Test
    public void testSetIva() {
        System.out.println("setIva");
        double iva = 0.0;
        FacturaDetalle instance = new FacturaDetalle();
        instance.setIva(iva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubtotal method, of class FacturaDetalle.
     */
    @Test
    public void testGetSubtotal() {
        System.out.println("getSubtotal");
        FacturaDetalle instance = new FacturaDetalle();
        double expResult = 0.0;
        double result = instance.getSubtotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubtotal method, of class FacturaDetalle.
     */
    @Test
    public void testSetSubtotal() {
        System.out.println("setSubtotal");
        double subtotal = 0.0;
        FacturaDetalle instance = new FacturaDetalle();
        instance.setSubtotal(subtotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class FacturaDetalle.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        FacturaDetalle instance = new FacturaDetalle();
        double expResult = 0.0;
        double result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class FacturaDetalle.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        double total = 0.0;
        FacturaDetalle instance = new FacturaDetalle();
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularTotal method, of class FacturaDetalle.
     */
    @Test
    public void testCalcularTotal() {
        System.out.println("calcularTotal");
        FacturaDetalle instance = new FacturaDetalle();
        instance.calcularTotal();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
