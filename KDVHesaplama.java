import java.util.Scanner;
/**Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

 (Not : KDV tutarını %18 olarak alın)

 KDV'siz Fiyat = 10;

 KDV'li Fiyat = 11,8;

 KDV tutarı = 1.8;
 Ödev
 Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı
 hesaplayan programı yazınız.*/
public class KDVHesaplama {
    public static void main(String[] args) {
        float KDVliFiyat, KDVTutari;
        int Para;
        Scanner inp = new Scanner(System.in);

        System.out.print("para değerini giriniz:");
        Para = inp.nextInt();

        if (Para > 0 && Para < 1000) {
            KDVliFiyat = (float) (0.18 * Para) + Para;
            System.out.println("ürünün KDV'li fiyatı:" + KDVliFiyat);

            KDVTutari = (KDVliFiyat - Para);
            System.out.print("KDV tutarı:" + KDVTutari);

        } else {
            KDVliFiyat = (float) (0.08 * Para) + Para;
            System.out.println("ürünün KDV'li fiyatı:" + KDVliFiyat);

            KDVTutari = (KDVliFiyat - Para);
            System.out.print("KDV tutarı:" + KDVTutari);
        }
    }
}