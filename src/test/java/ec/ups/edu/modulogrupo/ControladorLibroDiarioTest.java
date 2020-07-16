/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modulogrupo;

import ec.ups.edu.Controlador.ControladorLibroDiario;
import ec.ups.edu.Modelo.LibroDiario;
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
public class ControladorLibroDiarioTest {
    
    public ControladorLibroDiarioTest() {
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
     * Test of crearLibro method, of class ControladorLibroDiario.
     */
    @Test
    public void testCrearLibro() {
        System.out.println("crearLibro");
        LibroDiario l = null;
        ControladorLibroDiario instance = new ControladorLibroDiario();
        String expResult = "Detalle creado";
        String result = instance.crearLibro(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarLibro method, of class ControladorLibroDiario.
     */
    @Test
    public void testBuscarLibro() {
        System.out.println("buscarLibro");
        int codigo = 0;
        ControladorLibroDiario instance = new ControladorLibroDiario();
        String expResult = "Detalle";
        String result = instance.buscarLibro(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarLibro method, of class ControladorLibroDiario.
     */
    @Test
    public void testEliminarLibro() {
        System.out.println("eliminarLibro");
        int codigo = 0;
        ControladorLibroDiario instance = new ControladorLibroDiario();
        String expResult = "Detalle eliminado";
        String result = instance.eliminarLibro(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarLibro method, of class ControladorLibroDiario.
     */
    @Test
    public void testModificarLibro() {
        System.out.println("modificarLibro");
        int codigo = 0;
        ControladorLibroDiario instance = new ControladorLibroDiario();
        String expResult = "Detalle modificado";
        String result = instance.modificarLibro(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of listarCalificacion method, of class ControladorLibroDiario.
     */
    @Test
    public void testListarCalificacion() {
        System.out.println("listarCalificacion");
        ControladorLibroDiario instance = new ControladorLibroDiario();
        List expResult = new ArrayList<>();
        List<LibroDiario> result = instance.listarCalificacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
