import java.util.Scanner;
/**Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.*/
public class DiziSiralama{
     public static void main(String[] args) {
         Scanner girdi = new Scanner(System.in);
         int n,k=0,sayac=0;

         System.out.print("dizinin eleman sayısını giriniz:");
         n =girdi.nextInt();

         int[] dizi=new int[n];

         for(int i=0;i<n;i++){
             System.out.print((i+1)+". elemanı giriniz:");
             dizi[i]= girdi.nextInt();
         }

         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 if(dizi[i]<dizi[j]){
                     int temp=dizi[i];
                     dizi[i]=dizi[j];
                     dizi[j]=temp;
                 }
             }
         }
         System.out.println("\nDizinin küçükten büyüğe sıralanmış hali:");
         for(int i=0;i<n;i++){
             System.out.print(dizi[i]+"\t");
         }
     }
 }