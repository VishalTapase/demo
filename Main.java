package com.company;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//java
class Main{
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader isr  = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
        String[] st  = br.readLine().split(" ");
        int[] nums=new int[n];
        for(int i = 0 ; i < n ; i++){
            nums[i] = Integer.parseInt(st[i]);
        }
        int n=Arrays.binarySearch(nums,0,6,2);
        System.out.println(n);
    }


}
