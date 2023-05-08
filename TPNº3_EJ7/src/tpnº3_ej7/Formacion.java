/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpnº3_ej7;


public class Formacion {
    private Locomotora[] misL;
    private Vagon[] misV;
    private int cantV;
    private int cantL;

    public Formacion() {
    }

    public Formacion(Locomotora[] misL, Vagon[] misV,int cantV, int cantL) {
        this.misL = misL;
        this.misV = misV;
        this.cantL = cantL;
        this.cantV = cantV;
    }

    public int getCantV() {
        return cantV;
    }

    public int getCantL() {
        return cantL;
    }

    public void setCantV(int cantV) {
        this.cantV = cantV;
    }

    public void setCantL(int cantL) {
        this.cantL = cantL;
    }
    

    public Locomotora[] getMisL() {
        return misL;
    }

    public Vagon[] getMisV() {
        return misV;
    }

    public void setMisL(Locomotora[] misL) {
        this.misL = misL;
    }

    public void setMisV(Vagon[] misV) {
        this.misV = misV;
    }

    @Override
    public String toString() {
        return "Formacion{" + "misL=" + misL + ", misV=" + misV + '}';
    }
    
    public int cantPasajerosMaxima(){
        int cont = 0;
        for (int i = 0; i < this.cantV; i++){
            cont += this.misV[i].cantPasajerosMax();    
        }
        return cont;
    }
    ////
    public int cantVagonesLivianos(){
        int cont = 0 ;
        for (int i = 0 ; i < this.cantV ; i++){
            boolean liviano = this.misV[i].esLiviano();
            if (liviano){
                cont++;
            }
        }
        return cont;
    }
    ////
    public double velocidadMax(){
        double velocidad = this.misL[0].getVelocidadMax();
        for (int i = 0 ; i<this.cantL ; i++){
            if (this.misL[i].getVelocidadMax() < velocidad){
                velocidad = this.misL[i].getVelocidadMax();
            }
        }
        return velocidad;
    }
    ///
    public boolean esEficiente(){
        boolean eficiente = true;
        int i = 0;
        while (eficiente == true || i < this.cantL ){
            if (!this.misL[i].esEficiente()){
                eficiente = false;
            }
            else i++;
        }
        return eficiente;
    }
    ///
    public boolean puedeMoverse(){
        double arrastre = 0;
        double peso = 0;
        for (int i = 0 ; i < this.cantL ; i++){
            arrastre += this.misL[i].arrasteUtil();
            
        }
        for (int i = 0 ; i< this.cantV ; i++){
            peso += this.misV[i].pesoMaximo();
        }
        if ( arrastre >= peso){
            return true;
        }
        else return false;
    }
    ////
    public double kilosEmpuje(){
        double arrastre = 0;
        for (int i = 0 ; i<this.cantL ; i++){
            arrastre += this.misL[i].arrasteUtil();
        }
        double peso = 0;
        for (int i = 0; i<this.cantV ; i++ ){
            peso += this.misV[i].cantPasajerosMax();
        }
        return peso - arrastre;
    }
}
