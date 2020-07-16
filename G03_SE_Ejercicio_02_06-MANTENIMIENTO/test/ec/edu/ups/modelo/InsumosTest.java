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
public class InsumosTest {
    
    public InsumosTest() {
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
     * Test of getCodigoInsumo method, of class Insumos.
     */
    @Test
    public void testGetCodigoInsumo() {
        System.out.println("getCodigoInsumo");
        Insumos instance = new Insumos();
        int expResult = 0;
        int result = instance.getCodigoInsumo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoInsumo method, of class Insumos.
     */
    @Test
    public void testSetCodigoInsumo() {
        System.out.println("setCodigoInsumo");
        int codigoInsumo = 0;
        Insumos instance = new Insumos();
        instance.setCodigoInsumo(codigoInsumo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Insumos.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Insumos instance = new Insumos();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Insumos.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Insumos instance = new Insumos();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStock method, of class Insumos.
     */
    @Test
    public void testGetStock() {
        System.out.println("getStock");
        Insumos instance = new Insumos();
        int expResult = 0;
        int result = instance.getStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStock method, of class Insumos.
     */
    @Test
    public void testSetStock() {
        System.out.println("setStock");
        int stock = 0;
        Insumos instance = new Insumos();
        instance.setStock(stock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Insumos.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Insumos instance = new Insumos();
        double expResult = 0.0;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Insumos.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 0.0;
        Insumos instance = new Insumos();
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarca method, of class Insumos.
     */
    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        Insumos instance = new Insumos();
        String expResult = "";
        String result = instance.getMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarca method, of class Insumos.
     */
    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = "";
        Insumos instance = new Insumos();
        instance.setMarca(marca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarInsumos method, of class Insumos.
     */
    @Test
    public void testAgregarInsumos() {
        System.out.println("agregarInsumos");
        Insumos instance = new Insumos();
        instance.agregarInsumos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarInsumos method, of class Insumos.
     */
    @Test
    public void testActualizarInsumos() {
        System.out.println("actualizarInsumos");
        Insumos instance = new Insumos();
        instance.actualizarInsumos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarInsumos method, of class Insumos.
     */
    @Test
    public void testBuscarInsumos() {
        System.out.println("buscarInsumos");
        Insumos instance = new Insumos();
        instance.buscarInsumos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
