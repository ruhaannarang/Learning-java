public class matrixMultiplication {
    public static void main(String[]args){
        int[][] first = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] second = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int i=0;
        int j=0;
        int k=0;
        int m=first.length;
        int n=first[0].length;
        int a=second[0].length;
        int ans[][]=new int[m][a];
        for (i = 0; i < m; i++) {
            for ( j = 0; j < a; j++) {
                    ans[i][j]=0;
                for ( k = 0; k < a ; k++) {
                    ans[i][j]=ans[i][j]+(first[i][k]*second[k][j]);
                }
            }
        }
        for ( i = 0; i < n; i++) {
            for ( j = 0; j < a; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
