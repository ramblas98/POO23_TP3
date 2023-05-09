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
public class Vagonpasajero extends Vagon{
    private int largo;
    private int ancho;

    public Vagonpasajero() {
    }

    
    
    
    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public Vagonpasajero(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    
    
    
    
    @Override
    public String toString() {
        return "Vagonpasajero{" + "largo=" + largo + ", ancho=" + ancho + '}';
    }
    
    //metodos
    
    public int cantidadPasajerosMaximo(){
        if(this.ancho<=3)return this.largo*8;
        else return this.largo*10;
    }
    @Override
    public int pesoMaximo(){
        return this.cantidadPasajerosMaximo()*80;
    }
    @Override
    public boolean esLiviana(){
        if(this.pesoMaximo()<2500)return true;
        else return false;
    }
}
