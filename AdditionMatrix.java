import java.util.Scanner;

public class AdditionMatrix {
    public static void main(String[] args) {
        int[][] a=new int[3][3];
        int[][] b= new int[3][3];
        int[][] c=new int[3][3];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            System.out.println("enter the element of "+i+" th row of first matrix");
            for(int j=0;j<3;j++)
            {
                
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            System.out.println("enter the element of "+i+" th row of second matrix");
            for(int j=0;j<3;j++)
            {
                
                b[i][j]=sc.nextInt();
            }

        }
        
        for(int i=0;i<3;i++)
        {
            System.out.println("enter the element of "+i+" th row of second matrix");
            for(int j=0;j<3;j++)
            {
                
                c[i][j]=a[i][j]+b[i][j];

            }

        }
        System.out.print("[");
        for(int i=0;i<3;i++)
        {
            System.out.print("{");
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+",");
                

            }
            System.out.println("}"+",");


        }
        System.out.print("]");
        

    }
}
