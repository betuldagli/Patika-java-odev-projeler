import java.util.Scanner;
//ters üçgrn yapın

/**
 ******* 0b 7 y
  *****  1b 5 y
   *** 2b 3 y
    * 3b 1 y
 */
public class TersUcgen {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int i,j,n;

        System.out.println("Piramidin yüksekliğini giriniz:");
        n = girdi.nextInt();

        for(i=n;i>0;i--){
            for(int l=i;l<n;l++){
                System.out.print(" ");
            }
            for(j=2*i-1;j>0;j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}