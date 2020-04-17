
package com;

public class Euler028 {
    
    static int l = 1001;
    static int[] pB = new int[4];
    static int s = 1;
    
    public static void main(String[] args) {
        
        for (int c=0;c<=3;c++) {
            pB[c] = 1;
        }
        calcN(l);
    }
    
    protected static void calcN(int n) {
        for (int c=1;c<=(((2*n)-2)/4);c++) {
            for (int d=1;d<=4;d++) {
                pB[d-1] = pB[d-1] + 2*((4*(c-1)) + d);
                s = s + pB[d-1];
            }
        }
        System.out.println(s);
    }
}
