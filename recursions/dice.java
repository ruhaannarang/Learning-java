package recursions;
import java.util.*;
public class dice {
    static void dice(int target,String p,ArrayList<String> vals,int k,int n){
        if(target < 0) return;
        if(target==0){
            if(p.length()==n){

                vals.add(p);
            }
            return;
        }
        for(int i=1;i<=k;i++){
            dice(target-i,p+i,vals,k,n);
        }
    }

    public static void main(String[] args) {
        int target=7;
        int k=6;
        int n=2;
        ArrayList<String> vals=new ArrayList<>();
        dice(target,"",vals,k,n);
        System.out.println(vals);
        System.out.println(vals.size());
    }
}
