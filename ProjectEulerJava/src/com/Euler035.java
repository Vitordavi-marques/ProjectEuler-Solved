
package com;

public class Euler035 {
    
    static int limit = 1000000;
    static int aP=2;
    static int k =0;
    static boolean[] t = new boolean[limit+1];
    
    public static void main(String[] args) {
        
        for (int c=2;c<=limit;c++) {
            if (!checkIfEvenDigit(c)) {
                if (checkIfPrime(c)) {
                    checkIfCircular(c);
                }
            }
        }
        k++;
        //k+1 por causa do 11
        System.out.println(k+" circular primes");
    }
    
    protected static boolean checkIfEvenDigit(int p) {
        boolean y = false;
        
        if ((p!=2) || (p!=5)) {
            String cs = Integer.toString(p);
            for (int f=0;f<cs.length();f++) {
                if ((Integer.parseInt(cs.substring(f,f+1)) %2==0) || (Integer.parseInt(cs.substring(f,f+1)) %5==0)) {
                    y = true;
                }
            }
        }
        return y;
    }
    
    protected static void checkIfCircular(int p) {
        int e=0;
        String di = Integer.toString(p);
        int[] n = new int[di.length()];
        
        for (int c=0;c<di.length();c++) {
            
            String s = (di.substring(c, (di.length()))).concat( di.substring(0,c) );
            
            n[c] = Integer.parseInt(s);
            
            if (t[n[c]]==false) {
                t[n[c]] = true;
                if (checkIfPrime(n[c])) {
                    e++;
                }
            }
        }
        
        if (e==di.length()) {
            for (int c=0;c<di.length();c++){
                System.out.println(n[c]);
            }
            k=k+di.length();
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
