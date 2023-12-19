import java.util.Scanner;
/**Java'da döngüler kullanılarak yıldızlar ile üçgen yapıyoruz.

      *
     ***
    *****
   *******
  *********
 ***********
 */
public class YildizUcgen {
    public static void main(String[] args) {
        int i,j,n;
        Scanner girdi = new Scanner(System.in);

        System.out.println("Piramidin yüksekliğini giriniz:");
        n = girdi.nextInt();

        for(i=0;i<n;i++){
            for(j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int l=0;l<2*i+1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
