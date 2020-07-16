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
public class MedicoTest {
    
    public MedicoTest() {
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
     * Test of getEspecialidad method, of class Medico.
     */
    @Test
    public void testGetEspecialidad() {
        System.out.println("getEspecialidad");
        Medico instance = new Medico();
        String expResult = "";
        String result = instance.getEspecialidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEspecialidad method, of class Medico.
     */
    @Test
    public void testSetEspecialidad() {
        System.out.println("setEspecialidad");
        String especialidad = "";
        Medico instance = new Medico();
        instance.setEspecialidad(especialidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroConsultorio method, of class Medico.
     */
    @Test
    public void testGetNumeroConsultorio() {
        System.out.println("getNumeroConsultorio");
        Medico instance = new Medico();
        String expResult = "";
        String result = instance.getNumeroConsultorio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroConsultorio method, of class Medico.
     */
    @Test
    public void testSetNumeroConsultorio() {
        System.out.println("setNumeroConsultorio");
        String numeroConsultorio = "";
        Medico instance = new Medico();
        instance.setNumeroConsultorio(numeroConsultorio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContrasena method, of class Medico.
     */
    @Test
    public void testGetContrasena() {
        System.out.println("getContrasena");
        Medico instance = new Medico();
        String expResult = "";
        String result = instance.getContrasena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContrasena method, of class Medico.
     */
    @Test
    public void testSetContrasena() {
        System.out.println("setContrasena");
        String contrasena = "";
        Medico instance = new Medico();
        instance.setContrasena(contrasena);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularEdad method, of class Medico.
     */
    @Test
    public void testCalcularEdad() {
        System.out.println("calcularEdad");
        Medico instance = new Medico();
        int expResult = 0;
        int result = instance.calcularEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
