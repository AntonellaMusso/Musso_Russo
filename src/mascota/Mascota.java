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

import javax.swing.ImageIcon;

public class Mascota {
    //Atributos
    private String nombre;
    private int altura;
    private int peso;
    private String comentario;
    private ImageIcon foto;

    //Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public int getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public String getComentario() {
        return comentario;
    }

    public ImageIcon getFoto() {
        return foto;
    }

    //Métodos de modificación
    public void setNombre(String nom) {
        nombre = nom;
    }

    public void setAltura(int alt) {
        if (alt > 0 && alt < 200) {
            altura = alt;
        }
    }

    public void setPeso(int pes) {
        if (pes > 0 && pes < 250) {
            peso = pes;
        }
    }

    public void setComentario(String com) {
        if (com.length() > 0 && com.length() < 200) {
            comentario = com;
        }
    }

    public void setImagen(ImageIcon ima) {
        foto = ima;
    }
    
    //Constructores
    public Mascota(String nom, int alt, int pes, String com, ImageIcon im) {
        this.setNombre(nom);
        this.setAltura(alt);
        this.setPeso(pes);
        this.setComentario(com);
        this.setImagen(im);
    }

    public Mascota() {
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
