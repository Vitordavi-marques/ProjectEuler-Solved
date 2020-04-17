
package com;

public class Euler009 {
    
    static boolean reseta = true;
    
    public static void main(String[] args) {
        
        for (int n = 1; n <= 100; n++) {
            for (int m = 0;m<n;m++) {
                //System.out.println("(" + m + "," + n + ").");
                calculateTriplet(m,n);
            }
        }
    }
    
    protected static void calculateTriplet(int m , int n) {
        int a,b,c;
        
        a = (int) ((Math.pow(n, 2)) - (Math.pow(m, 2)));
        b = 2*n*m;
        c = (int) ((Math.pow(n, 2)) + (Math.pow(m, 2)));
        
        checkIfComplete(a,b,c);
    }
    
    protected static void checkIfComplete(int a, int b, int c) {
        
        System.out.println(a + " < " + b + " < " + c + ". (" + (a+b+c) + ").");
        
        if ((a+b+c) == 1000) {
            reseta = false;
        }
    }
}
