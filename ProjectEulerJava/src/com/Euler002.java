
package com;

public class Euler002 {
    
    static long start, end;
    static int alphaTerm, betaTerm, gammaTerm, sum;
    
    public static void main(String[] args) {
        
        sum = 2;
        alphaTerm = 1;
        betaTerm = 2;
        gammaTerm = 0;
        
        while (sum <= 4000000) {
            sumOfTerms();
        }
        
        System.out.println(sum);
    }
    
    protected static void sumOfTerms() {
        gammaTerm = alphaTerm + betaTerm;
        
        if (gammaTerm % 2 == 0) {
            sum = sum + gammaTerm;
        }
        
        alphaTerm = betaTerm;
        betaTerm = gammaTerm;
        gammaTerm = 0;
        
    }
}
