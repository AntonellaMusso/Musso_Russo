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
 * @author Emi
 */
public class PaseoTest {

    Familiar familiar = new Familiar("Nicolas", 170, 65, "Trabajador", null);
    Mascota masc = new Mascota("Firulais", 175, 70, "Labrador", null);
    Date date = new Date(1900 + 2018, 1, 22);
    Paseo p = new Paseo(familiar, masc, date);

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
