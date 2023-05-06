/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpnº3_ej6;


public class Piso extends Inmueble{
    private int numeroPiso;
    
    public Piso(){
    }
    
    public Piso(int numeroPiso, String direccion, double metrosCuadrados, int calidad, double precioBase, int Anios){
        super(direccion, metrosCuadrados, calidad, precioBase, Anios);
        this.numeroPiso = numeroPiso;
    }
    
    public int getNumeroPiso(){
        return numeroPiso;
    }
    
    public void setNumeroPiso(int numeroPiso){
        this.numeroPiso = numeroPiso;
    }
    
    @Override
    
    public double Precio(){
        double precioFinal;
        double precioAnios = super.Precio();
        if (this.numeroPiso >= 3){
            precioFinal = this.precioBase + (this.precioBase * 0.03);
            return precioAnios + precioFinal;
        }
        else return precioAnios;
        
    }
}
