import java.util.Scanner;
/**Taksimetre Programı
 Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

 Taksimetre KM başına 2.20 TL tutmaktadır.
 Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
 Taksimetre açılış ücreti 10 TL'dir.*/
public class Taksimetre {
    public static void main(String[] args){
        int km;
        float tutar;

        Scanner gir = new Scanner(System.in);

        System.out.print("yolun kaç kilometre olduğunu yazın:");
        km = gir.nextInt();

        tutar = (float) (10 + (km * 2.20));

        if(tutar<20){
            tutar = 20;
        }

        System.out.println("ödenecek tutar:" + tutar);
    }

}
