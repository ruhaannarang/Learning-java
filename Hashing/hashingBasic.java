package Hashing;

import java.util.Scanner;

public class hashingBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int hash[]=new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }
        System.out.println("Enter the element:");
        int num=sc.nextInt();
        System.out.println(hash[num]);
        return;
    }
}
