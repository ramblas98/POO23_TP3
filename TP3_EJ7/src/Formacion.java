/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class Formacion {
    private Locomotora[] misL;
    private int cantL;
    private Vagon[] misV;
    private int cantV;

    public Formacion() {
    }

    public Formacion(Locomotora[] misL, int cantL, Vagon[] misV, int cantV) {
        this.misL = misL;
        this.cantL = cantL;
        this.misV = misV;
        this.cantV = cantV;
    }

    public Locomotora[] getMisL() {
        return misL;
    }

    public int getCantL() {
        return cantL;
    }

    public Vagon[] getMisV() {
        return misV;
    }

    public int getCantV() {
        return cantV;
    }

    public void setMisL(Locomotora[] misL) {
        this.misL = misL;
    }

    public void setCantL(int cantL) {
        this.cantL = cantL;
    }

    public void setMisV(Vagon[] misV) {
        this.misV = misV;
    }

    public void setCantV(int cantV) {
        this.cantV = cantV;
    }
    
    public int cantPasajeroMax(){
        return 0;
    }
    public int cantVagonLiviano(){
        int i,c;
        
        c=0;
        for(i=0;i<this.cantV;i++){
            if(this.misV[i].esLiviano()==true)c++;
        }
        return c;
    }
    public boolean esEficiente(){
        return false;
    }
    public boolean puedeMoverse(){
        return false;
    }
    public double kilosEmpuje(){
        return 0;
    }
    public Vagon[] vagonMasPesado(){
        return null;
    }
    public boolean esComplejo(){
        return false;
    }
    public void agregarLocomotora(Locomotora L){
        
    }
}
