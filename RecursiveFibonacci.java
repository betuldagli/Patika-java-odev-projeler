import java.util.Scanner;
/**Java'da recursive metotlar ile fibonacci serisi bulan program yapıyoruz.*/
public class RecursiveFibonacci {
   static int fibonacci(int n) {
       if (n == 1 || n==2) {
           return 1;
       }
           return fibonacci(n - 1) + fibonacci(n - 2);

   }


    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int n;

        System.out.println("n değerini giriniz:");
        n =girdi.nextInt();

        System.out.println(fibonacci(n));

    }
}
