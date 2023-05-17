/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03_eje6;

/**
 *
 * @author Sans
 */
public class Inmueble {
    private String direccion;
    private int metroCuadrado;
    private Estado estado;
    private int anio;
    private double precio;
    
    //constructores

    public Inmueble() {
    }

    public Inmueble(String direccion, int metroCuadrado, Estado estado, int anio, double precio) {
        this.direccion = direccion;
        this.metroCuadrado = metroCuadrado;
        this.estado = estado;
        this.anio = anio;
        this.precio = precio;
    }
    
    //getter and setter

    public String getDireccion() {
        return direccion;
    }

    public int getMetroCuadrado() {
        return metroCuadrado;
    }

    public Estado getEstado() {
        return estado;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMetroCuadrado(int metroCuadrado) {
        this.metroCuadrado = metroCuadrado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "direccion=" + direccion + ", metroCuadrado=" + metroCuadrado + ", estado=" + estado + ", anio=" + anio + ", precio=" + precio + '}';
    }
    
    //metodos
    
    public double calcularPrecio(){
        if(this.anio<=15) return (this.precio-((this.precio*1)/100));
        else return (this.precio-((this.precio*2)/100));
    }
    public void mostrar(){
        System.out.println("Direccion: "+this.direccion);
        System.out.println("MetrosCuadrado: "+this.metroCuadrado);
        System.out.println("Estado: "+this.estado);
        System.out.println("Anios: "+this.anio);
        System.out.println("Precio: "+this.precio);
    }
}
