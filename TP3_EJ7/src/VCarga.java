/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class VCarga extends Vagon {
    private int cargaMax;
    private final int guardia=2;

    public VCarga() {
    }

    public VCarga(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public int getGuardia() {
        return guardia;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    @Override
    public int pesoMaximo(){
    return this.cargaMax+160;
}    
    public int cantPasajeroMax(){
       return 0;
    }
}