package tubespbo;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Pasien_bpjs extends Pasien{
    
    private String no_bpjs;
    
    Pasien_bpjs(String username,String password,String nama, String umur, String tgl_lahir, String NIK, String alamat,String no_ktp,String poli,String no_tlp,String no_bpjs){
        super(username,password, nama, umur, tgl_lahir, NIK, alamat,no_ktp,poli,no_tlp);
        this.no_bpjs = no_bpjs;
    }
    
    public String getPasien_bpjs(){
        return no_bpjs;
    }
    
    public void setPasien_bpjs(String no_bpjs){
        this.no_bpjs = no_bpjs;
    }
    
    
    
    
}
