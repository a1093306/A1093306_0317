import java.util.*;
public class A1093306_0317_1 {
    public static void main(String[] argv){
        Scanner input=new Scanner(System.in);
        int n,m;
        do{
            System.out.println("請輸入n值(需>0):");
            n=input.nextInt();
        }while(n<=0);
        do{
            System.out.println("請輸入m值(需>0):");
            m=input.nextInt();
        }while(m<=0);
        int[][] array=new int[n][m];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=(i+1)*(j+1);
            }
        }
        System.out.println("n*m值為:");
        for(int[] a:array){
            for(int b:a){
                System.out.print(b+",");
            }
            System.out.println();
        }
    }
    
}
