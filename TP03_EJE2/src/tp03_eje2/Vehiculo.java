/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03_eje2;

/**
 *
 * @author Sans
 */
public class Vehiculo {
    private int patente;
    private String marca;
    
    //Constructor

    public Vehiculo() {
    }

    public Vehiculo(int patente, String marca) {
        this.patente = patente;
        this.marca = marca;
    }
    
    //Getter and Setter

    public int getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + '}';
    }
    
    //metodos
    
    public void mostrar(){
        System.out.println("Patente: "+this.patente);
        System.out.println("Marca: "+this.marca);
    }
}
