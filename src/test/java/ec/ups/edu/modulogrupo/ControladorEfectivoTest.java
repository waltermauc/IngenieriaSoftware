/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modulogrupo;

import ec.ups.edu.Controlador.ControladorEfectivo;
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
public class ControladorEfectivoTest {
    
    public ControladorEfectivoTest() {
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
     * Test of calcularComision method, of class ControladorEfectivo.
     */
    @Test
    public void testCalcularComision() {
        System.out.println("calcularComision");
        ControladorEfectivo instance = new ControladorEfectivo();
        int expResult = 0;
        int result = instance.calcularComision();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcularTotal method, of class ControladorEfectivo.
     */
    @Test
    public void testCalcularTotal() {
        System.out.println("calcularTotal");
        ControladorEfectivo instance = new ControladorEfectivo();
        int expResult = 0;
        int result = instance.calcularTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
