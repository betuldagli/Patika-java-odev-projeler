import java.util.Scanner;
/**Özyinelemeli Metotlar ile Üslü Sayı Hesaplama
 Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.*/
public class RecursiveUsAlma {
    static int us(int x,int y){
        if(y==0){
            return 1;
        }
        return x*us(x,y-1);
    }
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int us,taban;

        System.out.println("tabanı giriniz:");
        taban=girdi.nextInt();

        System.out.println("Üssü giriniz:");
        us =girdi.nextInt();

        System.out.println("Sonuç:"+us(taban,us));
    }
}
