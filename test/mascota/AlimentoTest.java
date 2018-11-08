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
public class AlimentoTest {
    
    public AlimentoTest() {
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
     * Test of getFamiliar method, of class Alimento.
     */
    @Test
    public void testGetFamiliar() {
        System.out.println("getFamiliar");
        Alimento instance = new Alimento();
        Familiar expResult = null;
        Familiar result = instance.getFamiliar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMascota method, of class Alimento.
     */
    @Test
    public void testGetMascota() {
        System.out.println("getMascota");
        Alimento instance = new Alimento();
        Mascota expResult = null;
        Mascota result = instance.getMascota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHora method, of class Alimento.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        Alimento instance = new Alimento();
        int expResult = 0;
        int result = instance.getHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinutos method, of class Alimento.
     */
    @Test
    public void testGetMinutos() {
        System.out.println("getMinutos");
        Alimento instance = new Alimento();
        int expResult = 0;
        int result = instance.getMinutos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Alimento.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Alimento instance = new Alimento();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlimento method, of class Alimento.
     */
    @Test
    public void testGetAlimento() {
        System.out.println("getAlimento");
        Alimento instance = new Alimento();
        String expResult = "";
        String result = instance.getAlimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFamiliar method, of class Alimento.
     */
    @Test
    public void testSetFamiliar() {
        System.out.println("setFamiliar");
        Familiar fam = null;
        Alimento instance = new Alimento();
        instance.setFamiliar(fam);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMascota method, of class Alimento.
     */
    @Test
    public void testSetMascota() {
        System.out.println("setMascota");
        Mascota mas = null;
        Alimento instance = new Alimento();
        instance.setMascota(mas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHora method, of class Alimento.
     */
    @Test
    public void testSetHora() {
        System.out.println("setHora");
        int hor = 0;
        Alimento instance = new Alimento();
        instance.setHora(hor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinutos method, of class Alimento.
     */
    @Test
    public void testSetMinutos() {
        System.out.println("setMinutos");
        int min = 0;
        Alimento instance = new Alimento();
        instance.setMinutos(min);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Alimento.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date f = null;
        Alimento instance = new Alimento();
        instance.setFecha(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlimento method, of class Alimento.
     */
    @Test
    public void testSetAlimento() {
        System.out.println("setAlimento");
        String a = "";
        Alimento instance = new Alimento();
        instance.setAlimento(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Alimento.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Alimento instance = new Alimento();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
