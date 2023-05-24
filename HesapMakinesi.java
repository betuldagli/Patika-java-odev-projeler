import java.util.Scanner;
//hesap makinesi
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int islem,a,b;

        System.out.println("ilk sayıyı giriniz:");
        a = girdi.nextInt();

        System.out.println("ikinci sayıyı giriniz:");
        b = girdi.nextInt();

        System.out.println("yapmak istediğiniz işlemi seçiniz:");
        System.out.println("1:toplama\n2:çıkarma\n3:çarpma\n4:bölme\n");
        islem = girdi.nextInt();

        switch(islem){
            case 1:
                System.out.println("sonuc:"+(a+b));
                break;
            case 2:
                System.out.println("sonuc:"+(a-b));
                break;
            case 3:
                System.out.println("sonuc:"+ (a*b));
                break;
            case 4:
                System.out.println("sonuc:"+(a/b));
                break;
            default:
                System.out.println("geçerli işlem giriniz:");
        }

    }
}
