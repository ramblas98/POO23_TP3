/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class Deposito {
    private Formacion[] misF;
    private int cantF;
    private Locomotora[] misLs;
    private int cantLs;

    public Deposito() {
    }

    public Formacion[] getMisF() {
        return misF;
    }

    public int getCantF() {
        return cantF;
    }

    public Locomotora[] getMisLs() {
        return misLs;
    }

    public int getCantLs() {
        return cantLs;
    }

    public void setMisF(Formacion[] misF) {
        this.misF = misF;
    }

    public void setCantF(int cantF) {
        this.cantF = cantF;
    }

    public void setMisLs(Locomotora[] misLs) {
        this.misLs = misLs;
    }

    public void setCantLs(int cantLs) {
        this.cantLs = cantLs;
    }
    
    public Vagon[] vagonMasPesado(){
        return null;
    }
    public boolean necesitaConductorEpx(){
        return false;
    }
    public void LocAForm(int i){
        
    }
}
