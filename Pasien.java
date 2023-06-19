/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubespbo;

public class Pasien extends User{
    private String nama;
    private String umur;
    private String tgl_lahir;
    private String NIK;
    private String alamat;
    private String no_ktp;
    private String poli;
    private String no_tlp;
    
    //konstruktor
    Pasien(String username,String password,String nama, String umur, 
            String tgl_lahir, String NIK, String alamat, String no_ktp,String poli,String no_tlp){
        super(username,password);
        this.nama = nama;
        this.umur = umur;
        this.tgl_lahir = tgl_lahir;
        this.NIK = NIK;
        this.alamat = alamat;
        this.no_ktp = no_ktp;
        this.poli = poli;
        this.no_tlp = no_tlp;
    }
    
    //method
    @Override
    public String getUsername(){
        return username;
    }
    
    @Override
    public String getPassword(){
        return password;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getNo_ktp() {
        return no_ktp;
    }

    public void setNo_ktp(String no_ktp) {
        this.no_ktp = no_ktp;
    }

    public String getPoli() {
        return poli;
    }

    public void setPoli(String poli) {
        this.poli = poli;
    }

    public String getNo_tlp() {
        return no_tlp;
    }

    public void setNo_tlp(String no_tlp) {
        this.no_tlp = no_tlp;
    }
    
    
}
