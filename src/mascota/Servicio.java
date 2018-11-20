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
public class Servicio {

    private String nombreVeterinario;
    private Mascota mascota;
    private String servicio;
    private Date fecha;

    //Métodos de acceso

    public Mascota getMascota() {
        return mascota;
    }
    
    
    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

    public String getServicio() {
        return servicio;
    }

    public Date getFecha() {
        return fecha;
    }


    
    //Métodos de modificación
    
    
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void setNombreVeterinario(String nombreVeterinario) {
        this.nombreVeterinario = nombreVeterinario;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    
   
    
    //Constructores
    public Servicio(Mascota m,String nombreVeterinario, String servicio, Date fecha) {
        this.setMascota(m);
        this.setNombreVeterinario(nombreVeterinario);
        this.setServicio(servicio);
        this.setFecha(fecha);
    }
    
    public Servicio() {
        this.setNombreVeterinario("Veterinario por defecto");
        this.setServicio("Servicio por defecto");
        this.setFecha(new java.util.Date());
    }

    @Override
    public String toString() {
        return "  Veterinario: " + this.getNombreVeterinario() + " Mascota "+
                this.getMascota().getNombre()
                + ", servicio: " + this.getServicio()+" el día: " + 
                this.getFecha() ;
    }

}
