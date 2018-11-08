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
    private String servicio;
    private Date fecha;
    private int hora;
    private int minutos;
    
    //Métodos de acceso
    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

    public String getServicio() {
        return servicio;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }
    
    //Métodos de modificación
    public void setNombreVeterinario(String nombreVeterinario) {
        this.nombreVeterinario = nombreVeterinario;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
    
    //Constructores
    public Servicio(String nombreVeterinario, String servicio, Date fecha, int hora, int minutos) {
        this.nombreVeterinario = nombreVeterinario;
        this.servicio = servicio;
        this.fecha = fecha;
        this.hora = hora;
        this.minutos = minutos;
    }
    
    public Servicio() {
        this.setNombreVeterinario("Veterinario por defecto");
        this.setServicio("Servicio por defecto");
        this.setFecha(new java.util.Date());
        this.setHora(0);
        this.setMinutos(0);
    }

    @Override
    public String toString() {
        return "Nombre veterinario" + this.getNombreVeterinario()
                + ", servicio: " + this.getServicio()+ " a la hora: "
                + this.getHora() + ":" + this.getMinutos() + " el día: " + 
                this.getFecha();
    }

}
