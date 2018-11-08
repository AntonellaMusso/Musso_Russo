/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota;

import javax.swing.ImageIcon;
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
public class MascotaTest {
    
    public MascotaTest() {
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
     * Test of getNombre method, of class Mascota.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Mascota instance = new Mascota();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAltura method, of class Mascota.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        Mascota instance = new Mascota();
        int expResult = 0;
        int result = instance.getAltura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeso method, of class Mascota.
     */
    @Test
    public void testGetPeso() {
        System.out.println("getPeso");
        Mascota instance = new Mascota();
        int expResult = 0;
        int result = instance.getPeso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComentario method, of class Mascota.
     */
    @Test
    public void testGetComentario() {
        System.out.println("getComentario");
        Mascota instance = new Mascota();
        String expResult = "";
        String result = instance.getComentario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFoto method, of class Mascota.
     */
    @Test
    public void testGetFoto() {
        System.out.println("getFoto");
        Mascota instance = new Mascota();
        ImageIcon expResult = null;
        ImageIcon result = instance.getFoto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Mascota.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nom = "";
        Mascota instance = new Mascota();
        instance.setNombre(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAltura method, of class Mascota.
     */
    @Test
    public void testSetAltura() {
        System.out.println("setAltura");
        int alt = 0;
        Mascota instance = new Mascota();
        instance.setAltura(alt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPeso method, of class Mascota.
     */
    @Test
    public void testSetPeso() {
        System.out.println("setPeso");
        int pes = 0;
        Mascota instance = new Mascota();
        instance.setPeso(pes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComentario method, of class Mascota.
     */
    @Test
    public void testSetComentario() {
        System.out.println("setComentario");
        String com = "";
        Mascota instance = new Mascota();
        instance.setComentario(com);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImagen method, of class Mascota.
     */
    @Test
    public void testSetImagen() {
        System.out.println("setImagen");
        ImageIcon ima = null;
        Mascota instance = new Mascota();
        instance.setImagen(ima);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Mascota.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Mascota instance = new Mascota();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
