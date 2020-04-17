package com;

public class Euler046 {
    
    static int aP=2;
    static int l = 5777;
    
    public static void main(String[] args) {
        
        for (int c=9;c<=l;c=c+2) {
            if (checkIfOddComp(c)) {
                if (!checkIfConj(c)) {
                    System.out.println(c);
                }
            }
        }
    }
    
    protected static boolean checkIfConj(int n) {
        boolean y=false;
        boolean yy=true;
        for (int c=((int)Math.ceil(Math.sqrt(n)));c>=1;c--) {
            if (yy) {
                if (2*(Math.pow(c, 2)) < n) {
                    if (checkIfPrime(n - ((int)(2*(Math.pow(c, 2)))) )) {
                        y = true;
                        yy = false;
                    }
                }
            }
        }
        return y;
    }
    
    protected static boolean checkIfOddComp(int n) {
        return !(checkIfPrime(n));
    }
    
    protected static void nextPrime() {
        aP=aP+2;
        while (!checkIfPrime(aP)) {
            aP=aP+2;
        }
    }
    
    protected static boolean checkIfPrime(int p) {
        boolean y = true;
        boolean yy = true;
        if ((((p%2==0)&&(p>2)) || (((p>5)&&(p%5==0)) && (p%2==1))) || (p==1)) {
            y = false;
        } else {
            for (int div=2;div<=Math.ceil((int)Math.sqrt(p));div++) {
                if (yy) {
                    if (p%div==0) {
                        yy=false;
                        y=false;
                    }
                }
            }
        }
        return y;
    }
}
