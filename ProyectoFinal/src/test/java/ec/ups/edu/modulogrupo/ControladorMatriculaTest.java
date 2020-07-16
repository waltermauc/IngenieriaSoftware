/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modulogrupo;

import ec.ups.edu.Controlador.ControladorEspecialidad;
import ec.ups.edu.Controlador.ControladorEstudiante;
import ec.ups.edu.Controlador.ControladorGrupo;
import ec.ups.edu.Controlador.ControladorMatricula;
import ec.ups.edu.Controlador.ControladorModalidad;
import ec.ups.edu.Controlador.ControladorPeriodoLectivo;
import ec.ups.edu.Modelo.Matricula;
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
public class ControladorMatriculaTest {

    public ControladorMatriculaTest() {
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
     * Test of crearMatricula method, of class ControladorMatricula.
     */
    @Test
    public void testCrearMatricula() {
        System.out.println("crearMatricula");
        Matricula matriculaCre = null;
        ControladorMatricula instance = new ControladorMatricula();
        String expResult = "crear Mat";
        String result = instance.crearMatricula(matriculaCre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarMatricula method, of class ControladorMatricula.
     */
    @Test
    public void testModificarMatricula() {
        System.out.println("modificarMatricula");
        int codigo = 0;
        Matricula matricula = null;
        ControladorMatricula instance = new ControladorMatricula();
        String expResult = "modificar Matr";
        String result = instance.modificarMatricula(codigo, matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarMatricula method, of class ControladorMatricula.
     */
    @Test
    public void testListarMatricula() {
        System.out.println("listarMatricula");
        ControladorMatricula instance = new ControladorMatricula();
        ControladorPeriodoLectivo cpl = null;
        ControladorModalidad cm = null;
        ControladorEspecialidad ce = null;
        ControladorGrupo cg = null;
        ControladorEstudiante ces = null;
        String expResult = "listar Mat";
        List<Matricula> result = instance.listarMatricula(cpl, cm, ce, cg, ces);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarMatricula method, of class ControladorMatricula.
     */
    @Test
    public void testEliminarMatricula() {
        System.out.println("eliminarMatricula");
        int codigo = 0;
        ControladorMatricula instance = new ControladorMatricula();
        String expResult = "eliminar Mat";
        String result = instance.eliminarMatricula(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
