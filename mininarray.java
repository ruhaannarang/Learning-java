public class mininarray {
    public static void main(String[]args){
        int[] arr={4,55,1,31,53,10};
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
