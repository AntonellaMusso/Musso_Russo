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
public class Paseo {

    //Atributos
    private Familiar familiar;
    private Mascota mascota;
    private Date fecha;

    //Metodos de acceso
    public Familiar getFamiliar() {
        return this.familiar;
    }

    public Mascota getMascota() {
        return this.mascota;
    }


    public Date getFecha() {
        return this.fecha;
    }

    //Métodos de modificación
    public void setFamiliar(Familiar fam) {
        this.familiar = fam;
    }

    public void setMascota(Mascota mas) {
        this.mascota = mas;
    }


    public void setFecha(Date f) {
        this.fecha = f;
    }

    //Constructores
    public Paseo(Familiar unF, Mascota unaM, Date fecha) {
        this.setFamiliar(unF);
        this.setMascota(unaM);
        this.setFecha(fecha);
    }

    public Paseo() {
        this.setFamiliar(new Familiar());
        this.setMascota(new Mascota());
        this.setFecha(new java.util.Date());
    }

    @Override
    public String toString() {
        return "Familiar a cargo del paseo: " + this.getFamiliar().getNombre()
                + " pasea a: " + this.getMascota().getNombre() + " el dia: "
                + this.getFecha().getDate()+"/"+this.getFecha().getMonth()+"/"
                + (this.getFecha().getYear()+1900);
    }
}
