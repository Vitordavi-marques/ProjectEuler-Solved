
package com;

public class Euler006 {
    
    static int n = 100;
    
    public static void main(String[] args) {
        System.out.println(squareOfSum() - sumOfSquares());
    }
    
    protected static long sumOfSquares() {
        int sum = 0;
        int k = 1;
        
        for (int c = n; c>=1; c--) {
            sum = sum + (c * ((2*k)-1));
            k++;
        }
        
        System.out.println("Sum of Squares of n = " + n + ":");
        System.out.println(sum);
        System.out.println("");
        return sum;
    }
    
    protected static long squareOfSum() {
        double y = (((Math.pow(n, 4)) + (2*(Math.pow(n, 3))) + (Math.pow(n, 2))) / 4);
        long z = Double.valueOf(y).longValue();
        
        System.out.println("Square of Sum of n = " + n + ":");
        System.out.println(z);
        System.out.println("");
                
        return z;
    }
}
