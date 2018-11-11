/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;

/**
 *
 * @author Emiliano
 */
public class Sistema {

    //Atributos
    private ArrayList<Mascota> listadoMascota;
    private ArrayList<Familiar> listadoFamiliar;
    private ArrayList<Actividad> listadoActividades;
    private ArrayList<Alimento> listadoAlimento;
    private ArrayList<Servicio> listadoServicio;

    //Constructor
    public Sistema() {
        listadoMascota = new ArrayList<Mascota>();
        listadoFamiliar = new ArrayList<Familiar>();
        listadoActividades = new ArrayList<Actividad>();
        listadoAlimento = new ArrayList<Alimento>();
        listadoServicio = new ArrayList<Servicio>();
    }

    //Métodos de acceso
    public ArrayList<Mascota> getListaMascotas() {
        return listadoMascota;
    }

    public ArrayList<Familiar> getListaFamiliares() {
        return listadoFamiliar;
    }

    public ArrayList<Actividad> getListaActividades() {
        return listadoActividades;
    }

    public ArrayList<Alimento> getListaAlimentos() {
        return listadoAlimento;
    }

    public ArrayList<Servicio> getListaServicios() {
        return listadoServicio;
    }

    //Agregar listado al sistema    
    public void agregoMascotaALista(Mascota mascota) {
        this.getListaMascotas().add(mascota);
    }

    public void agregoFamiliarALista(Familiar familiar) {
        this.getListaFamiliares().add(familiar);
    }

    public void agregoActividadALista(Actividad actividad) {
        this.getListaActividades().add(actividad);
    }

    public void agregoAlimentoALista(Alimento alimento) {
        this.getListaAlimentos().add(alimento);
    }

    public void agregoServicioALista(Servicio servicio) {
        this.getListaServicios().add(servicio);
    }

    //Eliminar elemento del listado
    public void eliminarMascotaDeLista(Mascota mascota) {
        this.getListaMascotas().remove(mascota);
    }

    public void eliminarFamiliarDeLista(Familiar familiar) {
        this.getListaFamiliares().remove(familiar);
    }

    //Método que valida que no exista mascota con el mismo nombre en el listado
    public boolean validoNombreMascota(ArrayList<Mascota> lista,
            String nombre) {
        boolean esValido = true;
        Iterator<Mascota> it = lista.iterator();
        while (it.hasNext()) {
            Mascota mas = it.next();
            if (mas.getNombre().equalsIgnoreCase(nombre)) {
                esValido = false;
            }
        }
        return esValido;
    }

    //Método que valida que no exista familiar con el mismo nombre en el listado
    public boolean validoNombreFamiliar(ArrayList<Familiar> lista,
            String nombre) {
        boolean esValido = true;
        Iterator<Familiar> it = lista.iterator();
        while (it.hasNext()) {
            Familiar fam = it.next();
            if (fam.getNombre().equalsIgnoreCase(nombre)) {
                esValido = false;
            }
        }
        return esValido;
    }

    //Métodos de modificación de elementos de los listados
    public boolean modificarMascota(ArrayList<Mascota> listado, String nombre,
            int altura, int peso, String comentario, ImageIcon foto) {
        boolean modificar = false;
        Iterator<Mascota> it = listado.iterator();
        while (it.hasNext()){
            Mascota m = it.next();
            if (!m.getNombre().equalsIgnoreCase(nombre)){
                modificar = false;
            } else {
                m.setPeso(peso);
                m.setAltura(altura);
                m.setComentario(comentario);
                m.setImagen(foto);
                modificar = true;
            }
        }
    return modificar;
    }
    
    public boolean modificarFamiliar(ArrayList<Familiar> listado, String nombre,
            int altura, int peso, String comentario, ImageIcon foto) {
        boolean modificar = false;
        Iterator<Familiar> it = listado.iterator();
        while (it.hasNext()){
            Familiar f = it.next();
            if (!f.getNombre().equalsIgnoreCase(nombre)){
                modificar = false;
            } else {
                f.setPeso(peso);
                f.setAltura(altura);
                f.setComentario(comentario);
                f.setImagen(foto);
                modificar = true;
            }
        }
    return modificar;
    }
}
