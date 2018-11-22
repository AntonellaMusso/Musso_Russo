/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota;

/**
 *
 * @author usuario
 */

import java.io.File;
import javax.swing.ImageIcon;

public class Familiar {

    //Atributos
    private String nombre;
    private int altura;
    private int peso;
    private String comentario;
    private File foto;

    //Métodos de acceso
    public String getNombre() {
        return this.nombre;
    }

    public int getAltura() {
        return this.altura;
    }

    public int getPeso() {
        return this.peso;
    }

    public String getComentario() {
        return this.comentario;
    }

    public File getFoto() {
        return this.foto;
    }

    //Métodos de modificación
    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setAltura(int alt) {
        if (alt > 0 && alt < 200) {
            this.altura = alt;
        }
    }

    public void setPeso(int pes) {
        if (pes > 0 && pes < 250) {
            this.peso = pes;
        }
    }

    public void setComentario(String com) {
        if (com.length() > 0 && com.length() < 200) {
            this.comentario = com;
        }
    }

    public void setImagen(File ima) {
        this.foto = ima;
    }
    
   //Constructores
    public Familiar(String nom, int alt, int pes, String com, File im) {
        this.setNombre(nom);
        this.setAltura(alt);
        this.setPeso(pes);
        this.setComentario(com);
        this.setImagen(im);
    }

    public Familiar() {
        this.setNombre("Nombre por defecto");
        this.setAltura(1);
        this.setPeso(1);
        this.setComentario("Comentario por defecto");
        this.setImagen(null);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre()
                + ", altura: " + this.getAltura() + ", peso: "
                + this.getPeso()+ ", comentario: " + 
                this.getComentario();
    }
}
