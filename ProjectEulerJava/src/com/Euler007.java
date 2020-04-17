
package com;

public class Euler007 {
    
    static int primeC = 1;
    static int actualN = 2;
    
    public static void main(String[] args) {
        while (primeC <= 10001) {
            checkIfPrime(actualN);
            incrementActualNumber();
        }
    }
    
    protected static void incrementActualNumber() {
        
        if (actualN == 5) {
            actualN = 7;
        } else if (actualN > 5) {
            
            int rst = actualN % 10;
            
            if ((((rst == 1) || (rst == 3)) || (rst == 7)) || (rst == 9)) {
                actualN = actualN + 2;
                
                if (rst == 3) {
                    actualN = actualN + 2;
                }
            }
            
        } else {
            actualN++;
        }
        
    }
    
    protected static boolean checkIfPrime(int n) {
        boolean y = true;
        boolean rs = true;
        
        if ((n % 2 == 1) || (n == 2)) {
            for (int c=2;c<=Math.floor(n/2);c++) {
                if (rs) {
                    if (n % c == 0) {
                        y = false;
                        rs = false;
                    }
                }
            }
        } else {
            y = false;
        }
        
        if (y) {
            System.out.println(primeC + "º primo = " + n);
            primeC++;
        }
        
        return y;
    }
}
