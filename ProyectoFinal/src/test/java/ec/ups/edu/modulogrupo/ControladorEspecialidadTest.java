/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modulogrupo;

import ec.ups.edu.Controlador.ControladorEspecialidad;
import ec.ups.edu.Modelo.Especialidad;
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
public class ControladorEspecialidadTest {
    
    public ControladorEspecialidadTest() {
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
     * Test of crearEspecialidad method, of class ControladorEspecialidad.
     */
    @Test
    public void testCrearEspecialidad() {
        System.out.println("crearEspecialidad");
        Especialidad especial = null;
        ControladorEspecialidad instance = new ControladorEspecialidad();
        String expResult = "crear Esp";
        String result = instance.crearEspecialidad(especial);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarEspecialidad method, of class ControladorEspecialidad.
     */
    @Test
    public void testModificarEspecialidad() {
        System.out.println("modificarEspecialidad");
        int codigo = 0;
        ControladorEspecialidad instance = new ControladorEspecialidad();
        String expResult = "modifcar Esp";
        String result = instance.modificarEspecialidad(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of listarEspecialidad method, of class ControladorEspecialidad.
     */
    @Test
    public void testListarEspecialidad() {
        System.out.println("listarEspecialidad");
        ControladorEspecialidad instance = new ControladorEspecialidad();
        String expResult = "listar Esp";
        String result = instance.listarEspecialidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarEspecialidad method, of class ControladorEspecialidad.
     */
    @Test
    public void testEliminarEspecialidad() {
        System.out.println("eliminarEspecialidad");
        int codigo = 0;
        ControladorEspecialidad instance = new ControladorEspecialidad();
        String expResult = "eliminar Esp";
        String result = instance.eliminarEspecialidad(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
