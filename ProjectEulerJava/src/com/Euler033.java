
package com;

public class Euler033 {
    
    static int mN = 1;
    static int mD = 1;
    
    public static void main(String[] args) {
        
        for (int i=10;i<=98;i++) {
            for (int j=i+1;j<=99;j++) {
                checkIfTrivial(i,j);
            }
        }
        System.out.println(mN+"/"+mD);
    }
    
    protected static void checkIfTrivial(int num, int den) {
        
        if ((LD(num)==FD(den)) && (LD(den)!=0)) {
            
            double z = ( ((double) FD(num)) / ((double)LD(den)) );
            
            if (z== ((double) num / (double) den)) {
                System.out.println("Funciona pra "+num+"/"+den);
                mN = mN*num;
                mD = mD*den;
            }
            
        }
    }
    
    protected static int FD(int a) {
        return (int) Math.floor(a/10);
    }
    
    protected static int LD(int a) {
        return a%10;
    }
}
