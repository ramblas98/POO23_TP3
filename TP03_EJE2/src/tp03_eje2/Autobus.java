/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03_eje2;

/**
 *
 * @author Sans
 */
public class Autobus extends Vehiculo{
    private final int asiento;
    private final int precio;
    
    //constructores

    public Autobus(int asiento, int precio) {
        this.asiento = asiento;
        this.precio = precio;
    }

    public Autobus(int asiento, int precio, int patente, String marca) {
        super(patente, marca);
        this.asiento = asiento;
        this.precio = precio;
    }

    public int getAsiento() {
        return asiento;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Autobus{" + "asiento=" + asiento + ", precio=" + precio + '}';
    }
    
    //Metodos
    @Override
    public void mostrar(){
        System.out.println("Autobus");
        super.mostrar();
        System.out.println("Asientos: "+this.asiento);
        System.out.println("Precio Por Asiento: "+this.precio);
    }
    
}
