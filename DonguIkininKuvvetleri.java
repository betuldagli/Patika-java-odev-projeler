import java.util.Scanner;
/**Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.*/
public class DonguIkininKuvvetleri {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi;

        System.out.println("Sayı giriniz:");
        sayi = girdi.nextInt();

        for(int i=1;Math.pow(2,i)<sayi;i++){
            System.out.println(Math.pow(2,i));
        }
    }
}