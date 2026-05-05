package ArrayQuestions;

import java.util.HashMap;

public class highestFreqkey {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,4,5,3,5,3,6,4,6,2,6,9};
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int value:arr){
            freq.put(value,freq.getOrDefault(value,0)+1);
        }
        int highestFreq=0;
        int highestKey=0;
        for(int key : freq.keySet()){
            System.out.println(key+"-->"+freq.get(key));
            if(freq.get(key)>highestFreq){
                highestFreq=freq.get(key);
                highestKey=key;
            }
        }
        System.out.println("Highest Frequency :"+highestFreq);
        System.out.println("Highest Frequency key :"+highestKey);
    }
}
