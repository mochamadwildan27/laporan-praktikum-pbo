
package Laptop;

public class LaptopMain {
    public static void main(String[] args) {
        
        Laptop bj1 = new Laptop();
        Laptop bj2 = new Laptop();
      
        bj1.setMerk("asus");
        bj1.setWarna("abu-abu");
        bj1.setBerat("2.5kg");
        bj1.daftarHarga(7000000);
        bj1.cetakStatus();
        
        bj2.setMerk("Acer");
        bj2.setWarna("Hitam");
        bj2.setBerat("2kg");
        bj2.daftarHarga(8000000);
        bj2.cetakStatus();
    }
}
