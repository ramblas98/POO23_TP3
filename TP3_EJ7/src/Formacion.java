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
        int i,cantMP=0;
        
        for(i=0;i<this.cantV;i++){
            cantMP = cantMP + this.misV[i].cantPajaseroMax();
        }
        return cantMP;
    }
    public int cantVagonLiviano(){
        int i,c;
        
        c=0;
        for(i=0;i<this.cantV;i++){
            if(this.misV[i].esLiviano()==true)c++;
        }
        return c;
    }
    public double velocidadMaxima(){
         int i;
        double velocMin = this.misL[0].getVelocidadMax();
        for(i=1;i<this.cantL;i++){
            if(this.misL[i].getVelocidadMax()< velocMin) velocMin = this.misL[i].getVelocidadMax();
        }
        return velocMin;
    }
    public boolean esEficiente(){
        int i;
        boolean ban;
        
        i=0;
        ban=true;
        while(i<this.cantL && ban==true){
            if(this.misL[i].esEficiente()!=true)ban=false;
            else i++;
        }
        return ban;
    }
    public boolean puedeMoverse(){
        int i,peso=0;
        double arrastreU=0;
        
        for(i=0;i<this.cantL;i++){
            arrastreU = arrastreU + this.misL[i].arrastreUtil();
        }
        for(i=0;i<this.cantV;i++){
            peso = peso + this.misV[i].pesoMaximo();
        }
        return arrastreU >= peso;
        
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
