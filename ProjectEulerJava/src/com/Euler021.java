
package com;

public class Euler021 {
    
    static int l = 10000;
    static int sum = 0;
    static int[] sumD = new int[l];
    static boolean[] bD = new boolean[l];
    
    public static void main(String[] args) {
        
        instArrays();
        for (int c=1;c<=l;c++) {
            sumD[c-1] = findDivs(c);
        }
        findAmicN();
    }
    
    protected static int findDivs(int n) {
        int sumR = 0;
        
        if (checkIfPrime(n)==false) {
            for (int d=1;d<=n/2;d++) {
                if (n%d==0) {
                    sumR = sumR + d;
                }
            }
        } else {
            sumR = 1;
            bD[n-1] = false;
        }
        
        return sumR;
    }
    
    protected static void findAmicN() {
        for (int m=1;m<l;m++) {
            if (bD[m-1]) {
                for (int n=1;n<l;n++) {
                    if ((bD[n-1]) && (m!=n)) {
                        if ((sumD[m-1] == n) && (sumD[n-1] == m)) {
                            bD[m-1] = false;
                            bD[n-1] = false;
                            sum = sum + m + n;
                            System.out.println("Amicable pair: (" + m + "," + n + ").");
                        }
                    }
                }
            }
        }
        
        System.out.println(sum);
    }
    
    protected static boolean checkIfPrime(int p) {
        boolean y = true;
        boolean yy = true;
        
        if ((((p>2) && (p%2==0)) || ((p>5) && (p%5==0))) || (p==1)) {
            y = false;
        }
        
        if (((p>5) && (p%2==1))) {
            for (int g=2;g<=Math.ceil(Math.sqrt(p));g++) {
                if (yy) {
                    if (p%g==0) {
                        yy = false;
                        y = false;
                    }
                }
            }
        }
        
        return y;
    }
    
    protected static void instArrays() {
        for (int c=0;c<l;c++) {
            bD[c] = true;
        }
    }
}
