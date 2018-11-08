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
public class PaseoTest {
    
    public PaseoTest() {
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
     * Test of getFamiliar method, of class Paseo.
     */
    @Test
    public void testGetFamiliar() {
        System.out.println("getFamiliar");
        Paseo instance = new Paseo();
        Familiar expResult = null;
        Familiar result = instance.getFamiliar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMascota method, of class Paseo.
     */
    @Test
    public void testGetMascota() {
        System.out.println("getMascota");
        Paseo instance = new Paseo();
        Mascota expResult = null;
        Mascota result = instance.getMascota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHora method, of class Paseo.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        Paseo instance = new Paseo();
        int expResult = 0;
        int result = instance.getHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinutos method, of class Paseo.
     */
    @Test
    public void testGetMinutos() {
        System.out.println("getMinutos");
        Paseo instance = new Paseo();
        int expResult = 0;
        int result = instance.getMinutos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Paseo.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Paseo instance = new Paseo();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFamiliar method, of class Paseo.
     */
    @Test
    public void testSetFamiliar() {
        System.out.println("setFamiliar");
        Familiar fam = null;
        Paseo instance = new Paseo();
        instance.setFamiliar(fam);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMascota method, of class Paseo.
     */
    @Test
    public void testSetMascota() {
        System.out.println("setMascota");
        Mascota mas = null;
        Paseo instance = new Paseo();
        instance.setMascota(mas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHora method, of class Paseo.
     */
    @Test
    public void testSetHora() {
        System.out.println("setHora");
        int hor = 0;
        Paseo instance = new Paseo();
        instance.setHora(hor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinutos method, of class Paseo.
     */
    @Test
    public void testSetMinutos() {
        System.out.println("setMinutos");
        int min = 0;
        Paseo instance = new Paseo();
        instance.setMinutos(min);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Paseo.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date f = null;
        Paseo instance = new Paseo();
        instance.setFecha(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Paseo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Paseo instance = new Paseo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
