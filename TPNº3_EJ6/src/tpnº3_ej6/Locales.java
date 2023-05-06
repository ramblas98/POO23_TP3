/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpnº3_ej6;


public class Locales extends Inmueble{
    private int ventanas;
    
    public Locales(){
    }
    
    public Locales(int ventanas, String direccion, double metrosCuadrados, int calidad, double precioBase, int Anios){
        super(direccion, metrosCuadrados, calidad, precioBase, Anios);
        this.ventanas = ventanas;    
    }

    public int getVentanas() {
        return ventanas;
    }
    
    public void setVentanas(int ventanas){
        this.ventanas = ventanas;
    }
    
    @Override
    public double Precio(){
        double precioTotal = 0;
        double metros = this.getMetrosCuadrados();
        if (metros >50 ){
            precioTotal = metros + (metros * 0.01);
        }
        if (this.ventanas <= 1){
            precioTotal = this.ventanas - (this.ventanas * 0.02);
        }
        else if (this.ventanas > 4) {
            precioTotal = this.ventanas + (this.ventanas * 0.02);
        }
        double precioAnios = super.Precio();
        
        return precioAnios + precioTotal;
    }
}
