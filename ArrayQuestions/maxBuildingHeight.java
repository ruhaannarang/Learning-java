package ArrayQuestions;

public class maxBuildingHeight {
    public static void main(String[] args) {
        int n=10;
        int[][] restrictions={{5,3},{2,5},{7,4},{10,3}};
        int maxHeight=0;
        int currentHeight=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<restrictions.length;j++){
                if(restrictions[j][0]==i){
                    if(currentHeight>restrictions[j][1]){
                        currentHeight=restrictions[j][1];
                    }
                }
                if (j > 0 && j < restrictions.length - 1) {
                    if (restrictions[j][0] != i &&
                            restrictions[j - 1][0] == i - 1 &&
                            restrictions[j + 1][0] == i + 1) {

                        if (restrictions[j + 1][0] < restrictions[j - 1][0]) {
                            currentHeight = restrictions[j - 1][0] - 1;
                        }
                    }
                }

            }
            maxHeight=Math.max(maxHeight,currentHeight);
            System.out.println(currentHeight);
            currentHeight++;

        }
//        System.out.println("Max Height of a building: "+ maxHeight);
    }
}
