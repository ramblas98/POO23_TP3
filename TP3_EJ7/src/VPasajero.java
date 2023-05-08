/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class VPasajero extends Vagon{
    private int largo;
    private double anchoU;

    public VPasajero() {
    }

    public VPasajero(int largo, double ancho) {
        this.largo = largo;
        this.anchoU = anchoU;
    }

    public int getLargo() {
        return largo;
    }

    public double getAncho() {
        return anchoU;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.anchoU = ancho;
    }
    
    public int cantPasajeroMax(){
        if(this.anchoU<=2.5)return this.largo*8;
        else return this.largo*10;
    }
    @Override
    public double pesoMaximo(){
        int CantP = cantPasajeroMax();
        return CantP*80;
    }
    @Override
    public boolean esLiviano(){
        return false;
    }
}
