/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

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
public class AdministradorTest {
    
    public AdministradorTest() {
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
     * Test of getContrasena method, of class Administrador.
     */
    @Test
    public void testGetContrasena() {
        System.out.println("getContrasena");
        Administrador instance = new Administrador();
        String expResult = "";
        String result = instance.getContrasena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContrasena method, of class Administrador.
     */
    @Test
    public void testSetContrasena() {
        System.out.println("setContrasena");
        String contrasena = "";
        Administrador instance = new Administrador();
        instance.setContrasena(contrasena);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInsumos method, of class Administrador.
     */
    @Test
    public void testGetInsumos() {
        System.out.println("getInsumos");
        Administrador instance = new Administrador();
        Insumos expResult = null;
        Insumos result = instance.getInsumos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInsumos method, of class Administrador.
     */
    @Test
    public void testSetInsumos() {
        System.out.println("setInsumos");
        Insumos insumos = null;
        Administrador instance = new Administrador();
        instance.setInsumos(insumos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContabilidad method, of class Administrador.
     */
    @Test
    public void testGetContabilidad() {
        System.out.println("getContabilidad");
        Administrador instance = new Administrador();
        Contabilidad expResult = null;
        Contabilidad result = instance.getContabilidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContabilidad method, of class Administrador.
     */
    @Test
    public void testSetContabilidad() {
        System.out.println("setContabilidad");
        Contabilidad contabilidad = null;
        Administrador instance = new Administrador();
        instance.setContabilidad(contabilidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarInsumos method, of class Administrador.
     */
    @Test
    public void testGetListarInsumos() {
        System.out.println("getListarInsumos");
        Administrador instance = new Administrador();
        ArrayList<Insumos> expResult = null;
        ArrayList<Insumos> result = instance.getListarInsumos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListarInsumos method, of class Administrador.
     */
    @Test
    public void testSetListarInsumos() {
        System.out.println("setListarInsumos");
        ArrayList<Insumos> listarInsumos = null;
        Administrador instance = new Administrador();
        instance.setListarInsumos(listarInsumos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListarContabilidad method, of class Administrador.
     */
    @Test
    public void testGetListarContabilidad() {
        System.out.println("getListarContabilidad");
        Administrador instance = new Administrador();
        ArrayList<Contabilidad> expResult = null;
        ArrayList<Contabilidad> result = instance.getListarContabilidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListarContabilidad method, of class Administrador.
     */
    @Test
    public void testSetListarContabilidad() {
        System.out.println("setListarContabilidad");
        ArrayList<Contabilidad> listarContabilidad = null;
        Administrador instance = new Administrador();
        instance.setListarContabilidad(listarContabilidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularEdad method, of class Administrador.
     */
    @Test
    public void testCalcularEdad() {
        System.out.println("calcularEdad");
        Administrador instance = new Administrador();
        int expResult = 0;
        int result = instance.calcularEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
