public class selectionSort {
    public static void main(String args[]){
        int arr[]={7,8,3,1,2};
        for (int j = arr.length-1; j >=0 ; j--) {
            int highest=arr[0];
            int highestIndex=0;

            for (int i = 0; i <= j; i++) {
                if(highest<arr[i]){
                    highest=arr[i];
                    highestIndex=i;
                }

            }
            int temp=arr[j];
            arr[j]=highest;
            arr[highestIndex]=temp;
        }

//        System.out.println(highest);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
