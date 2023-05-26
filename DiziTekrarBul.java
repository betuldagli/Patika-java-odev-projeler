import java.util.Scanner;
/**Dizideki Tekrar Eden Sayıları Bulan Programı
*/
 public class DiziTekrarBul {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n,k=0,sayac=0;

        System.out.print("dizinin eleman sayısını giriniz:");
        n =girdi.nextInt();

        int[] dizi=new int[n];
        int[] tekrar=new int[n];

        for(int i=0;i<n;i++){
            System.out.print((i+1)+". elemanı giriniz:");
            dizi[i]= girdi.nextInt();
        }

        for(int i=0;i< dizi.length;i++){
            for(int j=0;j<dizi.length;j++){
                if(i!=j && dizi[i]==dizi[j]){
                    tekrar[k]=dizi[i];
                    dizi[j] ='\0';
                    k++;
                    sayac++;
                }
            }
        }
        System.out.println("\ntekrar eden elemanlar:");
        for(k=0;k< tekrar.length;k++){
            System.out.println(tekrar[k]+"\t");
            }
        }
    }
