public class searchInString {
    public static void main(String[]args){
        String love ="Sneha";
        char target='a';
        System.out.println(search(love,target));
    }
    public static int search(String str,char target){
        if (str.length()==0){
            return -1;

        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
}
