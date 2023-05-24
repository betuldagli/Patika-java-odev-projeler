import java.util.Scanner;
/**Manav Kasa Programı
 Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

 Meyveler ve KG Fiyatları

 Armut : 2,14 TL
 Elma : 3,67 TL
 Domates : 1,11 TL
 Muz: 0,95 TL
 Patlıcan : 5,00 TL*/
public class Manav {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double kg,armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5,af,ef,df,mf,pf;

        System.out.print("kaç kilo armut aldığınızı giriniz:");
        kg = girdi.nextFloat();
        af = kg*armut;

        System.out.print("kaç kilo elma aldığınızı giriniz:");
        kg = girdi.nextFloat();
        ef = kg*elma;

        System.out.print("kaç kilo domates aldığınızı giriniz:");
        kg = girdi.nextFloat();
        df = kg*domates;


        System.out.print("kaç kilo muz aldığınızı giriniz:");
        kg = girdi.nextFloat();
        mf = kg*muz;


        System.out.print("kaç kilo patlıcan aldığınızı giriniz:");
        kg = girdi.nextFloat();
        pf = kg*patlican;

        double toplam =af+ef+df+mf+pf;
        System.out.println();
        System.out.println("Armut;" + af);
        System.out.println("Elma;" + ef);
        System.out.println("Domates;" + df);
        System.out.println("Muz;" + mf);
        System.out.println("Patlıcan;" + pf);
        System.out.println("Toplam tutar" + toplam);
    }
}
