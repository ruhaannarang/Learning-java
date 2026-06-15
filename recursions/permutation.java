package recursions;
public class permutation {
    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String s=p.substring(0,i);
            String e=p.substring(i);
            permutation(s+ch+e,up.substring(1));
        }
    }
    public static void main(String[] args) {
        permutation("","Don");
    }
}