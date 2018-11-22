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
public class AlimentoTest {
    
    public AlimentoTest() {
    }
    
   Familiar familiar = new Familiar("Nicolas",170,65,"Trabajador",null);
   Mascota masc = new Mascota("Firulais",175,70,"Labrador",null);
    Date date = new Date(1900+2018,1,22);
   Alimento a = new Alimento(familiar,masc,date,"Dog Chow");
      
        

    
    
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
     * Test of getFamiliar method, of class Alimento.
     */
    @Test
    public void testGetFamiliar() {
        assertEquals(familiar, a.getFamiliar());
    }

    /**
     * Test of getMascota method, of class Alimento.
     */
    @Test
    public void testGetMascota() {
         assertEquals(masc, a.getMascota());
    }

    /**
     * Test of getFecha method, of class Alimento.
     */
    @Test
    public void testGetFecha() {
        assertEquals(date, a.getFecha());
    }

    /**
     * Test of getAlimento method, of class Alimento.
     */
    @Test
    public void testGetAlimento() {
        assertEquals("Dog Chow", a.getAlimento());
    }

    /**
     * Test of setFamiliar method, of class Alimento.
     */
    @Test
    public void testSetFamiliar() {
        Familiar f = null;
        a.setFamiliar(f);
         assertEquals(null, a.getFamiliar());
    }

    /**
     * Test of setMascota method, of class Alimento.
     */
    @Test
    public void testSetMascota() {
        Mascota m = null;
        a.setMascota(m);
         assertEquals(null, a.getMascota());
    }

    /**
     * Test of setFecha method, of class Alimento.
     */
    @Test
    public void testSetFecha() {
       Date d = new Date(1900+2018,10,10);
       a.setFecha(d);
        assertEquals(d, a.getFecha());
    }

    /**
     * Test of setAlimento method, of class Alimento.
     */
    @Test
    public void testSetAlimento() {
        a.setAlimento("Pedrigi");
         assertEquals("Pedrigi", a.getAlimento());
    }

   

    /**
     * Test of toString method, of class Alimento.
     */
    @Test
    public void testToString() {
            assertEquals(
                    "Familiar a cargo alimentar: " + 
                a.getFamiliar().getNombre() + " alimenta a: " 
                + a.getMascota().getNombre() + " el dia: "
                + a.getFecha().getDate()+"/"+a.getFecha().getMonth()+"/"
                + (a.getFecha().getYear()+1900)+" "
                + ", alimenta con: " + a.getAlimento(),a.toString());
    
    }
    
}
