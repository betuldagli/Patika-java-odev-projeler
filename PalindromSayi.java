import java.util.Scanner;
/**palindom sayı bulan kod*/
public class PalindromSayi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int[] dizi = new int[10];
        int sayi,bas=0,gecici,sayac=0,asilSayi,j=0;

        System.out.println("Sayiyi giriniz:");
        sayi = girdi.nextInt();
        gecici=sayi;
        asilSayi=sayi;
        while(sayi>0){
            bas++;
            sayi/=10;
        }
        sayi=gecici;
        for(int i=0;i<bas;i++){
            sayi%=10;
            dizi[i]=sayi;
            sayi=gecici;
            sayi/=10;
            gecici/=10;
        }

        for(int i=bas-1;i>=0;i--){
            if(dizi[i]==dizi[j]){
                    sayac++;
                }
            j++;
        }
        if(sayac==bas){
            System.out.println(asilSayi+" palindrom sayıdır.");
        }
        else{
            System.out.println(asilSayi+" palindrom sayı değildir.");
        }
    }
}