/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class Inmueble {
    private String direccion;
    private double nroMetros;
    private Estado est;
    private int anios;
    private double precioBase;

    public Inmueble() {
    }

    public Inmueble(String direccion, double nroMetros, Estado est, int anios, double precioBase) {
        this.direccion = direccion;
        this.nroMetros = nroMetros;
        this.est = est;
        this.anios = anios;
        this.precioBase = precioBase;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getNroMetros() {
        return nroMetros;
    }

    public Estado getEstado() {
        return est;
    }

    public int getAnios() {
        return anios;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNroMetros(double nroMetros) {
        this.nroMetros = nroMetros;
    }

    public void setEstado(Estado est) {
        this.est = est;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
   
    public double precio(){
        if(this.anios < 15) return this.precioBase * 99 / 100;
        else return this.precioBase * 98 / 100;
    }
}
    

