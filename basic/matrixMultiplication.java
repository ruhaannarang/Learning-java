import java.util.*;
public class matrixMultiplication {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows of first matrix");
        int RowsMatrixOne=sc.nextInt();
        System.out.println("Enter no of columns of first matrix");
        int columnMatrixOne=sc.nextInt();
        int[][] first = new int[RowsMatrixOne][columnMatrixOne];
        for (int i = 0; i <RowsMatrixOne; i++) {
            for (int j = 0; j < columnMatrixOne; j++) {
                System.out.println("Enter element of"+i+j);
                first[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter no of rows of second matrix");
        int RowsMatrixTwo=sc.nextInt();
        System.out.println("Enter no of columns of second matrix");
        int columnMatrixTwo=sc.nextInt();
        int[][] second = new int[RowsMatrixTwo][columnMatrixTwo];
        for (int i = 0; i <RowsMatrixTwo; i++) {
            for (int j = 0; j < columnMatrixTwo; j++) {
                System.out.println("Enter element of"+i+j);
                second[i][j]=sc.nextInt();
            }
        }
        int i=0;
        int j=0;
        int k=0;
        int m=RowsMatrixOne;
        int n=columnMatrixOne;
        int a=columnMatrixTwo;
        int ans[][]=new int[m][a];
        for (i = 0; i < m; i++) {
            for ( j = 0; j < a; j++) {
                    ans[i][j]=0;
                for ( k = 0; k < n ; k++) {
                    ans[i][j]=ans[i][j]+(first[i][k]*second[k][j]);
                }
            }
        }
        for ( i = 0; i < m; i++) {
            for ( j = 0; j < a; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
