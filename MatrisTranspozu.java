import java.util.Scanner;

public class MatrisTranspozu {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int i,j;
        int[][] matris=new int[3][3];
        System.out.println("Matrisin elemanlarını giriniz:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                matris[i][j]=girdi.nextInt();
            }
        }
        System.out.println("\nMatris:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(matris[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\nMatrisin transpozu:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(matris[j][i]+"\t");
            }
            System.out.println();
        }
    }
}