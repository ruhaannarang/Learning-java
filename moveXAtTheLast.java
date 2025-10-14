public class moveXAtTheLast {
    int x=0;
    public static void removeX(String str,int index,int x,StringBuilder a){
        if(index==str.length()){
            a.append("x".repeat(x));
            return;
        }
        if(str.charAt(index)!='x'){
            a.append(str.charAt(index));
        }else{
            x++;
        }
        removeX(str,index+1,x,a);
    }
    public static void main(String []args){
        int x=0;
        StringBuilder a=new StringBuilder("");
        String str="axbcxxd";
        removeX(str,0,x,a);
        System.out.println(a);
    }
}
