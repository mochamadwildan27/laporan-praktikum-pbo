
package Pbo;

public class SepedaGunung1841720140Wildan extends Sepeda1841720140Wildan{
     private String mTipeSuspensi;
    
    public void setTipeSuspensiWildan(String newValue){
        mTipeSuspensi = newValue;
    }
    
    public void cetakStatusWildan(){
        super.cetakStatusWildan();
        System.out.println("Tipe suspensi" +mTipeSuspensi);
    }
}
