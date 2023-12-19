import java.util.Scanner;
import java.util.Random;
/**Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.*/
public class SayiTahmin {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);
        int right=5;
        int tahmin;

        //System.out.println(number);

        while(right>0){
            System.out.println("Sayı giriniz:");
            tahmin=girdi.nextInt();

            if(tahmin==number){
                System.out.println("Tahmininiz doğru.");
                break;
            }
            else{
                if(right!=1){
                System.out.println("Yanlış tahmin tekrar deneyiniz.");
                }
                else{
                    System.out.println("Tahmininiz yanlış,kaybettiniz.");
                }
                right--;
        }
    }
  }
}
