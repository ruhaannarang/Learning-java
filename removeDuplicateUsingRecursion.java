public class removeDuplicateUsingRecursion {
    public static void removeD(String str,StringBuilder sb,int index){

        int c=0;
        for(int i=str.length()-1;i>index;i--){
            if(sb.charAt(index)==sb.charAt(i)){
                sb.deleteCharAt(i);
            }
        }
        if(index==sb.length()){
            return;
        }
        removeD(sb.toString(),sb,index+1);
    }
    public static  void main(String []args){
        String str ="Ruhaaaaaaaaaaaaaaaaaaaaaan is prooo";
        StringBuilder sb = new StringBuilder("");
        sb.append(str);
        removeD(str,sb,0);
        System.out.println(sb);
    }
}
