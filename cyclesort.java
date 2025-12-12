public class cyclesort {
    public static void main(String[] args) {
        int[] num={1,4,5,3,2};
        int i=0;
        while(i<num.length){
            int correctIndex=num[i]-1;
            if(num[i] != num[correctIndex]){
                int temp=num[i];
                num[i]=num[correctIndex];
                num[correctIndex]=temp;
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
