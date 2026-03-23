package Hashing;

public class modifiedCharacterHashing {
    public static void main(String[] args) {
        String str="HiI mynname isRuhaan WhatISYOur Name?";
        char target=' ';
        int[] hash=new int[256];
        for(int i=0;i<str.length();i++){
            hash[str.charAt(i)]++;
        }
        System.out.println(hash[target]);

    }
}
