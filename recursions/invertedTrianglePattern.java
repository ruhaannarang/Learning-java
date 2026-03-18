package recursions;

public class invertedTrianglePattern {
    public static void main(String[] args) {
        triagnle(4,0);
    }
    static void triagnle(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("* ");
            triagnle(row,col+1);
        }else{
            System.out.println();
            triagnle(row-1,0);
        }
    }
}
