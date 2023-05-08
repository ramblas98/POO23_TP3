/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class Pisos extends Inmueble{
    private int nroPiso;

    public Pisos() {
    }

    public Pisos(int nroPiso) {
        this.nroPiso = nroPiso;
    }

    public int getNroPiso() {
        return nroPiso;
    }

    public void setNroPiso(int nroPiso) {
        this.nroPiso = nroPiso;
    }
    
    @Override
    public double precio(){
        double precIn = super.getPrecioBase();
        if(this.nroPiso>=3)return precIn * 97 / 100;
        else return precIn;
    }
}
