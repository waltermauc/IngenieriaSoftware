/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modulogrupo;

import ec.ups.edu.Controlador.ControladorGrupo;
import ec.ups.edu.Controlador.ControladorEspacioFisico;
import ec.ups.edu.Controlador.ControladorModalidad;
import ec.ups.edu.Controlador.ControladorAsignatura;
import ec.ups.edu.Controlador.ControladorNivelAsignatura;
import ec.ups.edu.Modelo.Asignatura;
import ec.ups.edu.Modelo.EspacioFisico;
import ec.ups.edu.Modelo.Grupo;
import ec.ups.edu.Modelo.Modalidad;
import ec.ups.edu.Modelo.NivelAsignatura;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rayner
 */
public class programaMetodosTest {
    
    public programaMetodosTest() {
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
     * Test of buscarGrupo method, of class programaMetodos.
     */
    @Test
    public void testCrearGrupo() {
        System.out.println("crearGrupo");
        int codigoGrupo = 0;
        String asignatura = "lengua";
        int codigoEspacio = 1;
        int codigoModalidad = 1;
        String nombreDocente = "Juan";
        Grupo grupo= null;
        ControladorGrupo instance = new ControladorGrupo();
        String expResult = "Nombre ingresado correctamente";
        String result = instance.crearGrupo(grupo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)){
        fail("The test case is aprototype.");
        }
    }
    
   
    /**
     * Test of crearAsignatura method, of class programaMetodos.
     */
    @Test
    public void testCrearAsignatura() {
        System.out.println("crearAsignatura");
        Asignatura asignatura = null;
        NivelAsignatura nivelAsignatura = null;
        ControladorAsignatura instance = new ControladorAsignatura();
        String expResult = "Asignatura creada correctamente";
        String result = instance.crearAsignatura(asignatura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)){

        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of editarAsignatura method, of class programaMetodos.
     */
    @Test
    public void testEditarAsignatura() {
        System.out.println("editarAsignatura");
        Asignatura asignatura = null;
        int costo = 2;
        ControladorAsignatura instance = new ControladorAsignatura();
        String expResult = "Creada correctamente";
        String result = instance.editarAsignatura(asignatura, costo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)){
 
        fail("The test case is a prototype.");
        
        }
    }

    /**
     * Test of eliminarAsignatura method, of class programaMetodos.
     */
    @Test
    public void testEliminarAsignatura() {
        System.out.println("eliminarAsignatura");
        int codigo=0;
        ControladorAsignatura instance = new ControladorAsignatura();
        String expResult = "asignatura eliminada";
        String result = instance.eliminarAsignatura(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)){

            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of listarAsignatura method, of class programaMetodos.
     */
    @Test
    public void testListarAsignatura() {
        System.out.println("listarAsignatura");
        String descripcionAsignatura = "Lengua";
        ControladorAsignatura instance = new ControladorAsignatura();
        ControladorNivelAsignatura controladorNivelAsignatura = null;
        String expResult = "mostrar datos de la asignatura";
        List<Asignatura> result = instance.listarAsignatura(controladorNivelAsignatura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)){

        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of crearNivelAsignatura method, of class programaMetodos.
     */
    @Test
    public void testCrearNivelAsignatura() {
        System.out.println("crearNivelAsignatura");
        int codigoNivelAsignatura = 10;
        String descripcionNivelAsignatura = "quinto ciclo";
        NivelAsignatura nivelAsignatura = null;
        ControladorNivelAsignatura instance = new ControladorNivelAsignatura();
        String expResult = "Creado correctamnete";
        String result = instance.crearNivelAsignatura(nivelAsignatura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if (!result.equals(expResult)){

            fail("The test case is a prototype.");
         }
    }

    /**
     * Test of editarNivelAsignatura method, of class programaMetodos.
     */
    @Test
    public void testEditarNivelAsignatura() {
        System.out.println("editarNivelAsignatura");
        String descripcionNivelAsignatura = "quinto";
        ControladorNivelAsignatura instance = new ControladorNivelAsignatura();
        int codigo=0;
        NivelAsignatura nivelAsignatura= null;
        String expResult = "Descripcion del nivel de asignatura creada correctamente";
        String result = instance.editarNivelAsignatura(nivelAsignatura, codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)){

            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of EliminarNivelAsignatura method, of class programaMetodos.
     */
    @Test
    public void testEliminarNivelAsignatura() {
        System.out.println("EliminarNivelAsignatura");
        int codigoNivelAsignatura = 10;
        ControladorNivelAsignatura instance = new ControladorNivelAsignatura();
        String expResult = "codigo del nivel eliminado correctamnete";
        String result = instance.eliminarAsignatura(codigoNivelAsignatura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if (!result.equals(expResult)){

            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of listarNivelAsignatura method, of class programaMetodos.
     */
    @Test
    public void testListarNivelAsignatura() {
        System.out.println("listarNivelAsignatura");
        int codigoNivelAsignatura = 10;
        ControladorNivelAsignatura instance = new ControladorNivelAsignatura();
        String expResult = "mostrar datos del nivel de las asignatura";
        List<NivelAsignatura> result = instance.listarAsignatura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if (!result.equals(expResult)){

            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of crearModalidadCarrera method, of class programaMetodos.
     */
    @Test
    public void testCrearModalidadCarrera() {
        System.out.println("crearModalidadCarrera");
        int codigoModalida = 11;
        Modalidad modalida = null;
        ControladorModalidad instance = new ControladorModalidad();
        String expResult = "creado correctamente";
        String result = instance.crearModalidadCarrera( modalida);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)){

            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of editarModalidadCarrera method, of class programaMetodos.
     */
    @Test
    public void testEditarModalidadCarrera() {
        System.out.println("editarModalidadCarrera");
        Modalidad modalida = null;
        int codigo =0;
        ControladorModalidad instance = new ControladorModalidad();
        String expResult = "Ingrese una nueva modalidad";
        String result = instance.editarModalidadCarrera(codigo,modalida);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if (!result.equals(expResult)){

            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of eliminarModalidadCarrera method, of class programaMetodos.
     */
    @Test
    public void testEliminarModalidadCarrera() {
        System.out.println("eliminarModalidadCarrera");
        int modalida = 0;
        ControladorModalidad instance = new ControladorModalidad();
        String expResult = "Eliminar modalidad";
        String result = instance.eliminarModalidadCarrera(modalida);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if (!result.equals(expResult)){

            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of listarModalidadCarrera method, of class programaMetodos.
     */
    @Test
    public void testListarModalidadCarrera() {
        System.out.println("listarModalidadCarrera");
        String modalida = "Vespertina";
        ControladorModalidad instance = new ControladorModalidad();
        String expResult = "mostrar datos modalidad";
        List<Modalidad>result = instance.listarModalidadCarrera();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if (!result.equals(expResult)){

            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of crearEspacioFisico method, of class programaMetodos.
     */
    @Test
    public void testCrearEspacioFisico() {
        System.out.println("crearEspacioFisico");
        int codigoEspacio = 21;
        int numeroAula = 3;
        String edificioEspacioFisico = "Manuel Peralta";
        EspacioFisico espacioFisico = null;
        ControladorEspacioFisico instance = new ControladorEspacioFisico();
        String expResult = "espacio fisico creado";
        String result = instance.crearEspacioFisico(espacioFisico);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if (!result.equals(expResult)){

            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of editarEspacioFisico method, of class programaMetodos.
     */
    @Test
    public void testEditarEspacioFisico() {
        System.out.println("editarEspacioFisico");
        int numeroAula = 4;
        String edificiEspacioFisico = "Leon Gonzales";
        EspacioFisico espacioFisico = null;
        ControladorEspacioFisico instance = new ControladorEspacioFisico();
        String expResult = "Edificio cambiado correctamente";
        String result = instance.editarEspacioFisico(espacioFisico,numeroAula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if (!result.equals(expResult)){

            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of eliminarEspacioFisico method, of class programaMetodos.
     */
    @Test
    public void testEliminarEspacioFisico() {
        System.out.println("eliminarEspacioFisico");
        int codigoEspacio = 5;
        ControladorEspacioFisico instance = new ControladorEspacioFisico();
        String expResult = "espacio eliminado";
        String result = instance.eliminarEspacioFisico(codigoEspacio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if (!result.equals(expResult)){

            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of listarEspacioFisico method, of class programaMetodos.
     */
    @Test
    public void testListarEspacioFisico() {
        System.out.println("listarEspacioFisico");
        int codigoEspacio = 4;
        ControladorEspacioFisico instance = new ControladorEspacioFisico();
        String expResult = "Mostrar datos espacio fisico";
        List<EspacioFisico> result = instance.listarEspacioFisico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if (!result.equals(expResult)){

            fail("The test case is a prototype.");
        }
    }
    
}
