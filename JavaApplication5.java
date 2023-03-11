
package javaapplication5;


public class JavaApplication5 {

    public static void main(String[] args) {
        int n_detik = 50347;
        int jam = n_detik / 3600;
        
        System.out.println("Jumlah jam = " + jam);
        n_detik = n_detik % 3600;
        int menit = n_detik / 60;
        System.out.println("Jumlah menit = " + menit);
        n_detik = n_detik % 60;
        System.out.println("Jumlah detik = " + n_detik);
        
      
    }
    
}
