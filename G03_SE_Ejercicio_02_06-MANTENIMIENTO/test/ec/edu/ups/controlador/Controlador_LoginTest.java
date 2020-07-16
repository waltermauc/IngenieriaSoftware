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
public class Controlador_LoginTest {
    
    public Controlador_LoginTest() {
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
     * Test of validarCorreo method, of class Controlador_Login.
     */
    @Test
    public void testValidarCorreo() {
        System.out.println("validarCorreo");
        Controlador_Login instance = new Controlador_Login();
        instance.validarCorreo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarContrasena method, of class Controlador_Login.
     */
    @Test
    public void testValidarContrasena() {
        System.out.println("validarContrasena");
        Controlador_Login instance = new Controlador_Login();
        instance.validarContrasena();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
