
package com;

public class Euler027 {
    
    public static void main(String[] args) {
        
        boolean rr = false;
        for (int k=79;k>=41;k--) {
            if (rr==false) {
                rr = findSeq(k);
            }
        }
    }
    
    protected static boolean findSeq(int k) {
        int a = 81 - 2*k;
        int b = (int) (Math.pow(k-40, 2)) - (k-40) + 41;
        
        return checkIfSeq(a,b,k);
    }
    
    protected static boolean checkIfSeq(int a, int b, int k) {
        boolean r = false;
        int x,c = 0;
        
        for (int n=0;n<k;n++) {
            x = (int) (Math.pow(n, 2)) + a*n + b;
            
            if (checkIfPrime(x)) {
                c++;
            }
        }
        
        if (((c==k) && (a<1000)) && (b<=1000)) {
            r = true;
            System.out.println(a*b);
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
}
