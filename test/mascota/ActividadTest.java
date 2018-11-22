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
public class ActividadTest {
    Familiar f = null;
    Mascota m = null;
    String descripcion = "paseo por la rambla";
    Date fecha = new Date(2018+1900, 1, 22);
    int distancia = 1;
    String cordenadas=" 0001 0002";
        Actividad act = new Actividad(f,m,descripcion,fecha,distancia,cordenadas);
    
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
     * Test of getCordenadasDePaseo method, of class Actividad.
     */
    @Test
    public void testGetCordenadasDePaseo() {
     assertEquals(" 0001 0002", act.getCordenadasDePaseo());
    }

    /**
     * Test of getFecha method, of class Actividad.
     */
    @Test
    public void testGetFecha() {
        Date date = new Date(2018+1900, 1, 22);
         assertEquals(date, act.getFecha());
    }

    /**
     * Test of getFamiliar method, of class Actividad.
     */
    @Test
    public void testGetFamiliar() {
         assertEquals(null, act.getFamiliar());
    }

    /**
     * Test of getMascota method, of class Actividad.
     */
    @Test
    public void testGetMascota() {
         assertEquals(null, act.getMascota());
    }

    /**
     * Test of getDescripcion method, of class Actividad.
     */
    @Test
    public void testGetDescripcion() {
       assertEquals("paseo por la rambla", act.getDescripcion());
    }

    /**
     * Test of getDistancia method, of class Actividad.
     */
    @Test
    public void testGetDistancia() {
        assertEquals(1, act.getDistancia());
    }

    /**
     * Test of setCordenadasDePaseo method, of class Actividad.
     */
    @Test
    public void testSetCordenadasDePaseo() {
        act.setCordenadasDePaseo(" 0002 0003");
        assertEquals(" 0002 0003", act.getCordenadasDePaseo());
    }

    /**
     * Test of setFecha method, of class Actividad.
     */
    @Test
    public void testSetFecha() {
        Date date = new Date(1900+2018,1,22);
        act.setFecha(date);
       assertEquals(date, act.getFecha());
    }

    /**
     * Test of setFamiliar method, of class Actividad.
     */
    @Test
    public void testSetFamiliar() {
        Familiar fam = new Familiar();
        act.setFamiliar(fam);
        assertEquals(fam, act.getFamiliar());
    }

    /**
     * Test of setMascota method, of class Actividad.
     */
    @Test
    public void testSetMascota() {
        Mascota m = new Mascota();
           act.setMascota(m);
        assertEquals(m, act.getMascota());
    }

    /**
     * Test of setDescripcion method, of class Actividad.
     */
    @Test
    public void testSetDescripcion() {
       act.setDescripcion("hola");
       assertEquals("hola", act.getDescripcion());
    }

    /**
     * Test of setDistancia method, of class Actividad.
     */
    @Test
    public void testSetDistancia() {
        act.setDistancia(2);
        assertEquals(2, act.getDistancia());
    }

    /**
     * Test of toString method, of class Actividad.
     */
    @Test
    public void testToString() {
        Familiar familiar = new Familiar("Nicolas",170,65,"Trabajador",null);
        Mascota masc = new Mascota("Firulais",175,70,"Labrador",null);
        act.setFamiliar(familiar);
        act.setMascota(masc);
        
        assertEquals("Actividad realizada: " + act.getDescripcion()
                + ", familiar a cargo " + act.getFamiliar().getNombre()
                + ", Nombre de la mascota: " + act.getMascota().getNombre()
                +" , Distancia recorrida; "+act.getDistancia()+ " KM",act.toString());
    }
    
}
