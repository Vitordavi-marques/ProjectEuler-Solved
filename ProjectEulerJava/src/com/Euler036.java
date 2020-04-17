
package com;

public class Euler036 {
    
    static int l = 3;
    static int lA = 2;
    static int sum = 0;
    
    public static void main(String[] args) {
        
        for (int c=1;c<=999999;c=c+2) {
            checkIfDal(c);
        }
        System.out.println("Soma: "+sum);
    }
    
    protected static boolean checkIfDal(int n) {
        boolean y = false;
        String b10 = Integer.toString(n);
        String b2 = Integer.toString(n,2);
        
        StringBuilder sb10 = new StringBuilder(b10);
        String r10 = sb10.reverse().toString();
        
        StringBuilder sb2 = new StringBuilder(b2);
        String r2 = sb2.reverse().toString();
        
        if ((b10.equals(r10)) && (b2.equals(r2))) {
            System.out.println(b10 + " para " + r10);
            System.out.println(b2 + " para " + r2);
            System.out.println("");
            y=true;
            sum=sum+n;
        }
        
        return y;
    }
}
