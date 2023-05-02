/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03_eje1;

/**
 *
 * @author Sans
 */
public class Futbolista extends Miembrodeequipo{
    private String puesto;
    private double peso;
    //Constructor

    public Futbolista() {
    }

    public Futbolista(String puesto, double peso) {
        this.puesto = puesto;
        this.peso = peso;
    }

    public Futbolista(String puesto, double peso, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.puesto = puesto;
        this.peso = peso;
    }
    
    //Getter and Setter

    public String getPuesto() {
        return puesto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "puesto=" + puesto + ", peso=" + peso + '}';
    }
    
    //metodos
    public void mostrar(){
        System.out.println("Futbolista");
        super.mostrar();
        System.out.println("Puesto: "+this.puesto);
        System.out.println("Peso: "+this.peso);
        
    }
}
