import java.util.Scanner;
/**Ödev
 Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

 Dizi : {15,12,788,1,-1,-778,2,0}
 Girilen Sayı : 5
 Girilen sayıdan küçük en yakın sayı : 2
 Girilen sayıdan büyük en yakın sayı : 12
 ÇALIŞMIYOR*/
public class SayiyaYakinMinMax {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n,ek1=0,ek=0,sayi,gecici;
        System.out.println("dizinin eleman sayısını giriniz:");
        n=girdi.nextInt();

        int[] dizi=new int[n];
        int[] sayac=new int[n];
        int[] sayac1=new int[n];
        for(int i=0;i<n;i++){
            System.out.print((i+1)+". elemanı giriniz:");
            dizi[i]=girdi.nextInt();
        }
        System.out.println("Sayıyı giriniz:");
        sayi=girdi.nextInt();

        for(int i=0;i<n;i++){
                if(sayi<dizi[i]){
                 sayac[i]=dizi[i]-sayi;
                }
               if(sayi>dizi[i]){
                 sayac1[i]=sayi-dizi[i];
               }
            }
        ek=1;
        ek1=1;

        for(int k=0;k<sayac.length;k++){
            System.out.println("sayac"+sayac[k]);
            if(sayac[k]<ek){
                ek=k;
            }
        }
        for(int k=0;k<sayac1.length;k++){
            System.out.println("sayac1"+sayac1[k]);
            if(sayac1[k]<ek1){
                ek1=k;
            }
        }
        System.out.println("Girilen sayıya en yakın en küçük sayı:"+dizi[ek1]);
        System.out.println("Girilen sayıya en yakın en büyük sayı:"+dizi[ek]);



    }
}