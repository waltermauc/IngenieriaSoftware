/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Medico;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 59396
 */
public class ControladorMedicoTest {
    
    public ControladorMedicoTest() {
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
     * Test of crearMedico method, of class ControladorMedico.
     */
    @Test
    public void testCrearMedico() {
        System.out.println("crearMedico");
        Medico personaMedico = new  Medico();
        ControladorMedico instance = new ControladorMedico();
        String expResult = "medicoCreado";
        String result = instance.crearMedico(personaMedico);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of borrarMedico method, of class ControladorMedico.
     */
    @Test
    public void testBorrarMedico() {
        System.out.println("borrarMedico");
        String cedula = "";
        ControladorMedico instance = new ControladorMedico();
        String expResult = "medicoEliminado";
        String result = instance.borrarMedico(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of actualizar method, of class ControladorMedico.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Medico actualizarMedico = new Medico();
        String cedula = "";
        ControladorMedico instance = new ControladorMedico();
        String expResult = "medicoActualizado";
        String result = instance.actualizar(actualizarMedico, cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class ControladorMedico.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String cedula = "";
        ControladorMedico instance = new ControladorMedico();
        String expResult = "persona";
        String result = instance.buscar(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
