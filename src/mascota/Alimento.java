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

    public void setFecha(Date f) {
        this.fecha = f;
    }
    
    public void setAlimento(String a) {
        if(a.length()> 0 && a.length()<200){
        this.alimento = a;
        }
    }
    
    public void setEstado(String estado){
        if(estado.equalsIgnoreCase("hecho") || 
           estado.equalsIgnoreCase("pendiente") || 
           estado.equalsIgnoreCase("pendiente")){
            this.setEstado(estado);
        }
    }
    
    //Constructores
    public Alimento(Familiar unF, Mascota unaM,Date fech, String alimento) {
        this.setFamiliar(unF);
        this.setMascota(unaM);
        this.setFecha(fech);
        this.setAlimento(alimento);
    }

    public Alimento() {
        this.setFamiliar(new Familiar());
        this.setMascota(new Mascota());
        this.setFecha(new java.util.Date());
        this.setAlimento("Alimento por Defecto");
        this.setEstado("pendiente");
    }

    @Override
    public String toString() {
        return "Fmiliar a cargo de la alimientació: " + 
                this.getFamiliar().getNombre() + " alimenta a: " 
                + this.getMascota().getNombre() + " a la hora: "
                + this.getFecha() + ", alimenta con: " + this.getAlimento();
    }
}
