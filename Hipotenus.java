import java.util.Scanner;
/**Dik Üçgende Hipotenüs Bulan Programı
 Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

 Ödev
 Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

 Formül
 Üçgenin çevresi = 2u

 u = (a+b+c) / 2

 Alan * Alan = u * (u − a)* (u − b) * (u − c)*/
public class Hipotenus {
    public static void main(String[] args){
        double a,b,c;

        Scanner girdi = new Scanner(System.in);

        System.out.print("ilk kenari giriniz:");
        a = girdi.nextInt();

        System.out.print("ikinci kenari giriniz:");
        b = girdi.nextInt();

        c = Math.sqrt(a*a+b*b);
        System.out.println("hipotenüs:" + c);
    }
}
