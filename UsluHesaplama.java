import java.util.Scanner;
/**Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.*/
public class UsluHesaplama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int us,taban,sonuc=1;

        System.out.print("Taban değerini giriniz:");
        taban = girdi.nextInt();

        System.out.print("Üs değerini giriniz:");
        us = girdi.nextInt();

        for(int i=0;i<us;i++){
            sonuc*=taban;
        }
        System.out.println(taban+" üssü "+us+" :"+sonuc);
    }
}
