import java.util.Scanner;
/**Koşullar :

 Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
 Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
 Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
 Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/
public class EtkinlikOneri {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int derece;
        System.out.println("havanın kaç derece olduğunu giriniz:");
        derece= girdi.nextInt();

        if(derece<5){
            System.out.println("Hava kayak yapmak için uygun");
        }
        else if(derece>=5 && derece<15){
            System.out.println("Sinema izlemek için güzel bir gün");
        }
        else if(derece>=15 && derece<25){
            System.out.println("Biraz doğaya açılıp piknik yapmak güzel olmaz mı sence de");
        }
        else if(derece>=25){
            System.out.println("Hava serin bir suda yüzmek için mükemmel");
        }
    }
}
