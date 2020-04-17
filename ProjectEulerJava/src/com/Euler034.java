
package com;

public class Euler034 {
    
    static int l = 6;
    static int sumU = 0;
    
    public static void main(String[] args) {
        
        for (int c=10 ; c<=(((int)Math.pow(10, l))-1);c++) {
            checkIfTrue(c);
        }
        System.out.println("Soma: "+sumU);
    }
    
    protected static void checkIfTrue(int n) {
        int[] s = new int[Integer.toString(n).length()];
        int sum = 0;
        
        for (int d=0;d<Integer.toString(n).length();d++) {
            s[d] = Integer.valueOf(Integer.toString(n).substring(d,d+1));
            sum = sum + nFac(s[d]);
        }
        
        if (sum==n) {
            sumU = sumU+n;
            System.out.println(n);
        }
    }
    
    protected static int nFac(int n) {
        int m=1;
        if (n!=0) {
            for (int z=1;z<=n;z++) {
                m=m*z;
            }
        } 
        return m;
    }
}
