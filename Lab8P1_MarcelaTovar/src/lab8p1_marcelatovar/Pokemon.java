
package lab8p1_marcelatovar;

public class Pokemon {
   String nombre; 
   int vida;
   int ataque;
   int suerte;

    public Pokemon(String nombre, int vida, int ataque, int suerte) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.suerte = suerte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getSuerte() {
        return suerte;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
    }
   
}
