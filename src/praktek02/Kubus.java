package praktek02;

public class Kubus {
    double sisi;

    public Kubus() {
        sisi = 2;
    }
    
    void cetakinfo(){
        System.out.println("++++++++++++++++++++++");
        System.out.println("Sisi : "+sisi);
        System.out.println("++++++++++++++++++++++");
    }
    
    double hitungluas(){
        double luas;
        luas = 6*sisi*sisi;
        return luas;
    }

    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    
     void cetakluas(){
        System.out.println("Luasnya adalah : "+hitungluas());
     }
}
