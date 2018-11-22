/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota;

import java.io.File;
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
public class MascotaTest {
    
    public MascotaTest() {
    }
    Mascota m = new Mascota("Firulais",50,20,"Labrador",null);
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
     * Test of getNombre method, of class Mascota.
     */
    @Test
    public void testGetNombre() {
         assertEquals("Firulais", m.getNombre());
    }

    /**
     * Test of getAltura method, of class Mascota.
     */
    @Test
    public void testGetAltura() {
       assertEquals(50, m.getAltura());
    }

    /**
     * Test of getPeso method, of class Mascota.
     */
    @Test
    public void testGetPeso() {
        assertEquals(20, m.getPeso());
    }

    /**
     * Test of getComentario method, of class Mascota.
     */
    @Test
    public void testGetComentario() {
        assertEquals("Labrador", m.getComentario());
    }

    /**
     * Test of getFoto method, of class Mascota.
     */
    @Test
    public void testGetFoto() {
        
    }

    /**
     * Test of setNombre method, of class Mascota.
     */
    @Test
    public void testSetNombre() {
        m.setNombre("Rolfo");
        assertEquals("Rolfo", m.getNombre());
    }

    /**
     * Test of setAltura method, of class Mascota.
     */
    @Test
    public void testSetAltura() {
        m.setAltura(55);
        assertEquals(55, m.getAltura());
    }

    /**
     * Test of setPeso method, of class Mascota.
     */
    @Test
    public void testSetPeso() {
        m.setPeso(22);
       assertEquals(22, m.getPeso());
    }

    /**
     * Test of setComentario method, of class Mascota.
     */
    @Test
    public void testSetComentario() {
        m.setComentario("Husky");
        assertEquals("Husky", m.getComentario());
    }

    /**
     * Test of setImagen method, of class Mascota.
     */
    @Test
    public void testSetImagen() {
        
    }

    /**
     * Test of toString method, of class Mascota.
     */
    @Test
    public void testToString() {
         assertEquals( "Nombre: " + m.getNombre()
                + ", altura: " + m.getAltura() + ", peso: "
                + m.getPeso()+ ", comentario: " + 
                m.getComentario(), m.toString());
       
    }
    
}
