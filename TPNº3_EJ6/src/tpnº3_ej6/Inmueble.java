/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpnº3_ej6;


public class Inmueble {
    private String direccion;
    private double metrosCuadrados;
    private int calidad;
    protected double precioBase;
    private int Anios;
    
    public Inmueble(){
    }
    
    public Inmueble(String direccion, double metrosCuadrados, int calidad, double precioBase, int Anios){
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.calidad = calidad;
        this.precioBase = precioBase;
        this.Anios= Anios;
   
    }

    public String getDireccion() {
        return direccion;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public int isCalidad() {
        return calidad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public int getAnios() {
        return Anios;
    }
    //SETTERS
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setMetrosCuadrados(double metrosCuadrados){
        this.metrosCuadrados = metrosCuadrados;
   }
    public void setCalidad(int calidad){
        this.calidad = calidad;
    }
    public void setPrecioBase(double precioBase){
        this.precioBase = precioBase;
    }
    public void setAnios(int Anios){
        this.Anios = Anios;
    }
    
    public double Precio(){
        double precioFinal;
        if (this.Anios < 15) {
            precioFinal = this.precioBase - (this.precioBase * 0.01); 
        }
        else {precioFinal = this.precioBase - (this.precioBase * 0.02);}
        
        return precioFinal;
    }
}
