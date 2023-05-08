/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class Locales extends Inmueble {
    private int nroVentanas;
    private int nroVentanal;

    public Locales() {
    }

    public Locales(int nroVentanas, int nroVentanal) {
        this.nroVentanas = nroVentanas;
        this.nroVentanal = nroVentanal;
    }

    public int getNroVentanas() {
        return nroVentanas;
    }

    public int getNroVentanal() {
        return nroVentanal;
    }

    @Override
public double precio(){
    double preIn = super.getPrecioBase();
      
    if(super.getNroMetros()>50)preIn = preIn*101/100;
    if(this.nroVentanal<=1)return preIn*98/100;
    else{
        if(this.nroVentanal==4)return preIn*102/100;
        else return preIn;
    }
    
}    
    
}
