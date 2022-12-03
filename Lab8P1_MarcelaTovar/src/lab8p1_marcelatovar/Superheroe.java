
package lab8p1_marcelatovar;


public class Superheroe {
    String nombre;
    String franquicia;
    String identidad;
    String origen;
    
    public Superheroe(){
        
    }
    public Superheroe(String nombre, String franquicia, String identidad, String origen) {
        this.nombre = nombre;
        this.franquicia = franquicia;
        this.identidad = identidad;
        this.origen = origen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Superheroe"  + nombre + "\n Franquicia: " + franquicia + "\nIdentidad: " + identidad + "\nLugar de origen:" + origen;
    }
    
    
}
