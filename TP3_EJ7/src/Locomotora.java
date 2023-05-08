/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class Locomotora {
    private double peso;
    private double pesoMaxA;
    private double velocidadMax;

    public Locomotora() {
    }

    public Locomotora(double peso, double pesoMaxA, double velocidadMax) {
        this.peso = peso;
        this.pesoMaxA = pesoMaxA;
        this.velocidadMax = velocidadMax;
    }

    public double getPeso() {
        return peso;
    }

    public double getPesoMaxA() {
        return pesoMaxA;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPesoMaxA(double pesoMaxA) {
        this.pesoMaxA = pesoMaxA;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    
    public boolean esEficiente(){
        return false;
    }
    public double arrastreUtil(){
        return this.pesoMaxA - this.peso;
    }
}


