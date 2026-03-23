public class createUsernameFromEmail {
    public static void main(String[]args){
        String mail="ruhaanarang3@gmail.com";
        for (int i=0;i<mail.length();i++){
            if (mail.charAt(i)=='@'){
                break;
            }
            else {
                System.out.print(mail.charAt(i));
            }
        }
    }
}
