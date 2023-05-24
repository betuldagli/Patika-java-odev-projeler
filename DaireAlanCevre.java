import java.util.Scanner;
/**Dairenin Alanını ve Çevresini Hesaplayan Programı
 Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

 Alan Formülü : π * r * r;

 Çevre Formülü : 2 * π * r;

 Ödev
 Yarıçapı r, merkez açısının ölçüsü α olan daire diliminin alanı bulan programı yazınız.

 π sayısını = 3.14 alınız.

 Formül : (π * (r*r) * α) / 360*/
public class DaireAlanCevre {

    public static void main(String[] args){
        float Alan,Cevre,r,a,dilim;
        Scanner gir = new Scanner(System.in);

        System.out.print("yarıçapı giriniz:");
        r = gir.nextFloat();
        System.out.print("açıyı giriniz:");
        a = gir.nextFloat();

        Cevre = (float) (2 * r * 3.14);
        System.out.println("çevre:"+ Cevre);
        Alan = (float) (3.14 * (r*r));
        System.out.println("alan"+ Alan);

        dilim = (float) ((3.14 * (r*r) * a)/360);
        System.out.println("daire diliminin alanı:"+dilim);
    }
}
