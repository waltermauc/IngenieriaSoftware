/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modulogrupo;

import ec.ups.edu.Controlador.ControladorDocente;
import ec.ups.edu.Modelo.Docente;
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
public class ControladorDocenteTest {
    
    public ControladorDocenteTest() {
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
     * Test of registrarNota method, of class ControladorDocente.
     */
    @Test
    public void testRegistrarNota() {
        System.out.println("registrarNota");
        ControladorDocente instance = new ControladorDocente();
        int expResult = 0;
        int result = instance.registrarNota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of verificarUsuario method, of class ControladorDocente.
     */
    @Test
    public void testVerificarUsuario() {
        System.out.println("verificarUsuario");
        ControladorDocente instance = new ControladorDocente();
        String expResult = "Usuario valido";
        String result = instance.verificarUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validarCedula method, of class ControladorDocente.
     */
    @Test
    public void testValidarCedula() {
        System.out.println("validarCedula");
        ControladorDocente instance = new ControladorDocente();
        String expResult = "Cedula Docente valida";
        String result = instance.validarCedula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of crarPersona method, of class ControladorDocente.
     */
    @Test
    public void testCrarPersona() {
        System.out.println("crarPersona");
        Docente docente = null;
        ControladorDocente instance = new ControladorDocente();
        String expResult = "Docente creado";
        String result = instance.crearDocente(docente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarDocente method, of class ControladorDocente.
     */
    @Test
    public void testEliminarPersona() {
        System.out.println("eliminarPersona");
        int codigo = 0;
        ControladorDocente instance = new ControladorDocente();
        String expResult = "Docente eliminado";
        String result = instance.eliminarDocente(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarDocente method, of class ControladorDocente.
     */
    @Test
    public void testBuscarPersona() {
        System.out.println("buscarPersona");
        int codigo = 0;
        ControladorDocente instance = new ControladorDocente();
        String expResult = "Docente encontrado";
        String result = instance.buscarDocente(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarDocente method, of class ControladorDocente.
     */
    @Test
    public void testListarPersona() {
        System.out.println("listarPersona");
        ControladorDocente instance = new ControladorDocente();
        List expResult = new ArrayList();
        List<Docente> result = instance.listarDocente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarDocente method, of class ControladorDocente.
     */
    @Test
    public void testModificarPersona() {
        System.out.println("modificarPersona");
        int codigo = 0;
        ControladorDocente instance = new ControladorDocente();
        String expResult = "Docente modificado";
        String result = instance.modificarDocente(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
