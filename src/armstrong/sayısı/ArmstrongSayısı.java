
package armstrong.sayısı;

import java.util.Scanner;

public class ArmstrongSayısı {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayı = scanner.nextInt();
        System.out.println("Basamak sayısını giriniz : ");
        int basamak = scanner.nextInt();
        
        int gecici_sayı = sayı;
        int toplam = 0;
        
        do {
            int basamak_değeri = gecici_sayı % 10;
            gecici_sayı/=10;
            
            toplam += Math.pow(basamak_değeri, basamak);
            
            
            
        } while (gecici_sayı>0);
        if (sayı == toplam) {
            System.out.println("Bu sayı bir armstrong sayısıdır");
            
        }
        else
            System.out.println("Bu sayı armstrong sayısı değildir");
        
        
        

    }
    
}
