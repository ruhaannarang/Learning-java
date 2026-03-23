public class stringBuilder {
    public static void main(String []args){
        StringBuilder sb =new StringBuilder("Ruhaan");
        System.out.println(sb);
//        char at index 0
        System.out.println(sb.charAt(0));
//        st char at index 0
        sb.setCharAt(0,'S');
        System.out.println(sb);

        sb.insert(0,'S');
        System.out.println(sb);

        sb.insert(5,'b');
        System.out.println(sb);

        sb.delete(0,2);
        sb.delete(3,4);
        sb.insert(0,'R');
        System.out.println(sb);

        sb.append(" pro");
        System.out.println(sb);
        sb.append(' ');
        sb.append('r');
        sb.append('e');
        sb.append('a');
        sb.append('l');
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
