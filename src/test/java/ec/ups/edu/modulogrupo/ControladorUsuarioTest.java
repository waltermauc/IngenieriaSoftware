/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modulogrupo;

import ec.ups.edu.Controlador.ControladorUsuario;
import ec.ups.edu.Modelo.Usuario;
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
public class ControladorUsuarioTest {
    
    public ControladorUsuarioTest() {
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
     * Test of generarUsuario method, of class ControladorUsuario.
     */
    @Test
    public void testGenerarUsuario() {
        System.out.println("generarUsuario");
        Usuario u = null;
        ControladorUsuario instance = new ControladorUsuario();
        String expResult = "usuario generado";
        String result = instance.generarUsuario(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarEstado method, of class ControladorUsuario.
     */
    @Test
    public void testCambiarEstado() {
        System.out.println("cambiarEstado");
        ControladorUsuario instance = new ControladorUsuario();
        String expResult = "estado";
        String result = instance.cambiarEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
