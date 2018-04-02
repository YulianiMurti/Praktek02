
package praktek02;
public class Rectangle {
    double panjang;
    double lebar;

    public Rectangle() {
        panjang= 5;
        lebar= 2;
        
    }
    
    void cetakInfo(){
        System.out.println("---------------------");
        System.out.println("Panjang= "+panjang);
        System.out.println("Lebar= "+lebar);
        System.out.println("---------------------");
    }
    
    double hitungLuas(){
        double luas;
        luas=panjang*lebar;
        return luas;
    }
    
    void cetakLuas(){
        System.out.println("Luasnya Adalah: "+hitungLuas());
    }
}
