/*Proje 1
[22,27,16,2,18,6] -> Insertion Sort

Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

Big-O gösterimini yazınız.

Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız

Average case: Aradığımız sayının ortada olması
Worst case: Aradığımız sayının sonda olması
Best case: Aradığımız sayının dizinin en başında olması.

[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.*/
public class InsertionSort
{
    public static void main(String[] args) {
        int[] dizi= new int[]{22, 27, 16, 2, 18, 6};
        int i,j;

        for(i=0;i< dizi.length;i++){
            for(j=i;j< dizi.length;j++){
                if(dizi[j]<dizi[i]){
                    int temp=dizi[j];
                    dizi[j]=dizi[i];
                    dizi[i]=temp;
                }
            }
        }

        for(i=0;i< dizi.length;i++){
            System.out.print(dizi[i]+"\t");
        }
    }
}

/*Normalde O(n^2)karşılaştırması ve değişimi gerekir ama en iyi durumda yani girilen verilerin neredeyse sıralı olması
halinde O(n) durumunda olur.

Dizi sıralandıktan sonra 18 sayısı Avarage case kapsamına girer.

[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımı:

1-)Tüm diziyi gezip en küçük sayıyı(2) bulup ilk baştaki sayı(7) ile yer değiştirir.
2-)Artık ilk eleman olan(2) sayıyı atlayıp diğer en küçük elemanı(3) bulur ve ikinci sıraya yerleştirir.
3-)Sıradaki en küçük elemanı(4) bulur ve üçüncü sıradakı sayı(5) ile yer değiştirir.
4-)Sıradaki en küçük elemanı(5) bulur ve dördüncü sıradakı sayı(8) ile yer değiştirir.
 */