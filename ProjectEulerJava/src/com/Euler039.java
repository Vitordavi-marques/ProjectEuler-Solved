package com;

public class Euler039 {
    
    static int k = 0;
    static int kM = 0;
    static int pA = 0;
    
    public static void main(String[] args) {
        
        for (int p=3;p<=1000;p++) {
            k=0;
            checkForP(p);
            pA = (k>kM) ? p : pA;
            kM = (k>kM) ? k : kM;
        }
        System.out.println(pA);
    }
    
    protected static void doBruteForce() {
        
    }
    
    protected static void checkForP(int p) {
        for (int a=1;a<=((int)Math.ceil((p-3)/3));a++) {
            
            for (int b=1;b<=((int)(Math.ceil((p-a)/2)));b++) {
                findPyTr(a,b,p);
            }
        }
    }
    
    protected static void findPyTr(int a, int b, int s) {
        int c = ((s - a) - b);
        if (checkIfTriplet(a,b,c)) {
            k++;
            //System.out.println("Solução "+k+" para p="+s + ". ("+a+","+b+","+c+").");
        }
    }
    
    protected static boolean checkIfTriplet(int a,int b, int c) {
        return ((((((int)(Math.pow(a, 2))) + ((int)(Math.pow(b, 2))) == ((int)(Math.pow(c, 2)))) && (a<b)) && (b<c)) && (a>0));
    }
}
