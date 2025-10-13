public class reverseStringUsingRecursions {
    public static void reverse(String s,int i){
        if(i==s.length()){
            return;
        }
        reverse(s,i+1);
        System.out.print(s.charAt(i));

    }
    public static void main(String []args){
        String s="Ruhaan";
        int i=0;
        reverse(s,i);
    }
}
