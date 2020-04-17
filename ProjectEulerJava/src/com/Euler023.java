
package com;

public class Euler023 {
    
    static int l = 28123;
    static boolean[] isA = new boolean[l];
    static boolean[] isSA = new boolean[2*l];
    
    public static void main(String[] args) {
        
        findANum();
        sumOfAb();
    }
    
    protected static void sumOfAb() {
        int s = 0;
        
        for (int i=1;i<=l;i++) {
            if (isA[i-1]) {
                for (int j=1;j<=l;j++) {
                    if (isA[j-1]) {
                        
                        int k = i+j;
                        isSA[k-1] = true;
                    }
                }
            }
        }
        
        for (int c=1;c<=l;c++) {
            if (isSA[c-1] == false) {
                s = s + c;
            }
        }
        
        System.out.println("Result: " + s);
    }
    
    protected static void findANum() {
        
        for (int k=1;k<=l;k++) {
            
            if (isA[k-1] == false) {
                
                if (checkIfPrime(k)) {
                    isA[k-1] = false;

                } else if (checkIfPerfect(k)) {
                    isA[k-1] = false;

                    for (int m=2*k;m<=l;m=m+k) {
                        isA[m-1] = true;
                    }

                } else if (checkIfAbundant(k)) {
                    isA[k-1] = true;

                    for (int m=2*k;m<=l;m=m+k) {
                        isA[m-1] = true;
                    }
                    
                } else {
                    isA[k-1] = false;
                }
            }
            
            if (isA[k-1]) {
                //System.out.println("Abundant: " + k);
            }
        }
    }
    
    protected static boolean checkIfAbundant(int n) {
        boolean r = false;
        int s = 0;
        
        for (int c=1;c<=Math.floorDiv(n, 2);c++) {
            if (n%c==0) {
                s = s + c;
            }
        }
        
        if (s > n) {
            r = true;
        }
        
        return r;
    }
    
    protected static boolean checkIfPrime(int n) {
        boolean b = true;
        boolean rs = true;
        
        if ((((n%2==0) && (n>2)) || ((n%5==0) && (n>5))) || (n==1)) {
            b = false;
        }
        
        if (((n%2==1) && (n>5))) {
            for (int c=2;c<=Math.ceil( Math.sqrt(n) );c++) {
                if (rs) {
                    if (n%c == 0) {
                        rs = false;
                        b = false;
                    }
                }
            }
        }
        return b;
    }
    
    protected static boolean checkIfPerfect(int n) {
        boolean b = false;
        if ((((n == 6) || (n == 28)) || ((n==496)) || (n==8128))) {
            b = true;
        }
        return b;
    }
}
