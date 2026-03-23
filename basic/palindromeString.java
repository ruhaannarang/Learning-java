public class palindromeString {
    public static void main(String[] args) {
        StringBuilder string=new StringBuilder("abcdcbaa");
        int start=0;
        int end=string.length()-1;
        while(start<=end) {
            if(string.charAt(start)!=string.charAt(end)){
                System.out.println("Not Palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Palindrome");
    }
}
