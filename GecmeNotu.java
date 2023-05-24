import java.util.Scanner;
/**kullanıcıdan alınan veriler ile geçme notu hesaplayan program (if-else kullanılmayacak)*/
public class GecmeNotu {
    public static void main(String[] args) {
      int matematik,fizik,kimya,biyoloji,tarih,cografya,edebiyat;
      float toplam=0;
      Scanner inp = new Scanner(System.in);

        System.out.println("matematik notunu giriniz:");
        matematik = inp.nextInt();

        System.out.println("fizik notunu giriniz:");
        fizik = inp.nextInt();

        System.out.println("kimya notunu giriniz:");
        kimya = inp.nextInt();

        System.out.println("biyoloji notunu giriniz:");
        biyoloji = inp.nextInt();

        System.out.println("tarih notunu giriniz:");
        tarih = inp.nextInt();

        System.out.println("coğrafya notunu giriniz:");
        cografya = inp.nextInt();

        System.out.println("edebiyat notunu giriniz:");
        edebiyat = inp.nextInt();

        toplam = matematik+fizik+kimya+biyoloji+tarih+cografya+edebiyat;
        toplam /= 7;
      System.out.println(toplam);

      String gectimi = toplam >= 60 ? "geçti" : "kaldı" ;
      System.out.println(gectimi);
    }
}