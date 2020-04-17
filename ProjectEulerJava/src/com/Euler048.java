package com;

public class Euler048 {
    
    static int di=10;
    
    public static void main(String[] args) {
        
        System.out.println(findSum(1000));
    }
    
    protected static void soutExpN(int n) {
        long m=1L;
        for (int c=1;c<=n;c++) {
            m=reduceD(m*n);
            System.out.println(m);
        }
        System.out.println(m);
    }
    
    protected static long findSum(int l) {
        long s=0L;
        
        for (int a=1;a<=l;a++) {
            long f=1L;
            
            for (int b=1;b<=a;b++) {
                f=reduceD(f*a);
            }
            
            s=reduceD(s+f);
        }
        
        return s;
    }
    
    protected static long reduceD(long d) {
        String ds = Long.toString(d);
        ds = (ds.length()>di) ? ds.substring(ds.length()-10,ds.length()) : ds;
        return Long.parseLong(ds);
    }
}
