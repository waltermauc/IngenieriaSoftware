/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

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
public class HistoriaClinicaTest {
    
    public HistoriaClinicaTest() {
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
     * Test of getCodigoHistoria method, of class HistoriaClinica.
     */
    @Test
    public void testGetCodigoHistoria() {
        System.out.println("getCodigoHistoria");
        HistoriaClinica instance = new HistoriaClinica();
        int expResult = 0;
        int result = instance.getCodigoHistoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoHistoria method, of class HistoriaClinica.
     */
    @Test
    public void testSetCodigoHistoria() {
        System.out.println("setCodigoHistoria");
        int codigoHistoria = 0;
        HistoriaClinica instance = new HistoriaClinica();
        instance.setCodigoHistoria(codigoHistoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class HistoriaClinica.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        HistoriaClinica instance = new HistoriaClinica();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class HistoriaClinica.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        HistoriaClinica instance = new HistoriaClinica();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroConsultorio method, of class HistoriaClinica.
     */
    @Test
    public void testGetNumeroConsultorio() {
        System.out.println("getNumeroConsultorio");
        HistoriaClinica instance = new HistoriaClinica();
        String expResult = "";
        String result = instance.getNumeroConsultorio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroConsultorio method, of class HistoriaClinica.
     */
    @Test
    public void testSetNumeroConsultorio() {
        System.out.println("setNumeroConsultorio");
        String numeroConsultorio = "";
        HistoriaClinica instance = new HistoriaClinica();
        instance.setNumeroConsultorio(numeroConsultorio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class HistoriaClinica.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        HistoriaClinica instance = new HistoriaClinica();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class HistoriaClinica.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        HistoriaClinica instance = new HistoriaClinica();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarPaciente method, of class HistoriaClinica.
     */
    @Test
    public void testAgregarPaciente() {
        System.out.println("agregarPaciente");
        HistoriaClinica instance = new HistoriaClinica();
        instance.agregarPaciente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPaciente method, of class HistoriaClinica.
     */
    @Test
    public void testEliminarPaciente() {
        System.out.println("eliminarPaciente");
        HistoriaClinica instance = new HistoriaClinica();
        instance.eliminarPaciente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPaciente method, of class HistoriaClinica.
     */
    @Test
    public void testBuscarPaciente() {
        System.out.println("buscarPaciente");
        HistoriaClinica instance = new HistoriaClinica();
        instance.buscarPaciente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarPaciente method, of class HistoriaClinica.
     */
    @Test
    public void testActualizarPaciente() {
        System.out.println("actualizarPaciente");
        HistoriaClinica instance = new HistoriaClinica();
        instance.actualizarPaciente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
