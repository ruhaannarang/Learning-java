
package Hashing;
import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap <>();
        int[] arr={1,3,2,4,1,5,2,66,2,1};
        int target=3;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map.get(target));

    }
}
