import java.util.Scanner;
/**Armstrong Sayı Nedir ?
 N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

 Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.*/
public class Armstrong {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int sayi,bas=0,sayac=0,gecici,toplam=0,gecici1;

        System.out.print("Sayı giriniz:");
        sayi = girdi.nextInt();
        gecici=sayi;
        gecici1=sayi;
        while(sayi>0){
            sayi/=10;
            bas++;
        }
        sayi=gecici;

        for(int i=0;i<bas;i++){
            sayi %= 10;
            toplam+=Math.pow(sayi,bas);
            sayi=gecici;
            sayi/=10;
            gecici/=10;
        }
        if(toplam==gecici1){
            System.out.println(toplam+" bir armstong sayıdır.");
        }
        else{
            System.out.println(gecici1+" bir armstrong sayı değildir.");
        }
    }
}