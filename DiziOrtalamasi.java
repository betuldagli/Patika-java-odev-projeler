import java.util.Scanner;
/**Dizideki Elemanların Ortalamasını Hesaplayan Program*/
public class DiziOrtalamasi {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
       int n;
       float ort=0;

        System.out.println("dizinin eleman sayısını giriniz:");
        n=girdi.nextInt();

        int[] dizi=new int[n];

        for(int i=0;i<n;i++){
            System.out.println((i+1)+". elemanı giriniz:");
            dizi[i]=girdi.nextInt();
            ort+=dizi[i];
        }
        ort/=n;
        System.out.println("Ortalama:"+ort);
    }
}