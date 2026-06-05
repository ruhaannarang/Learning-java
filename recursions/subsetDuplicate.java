package recursions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetDuplicate {
    static List<List<Integer>> subset(int[] arr){
    List<List<Integer>> ans= new ArrayList<>();
    Arrays.sort(arr);
    ans.add(new ArrayList<>());
    int start=0;
    int end=0;

    for(int i=0;i<arr.length;i++){
        start=0;
        if(i>0 && arr[i]==arr[i-1]){
            start=end+1;
        }
        end=ans.size()-1;
        int n=ans.size();
        for(int j=start;j<n;j++){
            List<Integer> temp=new ArrayList<>(ans.get(j));
                temp.add(arr[i]);
                ans.add(temp);
        }
    }
    return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2};
        System.out.println(subset(arr).toString());
    }
}
