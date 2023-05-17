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
public class Piso extends Inmueble {
    private int pisos;
    
    //constructores

    public Piso() {
    }

    public Piso(int pisos) {
        this.pisos = pisos;
    }

    public Piso(int pisos, String direccion, int metroCuadrado, Estado estado, int anio, double precio) {
        super(direccion, metroCuadrado, estado, anio, precio);
        this.pisos = pisos;
    }
    
    //getter and setter

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    @Override
    public String toString() {
        return "Piso{" + "pisos=" + pisos + '}';
    }
    
    //metodos
    @Override
    public double calcularPrecio(){
        double d=super.calcularPrecio();
        if(this.pisos>=3)return d+((d*3)/100);
        else return d;
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Pisos: "+this.pisos);
    }
}
