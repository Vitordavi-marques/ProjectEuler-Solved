
package com;

import java.math.BigInteger;

public class Euler016 {
    
    public static void main(String[] args) {
        sumOfDgs(new BigInteger("2").pow(1000));
    }
    
    protected static void sumOfDgs(BigInteger n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        int sum = 0;
        
        for (int c=1;c<=d.length;c++) {
            d[c-1] = Integer.parseInt( s.substring(c-1, c) );
            sum = sum + d[c-1];
        }
        
        System.out.println(sum);
    }
}
