package com;

public class Euler045 {
    
    static int l = 1;
    
    public static void main(String[] args) {
        
        System.out.println(tN(l*285));
        System.out.println(pN(l*165));
        System.out.println(hN(l*143));
    }
    
    protected static int tN(int n) {
        return ((n*(n+1))/2);
    }
    
    protected static int pN(int n) {
        return ((n*((3*n)-1))/2);
    }
    
    protected static int hN(int n) {
        return (n*((2*n)-1));
    }
}
