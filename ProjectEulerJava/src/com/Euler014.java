
package com;

public class Euler014 {
    
    static int bC = 0;
    static long q = 0;
    
    public static void main(String[] args) {
        for (int d=1000000;d>=1;d--) {
            startSeq(d);
        }
        
        System.out.println("Maior: " + bC + " ," + q);
    }
    
    protected static void startSeq(long n) {
        int c = 1;
        long p = n;
        
        while (n != 1) {
            if (n%2==0) {
                n = n/2;
            } else {
                n = ((3*n) +1);
            }
            c++;
        }
        
        if (c>bC) {
            bC=c;
            q = p;
        }
        System.out.println(p + ": " + c);
    }
}
