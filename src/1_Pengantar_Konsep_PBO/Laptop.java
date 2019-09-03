
package Laptop;

public class Laptop {
    private String merk;
    private String warna;
    private String berat;
    private double harga;
    
    public void setMerk(String newValue){
        merk = newValue;
    }
    public void setWarna(String newValue){
        warna = newValue;
    }
    public void setBerat(String newValue){
        berat = newValue;
    }
    public void daftarHarga(double newValue){
        harga = newValue;
    }
    public void cetakStatus(){
        System.out.println("Merk: "+merk);
        System.out.println("Warna: "+warna);
        System.out.println("Berat: "+berat);
        System.out.println("Harga Rp.: "+harga);
    }
}
