import java.util.Scanner;
/**Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları
 toplayıp ekrana basan programı yazıyoruz.*/
public class DonguTekToplam {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi,toplam=0;
        System.out.print("Sayı giriniz:");
        sayi = girdi.nextInt();
        if(sayi%2==1){
            toplam=sayi;
        }
        while(sayi>0){
            System.out.print("Sayı giriniz:");
            sayi = girdi.nextInt();
            if(sayi%2==1){
                toplam+=sayi;
            }
        }
        System.out.println("Tek sayıların toplamı:"+toplam);
    }
}
