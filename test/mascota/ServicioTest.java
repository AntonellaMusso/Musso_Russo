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
public class ServicioTest {
    
     Mascota masc = new Mascota("Firulais",175,70,"Labrador",null);
     Date date = new Date(1900+2018,1,22);
     Servicio s = new Servicio(masc,"Fernando","Corte de Pelo",date);
     
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
     * Test of getMascota method, of class Servicio.
     */
    @Test
    public void testGetMascota() {
        assertEquals(masc, s.getMascota());
    }

    /**
     * Test of getNombreVeterinario method, of class Servicio.
     */
    @Test
    public void testGetNombreVeterinario() {
        assertEquals("Fernando", s.getNombreVeterinario());
    }

    /**
     * Test of getServicio method, of class Servicio.
     */
    @Test
    public void testGetServicio() {
        assertEquals("Corte de Pelo", s.getServicio());
    }

    /**
     * Test of getFecha method, of class Servicio.
     */
    @Test
    public void testGetFecha() {
        assertEquals(date, s.getFecha());
    }

    /**
     * Test of setMascota method, of class Servicio.
     */
    @Test
    public void testSetMascota() {
        s.setMascota(null);
        assertEquals(null, s.getMascota());
    }

    /**
     * Test of setNombreVeterinario method, of class Servicio.
     */
    @Test
    public void testSetNombreVeterinario() {
        s.setNombreVeterinario("Gabriel");
        assertEquals("Gabriel", s.getNombreVeterinario());
    }

    /**
     * Test of setServicio method, of class Servicio.
     */
    @Test
    public void testSetServicio() {
        s.setServicio("desparacito");
       assertEquals("desparacito", s.getServicio());
    }

    /**
     * Test of setFecha method, of class Servicio.
     */
    @Test
    public void testSetFecha() {
        s.setFecha(null);
        assertEquals(null, s.getFecha());
    }

    /**
     * Test of toString method, of class Servicio.
     */
    @Test
    public void testToString() {
        assertEquals( "  Veterinario: " + s.getNombreVeterinario() + " Mascota "+
                s.getMascota().getNombre()
                + ", servicio: " + s.getServicio()+" el día: " + 
                s.getFecha() , s.toString());
       
    }
    
}
