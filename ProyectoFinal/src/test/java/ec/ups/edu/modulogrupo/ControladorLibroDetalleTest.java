/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modulogrupo;

import ec.ups.edu.Controlador.ControladorLibroDetalle;
import ec.ups.edu.Modelo.LibroDetalle;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 59396
 */
public class ControladorLibroDetalleTest {
    
    public ControladorLibroDetalleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of crearDetalle method, of class ControladorLibroDetalle.
     */
    @Test
    public void testCrearDetalle() {
        System.out.println("crearDetalle");
        LibroDetalle l = null;
        ControladorLibroDetalle instance = new ControladorLibroDetalle();
        String expResult = "Detalle creado";
        String result = instance.crearDetalle(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of buscarDetalle method, of class ControladorLibroDetalle.
     */
    @Test
    public void testBuscarDetalle() {
        System.out.println("buscar");
        int codigo = 0;
        ControladorLibroDetalle instance = new ControladorLibroDetalle();
        String expResult = "Detalle";
        String result = instance.buscarDetalle(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarDetalle method, of class ControladorLibroDetalle.
     */
    @Test
    public void testEliminarDetalle() {
        System.out.println("eliminar");
        int codigo = 0;
        ControladorLibroDetalle instance = new ControladorLibroDetalle();
        String expResult = "Detalle eliminado";
        String result = instance.eliminarDetalle(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarDetalle method, of class ControladorLibroDetalle.
     */
    @Test
    public void testModificarDetalle() {
        System.out.println("modificar");
        int codigo = 0;
        ControladorLibroDetalle instance = new ControladorLibroDetalle();
        String expResult = "Detalle modificado";
        String result = instance.modificarDetalle(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarDetalle method, of class ControladorLibroDetalle.
     */
    @Test
    public void testListarDetalle() {
        System.out.println("listar");
        ControladorLibroDetalle instance = new ControladorLibroDetalle();
        List expResult = new ArrayList();
        List<LibroDetalle> result = instance.listarDetalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
