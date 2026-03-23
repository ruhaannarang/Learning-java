public class sumOfnNumbersUsingRecursion {

    public static void sumNumbers(int i,int n ,int sum){
        sum+=i;

        if(i==n){
            System.out.println(sum);
            return;
        }
        sumNumbers(i+1,n,sum);
    }
    public static void main(String []args){
    sumNumbers(1,5,0);


    }
}
