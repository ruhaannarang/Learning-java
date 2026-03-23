package Hashing;

public class characterHashing {
    public static void main(String[] args) {
        //for small letters only
        String str="asdhasfghjasd";
        char target='r';
        int[] hash=new int[26];
        for(int i=0;i<str.length();i++){
            hash[str.charAt(i)-'a']++;
        }
        System.out.println(hash[target-'a']);

    }
}
