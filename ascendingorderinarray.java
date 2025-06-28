public class ascendingorderinarray {
    public static void main(String[]args){
        int[] arr={4,55,31,53,10};
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print(min);
        for (int length = arr.length; length >0 ; length--) {
            for (int a = 1; a <arr.length ; a++) {
                int[] newArr=new int[length];
                for (int j = 0; j < length; j++) {
                    if (min==arr[j]){
                        continue;
                    }
                    else{
                        newArr[j]=arr[a];
                    }
                    int newmin=newArr[0];
                    for (int i = 0; i <newArr.length ; i++) {
                        if (arr[i]<newmin){
                            newmin=arr[i];
                        }
                    }
                    System.out.print(newmin);



                }

            }
        }

    }
}
