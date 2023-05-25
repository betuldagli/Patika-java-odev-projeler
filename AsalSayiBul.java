import java.util.Scanner;
/**Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.*/
public class AsalSayiBul {
   static int sayac=0;
    static int asal(int x,int y){
        if (y <= 1) {
            return sayac;
        }
        if (x % y == 0) {
                sayac++;
            }

       return asal(x,y-1);
    }
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int x;


        System.out.print("Sayıyı giriniz:");
        x= girdi.nextInt();
        int y=x-1;
        if(asal(x,y)!=0){
            System.out.println(x+" sayısı asal değildir.");
        }
        else{
            System.out.println(x+" sayısı asaldır.");
        }

    }
}