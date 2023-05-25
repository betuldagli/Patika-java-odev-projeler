import java.util.Scanner;
/**Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.

 Fibonacci Serisi Nedir ?
 Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. Bu şekilde devam eden bu dizide sayılar
 birbirleriyle oranlandığında altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan
 bir dizi elde edilir.

 Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır.
 Fibonacci dizisinin ilk on sayısı şu şekildedir:

 9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34*/
public class Fibonacci {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int n,gecici=1,gecici1=1,sayi;

        System.out.println("kaçıncı fibonacci sayısına kadar görmek istediğinizi giriniz:");
        n = girdi.nextInt();
        n--;
        while(n>0){
            if(n<0){
                break;
            }
            System.out.print(gecici+"\t");
            n--;
            if(n<0){
                break;
            }
            System.out.print(gecici1+"\t");
            n--;
            if(n<0){
                break;
            }
            sayi= gecici+gecici1;
            System.out.print(sayi+"\t");
            n--;
            gecici=gecici1+sayi;
            gecici1=sayi+gecici;
        }
    }
}