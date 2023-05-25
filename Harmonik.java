import java.util.Scanner;
/** Harmonik sayı*/
public class Harmonik {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int n;
       float harm=0;
        System.out.print("n değerini giriniz:");
        n =girdi.nextInt();

        for(int i=1;i<=n;i++){
            harm+=(1.0/i);
        }
        System.out.println(harm);
    }
}
