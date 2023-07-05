import java.util.Arrays;
import java.util.Scanner;

/**Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.

 Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".

 Örnek : abba , asa , kavak, kayak*/
public class PalindromKelime {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        String kelime;
        int sayac=0;

        System.out.print("Kelimeyi giriniz:");
        kelime=girdi.nextLine();

        for(int i=0;i<kelime.length();i++){
            for(int j=kelime.length()-1;j>=0;j--){
                if(kelime.charAt(i)==kelime.charAt(j)){
                    sayac++;
                }
                else{
                    sayac=0;
                }
            }
        }
        if(sayac!=0){
            System.out.println(kelime+" kelimesi palindromdur.");
        }
        else{
            System.out.println(kelime+" kelimesi palindrom değildir.");
        }
    }
}
