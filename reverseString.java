public class reverseString {
    public static void main(String[]args){
        StringBuilder str =  new StringBuilder("Ruhaan");
        for(int i=0; i< str.length()/2;i++){
            int front =i;
            int back = str.length()-i-1;

            char frontchar=str.charAt(front);
            char backchar = str.charAt(back);

            str.setCharAt(front, backchar);
            str.setCharAt(back, frontchar);

        }
        System.out.println(str);
    }
}
