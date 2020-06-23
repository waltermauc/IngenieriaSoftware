/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.HistoriaClinica;
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
public class Controlador_DiagnosticoTest {
    
    public Controlador_DiagnosticoTest() {
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
     * Test of mostrarDiagnostico method, of class Controlador_Diagnostico.
     */
    @Test
    public void testMostrarDiagnostico() {
        System.out.println("mostrarDiagnostico");
        Controlador_Diagnostico instance = new Controlador_Diagnostico();
        instance.mostrarDiagnostico();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nuevaHostoriaClinica method, of class Controlador_Diagnostico.
     */
    @Test
    public void testNuevaHostoriaClinica() {
        System.out.println("nuevaHostoriaClinica");
        HistoriaClinica historiaClinica = null;
        Controlador_Diagnostico instance = new Controlador_Diagnostico();
        instance.nuevaHostoriaClinica(historiaClinica);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
