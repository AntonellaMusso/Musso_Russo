/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
    private ArrayList<Paseo> listadoPaseos;
    private ArrayList<Servicio> listadoServicio;
    private ArrayList<String> cordenadasMapa;

    //Constructor
    public Sistema() {
        listadoMascota = new ArrayList<Mascota>();
        listadoFamiliar = new ArrayList<Familiar>();
        listadoActividades = new ArrayList<Actividad>();
        listadoAlimento = new ArrayList<Alimento>();
        listadoServicio = new ArrayList<Servicio>();
        listadoPaseos = new ArrayList();
        usuarioSeleccionado = null;
        cordenadasMapa = new ArrayList();
        listadoFamiliar.add(new Familiar("Emiliano", 170, 65, "estudiante", null)); //borrar luego
        listadoMascota.add(new Mascota("Firulais", 50, 13, "perro sin raza", null));
        
    }

   

  

    //Metodos de calendario
    public Date sumarDiasAFecha(Date fecha, int diasSuma, int limite) {
        System.out.println("------------------------------------");
        System.out.println("***");
        System.out.println("Dia antes de sumar " + fecha.getDate());
        int dia = fecha.getDate() + diasSuma;
        System.out.println("Dia despues del sumado " + dia);
        System.out.println("***");
        if (dia > limite) {
            System.out.println("No deberia entrar aca");
            dia = dia - limite;
            if (fecha.getMonth() <= 11) {
                fecha.setMonth(fecha.getMonth() + 1);
            } else {
                fecha.setYear(fecha.getYear() + 1);
                fecha.setMonth(1);
            }
        }
        System.out.println("Vamos a hacer un date con esto");
        System.out.println("Year: " + fecha.getYear());
        System.out.println("Month: " + fecha.getMonth());
        System.out.println("Day: " + dia);
        System.out.println("****** La hacemos **** ");
        Date date = new Date(fecha.getYear(), fecha.getMonth(), dia);
        System.out.println("date a punto de retornar" + date.toString());
        System.out.println("-------------------------------------");
        return date;
    }

    public int conversionMesANumero(String mes) {
        int mesNumerico = 0;
        switch (mes) {
            case "Jan":
                mesNumerico = 1;
                break;
            case "Feb":
                mesNumerico = 2;
                break;
            case "Mar":
                mesNumerico = 3;
                break;
            case "Apr":
                mesNumerico = 4;
                break;
            case "May":
                mesNumerico = 5;
                break;
            case "Jun":
                mesNumerico = 6;
                break;
            case "Jul":
                mesNumerico = 7;
                break;
            case "Aug":
                mesNumerico = 8;
                break;
            case "Sep":
                mesNumerico = 9;
                break;
            case "Oct":
                mesNumerico = 10;
                break;
            case "Nov":
                mesNumerico = 11;
                break;
            case "Dec":
                mesNumerico = 12;
                break;
        }

        return mesNumerico;
    }

    public int getMes(Date fecha) {
        int mes = conversionMesANumero(fecha.toString().substring(4, 7));
        return mes;
    }

    public int ultimoDiaDelMes(int mes) {
        int ultimoDia = 0;
        switch (mes) {
            case 1:
                //enero
                ultimoDia = 31;
                break;
            case 2:
                //febrero
                ultimoDia = 28;
                break;
            case 3:
                //marzo
                ultimoDia = 31;
                break;
            case 4:
                //abril
                ultimoDia = 30;
                break;
            case 5:
                //mayo
                ultimoDia = 31;
                break;
            case 6:
                //junio
                ultimoDia = 30;
                break;
            case 7:
                //julio
                ultimoDia = 31;
                break;
            case 8:
                //agosto
                ultimoDia = 31;
                break;
            case 9:
                //septiembre
                ultimoDia = 30;
                break;
            case 10:
                //octubre
                ultimoDia = 31;
                break;
            case 11:
                //noviembre
                ultimoDia = 30;
                break;
            case 12:
                //diciembre
                ultimoDia = 31;
                break;
        }
        return ultimoDia;
    }

    public Date fechaMenor(Date fecha1, Date fecha2) {
        if (fecha1.getYear() == fecha2.getYear()) {
            //anios iguales
            if (fecha1.getMonth() == fecha2.getMonth()) {
                //meses iguales
                if (fecha1.getDate() == fecha2.getDate()) {
                    //dias iguales, aca no deberia llegar
                    return fecha1; // retorno cualquiera
                } else {
                    // dias diferentes
                    if (fecha1.getDate() < fecha2.getDate()) {
                        return fecha1;
                    } else {
                        return fecha2;
                    }
                }
            } else {
                //meses diferentes
                if (fecha1.getMonth() < fecha2.getMonth()) {
                    return fecha1;
                } else {
                    return fecha2;
                }
            }
        } else {
            //anios diferentes
            if (fecha1.getYear() < fecha2.getYear()) {
                return fecha1;
            } else {
                return fecha2;
            }
        }
    }

    public boolean fechasIguales(Date fecha1, Date fecha2) {
        return fecha1.getYear() == fecha2.getYear()
                && fecha1.getMonth() == fecha2.getMonth()
                && fecha1.getDate() == fecha2.getDate();
    }
  
    public void borrarActividadPorNombre(String actividad){
        for (int i = 0; i < getListaActividades().size(); i++) {
            Actividad a = getListaActividades().get(i);
            if (a.getDescripcion().equalsIgnoreCase(actividad)){
                System.out.println("Borramos actividad");
                getListaActividades().remove(a);
            }
        }
    }
    
    //Métodos de acceso
     public ArrayList<String> getCordenadasMapa() {
        return cordenadasMapa;
    }
    
    public ArrayList<Alimento> getListadoAlimento() {
        return listadoAlimento;
    }

    public ArrayList<Paseo> getListadoPaseos() {
        return listadoPaseos;
    }

    public Mascota getMascotaPorNombre(String mascota) {

        if (mascota != null) {
            for (int i = 0; i < listadoMascota.size(); i++) {
                Mascota m = getListaMascotas().get(i);
                if (m.getNombre().equalsIgnoreCase(mascota)) {
                    return m;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay mascota seleccionada");
        }
        return null; // si es null no se encontro coincidencia
    }

    public Familiar getUsuarioSeleccionadoPorNombre(String name) {
        if (name != null) {
            Familiar usuario = null;
            for (int i = 0; i < getListaFamiliares().size(); i++) {
                if (getListaFamiliares().get(i).getNombre().equalsIgnoreCase(name)) {
                    usuario = getListaFamiliares().get(i);
                }
            }
            return usuario; // si es null no se encontro conicidencia
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuario seleccionado");
            return null;
        }
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
      public void agregarCordenada(String cord) {
        getCordenadasMapa().add(cord);
    }
    
    public void setListadoAlimento(ArrayList<Alimento> listadoAlimento) {
        this.listadoAlimento = listadoAlimento;
    }

    public void setListadoPaseos(ArrayList<Paseo> listadoPaseos) {
        this.listadoPaseos = listadoPaseos;
    }

    public void setUsuarioSeleccionado(Familiar usuarioSeleccionado) {
        this.usuarioSeleccionado = usuarioSeleccionado;
    }

    public void agregoMascotaALista(Mascota mascota) {
        if (getListaMascotas().size() < 4) {
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
    public boolean validoNombreMascota(String nombre) {
        boolean esValido = true;
        Iterator<Mascota> it = getListaMascotas().iterator();
        while (it.hasNext()) {
            Mascota mas = it.next();
            if (mas.getNombre().equalsIgnoreCase(nombre)) {
                esValido = false;
            }
        }
        return esValido;
    }

    //Método que valida que no exista familiar con el mismo nombre en el listado
    public boolean validoNombreFamiliar(String nombre) {    
        boolean esValido = true;
        Iterator<Familiar> it =  getListaFamiliares().iterator();
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
        while (it.hasNext()) {
            Familiar f = it.next();
            if (!f.getNombre().equalsIgnoreCase(nombre)) {
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
