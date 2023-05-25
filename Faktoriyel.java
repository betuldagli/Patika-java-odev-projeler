import java.util.Scanner;
/**Java ile faktöriyel hesaplayan program yazıyoruz.*/
public class Faktoriyel {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int sayi,fakt=1;

        System.out.print("Sayı giriniz:");
        sayi = girdi.nextInt();

        for(int i=1;i<=sayi;i++){
            fakt*=i;
        }
        System.out.println(sayi+"'nın faktöriyeli:"+fakt);
    }
}