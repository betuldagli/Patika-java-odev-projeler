import java.util.Scanner;
/**girilen 3 sayıyı büyükten küçüğe sıralayan kod*/
public class Siralama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int s1,s2,s3,eb=0,ek=0,mid=0;

        System.out.println("sayilari giriniz:");
        s1 = girdi.nextInt();
        s2 = girdi.nextInt();
        s3 = girdi.nextInt();
        if(s1<s2){
            eb=s2;
           ek=s1;
        }
        else{
            eb=s1;
            ek=s2;
        }
        if(eb<s3){
            mid=eb;
            eb =s3;
        }
        if(ek>s3){
            mid=ek;
            ek =s3;
        }


        System.out.println("Sayıların sıralanmış hali:\n" +eb+mid+ek);
    }
}
