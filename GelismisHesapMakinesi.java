import java.util.Scanner;
/**Gelişmiş Hesap Makinesi
 Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.

 Hesap makinesinin fonksiyonları :

 1- Toplama İşlemi
 2- Çıkarma İşlemi
 3- Çarpma İşlemi
 4- Bölme işlemi
 5- Üslü Sayı Hesaplama
 6- Faktoriyel Hesaplama
 7- Mod Alma
 8- Dikdörtgen Alan ve Çevre Hesabı
*/
 public class GelismisHesapMakinesi {
    static int top(int x, int y) {
        return x + y;
    }

    static int cik(int x, int y) {
        int eb, ek;
        if (x > y) {
            eb = x;
            ek = y;
        } else {
            ek = x;
            eb = y;
        }
        return eb - ek;
    }

    static int carp(int x, int y) {
        return x * y;
    }

    static float bol(int x, int y) {
        float eb, ek;
        if (x > y) {
            eb = x;
            ek = y;
        } else {
            ek = x;
            eb = y;
        }
        return eb / ek;
    }

    static int us(int x, int y) {
        int sonuc = 1;
        for (int i = 1; i <= y; i++) {
            sonuc *= x;
        }
        return sonuc;
    }

    static int fakt(int x) {
        int sonuc = 1;
        for (int i = 1; i <= x; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    static int mod(int x, int y) {
        return x % y;
    }

    static void dikdortgenAlanCevre(int x, int y) {
        int alan = x * y;
        int cevre = 2 * (x + y);
        System.out.println("Dikdörtgenin alanı:" + alan);
        System.out.println("Dikdörtgenin çevresi:" + cevre);
    }

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int secim;
        do{
        System.out.println(" 1- Toplama İşlemi\n" +
                " 2- Çıkarma İşlemi\n" +
                " 3- Çarpma İşlemi\n" +
                " 4- Bölme işlemi\n" +
                " 5- Üslü Sayı Hesaplama\n" +
                " 6- Faktoriyel Hesaplama\n" +
                " 7- Mod Alma\n" +
                " 8- Dikdörtgen Alan ve Çevre Hesabı\n"+
                " 0-çıkış\n");
        System.out.print("Yapmak istediğiniz işlemi giriniz:");
        secim = girdi.nextInt();

        int x, y;

        if (secim == 6) {
            System.out.println("İşlem yapmak istediğiniz sayıyı giriniz:");
            x = girdi.nextInt();
            switch (secim) {
                case 6:
                    System.out.println("Sonuç:"+fakt(x));
                    break;

                default:
                    System.out.println("Geçerli işlem giriniz:");
            }
        }
        if(secim==0){
            switch (secim){
                case 0:
                    System.out.println("çıkış yapıldı.");
            }
        }
        else if(secim!=6){
            System.out.println("İşlem yapmak istediğiniz sayıları giriniz:");
            x = girdi.nextInt();
            y = girdi.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Sonuç:"+top(x, y));
                    break;

                case 2:
                    System.out.println("Sonuç:"+cik(x, y));
                    break;

                case 3:
                    System.out.println("Sonuç:"+carp(x, y));
                    break;

                case 4:
                    System.out.println("Sonuç:"+bol(x, y));
                    break;

                case 5:
                    System.out.println("Sonuç:"+us(x, y));
                    break;

                case 7:
                    System.out.println("Sonuç:"+mod(x, y));
                    break;

                case 8:
                    dikdortgenAlanCevre(x, y);
                    break;
                default:
                    System.out.println("Geçerli işlem giriniz:");

            }
        }
    }
           while(secim!=0);{
           }
      }
}
