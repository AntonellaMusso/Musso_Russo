/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class SistemaTest {
    
    public SistemaTest() {
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
     * Test of getUsuarioSeleccionadoPorNombre method, of class Sistema.
     */
    @Test
    public void testGetUsuarioSeleccionadoPorNombre() {
        System.out.println("getUsuarioSeleccionadoPorNombre");
        String name = "";
        Sistema instance = new Sistema();
        Familiar expResult = null;
        Familiar result = instance.getUsuarioSeleccionadoPorNombre(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListadoEventos method, of class Sistema.
     */
    @Test
    public void testGetListadoEventos() {
        System.out.println("getListadoEventos");
        Sistema instance = new Sistema();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getListadoEventos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaDeEvento method, of class Sistema.
     */
    @Test
    public void testGetFechaDeEvento() {
        System.out.println("getFechaDeEvento");
        int i = 0;
        Sistema instance = new Sistema();
        String expResult = "";
        String result = instance.getFechaDeEvento(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvento method, of class Sistema.
     */
    @Test
    public void testGetEvento() {
        System.out.println("getEvento");
        int i = 0;
        Sistema instance = new Sistema();
        String expResult = "";
        String result = instance.getEvento(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiasConEventosEnMes method, of class Sistema.
     */
    @Test
    public void testGetDiasConEventosEnMes() {
        System.out.println("getDiasConEventosEnMes");
        String mes = "";
        String Anio = "";
        Sistema instance = new Sistema();
        String expResult = "";
        String result = instance.getDiasConEventosEnMes(mes, Anio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quitarEvento method, of class Sistema.
     */
    @Test
    public void testQuitarEvento() {
        System.out.println("quitarEvento");
        String evento = "";
        Sistema instance = new Sistema();
        instance.quitarEvento(evento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuarioSeleccionado method, of class Sistema.
     */
    @Test
    public void testGetUsuarioSeleccionado() {
        System.out.println("getUsuarioSeleccionado");
        Sistema instance = new Sistema();
        Familiar expResult = null;
        Familiar result = instance.getUsuarioSeleccionado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaMascotas method, of class Sistema.
     */
    @Test
    public void testGetListaMascotas() {
        System.out.println("getListaMascotas");
        Sistema instance = new Sistema();
        ArrayList<Mascota> expResult = null;
        ArrayList<Mascota> result = instance.getListaMascotas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaFamiliares method, of class Sistema.
     */
    @Test
    public void testGetListaFamiliares() {
        System.out.println("getListaFamiliares");
        Sistema instance = new Sistema();
        ArrayList<Familiar> expResult = null;
        ArrayList<Familiar> result = instance.getListaFamiliares();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaActividades method, of class Sistema.
     */
    @Test
    public void testGetListaActividades() {
        System.out.println("getListaActividades");
        Sistema instance = new Sistema();
        ArrayList<Actividad> expResult = null;
        ArrayList<Actividad> result = instance.getListaActividades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaAlimentos method, of class Sistema.
     */
    @Test
    public void testGetListaAlimentos() {
        System.out.println("getListaAlimentos");
        Sistema instance = new Sistema();
        ArrayList<Alimento> expResult = null;
        ArrayList<Alimento> result = instance.getListaAlimentos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaServicios method, of class Sistema.
     */
    @Test
    public void testGetListaServicios() {
        System.out.println("getListaServicios");
        Sistema instance = new Sistema();
        ArrayList<Servicio> expResult = null;
        ArrayList<Servicio> result = instance.getListaServicios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarEvento method, of class Sistema.
     */
    @Test
    public void testAgregarEvento() {
        System.out.println("agregarEvento");
        String event = "";
        Sistema instance = new Sistema();
        instance.agregarEvento(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuarioSeleccionado method, of class Sistema.
     */
    @Test
    public void testSetUsuarioSeleccionado() {
        System.out.println("setUsuarioSeleccionado");
        Familiar usuarioSeleccionado = null;
        Sistema instance = new Sistema();
        instance.setUsuarioSeleccionado(usuarioSeleccionado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregoMascotaALista method, of class Sistema.
     */
    @Test
    public void testAgregoMascotaALista() {
        System.out.println("agregoMascotaALista");
        Mascota mascota = null;
        Sistema instance = new Sistema();
        instance.agregoMascotaALista(mascota);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregoFamiliarALista method, of class Sistema.
     */
    @Test
    public void testAgregoFamiliarALista() {
        System.out.println("agregoFamiliarALista");
        Familiar familiar = null;
        Sistema instance = new Sistema();
        instance.agregoFamiliarALista(familiar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregoActividadALista method, of class Sistema.
     */
    @Test
    public void testAgregoActividadALista() {
        System.out.println("agregoActividadALista");
        Actividad actividad = null;
        Sistema instance = new Sistema();
        instance.agregoActividadALista(actividad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregoAlimentoALista method, of class Sistema.
     */
    @Test
    public void testAgregoAlimentoALista() {
        System.out.println("agregoAlimentoALista");
        Alimento alimento = null;
        Sistema instance = new Sistema();
        instance.agregoAlimentoALista(alimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregoServicioALista method, of class Sistema.
     */
    @Test
    public void testAgregoServicioALista() {
        System.out.println("agregoServicioALista");
        Servicio servicio = null;
        Sistema instance = new Sistema();
        instance.agregoServicioALista(servicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarMascotaDeLista method, of class Sistema.
     */
    @Test
    public void testEliminarMascotaDeLista() {
        System.out.println("eliminarMascotaDeLista");
        Mascota mascota = null;
        Sistema instance = new Sistema();
        instance.eliminarMascotaDeLista(mascota);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarFamiliarDeLista method, of class Sistema.
     */
    @Test
    public void testEliminarFamiliarDeLista() {
        System.out.println("eliminarFamiliarDeLista");
        Familiar familiar = null;
        Sistema instance = new Sistema();
        instance.eliminarFamiliarDeLista(familiar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validoNombreMascota method, of class Sistema.
     */
    @Test
    public void testValidoNombreMascota() {
        System.out.println("validoNombreMascota");
        ArrayList<Mascota> lista = null;
        String nombre = "";
        Sistema instance = new Sistema();
        boolean expResult = false;
        boolean result = instance.validoNombreMascota(lista, nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validoNombreFamiliar method, of class Sistema.
     */
    @Test
    public void testValidoNombreFamiliar() {
        System.out.println("validoNombreFamiliar");
        ArrayList<Familiar> lista = null;
        String nombre = "";
        Sistema instance = new Sistema();
        boolean expResult = false;
        boolean result = instance.validoNombreFamiliar(lista, nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarFamiliar method, of class Sistema.
     */
    @Test
    public void testModificarFamiliar() {
        System.out.println("modificarFamiliar");
        ArrayList<Familiar> listado = null;
        String nombre = "";
        int altura = 0;
        int peso = 0;
        String comentario = "";
        ImageIcon foto = null;
        Sistema instance = new Sistema();
        boolean expResult = false;
        boolean result = instance.modificarFamiliar(listado, nombre, altura, peso, comentario, foto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
