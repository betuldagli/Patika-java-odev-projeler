/**Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.*/
public class BirYuzArasiAsal {
    public static void main(String[] args) {
        int i,j,sayac=0;

        for(i=2;i<100;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    sayac++;
                }
            }
            if(sayac==0){
                System.out.print(i+"\t");
            }
            sayac=0;
        }
    }
}
