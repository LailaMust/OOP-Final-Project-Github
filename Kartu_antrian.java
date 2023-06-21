/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubespbo;

public class Kartu_antrian {
    private int no_antrian;
    private String tipe_pasien;

    Kartu_antrian(int no_antrian,String tipe_pasien){
        this.no_antrian = no_antrian;
        this.tipe_pasien = tipe_pasien;

    }

    public int getNo_antrian() {
        return no_antrian;
    }
    
    public void setNo_antrian(int no_antrian){
        no_antrian++;
    }

    public String getTipe_pasien() {
        return tipe_pasien;
    }

    public void setTipe_pasien(String tipe_pasien) {
        this.tipe_pasien = tipe_pasien;
    }
    
    

 
}
