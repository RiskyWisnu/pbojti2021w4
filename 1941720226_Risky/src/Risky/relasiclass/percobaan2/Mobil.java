/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Risky.relasiclass.percobaan2;

/**
 *
 * @author Risky
 */
public class Mobil {

    private String nama;
    private int biaya;

    Mobil() {}

    public void setNama(String nama) {
        this.nama = nama;
    }
      public String getNama() {
        return nama;
    }
    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    public int getBiaya() {
        return biaya;
    }
    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }

    void setMerk(String avanza) {
    }

}

    