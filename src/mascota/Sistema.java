

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
    private Familiar usuarioSeleccionado; // usuario el cual usara la aplicacion
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
        usuarioSeleccionado = null;
        listadoFamiliar.add(new Familiar("Emiliano",20,63,"blablabla",null)); //borrar luego
    }

    //Métodos de acceso
    public Familiar getUsuarioSeleccionadoPorNombre(String name){
        Familiar usuario = null;
        for (int i = 0; i < getListaFamiliares().size(); i++) {
            if (getListaFamiliares().get(i).getNombre() == name ){
                usuario = getListaFamiliares().get(i);
            }
        }            
        return usuario; // si es null no se encontro conicidencia
    }
  
    public Familiar getUsuarioSeleccionado() { 
        return usuarioSeleccionado;
    }
    
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
    public void setUsuarioSeleccionado(Familiar usuarioSeleccionado) {
        this.usuarioSeleccionado = usuarioSeleccionado;
    }
    
    public void agregoMascotaALista(Mascota mascota) {
        if (getListaMascotas().size() < 4){
        this.getListaMascotas().add(mascota);
        }
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

