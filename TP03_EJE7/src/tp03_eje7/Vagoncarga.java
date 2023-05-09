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
public class Vagoncarga extends Vagon{
    private int cargarMaxima;
    private final int guarda;

    public Vagoncarga() {
        this.guarda = 2;
    }

    public Vagoncarga(int cargarMaxima, int guarda) {
        this.cargarMaxima = cargarMaxima;
        this.guarda = guarda;
    }

    public int getCargarMaxima() {
        return cargarMaxima;
    }

    public int getGuarda() {
        return guarda;
    }

    public void setCargarMaxima(int cargarMaxima) {
        this.cargarMaxima = cargarMaxima;
    }

    @Override
    public String toString() {
        return "Vagoncarga{" + "cargarMaxima=" + cargarMaxima + ", guarda=" + guarda + '}';
    }
    
    //metodo
    
    @Override
    public int pesoMaximo(){
        return this.cargarMaxima+160;
    }
    @Override
    public boolean esLiviana(){
        if(this.pesoMaximo()<2500)return true;
        else return false;
    }
}
