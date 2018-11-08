/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota;

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
public class ActividadTest {
    
    public ActividadTest() {
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
     * Test of getFamiliar method, of class Actividad.
     */
    @Test
    public void testGetFamiliar() {
        System.out.println("getFamiliar");
        Actividad instance = new Actividad();
        Familiar expResult = null;
        Familiar result = instance.getFamiliar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMascota method, of class Actividad.
     */
    @Test
    public void testGetMascota() {
        System.out.println("getMascota");
        Actividad instance = new Actividad();
        Mascota expResult = null;
        Mascota result = instance.getMascota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Actividad.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Actividad instance = new Actividad();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistancia method, of class Actividad.
     */
    @Test
    public void testGetDistancia() {
        System.out.println("getDistancia");
        Actividad instance = new Actividad();
        int expResult = 0;
        int result = instance.getDistancia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFamiliar method, of class Actividad.
     */
    @Test
    public void testSetFamiliar() {
        System.out.println("setFamiliar");
        Familiar familiar = null;
        Actividad instance = new Actividad();
        instance.setFamiliar(familiar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMascota method, of class Actividad.
     */
    @Test
    public void testSetMascota() {
        System.out.println("setMascota");
        Mascota mascota = null;
        Actividad instance = new Actividad();
        instance.setMascota(mascota);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Actividad.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Actividad instance = new Actividad();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDistancia method, of class Actividad.
     */
    @Test
    public void testSetDistancia() {
        System.out.println("setDistancia");
        int distancia = 0;
        Actividad instance = new Actividad();
        instance.setDistancia(distancia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Actividad.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Actividad instance = new Actividad();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
