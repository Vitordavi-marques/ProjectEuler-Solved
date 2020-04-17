
package com;

public class Euler010 {
    
    static int li = 2000000;
    
    public static void main(String[] args) {
        
        int n = 5;
        long sum = 5;
        
        while (n < li) {
            if (checkIfPrime(n)) {
                sum = sum + n;
            }
            
            n+=2;
        }
        
        System.out.println(sum);
    }
    
    protected static boolean checkIfPrime(int n) {
        boolean v = true;
        boolean vb = true;
        
        if ((n%2==1) && (n>7)) {
                
            for (int c=2;c <= Math.ceil(Math.sqrt(n));c++) {
                if (vb) {
                    if (n%c == 0) {
                        v = false;
                        vb = false;
                    }
                }
            }
        }
        
        if (v) {
            //System.out.println("Primo: " + n);
        }
        return v;
    }
}
