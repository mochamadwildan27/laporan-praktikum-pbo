

package Pbo;

public class Sepeda1841720140Wildan {
    private String mMerek;
    private int mKecepatan;
    private int mGear;
    private String mWarna;
    
    public void setWarnaWildan(String newValue){
        mWarna = newValue;
    }
    
    public void setMerekWildan(String newValue){
        mMerek = newValue;
    }
    
    public void gantiGearWildan(int newValue){
        mGear = newValue;
    }
    
    public void tambahKecepatanWildan(int plus){
        mKecepatan = mKecepatan + plus;
    }
    
    public void remWildan(int min){
        mKecepatan = mKecepatan - min;
    }
    
    public void cetakStatusWildan(){
        System.out.println("Merek: " + mMerek);
        System.out.println("Warna: "+mWarna);
        System.out.println("Kecepatan: " + mKecepatan + "km/h");
        System.out.println("Gear:" + mGear);
    }
}

