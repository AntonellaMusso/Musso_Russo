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
public class Actividad {

    private Familiar familiar;
    private Mascota mascota;
    private String descripcion;
    private int distancia; 
    
    //Métodos de acceso
    public Familiar getFamiliar() {
        return familiar;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getDistancia() {
        return distancia;
    }

    //Métodos de modificación 
    public void setFamiliar(Familiar familiar) {
        this.familiar = familiar;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion.length() > 0 && descripcion.length() < 200) {
            this.descripcion = descripcion;
        }
    }

    public void setDistancia(int distancia) {
        if (distancia > 0) {
            this.distancia = distancia;
        }
    }

    //Constructor
    public Actividad(Familiar familiar, Mascota mascota, String descripcion, 
            int distancia) {
        this.setFamiliar(familiar);
        this.setMascota(mascota);
        this.setDescripcion(descripcion);
        this.setDistancia(distancia);
    }
    
    public Actividad() {
        this.setFamiliar(new Familiar());
        this.setMascota(new Mascota());
        this.setDescripcion("Descripción por defecto");
        this.setDistancia(0);
    }

    @Override
    public String toString() {
        return "Actividad realizada: " + this.getDescripcion() + 
                ", familiar a cargo " + this.getFamiliar().getNombre()+
                ". Nombre de la mascota: " + this.getMascota().getNombre();
                }
    
    
}
