package com;

public class Euler047 {
    
    static int[] primes;
    
    public static void main(String[] args) {
        
        genP(10000);
    }
    
    protected static void factorN(int n) {
        int k=0;
    }
    
    protected static void genP(int y) {
        System.out.print("{");
        for (int c=2;c<=y;c++) {
            if (checkIfPrime(c)) {
                System.out.print(c);
                if (c!=y) {
                    System.out.print(", ");
                    if (c%5000==0) {
                        System.out.println(" ");
                    }
                } else {
                    System.out.print("}");
                }
            }
        }
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
        } else if ((n>2) && (n%2==0)) {
            v=false;
        }
        return v;
    }
}
