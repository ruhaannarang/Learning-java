public class cyclesort {
    public static void main(String[] args) {
        int[] num={1,4,5,3,2};
        int i=0;
        while(i<num.length){
            int correct=num[i]-1;
            if(num[i] != num[correct]){
                int temp=num[i];
                num[i]=num[correct];
                num[correct]=temp;
            }
            else{
                i++;
            }
        }
        for (int j=0;j<num.length;j++){
            System.out.print(num[j]+" ");
        }
    }
}
