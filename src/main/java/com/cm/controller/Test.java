package com.cm.controller;

public class Test {
    public static void main(String[] args){
        int[] a = new int[]{-13,-11,-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i <a.length ; i++) {
            if ((a[i]&1)!=0){
                System.out.println(a[i]+"是奇数");
            }else {
                System.out.println(a[i]+"是偶数");
            }
        }
    }


}
