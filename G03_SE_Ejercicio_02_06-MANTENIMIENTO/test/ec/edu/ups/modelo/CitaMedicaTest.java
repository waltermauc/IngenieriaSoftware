/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.sql.Time;
import java.util.Date;
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
public class CitaMedicaTest {
    
    public CitaMedicaTest() {
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
     * Test of getCodigoCita method, of class CitaMedica.
     */
    @Test
    public void testGetCodigoCita() {
        System.out.println("getCodigoCita");
        CitaMedica instance = new CitaMedica();
        int expResult = 0;
        int result = instance.getCodigoCita();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoCita method, of class CitaMedica.
     */
    @Test
    public void testSetCodigoCita() {
        System.out.println("setCodigoCita");
        int codigoCita = 0;
        CitaMedica instance = new CitaMedica();
        instance.setCodigoCita(codigoCita);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaCita method, of class CitaMedica.
     */
    @Test
    public void testGetFechaCita() {
        System.out.println("getFechaCita");
        CitaMedica instance = new CitaMedica();
        Date expResult = null;
        Date result = instance.getFechaCita();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaCita method, of class CitaMedica.
     */
    @Test
    public void testSetFechaCita() {
        System.out.println("setFechaCita");
        Date fechaCita = null;
        CitaMedica instance = new CitaMedica();
        instance.setFechaCita(fechaCita);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoraCita method, of class CitaMedica.
     */
    @Test
    public void testGetHoraCita() {
        System.out.println("getHoraCita");
        CitaMedica instance = new CitaMedica();
        Time expResult = null;
        Time result = instance.getHoraCita();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoraCita method, of class CitaMedica.
     */
    @Test
    public void testSetHoraCita() {
        System.out.println("setHoraCita");
        Time horaCita = null;
        CitaMedica instance = new CitaMedica();
        instance.setHoraCita(horaCita);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaciente method, of class CitaMedica.
     */
    @Test
    public void testGetPaciente() {
        System.out.println("getPaciente");
        CitaMedica instance = new CitaMedica();
        Paciente expResult = null;
        Paciente result = instance.getPaciente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaciente method, of class CitaMedica.
     */
    @Test
    public void testSetPaciente() {
        System.out.println("setPaciente");
        Paciente paciente = null;
        CitaMedica instance = new CitaMedica();
        instance.setPaciente(paciente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedico method, of class CitaMedica.
     */
    @Test
    public void testGetMedico() {
        System.out.println("getMedico");
        CitaMedica instance = new CitaMedica();
        Medico expResult = null;
        Medico result = instance.getMedico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedico method, of class CitaMedica.
     */
    @Test
    public void testSetMedico() {
        System.out.println("setMedico");
        Medico medico = null;
        CitaMedica instance = new CitaMedica();
        instance.setMedico(medico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMotivoCita method, of class CitaMedica.
     */
    @Test
    public void testGetMotivoCita() {
        System.out.println("getMotivoCita");
        CitaMedica instance = new CitaMedica();
        String expResult = "";
        String result = instance.getMotivoCita();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMotivoCita method, of class CitaMedica.
     */
    @Test
    public void testSetMotivoCita() {
        System.out.println("setMotivoCita");
        String motivoCita = "";
        CitaMedica instance = new CitaMedica();
        instance.setMotivoCita(motivoCita);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarCita method, of class CitaMedica.
     */
    @Test
    public void testAgregarCita() {
        System.out.println("agregarCita");
        CitaMedica instance = new CitaMedica();
        instance.agregarCita();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarCita method, of class CitaMedica.
     */
    @Test
    public void testEliminarCita() {
        System.out.println("eliminarCita");
        CitaMedica instance = new CitaMedica();
        instance.eliminarCita();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCita method, of class CitaMedica.
     */
    @Test
    public void testBuscarCita() {
        System.out.println("buscarCita");
        CitaMedica instance = new CitaMedica();
        instance.buscarCita();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class CitaMedica.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        CitaMedica instance = new CitaMedica();
        instance.actualizar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
