package recursions;

import java.util.ArrayList;

public class phonepad {
    public static void main(String[] args) {
        ArrayList<String> ans=new ArrayList<>();
        pad("12","",ans);
        System.out.println(ans);
    }
    static void pad(String up, String p, ArrayList<String> ans){
        if(up.isEmpty()){
            ans.add(p);
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char) ('a'+i);
            pad(up.substring(1),p+ch,ans);
        }
    }


}
