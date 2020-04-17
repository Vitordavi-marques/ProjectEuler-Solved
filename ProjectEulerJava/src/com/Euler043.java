package com;

import java.util.Arrays;

public class Euler043 {
    
    static long k = 0L;
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        permute(arr);
        
        System.out.println("SOMA: " + k);
    }
    
    protected static void checkIfVD(long c) {
        
        if (getDN(c,4,4) % 2 == 0) {
            if (((getDN(c,3,3)+getDN(c,4,4)) + (getDN(c,5,5))) % 3 == 0) {
                if (getDN(c,6,6) % 5 == 0) {
                    if (getDN(c,5,7) % 7 == 0) {
                        if (getDN(c,6,8) % 11 == 0) {
                            if (getDN(c,7,9) % 13 == 0) {
                                if (getDN(c,8,10) % 17 == 0) {
                                    System.out.println(c);
                                    k=k+c;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    protected static int getDN(long c, int i, int f) {
        String ss = "";
        String s = Long.toString(c);
        
        for (int d=i;d<=f;d++) {
            ss=ss.concat(s.substring(d-1,d));
        }
        
        return Integer.parseInt(ss);
    }
    
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void permute(int[] arr) {
        permute(arr, 0, arr.length - 1);
    }

    static void permute(int[] arr, int i, int n) {
        int j;
        if (i == n) {
            String s="";
            for (int z=0;z<arr.length;z++) {
                s=s.concat(Integer.toString(arr[z]));
            }
            
            if (!"0".equals(s.substring(0,1))) {
                checkIfVD(Long.parseLong(s));
            }
            
        } else {
            for (j = i; j <= n; j++) {
                Permute.swap(arr, i, j);
                Permute.permute(arr, i + 1, n);
                Permute.swap(arr, i, j); // backtrack
            }
        }
    }
}

class Permute {
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void permute(int[] arr) {
        permute(arr, 0, arr.length - 1);
    }

    public static void permute(int[] arr, int i, int n) {
        int j;
        if (i == n)
            System.out.println(Arrays.toString(arr));
        else {
            for (j = i; j <= n; j++) {
                swap(arr, i, j);
                permute(arr, i + 1, n);
                swap(arr, i, j); // backtrack
            }
        }
    }
}