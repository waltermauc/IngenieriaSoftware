/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modulogrupo;

import ec.ups.edu.Controlador.ControladorQuimestre;
import ec.ups.edu.Modelo.Quimestre;
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
public class ControladorQuimestreTest {
    
    public ControladorQuimestreTest() {
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
     * Test of crearQuimestre method, of class ControladorQuimestre.
     */
    @Test
    public void testCrearQuimestre() {
        System.out.println("crearQuimestre");
        Quimestre q = null;
        ControladorQuimestre instance = new ControladorQuimestre();
        String expResult = "Quimestre creado";
        String result = instance.crearQuimestre(q);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarQuimestre method, of class ControladorQuimestre.
     */
    @Test
    public void testBuscarQuimestre() {
        System.out.println("buscarQuimestre");
        int codigo = 0;
        ControladorQuimestre instance = new ControladorQuimestre();
        String expResult = "Quimestre";
        String result = instance.buscarQuimestre(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarQuimestre method, of class ControladorQuimestre.
     */
    @Test
    public void testEliminarQuimestre() {
        System.out.println("eliminarQuimestre");
        Quimestre q = null;
        ControladorQuimestre instance = new ControladorQuimestre();
        String expResult = "Quimestre eliminado";
        String result = instance.eliminarQuimestre(q);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarQuimestre method, of class ControladorQuimestre.
     */
    @Test
    public void testListarQuimestre() {
        System.out.println("listarQuimestre");
        ControladorQuimestre instance = new ControladorQuimestre();
        List<Quimestre> expResult = new ArrayList<>();
        List<Quimestre> result = instance.listarQuimestre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcularNotaFinal method, of class ControladorQuimestre.
     */
    @Test
    public void testCalcularNotaFinal() {
        System.out.println("calcularNotaFinal");
        ControladorQuimestre instance = new ControladorQuimestre();
        String expResult = "Nota";
        String result = instance.calcularNotaFinal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarEstado method, of class ControladorQuimestre.
     */
    @Test
    public void testCambiarEstado() {
        System.out.println("cambiarEstado");
        ControladorQuimestre instance = new ControladorQuimestre();
        String expResult = "Aprovado";
        String result = instance.cambiarEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
