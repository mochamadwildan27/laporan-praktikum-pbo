
package Pbo;

public class SepedaDemo1841720140Wildan {
    public static void main(String[] args) {
        
        Sepeda1841720140Wildan spd1 = new Sepeda1841720140Wildan();
        Sepeda1841720140Wildan spd2 = new Sepeda1841720140Wildan();
        SepedaGunung1841720140Wildan spd3 = new SepedaGunung1841720140Wildan();
        
        spd1.setMerekWildan("Polygon");
        spd1.setWarnaWildan("Hitam");
        spd1.tambahKecepatanWildan(10);
        spd1.gantiGearWildan(2);
        spd1.cetakStatusWildan();
        
        spd2.setMerekWildan("United");
        spd2.tambahKecepatanWildan(10);
        spd2.remWildan(5);
        spd2.tambahKecepatanWildan(10);
        spd2.remWildan(8);
        spd2.tambahKecepatanWildan(2);
        spd2.cetakStatusWildan();
        
        spd3.setMerekWildan("Klinee");
        spd3.tambahKecepatanWildan(5);
        spd3.gantiGearWildan(7);
        spd3.setTipeSuspensiWildan("Gas suspension");
        spd3.cetakStatusWildan();
    }
}
