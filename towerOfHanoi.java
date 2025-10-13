public class towerOfHanoi {
    public static void hanoiTower(int n,String search, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+search+" to "+dest);
            return;
        }
        hanoiTower(n-1,search , dest, helper);
        System.out.println("transfer disk "+n+" from "+search+" to "+dest);
        hanoiTower(n-1,helper,search,dest);
    }
    public static void main(String []args){
        int n=7;
        hanoiTower(n,"S","H","D");
    }
}
