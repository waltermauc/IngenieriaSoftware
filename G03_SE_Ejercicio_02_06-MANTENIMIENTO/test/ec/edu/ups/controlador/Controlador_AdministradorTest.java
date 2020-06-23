/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Contabilidad;
import ec.edu.ups.modelo.Insumos;
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
public class Controlador_AdministradorTest {
    
    public Controlador_AdministradorTest() {
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
     * Test of listarInsumos method, of class Controlador_Administrador.
     */
    @Test
    public void testListarInsumos() {
        System.out.println("listarInsumos");
        Controlador_Administrador instance = new Controlador_Administrador();
        ArrayList<Insumos> expResult = null;
        ArrayList<Insumos> result = instance.listarInsumos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarContabilidad method, of class Controlador_Administrador.
     */
    @Test
    public void testListarContabilidad() {
        System.out.println("listarContabilidad");
        Controlador_Administrador instance = new Controlador_Administrador();
        ArrayList<Contabilidad> expResult = null;
        ArrayList<Contabilidad> result = instance.listarContabilidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
