import java.util.Scanner;
/**Çok boyutlu diziler kullanılarak "yıldızlar" ile ekrana "B" harfi yazan programı yazınız.
 * * * * 0b 4y
 *     * 0b 1y 2b 1y
 * * * * 0b 4y
 *     * 0b 1y 2b 1y
 * * * * 0b 4y
 */
public class YildizB{
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int i,j;

        char[][] dizi=new char[5][4];

        for(i=0;i<5;i++){
            for(j=0;j<4;j++){
                if(j==0 || j==3 || i%2==0){
                    dizi[i][j]='*';
                }
                else{
                    dizi[i][j]=' ';
                }
                System.out.print(dizi[i][j]+"\t");
            }
            System.out.println();
        }
    }
}