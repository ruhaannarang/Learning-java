package recursions;

public class skipAString {
    static String skipString(String p,String up,String a){
        if(up.isEmpty()){
            return p;
        }
        if(up.startsWith(a)){
            return skipString(p,up.substring(5),a);
        }else{
            return skipString(p+up.charAt(0),up.substring(1),a);
        }

    }
    public static void main(String[] args) {
        String a="Apple";
        String b="aloosebkelaAppleKhalo";
        System.out.println(skipString("",b,a));
    }
}
