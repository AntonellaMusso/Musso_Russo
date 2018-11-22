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
        assertEquals(familiar, p.getFamiliar());
        
    }

    /**
     * Test of getMascota method, of class Paseo.
     */
    @Test
    public void testGetMascota() {
       assertEquals(masc, p.getMascota());
    }

    /**
     * Test of getFecha method, of class Paseo.
     */
    @Test
    public void testGetFecha() {
       assertEquals(date, p.getFecha());
    }

    /**
     * Test of setFamiliar method, of class Paseo.
     */
    @Test
    public void testSetFamiliar() {
       p.setFamiliar(null);
       assertEquals(null, p.getFamiliar());
    }

    /**
     * Test of setMascota method, of class Paseo.
     */
    @Test
    public void testSetMascota() {
        p.setMascota(null);
       assertEquals(null, p.getMascota());
    }

    /**
     * Test of setFecha method, of class Paseo.
     */
    @Test
    public void testSetFecha() {
        p.setFecha(null);
       assertEquals(null, p.getFecha());
    }

    /**
     * Test of toString method, of class Paseo.
     */
    @Test
    public void testToString() {
        assertEquals("Familiar a cargo del paseo: " + p.getFamiliar().getNombre()
                + " pasea a: " + p.getMascota().getNombre() + " el dia: "
                + p.getFecha().getDate()+"/"+p.getFecha().getMonth()+"/"
                + (p.getFecha().getYear()+1900), p.toString());
        
    }

}
