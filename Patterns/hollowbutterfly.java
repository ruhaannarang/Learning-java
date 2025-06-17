package Patterns;

public class hollowbutterfly {

        public static void main(String[]args){
            int n=4;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if(j==1 || j==i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }

                }
                for(int k=n-i;k>=1;k--){
                    System.out.print("  ");
                }
                for(int j=1;j<=i;j++){
                    if(j==1 || j==i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }

            for(int a=n;a>=1;a--){
                for(int b=a;b>=1;b--){

                    if(b==1 || b==a){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }

                }
                for(int j=0;j<n-a;j++){
                    System.out.print("  ");
                }
                for(int b=a;b>=1;b--){
                    if(b==1 || b==a){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }


}
