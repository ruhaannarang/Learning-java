package BitManipulation2;

public class findUnique {
    public static void main(String[] args) {
        int[] arr={2,6,3,2,6,5,5};
        int unique=0;
        for(int i=0;i<arr.length;i++){
            unique=unique^arr[i];
        }
        System.out.println(unique);
    }
}
