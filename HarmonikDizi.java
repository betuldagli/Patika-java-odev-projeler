import java.util.Scanner;
/**Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

 Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi*/
public class HarmonikDizi {
    public static void main(String[] args) {
       Scanner girdi = new Scanner(System.in);
        int n;
        float harm=0;

        System.out.println("dizinin eleman sayısını giriniz:");
        n=girdi.nextInt();

        int[] dizi=new int[n];

        for(int i=0;i<n;i++){
            System.out.println((i+1)+". elemanı giriniz:");
            dizi[i]=girdi.nextInt();
            harm+=(1.0/dizi[i]);
        }

        System.out.println(n/harm);
    }
}