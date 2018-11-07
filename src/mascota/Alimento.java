/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Alimento {
    //Atributos
    private Mascota mascota;
    private Familiar familiar;
    private Date fecha;
    private String alimento;
    private int hora;
    private int minutos;

    //Metodos de acceso
    public Familiar getFamiliar() {
        return this.familiar;
    }

    public Mascota getMascota() {
        return this.mascota;
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public Date getFecha() {
        return this.fecha;
    }
    
    public String getAlimento() {
        return this.alimento;
    }

    //Métodos de modificación
    public void setFamiliar(Familiar fam) {
        this.familiar = fam;
    }

    public void setMascota(Mascota mas) {
        this.mascota = mas;
    }

    public void setHora(int hor) {
        if (hor >= 0 && hor <= 23) {
            this.hora = hor;
        }
    }

    public void setMinutos(int min) {
        if (min >= 0 && min <= 60) {
            this.minutos = min;
        }
    }

    public void setFecha(Date f) {
        this.fecha = f;
    }
    
    public void setAlimento(String a) {
        if(a.length()> 0 && a.length()<200){
        this.alimento = a;
        }
    }
    //Constructores
    public Alimento(Familiar unF, Mascota unaM, int unahora, int minuto,
            Date fech, String alimento) {
        this.setFamiliar(unF);
        this.setMascota(unaM);
        this.setHora(unahora);
        this.setMinutos(minuto);
        this.setFecha(fech);
    }

    public Alimento() {
        this.setFamiliar(new Familiar());
        this.setMascota(new Mascota());
        this.setHora(0);
        this.setMinutos(0);
        this.setFecha(new java.util.Date());
        this.setAlimento("Galletitas");
    }

    @Override
    public String toString() {
        return "Fmiliar a cargo de la alimientació: " + 
                this.getFamiliar().getNombre() + " alimenta a: " 
                + this.getMascota().getNombre() + " a la hora: "
                + this.getHora() + ":" + this.getMinutos() + " el día: " + 
                this.getFecha() + ", alimenta con: " + this.getAlimento();
    }
}
