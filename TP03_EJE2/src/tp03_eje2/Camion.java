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
public class Camion extends Vehiculo{
    private int carga;
    private int comportamiento;
    
    //constructor

    public Camion() {
    }

    public Camion(int carga, int comportamiento) {
        this.carga = carga;
        this.comportamiento = comportamiento;
    }

    public Camion(int carga, int comportamiento, int patente, String marca) {
        super(patente, marca);
        this.carga = carga;
        this.comportamiento = comportamiento;
    }
    
    //Getter and Setter
    
    public int getCarga() {
        return carga;
    }

    public int getComportamiento() {
        return comportamiento;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void setComportamiento(int comportamiento) {
        this.comportamiento = comportamiento;
    }

    @Override
    public String toString() {
        return "Camion{" + "carga=" + carga + ", comportamiento=" + comportamiento + '}';
    }
    
    
    
    //Metodos
    @Override
    public void mostrar(){
        System.out.println("Camion");
        super.mostrar();
        System.out.println("Cantidad de Carga: "+this.carga);
        System.out.println("Cantidad De Compartimiento: "+this.comportamiento);
    }
    public double pesoporcompartimiento(){
        return this.carga/this.comportamiento;
    }
}