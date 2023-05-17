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
public class Local extends Inmueble{
    private int numeroventa;
    private int ventanal;
    //constructor

    public Local() {
    }

    public Local(int numeroventa, int ventanal) {
        this.numeroventa = numeroventa;
        this.ventanal = ventanal;
    }

    public Local(int numeroventa, int ventanal, String direccion, int metroCuadrado, Estado estado, int anio, double precio) {
        super(direccion, metroCuadrado, estado, anio, precio);
        this.numeroventa = numeroventa;
        this.ventanal = ventanal;
    }
    
    //getter and setter

    public int getNumeroventa() {
        return numeroventa;
    }

    public int getVentanal() {
        return ventanal;
    }

    public void setNumeroventa(int numeroventa) {
        this.numeroventa = numeroventa;
    }

    public void setVentanal(int ventanal) {
        this.ventanal = ventanal;
    }

    @Override
    public String toString() {
        return "Local{" + "numeroventa=" + numeroventa + ", ventanal=" + ventanal + '}';
    }
    
    //metodo
    @Override
    public double calcularPrecio(){
        double a,b,c,d;
        c=0;
        b=0;
        d=super.calcularPrecio();
        if(this.getMetroCuadrado()>50) a=(d*1)/100;
        else a=0;
        if(this.ventanal==0||this.ventanal==1)b=(d*2)/100;
        else if(this.ventanal>4)c=(d*4)/100;
        return d-a+b+c;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Cantidad de Ventas: "+this.numeroventa);
        System.out.println("Cantidad de Ventanal: "+this.ventanal);
    }
}
