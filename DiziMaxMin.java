import java.util.Scanner;
/**Dizideki Elemanların Max ve Min Değerlerini Bulan Program*/
public class DiziMaxMin {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n,eb,ek;
        System.out.println("dizinin eleman sayısını giriniz:");
        n=girdi.nextInt();

        int[] dizi=new int[n];

        for(int i=0;i<n;i++){
            System.out.print((i+1)+". elemanı giriniz:");
            dizi[i]=girdi.nextInt();
        }
        eb=dizi[0];
        ek=dizi[0];

        for(int i=0;i<n;i++){
            if(dizi[i]<ek){
                ek=dizi[i];
            }
            if(dizi[i]>eb){
                eb=dizi[i];
            }
        }
        System.out.println("Max:"+eb);
        System.out.println("Min:"+ek);
    }
}
