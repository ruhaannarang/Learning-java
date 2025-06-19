package functions;

public class sumofodd {
    public static int sumofodd(int n){
        int temp=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                temp=temp+i;
            }

        }
        return temp;
    }
    public static void main(String[]args){
        System.out.println(sumofodd(7));
    }
}
