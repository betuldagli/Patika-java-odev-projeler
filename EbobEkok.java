import java.util.Scanner;
/**Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.*/
public class EbobEkok {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int x,y,ebob=0,ekok;

        System.out.print("İlk sayıyı giriniz:");
        x = girdi.nextInt();

        System.out.print("İkinci sayıyı giriniz:");
        y = girdi.nextInt();

        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                if(x%i==0 && y%j==0){
                    if(i==j){
                        ebob=i;
                    }
                }
            }
        }
        System.out.println("EBOB:"+ebob);

        ekok = (x*y)/ebob;

        System.out.println("EKOK:"+ekok);
    }
}
