import java.util.Scanner;
/**Ödev
 N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
 N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
 Java ile kombinasyon hesaplayan program yazınız.

 Kombinasyon formülü
 C(n,r) = n! / (r! * (n-r)!)*/
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int n,r,z,faktn=1,faktr=1,faktz=1;
        float komb;

        System.out.print("n değerini giriniz:");
        n = girdi.nextInt();

        System.out.print("r değerini giriniz:");
        r = girdi.nextInt();
        z=(n-r);

        for(int i=1;i<=n;i++){
            faktn*=i;
        }
        for(int i=1;i<=r;i++){
            faktr*=i;
        }
        for(int i=1;i<=z;i++){
            faktz*=i;
        }

        komb = faktn/(faktr*faktz);

        System.out.println(n+"'in "+r+"'li kombinasyonu:"+komb);

    }
}
