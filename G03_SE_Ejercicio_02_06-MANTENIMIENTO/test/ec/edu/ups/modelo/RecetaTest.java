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
public class RecetaTest {
    
    public RecetaTest() {
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
     * Test of getCodigoReceta method, of class Receta.
     */
    @Test
    public void testGetCodigoReceta() {
        System.out.println("getCodigoReceta");
        Receta instance = new Receta();
        int expResult = 0;
        int result = instance.getCodigoReceta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoReceta method, of class Receta.
     */
    @Test
    public void testSetCodigoReceta() {
        System.out.println("setCodigoReceta");
        int codigoReceta = 0;
        Receta instance = new Receta();
        instance.setCodigoReceta(codigoReceta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Receta.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Receta instance = new Receta();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Receta.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Receta instance = new Receta();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndicaciones method, of class Receta.
     */
    @Test
    public void testGetIndicaciones() {
        System.out.println("getIndicaciones");
        Receta instance = new Receta();
        String expResult = "";
        String result = instance.getIndicaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIndicaciones method, of class Receta.
     */
    @Test
    public void testSetIndicaciones() {
        System.out.println("setIndicaciones");
        String indicaciones = "";
        Receta instance = new Receta();
        instance.setIndicaciones(indicaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedico method, of class Receta.
     */
    @Test
    public void testGetMedico() {
        System.out.println("getMedico");
        Receta instance = new Receta();
        Medico expResult = null;
        Medico result = instance.getMedico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedico method, of class Receta.
     */
    @Test
    public void testSetMedico() {
        System.out.println("setMedico");
        Medico medico = null;
        Receta instance = new Receta();
        instance.setMedico(medico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaciente method, of class Receta.
     */
    @Test
    public void testGetPaciente() {
        System.out.println("getPaciente");
        Receta instance = new Receta();
        Paciente expResult = null;
        Paciente result = instance.getPaciente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaciente method, of class Receta.
     */
    @Test
    public void testSetPaciente() {
        System.out.println("setPaciente");
        Paciente paciente = null;
        Receta instance = new Receta();
        instance.setPaciente(paciente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiagnostico method, of class Receta.
     */
    @Test
    public void testGetDiagnostico() {
        System.out.println("getDiagnostico");
        Receta instance = new Receta();
        Diagnostico expResult = null;
        Diagnostico result = instance.getDiagnostico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiagnostico method, of class Receta.
     */
    @Test
    public void testSetDiagnostico() {
        System.out.println("setDiagnostico");
        Diagnostico diagnostico = null;
        Receta instance = new Receta();
        instance.setDiagnostico(diagnostico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimirReceta method, of class Receta.
     */
    @Test
    public void testImprimirReceta() {
        System.out.println("imprimirReceta");
        Receta instance = new Receta();
        instance.imprimirReceta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
