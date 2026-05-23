package recursions;

import java.util.ArrayList;

public class StringSubset {
    static void subset(String up,String p,ArrayList<String> ans){
        if(up.isEmpty()){
            ans.add(p);
            System.out.println(p);
            return;
        }
        subset(up.substring(1),p+up.charAt(0),ans);
        subset(up.substring(1),p,ans);
    }

    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        String str="abc";
        subset(str,"",ans);
        System.out.println(ans);

    }
}
