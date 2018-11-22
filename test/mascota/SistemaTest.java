/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota;

import java.util.ArrayList;
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
public class SistemaTest {
    Sistema s = new Sistema();
    Familiar familiar = new Familiar("Nicolas",170,65,"Trabajador",null);
     Mascota masc = new Mascota("Firulais",175,70,"Labrador",null);
    public SistemaTest() {
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
     * Test of sumarDiasAFecha method, of class Sistema.
     */
    @Test
    public void testSumarDiasAFecha() {
         Date date = new Date(1900+2018,1,22);
        date = s.sumarDiasAFecha(date, 2, 30);
        Date resultadoEsperado = new Date(1900+2018,1,24);
        assertEquals(date, resultadoEsperado);
         
    }

    /**
     * Test of conversionMesANumero method, of class Sistema.
     */
    @Test
    public void testConversionMesANumero() {
        //no se usa
    }

    /**
     * Test of getMes method, of class Sistema.
     */
    @Test
    public void testGetMes() {
        //no se usa
    }

    /**
     * Test of ultimoDiaDelMes method, of class Sistema.
     */
    @Test
    public void testUltimoDiaDelMes() {
        int mes = 10;
        mes = s.ultimoDiaDelMes(10);
        int resultadoEsperado = 31;
        assertEquals(mes, resultadoEsperado);
    }

    /**
     * Test of fechaMenor method, of class Sistema.
     */
    @Test
    public void testFechaMenor() {
        Date fecha1 = new Date(1900+2018,1,22);
        Date fecha2 = new Date(1900+2017,1,22);
        Date result =s.fechaMenor(fecha1, fecha2);
        assertEquals(result, fecha2);
        
    }

    /**
     * Test of fechasIguales method, of class Sistema.
     */
    @Test
    public void testFechasIguales() {
        Date fecha1 = new Date(1900+2018,1,22);
        Date fecha2 = new Date(1900+2018,1,22);
        assertTrue(s.fechasIguales(fecha1, fecha2));
    }

    /**
     * Test of borrarActividadPorNombre method, of class Sistema.
     */
    @Test
    public void testBorrarActividadPorNombre() {
        Actividad a = new Actividad();
        Actividad act[] = new Actividad[0];
        s.agregoActividadALista(a);
        s.borrarActividadPorNombre(a.getDescripcion());
        assertEquals(s.getListaActividades().size(), act.length);

        
    }


    /**
     * Test of getListadoAlimento method, of class Sistema.
     */
    @Test
    public void testGetListadoAlimento() {
       
    }

    /**
     * Test of getListadoPaseos method, of class Sistema.
     */
    @Test
    public void testGetListadoPaseos() {
     
    }

    /**
     * Test of getMascotaPorNombre method, of class Sistema.
     */
    @Test
    public void testGetMascotaPorNombre() {
    
     s.agregoMascotaALista(masc);
     assertEquals(masc, s.getMascotaPorNombre("Firulais"));
    }

    /**
     * Test of getUsuarioSeleccionadoPorNombre method, of class Sistema.
     */
    @Test
    public void testGetUsuarioSeleccionadoPorNombre() {
         
         s.agregoFamiliarALista(familiar);
         assertEquals(familiar, s.getUsuarioSeleccionadoPorNombre("Nicolas"));
         
    }

    /**
     * Test of getUsuarioSeleccionado method, of class Sistema.
     */
    @Test
    public void testGetUsuarioSeleccionado() {
      assertEquals(null, s.getUsuarioSeleccionado());
    }

    /**
     * Test of getListaMascotas method, of class Sistema.
     */
    @Test
    public void testGetListaMascotas() {
        ArrayList<Mascota> lista = s.getListaMascotas();
        assertEquals(lista, s.getListaMascotas());  
    }

    /**
     * Test of getListaFamiliares method, of class Sistema.
     */
    @Test
    public void testGetListaFamiliares() {
  
    }

    /**
     * Test of getListaActividades method, of class Sistema.
     */
    @Test
    public void testGetListaActividades() {
     
    }

    /**
     * Test of getListaAlimentos method, of class Sistema.
     */
    @Test
    public void testGetListaAlimentos() {
        
    }

    /**
     * Test of getListaServicios method, of class Sistema.
     */
    @Test
    public void testGetListaServicios() {
        
    }

   

    /**
     * Test of setListadoAlimento method, of class Sistema.
     */
    @Test
    public void testSetListadoAlimento() {
        ArrayList<Alimento> lista = new ArrayList();
        s.setListadoAlimento(lista);
        assertEquals(lista, s.getListaAlimentos());  
       
    }

    /**
     * Test of setListadoPaseos method, of class Sistema.
     */
    @Test
    public void testSetListadoPaseos() {
        ArrayList<Paseo> lista = new ArrayList();
        s.setListadoPaseos(lista);
        assertEquals(lista, s.getListadoPaseos());  
    }

    /**
     * Test of setUsuarioSeleccionado method, of class Sistema.
     */
    @Test
    public void testSetUsuarioSeleccionado() {
     s.setUsuarioSeleccionado(familiar);
     assertEquals(familiar, s.getUsuarioSeleccionado());
     
    }

    /**
     * Test of agregoMascotaALista method, of class Sistema.
     */
    @Test
    public void testAgregoMascotaALista() {
        s.agregoMascotaALista(masc);
        assertEquals(masc, s.getMascotaPorNombre("Firulais"));
    }

    /**
     * Test of agregoFamiliarALista method, of class Sistema.
     */
    @Test
    public void testAgregoFamiliarALista() {
        s.agregoFamiliarALista(familiar);
        assertEquals(familiar, s.getUsuarioSeleccionadoPorNombre("Nicolas"));
    }

    /**
     * Test of agregoActividadALista method, of class Sistema.
     */
    @Test
    public void testAgregoActividadALista() {
        Actividad a =  new Actividad();
        s.agregoActividadALista(a);
        assertEquals(a, s.getListaActividades().get(0));
    }

    /**
     * Test of agregoAlimentoALista method, of class Sistema.
     */
    @Test
    public void testAgregoAlimentoALista() {
        Alimento al = new Alimento();
        s.agregoAlimentoALista(al);
        assertEquals(al, s.getListaAlimentos().get(0));
    }

    /**
     * Test of agregoServicioALista method, of class Sistema.
     */
    @Test
    public void testAgregoServicioALista() {
        Servicio ser = new Servicio();
        s.agregoServicioALista(ser);
        assertEquals(ser, s.getListaServicios().get(0));
    }

    /**
     * Test of eliminarMascotaDeLista method, of class Sistema.
     */
    @Test
    public void testEliminarMascotaDeLista() {
        s.agregoMascotaALista(masc);
        s.eliminarMascotaDeLista(masc);
        assertNull(s.getMascotaPorNombre("Firulais"));
    }

    /**
     * Test of eliminarFamiliarDeLista method, of class Sistema.
     */
    @Test
    public void testEliminarFamiliarDeLista() {
       s.agregoFamiliarALista(familiar);
       s.eliminarFamiliarDeLista(familiar);
        assertNull(s.getUsuarioSeleccionadoPorNombre("Nicolas"));
    }

    /**
     * Test of validoNombreMascota method, of class Sistema.
     */
    @Test
    public void testValidoNombreMascota() {
        s.agregoMascotaALista(masc);
        assertFalse(s.validoNombreMascota("Firulais"));
    }

    /**
     * Test of validoNombreFamiliar method, of class Sistema.
     */
    @Test
    public void testValidoNombreFamiliar() {
       s.agregoFamiliarALista(familiar);
        assertFalse(s.validoNombreFamiliar("Nicolas"));
    }
    
}
