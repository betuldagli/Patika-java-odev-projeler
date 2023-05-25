import java.util.Scanner;
/**Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.*/
public class DonguCiftSayi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int i,sayi;

        System.out.print("Sayı giriniz:");
        sayi = girdi.nextInt();

        for(i=0;i<sayi;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
