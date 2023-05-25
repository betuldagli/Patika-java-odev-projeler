import java.util.Scanner;
/**Ödev
 Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.*/
 public class DonguKuvvet {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int sayi;

        System.out.print("Sayı giriniz:");
        sayi = girdi.nextInt();

        System.out.println("4'ün kuvvetleri:");
        for(int i=1;Math.pow(4,i)<sayi;i++){
            System.out.println(Math.pow(4,i));
        }

        System.out.println("5'ün kuvvetleri:");
        for(int i=1;Math.pow(5,i)<sayi;i++){
            System.out.println(Math.pow(5,i));
        }

    }
}
