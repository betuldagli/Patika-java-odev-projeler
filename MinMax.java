import java.util.Scanner;
/**Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.*/
public class MinMax {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int n,sayi,eb=0,ek=0;

        System.out.print("kaç adet sayı gireceksiniz:");
        n = girdi.nextInt();
        System.out.print("sayı giriniz:");
        sayi = girdi.nextInt();
        ek=sayi;
        eb=sayi;
        for(int i=0;i<n-1;i++){
            System.out.print("sayı giriniz:");
            sayi = girdi.nextInt();
            if(sayi>eb){
                eb=sayi;
            }
            if(sayi<ek){
                ek=sayi;

            }
        }

        System.out.println("En küçük sayı:"+ek);
        System.out.println("En büyük sayı:"+eb);
    }
}
