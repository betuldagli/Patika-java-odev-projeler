import javax.lang.model.type.NullType;
import java.util.Scanner;
/**Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

 Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana
 son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

 Senaryolar
 N Sayısı : 16
 Çıktısı : 16 11 6 1 -4 1 6 11 16
 N Sayısı : 10
 Çıktısı : 10 5 0 5 10
 N Sayısı : 25
 Çıktısı : 25 20 15 10 5 0 5 10 15 20 25
 N Sayısı : 5
 Çıktısı : 5 0 5 */
public class MetotlarlaDesen {
    static  int gecici,gecici1=1;
    static int desen(int n) {
        if(gecici1<=0) {
               if (n == gecici) {
                   System.out.print(n + "\t");
                   return '\0';
               } else {
                   System.out.print(n + "\t");
                   return desen(n + 5);
               }
       }
        if(n<=0) {
            gecici1 = n;
       return desen(n);
        }
        else {
            System.out.print(n + "\t");
            return desen(n - 5);
        }
    }
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n;

        System.out.print("n değerini giriniz:");
        n = girdi.nextInt();
        gecici=n;
        System.out.println(desen(n));
    }
}