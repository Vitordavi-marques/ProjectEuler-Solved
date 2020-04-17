
package com;

import java.math.BigInteger;

public class Euler020 {
    
    public static void main(String[] args) {
        
        BigInteger bi2 = new BigInteger("1");
        
        for (int c=1;c<=100;c++) {
            bi2 = bi2.multiply(BigInteger.valueOf(c));
        }
        
        multOfDgs(bi2);
    }
    
    protected static void multOfDgs(BigInteger n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        int m = 0;
        
        for (int c=1;c<=d.length;c++) {
            d[c-1] = Integer.parseInt( s.substring(c-1, c) );
            m = m + d[c-1];
        }
        
        System.out.println(m);
    }
}
