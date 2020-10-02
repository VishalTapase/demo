package com.company;

import java.util.*;
//java
class Main{
    public static void main(String[] args) {
        int[] nums=new int[]{ 0, 8, 4, 12, 2, 15, 22};
       int n=Arrays.binarySearch(nums,0,6,2);
        System.out.println(n);
    }


}
