/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03_eje7;

/**
 *
 * @author Sans
 */
public class Locomotora {
    private int peso;
    private int pesoMaxarrastre;
    private int velocidadMaxima;

    public Locomotora() {
    }

    public Locomotora(int peso, int pesoMaxarrastre, int velocidadMaxima) {
        this.peso = peso;
        this.pesoMaxarrastre = pesoMaxarrastre;
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getPeso() {
        return peso;
    }

    public int getPesoMaxarrastre() {
        return pesoMaxarrastre;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setPesoMaxarrastre(int pesoMaxarrastre) {
        this.pesoMaxarrastre = pesoMaxarrastre;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "Locomotora{" + "peso=" + peso + ", pesoMaxarrastre=" + pesoMaxarrastre + ", velocidadMaxima=" + velocidadMaxima + '}';
    }
    
    //Metodos
    
    public boolean esEficiente(){
        if(this.pesoMaxarrastre>=this.peso*5) return true;
        else return false;
    }
    public int arrastreUtil(){
        return this.pesoMaxarrastre-this.peso;
    }
    
}
