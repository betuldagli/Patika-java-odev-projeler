import java.util.Scanner;
/**Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

 Senaryo
 Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
 Tekrar Sayıları
 10 sayısı 3 kere tekrar edildi.
 20 sayısı 4 kere tekrar edildi.
 5 sayısı 1 kere tekrar edildi.*/
public class DiziHangisiKacTekrar {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n,k=0,sayac=0,l=0;

        //System.out.print("dizinin eleman sayısını giriniz:");
        //n =girdi.nextInt();

        int[] dizi={10, 20, 20, 10, 10, 20, 5, 20};
        int[] tekrar=new int[10];
        int[] gecici=new int[10];
       /** for(int i=0;i<n;i++){
            System.out.print((i+1)+". elemanı giriniz:");
            dizi[i]= girdi.nextInt();
        }*/

        for(int i=0;i< dizi.length;i++){
            for(int j=i;j<dizi.length;j++){
                if(i!=j && dizi[i]==dizi[j]){
                    sayac++;
                    tekrar[k]=dizi[i];
                    k++;
                    gecici[l++]=sayac;
                }
            }sayac=0;
        }
        for(int i=0;tekrar[i]!='\0';i++){
            System.out.println(tekrar[i]+" sayısı "+gecici[l++]+" kere tekrar etti.");
        }
    }
}
