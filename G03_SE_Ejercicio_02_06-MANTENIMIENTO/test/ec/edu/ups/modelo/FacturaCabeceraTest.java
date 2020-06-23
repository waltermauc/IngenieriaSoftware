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
public class FacturaCabeceraTest {
    
    public FacturaCabeceraTest() {
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
     * Test of getCodigoFacC method, of class FacturaCabecera.
     */
    @Test
    public void testGetCodigoFacC() {
        System.out.println("getCodigoFacC");
        FacturaCabecera instance = new FacturaCabecera();
        int expResult = 0;
        int result = instance.getCodigoFacC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoFacC method, of class FacturaCabecera.
     */
    @Test
    public void testSetCodigoFacC() {
        System.out.println("setCodigoFacC");
        int codigoFacC = 0;
        FacturaCabecera instance = new FacturaCabecera();
        instance.setCodigoFacC(codigoFacC);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class FacturaCabecera.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        FacturaCabecera instance = new FacturaCabecera();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class FacturaCabecera.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        FacturaCabecera instance = new FacturaCabecera();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaciente method, of class FacturaCabecera.
     */
    @Test
    public void testGetPaciente() {
        System.out.println("getPaciente");
        FacturaCabecera instance = new FacturaCabecera();
        Paciente expResult = null;
        Paciente result = instance.getPaciente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaciente method, of class FacturaCabecera.
     */
    @Test
    public void testSetPaciente() {
        System.out.println("setPaciente");
        Paciente paciente = null;
        FacturaCabecera instance = new FacturaCabecera();
        instance.setPaciente(paciente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSecretaria method, of class FacturaCabecera.
     */
    @Test
    public void testGetSecretaria() {
        System.out.println("getSecretaria");
        FacturaCabecera instance = new FacturaCabecera();
        Secretaria expResult = null;
        Secretaria result = instance.getSecretaria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSecretaria method, of class FacturaCabecera.
     */
    @Test
    public void testSetSecretaria() {
        System.out.println("setSecretaria");
        Secretaria secretaria = null;
        FacturaCabecera instance = new FacturaCabecera();
        instance.setSecretaria(secretaria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarFactura method, of class FacturaCabecera.
     */
    @Test
    public void testGenerarFactura() {
        System.out.println("generarFactura");
        FacturaCabecera instance = new FacturaCabecera();
        instance.generarFactura();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nuevaFacturaDetalle method, of class FacturaCabecera.
     */
    @Test
    public void testNuevaFacturaDetalle() {
        System.out.println("nuevaFacturaDetalle");
        FacturaCabecera instance = new FacturaCabecera();
        instance.nuevaFacturaDetalle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
