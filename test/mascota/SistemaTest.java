/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota;

import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Emi
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
     * Test of sumarDiasAFecha method, of class Sistema.
     */
    @Test
    public void testSumarDiasAFecha() {
        System.out.println("sumarDiasAFecha");
        Date fecha = null;
        int diasSuma = 0;
        int limite = 0;
        Sistema instance = new Sistema();
        Date expResult = null;
        Date result = instance.sumarDiasAFecha(fecha, diasSuma, limite);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conversionMesANumero method, of class Sistema.
     */
    @Test
    public void testConversionMesANumero() {
        System.out.println("conversionMesANumero");
        String mes = "";
        Sistema instance = new Sistema();
        int expResult = 0;
        int result = instance.conversionMesANumero(mes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMes method, of class Sistema.
     */
    @Test
    public void testGetMes() {
        System.out.println("getMes");
        Date fecha = null;
        Sistema instance = new Sistema();
        int expResult = 0;
        int result = instance.getMes(fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ultimoDiaDelMes method, of class Sistema.
     */
    @Test
    public void testUltimoDiaDelMes() {
        System.out.println("ultimoDiaDelMes");
        int mes = 0;
        Sistema instance = new Sistema();
        int expResult = 0;
        int result = instance.ultimoDiaDelMes(mes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fechaMenor method, of class Sistema.
     */
    @Test
    public void testFechaMenor() {
        System.out.println("fechaMenor");
        Date fecha1 = null;
        Date fecha2 = null;
        Sistema instance = new Sistema();
        Date expResult = null;
        Date result = instance.fechaMenor(fecha1, fecha2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fechasIguales method, of class Sistema.
     */
    @Test
    public void testFechasIguales() {
        System.out.println("fechasIguales");
        Date fecha1 = null;
        Date fecha2 = null;
        Sistema instance = new Sistema();
        boolean expResult = false;
        boolean result = instance.fechasIguales(fecha1, fecha2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarActividadPorNombre method, of class Sistema.
     */
    @Test
    public void testBorrarActividadPorNombre() {
        System.out.println("borrarActividadPorNombre");
        String actividad = "";
        Sistema instance = new Sistema();
        instance.borrarActividadPorNombre(actividad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCordenadasMapa method, of class Sistema.
     */
    @Test
    public void testGetCordenadasMapa() {
        System.out.println("getCordenadasMapa");
        Sistema instance = new Sistema();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getCordenadasMapa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListadoAlimento method, of class Sistema.
     */
    @Test
    public void testGetListadoAlimento() {
        System.out.println("getListadoAlimento");
        Sistema instance = new Sistema();
        ArrayList<Alimento> expResult = null;
        ArrayList<Alimento> result = instance.getListadoAlimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListadoPaseos method, of class Sistema.
     */
    @Test
    public void testGetListadoPaseos() {
        System.out.println("getListadoPaseos");
        Sistema instance = new Sistema();
        ArrayList<Paseo> expResult = null;
        ArrayList<Paseo> result = instance.getListadoPaseos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMascotaPorNombre method, of class Sistema.
     */
    @Test
    public void testGetMascotaPorNombre() {
        System.out.println("getMascotaPorNombre");
        String mascota = "";
        Sistema instance = new Sistema();
        Mascota expResult = null;
        Mascota result = instance.getMascotaPorNombre(mascota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
     * Test of agregarCordenada method, of class Sistema.
     */
    @Test
    public void testAgregarCordenada() {
        System.out.println("agregarCordenada");
        String cord = "";
        Sistema instance = new Sistema();
        instance.agregarCordenada(cord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListadoAlimento method, of class Sistema.
     */
    @Test
    public void testSetListadoAlimento() {
        System.out.println("setListadoAlimento");
        ArrayList<Alimento> listadoAlimento = null;
        Sistema instance = new Sistema();
        instance.setListadoAlimento(listadoAlimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListadoPaseos method, of class Sistema.
     */
    @Test
    public void testSetListadoPaseos() {
        System.out.println("setListadoPaseos");
        ArrayList<Paseo> listadoPaseos = null;
        Sistema instance = new Sistema();
        instance.setListadoPaseos(listadoPaseos);
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
        String nombre = "";
        Sistema instance = new Sistema();
        boolean expResult = false;
        boolean result = instance.validoNombreMascota(nombre);
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
        String nombre = "";
        Sistema instance = new Sistema();
        boolean expResult = false;
        boolean result = instance.validoNombreFamiliar(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
