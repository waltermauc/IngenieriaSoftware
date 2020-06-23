/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modulogrupo;
        
import ec.ups.edu.Controlador.ControladorEstudiante;
import ec.ups.edu.Modelo.Calificacion;
import ec.ups.edu.Modelo.Persona;
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
public class ControladorEstudianteTest {
    
    public ControladorEstudianteTest() {
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
     * Test of verificarUsuario method, of class ControladorEstudiante.
     */
    @Test
    public void testVerificarUsuario() {
        System.out.println("verificarUsuario");
        ControladorEstudiante instance = new ControladorEstudiante();
        String expResult = "Usuario valido";
        String result = instance.verificarUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of validarCedula method, of class ControladorEstudiante.
     */
    @Test
    public void testValidarCedula() {
        System.out.println("validarCedula");
        ControladorEstudiante instance = new ControladorEstudiante();
        String expResult = "Cedula Estudiante valida";
        String result = instance.validarCedula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of crarPersona method, of class ControladorEstudiante.
     */
    @Test
    public void testCrarPersona() {
        System.out.println("crarPersona");
        Persona p = null;
        ControladorEstudiante instance = new ControladorEstudiante();
        String expResult = "Estudiante creado";
        String result = instance.crarPersona(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPersona method, of class ControladorEstudiante.
     */
    @Test
    public void testEliminarPersona() {
        System.out.println("eliminarPersona");
        int codigo = 0;
        ControladorEstudiante instance = new ControladorEstudiante();
        String expResult = "Estudiante eliminado";
        String result = instance.eliminarPersona(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPersona method, of class ControladorEstudiante.
     */
    @Test
    public void testBuscarPersona() {
        System.out.println("buscarPersona");
        int codigo = 0;
        ControladorEstudiante instance = new ControladorEstudiante();
        String expResult = "Estudiante encontrado";
        String result = instance.buscarPersona(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of modificarPersona method, of class ControladorEstudiante.
     */
    @Test
    public void testModificarPersona() {
        System.out.println("modificarPersona");
        int codigo = 0;
        ControladorEstudiante instance = new ControladorEstudiante();
        String expResult = "Estudiante modificado";
        String result = instance.modificarPersona(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarPersona method, of class ControladorEstudiante.
     */
    @Test
    public void testListarPersona() {
        System.out.println("listarPersona");
        ControladorEstudiante instance = new ControladorEstudiante();
        List expResult = new ArrayList();
        List<Persona> result = instance.listarPersona();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of realizarMatricula method, of class ControladorEstudiante.
     */
    @Test
    public void testRealizarMatricula() {
        System.out.println("realizarMatricula");
        ControladorEstudiante instance = new ControladorEstudiante();
        String expResult = "Matricula Realizada";
        String result = instance.realizarMatricula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarCalificaciones method, of class ControladorEstudiante.
     */
    @Test
    public void testListarCalificaciones() {
        System.out.println("listarCalificaciones");
        ControladorEstudiante instance = new ControladorEstudiante();
        List expResult = new ArrayList();
        List<Calificacion> result = instance.listarCalificaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
