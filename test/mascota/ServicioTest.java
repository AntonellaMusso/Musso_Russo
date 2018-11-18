/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota;

import java.util.Date;
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
public class ServicioTest {
    
    public ServicioTest() {
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
     * Test of getNombreVeterinario method, of class Servicio.
     */
    @Test
    public void testGetNombreVeterinario() {
        System.out.println("getNombreVeterinario");
        Servicio instance = new Servicio();
        String expResult = "";
        String result = instance.getNombreVeterinario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServicio method, of class Servicio.
     */
    @Test
    public void testGetServicio() {
        System.out.println("getServicio");
        Servicio instance = new Servicio();
        String expResult = "";
        String result = instance.getServicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Servicio.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Servicio instance = new Servicio();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHora method, of class Servicio.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        Servicio instance = new Servicio();
        int expResult = 0;
        int result = instance.getHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinutos method, of class Servicio.
     */
    @Test
    public void testGetMinutos() {
        System.out.println("getMinutos");
        Servicio instance = new Servicio();
        int expResult = 0;
        int result = instance.getMinutos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Servicio.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Servicio instance = new Servicio();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreVeterinario method, of class Servicio.
     */
    @Test
    public void testSetNombreVeterinario() {
        System.out.println("setNombreVeterinario");
        String nombreVeterinario = "";
        Servicio instance = new Servicio();
        instance.setNombreVeterinario(nombreVeterinario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServicio method, of class Servicio.
     */
    @Test
    public void testSetServicio() {
        System.out.println("setServicio");
        String servicio = "";
        Servicio instance = new Servicio();
        instance.setServicio(servicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Servicio.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Servicio instance = new Servicio();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHora method, of class Servicio.
     */
    @Test
    public void testSetHora() {
        System.out.println("setHora");
        int hor = 0;
        Servicio instance = new Servicio();
        instance.setHora(hor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinutos method, of class Servicio.
     */
    @Test
    public void testSetMinutos() {
        System.out.println("setMinutos");
        int min = 0;
        Servicio instance = new Servicio();
        instance.setMinutos(min);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Servicio.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Servicio instance = new Servicio();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Servicio.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Servicio instance = new Servicio();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
