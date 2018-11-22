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
public class FamiliarTest {
    Familiar f = new Familiar("A", 160,70, "Buen estudiante", null);
    
    public FamiliarTest() {
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
     * Test of getNombre method, of class Familiar.
     */
    @Test
    public void testGetNombre() {
            //f.getNombre();
            
            assertEquals("A", f.getNombre());
        
    }

    /**
     * Test of getAltura method, of class Familiar.
     */
    @Test
    public void testGetAltura() {
        assertEquals(160, f.getAltura());
    }

    /**
     * Test of getPeso method, of class Familiar.
     */
    @Test
    public void testGetPeso() {
       assertEquals(70, f.getPeso());
    }

    /**
     * Test of getComentario method, of class Familiar.
     */
    @Test
    public void testGetComentario() {
       assertEquals("Buen estudiante", f.getComentario());
    }

    /**
     * Test of getFoto method, of class Familiar.
     */
    @Test
    public void testGetFoto() {
      
    }

    /**
     * Test of setNombre method, of class Familiar.
     */
    @Test
    public void testSetNombre() {
       f.setNombre("Rafa");
       assertEquals("Rafa", f.getNombre());
    }

    /**
     * Test of setAltura method, of class Familiar.
     */
    @Test
    public void testSetAltura() {
        f.setAltura(170);
       assertEquals(170, f.getAltura());
    }

    /**
     * Test of setPeso method, of class Familiar.
     */
    @Test
    public void testSetPeso() {
      f.setPeso(50);
      assertEquals(50, f.getPeso());
    }

    /**
     * Test of setComentario method, of class Familiar.
     */
    @Test
    public void testSetComentario() {
        f.setComentario("excelente");
      assertEquals("excelente", f.getComentario());
    }

    /**
     * Test of setImagen method, of class Familiar.
     */
    @Test
    public void testSetImagen() {
        
    }

    @Test
    public void testToString() {
      assertEquals("Nombre: " + "A"
                + ", altura: " + 160 + ", peso: "
                + 70+ ", comentario: " + 
                "Buen estudiante", f.toString());
    }
    
}
