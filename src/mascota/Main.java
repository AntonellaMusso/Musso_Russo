/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota;
import interfaz.Perfiles;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sistema sistema = new Sistema();
        Perfiles seleccion = new Perfiles(sistema);
        seleccion.setVisible(true);
               
    }
    
    
}

