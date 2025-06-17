package Patterns;

public class zeroonetriangle {
    public static void main(String[]args){
              int n=5;
              int k = 1;
              for(int i=1;i<=n;i++){
                  for(int j=1;j<=i;j++){
//                      System.out.print(1+" ");
                      if ((i % 2==0 && j%2 !=0)|| (i % 2!=0 && j%2 ==0)){
//                      if(i%2 != j%2){
                          System.out.print(0);
                      }
                      else{
                          System.out.print(1);
                      }
//                      System.out.print(k);
//                      k = k == 0 ? 1 : 0;
                 }
                  System.out.println();
              }
    }
}
