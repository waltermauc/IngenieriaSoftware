/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modulogrupo;

import ec.ups.edu.Controlador.ControladorAsignatura;
import ec.ups.edu.Controlador.ControladorDocente;
import ec.ups.edu.Controlador.ControladorEspacioFisico;
import ec.ups.edu.Controlador.ControladorEspecialidad;
import ec.ups.edu.Controlador.ControladorEstudiante;
import ec.ups.edu.Controlador.ControladorFacturaDet;
import ec.ups.edu.Controlador.ControladorGrupo;
import ec.ups.edu.Controlador.ControladorMatricula;
import ec.ups.edu.Controlador.ControladorModalidad;
import ec.ups.edu.Controlador.ControladorNivelAsignatura;
import ec.ups.edu.Controlador.ControladorPeriodoLectivo;
import ec.ups.edu.Modelo.FacturaDet;
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
public class ControladorFacturaDetTest {
    
    public ControladorFacturaDetTest() {
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
     * Test of crearFactDet method, of class ControladorFacturaDet.
     */
    @Test
    public void testCrearFactDet() {
        System.out.println("crearFactDet");
        FacturaDet detalle = null;
        ControladorFacturaDet instance = new ControladorFacturaDet();
        String expResult = "crear Det";
        String result = instance.crearFactDet(detalle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarFactDet method, of class ControladorFacturaDet.
     */
    @Test
    public void testModificarFactDet() {
        System.out.println("modificarFactDet");
        int codigo = 0;
        FacturaDet facturaDet = null;
        ControladorFacturaDet instance = new ControladorFacturaDet();
        String expResult = "modi Det";
        String result = instance.modificarFactDet(codigo,facturaDet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarFactDet method, of class ControladorFacturaDet.
     */
    @Test
    public void testListarFactDet() {
        System.out.println("listarFactDet");
        ControladorFacturaDet instance = new ControladorFacturaDet();
        String expResult = "listar Det";
        ControladorPeriodoLectivo cpl = null;
        ControladorModalidad cm = null;
        ControladorEspecialidad ce = null;
        ControladorGrupo cg = null;
        ControladorEstudiante ces = null;
        ControladorAsignatura ca = null;
        ControladorDocente cd = null;
        ControladorEspacioFisico cef = null;
        ControladorNivelAsignatura cn = null;
        ControladorMatricula cma = null;
        List<FacturaDet> result = instance.listarFactDet(cma, cpl, cm, ce, cg, ces, ca, cd, cef, cn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarFactDet method, of class ControladorFacturaDet.
     */
    @Test
    public void testEliminarFactDet() {
        System.out.println("eliminarFactDet");
        int codigo = 0;
        ControladorFacturaDet instance = new ControladorFacturaDet();
        String expResult = "eliminar De";
        String result = instance.eliminarFactDet(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
