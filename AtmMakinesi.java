import java.util.Scanner;
/**Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapıyoruz.*/
public class AtmMakinesi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int dogru = 3, secim;
        float bakiye = 2000;
        String userName, password;
        do {
        System.out.print("Kullanıcı adını giriniz:");
        userName = girdi.nextLine();

        System.out.print("Şifreyi giriniz:");
        password = girdi.nextLine();


        if (userName.equals("betuldagli") && password.equals("1234")) {
            System.out.println("Giriş Başarılı.");
            System.out.println("Yapmak isteiğiniz işlemi giriniz:\n1-Para yatırma\n2-Para çekme\n3-Bakiye sorgula\n4-Çıkış yap");
            secim = girdi.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Yatırmak istediğiniz para miktarını giriniz:");
                    int yatirma = girdi.nextInt();
                    bakiye += yatirma;
                    System.out.println("Bakiyeniz:" + bakiye);
                    break;

                case 2:
                    System.out.println("Çekmek istediğiniz miktarı giriniz:");
                    int cekme = girdi.nextInt();
                    if (cekme > bakiye) {
                        System.out.println("Yetersiz bakiye");
                    } else {
                        bakiye -= cekme;
                        System.out.println("Kalan bakiye:" + bakiye);
                    }
                    break;

                case 3:
                    System.out.println("Bakiyeniz:" + bakiye);
                    break;

                case 4:
                    System.out.println("Çıkışınız yapıldı.Tekrar görüşmek dileğiyle.");
                    break;

                default:
                    System.out.println("Geçerli işlem giriniz!");
                    break;
            }
        }
            else{
                dogru--;

                if (dogru <= 0) {
                    System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Hatalı Veri Girişi Yaptınız.Lütfen Tekrar Deneyiniz.");
                    System.out.println("Kalan Giriş Denemesi Hakkınız:" + dogru);
                }
            }
        }
        while(dogru>0);
    }
}