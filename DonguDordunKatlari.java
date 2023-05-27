import java.util.Scanner;
/**Ödev
 Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
 çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/
public class DonguDordunKatlari {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi,toplam=0;

        System.out.print("Sayı giriniz:");
        sayi = girdi.nextInt();

        while(sayi%2==0){
            System.out.print("Sayı giriniz:");
            sayi = girdi.nextInt();

            if(sayi%4==0){
                toplam+=sayi;
            }
        }
        System.out.println("4'ün katlarının toplamı:"+toplam);
    }
}