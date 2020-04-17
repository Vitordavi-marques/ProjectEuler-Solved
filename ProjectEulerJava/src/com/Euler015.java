
package com;

import java.math.BigInteger;

public class Euler015 {
    
    public static void main(String[] args) {
        
        BigInteger x = new BigInteger("1");
        BigInteger y = new BigInteger("1");
        
        for (int c=40;c>=1;c--) {
            if (c >= 21) {
                x = x.multiply(BigInteger.valueOf(c));
            } else {
                y = y.multiply(BigInteger.valueOf(c));
            }
        }
        
        calcBin(x,y);
    }
    
    protected static void calcBin(BigInteger a, BigInteger b) {
        System.out.println(a.divide(b));
    }
}
