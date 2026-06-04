package recursions;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    static List<List<Integer>> subset(int[] nums){
        List<List<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:nums){
            int n= outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(subset(arr).toString());
    }
}
