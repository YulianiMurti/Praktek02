package praktek02;

public class KubusAksi {
    public static void main(String[] args) {
        Kubus K1 = new Kubus();
        K1.sisi = 7;
        
        K1.cetakinfo();
        System.out.println("Luas Kubus : "+K1.hitungluas());
        K1.cetakluas();
        
        Kubus K2 = new Kubus();
        K2.cetakinfo();
        
        Kubus K3 = new Kubus(9);
        K3.cetakinfo();
    }
     
}
