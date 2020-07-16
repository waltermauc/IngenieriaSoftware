/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modulogrupo;

import ec.ups.edu.Controlador.ControladorPeriodoLectivo;
import ec.ups.edu.Modelo.PeriodoLectivo;
import ec.ups.edu.Modelo.Persona;
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
public class ControladorPeriodoLectivoTest {
    
    public ControladorPeriodoLectivoTest() {
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
     * Test of crearPeriLect method, of class ControladorPeriodoLectivo.
     */
    @Test
    public void testCrearPeriLect() {
        System.out.println("crearPeriLect");
        PeriodoLectivo pLectivo = null;
        ControladorPeriodoLectivo instance = new ControladorPeriodoLectivo();
        String expResult = "crear Peri";
        String result = instance.crearPeriLect(pLectivo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of editarPeriLect method, of class ControladorPeriodoLectivo.
     */
    @Test
    public void testEditarPeriLect() {
        System.out.println("editarPeriLect");
        int codigo = 0;
        ControladorPeriodoLectivo instance = new ControladorPeriodoLectivo();
        String expResult = "editar Peri";
        String result = instance.editarPeriLect(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPeriLect method, of class ControladorPeriodoLectivo.
     */
    @Test
    public void testBuscarPeriLect() {
        System.out.println("buscarPeriLect");
        int codigo = 0;
        ControladorPeriodoLectivo instance = new ControladorPeriodoLectivo();
        String expResult = "buscar Peri";
        String result = instance.buscarPeriLect(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPeriLect method, of class ControladorPeriodoLectivo.
     */
    @Test
    public void testEliminarPeriLect() {
        System.out.println("eliminarPeriLect");
        int codigo = 0;
        ControladorPeriodoLectivo instance = new ControladorPeriodoLectivo();
        boolean expResult = true;
        boolean result = instance.eliminarPeriLect(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarCed method, of class ControladorPeriodoLectivo.
     */
    @Test
    public void testValidarCed() {
        System.out.println("validarCed");
        Persona cedula = null;
        ControladorPeriodoLectivo instance = new ControladorPeriodoLectivo();
        String expResult = "validar cedula";
        String result = instance.validarCed(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
