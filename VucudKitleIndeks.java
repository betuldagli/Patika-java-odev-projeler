import java.util.Scanner;
/**Vücut Kitle İndeksi Hesaplama
 Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks"
 değerini hesaplayıp ekrana yazdırın.

 Formül
 Kilo (kg) / Boy(m) * Boy(m)*/
public class VucudKitleIndeks {
    public static void main(String[] args){
        Scanner girdi = new Scanner(System.in);
        float indeks, kg,m;;

        System.out.print("boyunuzu metre olarak giriniz:");
        m = girdi.nextFloat();

        System.out.print("kilonuzu giriniz:");
        kg = girdi.nextFloat();

        indeks = (float) kg / (m*m);
        System.out.println("vücut kitle indeksiniz:" + indeks);
    }
}
