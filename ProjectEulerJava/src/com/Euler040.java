package com;

public class Euler040 {
    
    static int l=6;
    
    public static void main(String[] args) {
        
        for (int c=2;c<=6;c++) {
            findTerms((int)(Math.pow(10, c)));
            System.out.println("");
        }
    }
    
    protected static int findTerms(int dn) {
        boolean y = true;
        int g =1;
        int df=0;
        
        while (y) {
            if ((fD(g) < dn) && (dn < fD(g+1))) {
                y=false;
                
                df = (int)(Math.floor((dn - fD(g))/(g+1))) + (int) (Math.pow(10, g));
                int dh = (int)(Math.floor((dn - fD(g))%(g+1)));
                System.out.println("opa "+df + " com resto "+dh);
            } else {
                g++;
            }
        }
        
        return df;
    }
    
    //Dizer o limite de dN numa sequência de 1 até 10^n
    protected static int fD(int n) {
        int o=0;
        for (int c=n;c>=1;c--) {
            o=o+ (fA(c)*c);
        }
        return o;
    }
    
    //Me diz quantos números com N dígitos existem.
    protected static int fA(int n) {
        return ( ( (((int)(Math.pow(10, n)))-1) - ((int)(Math.pow(10, n-1))) ) +1);
    }
    
    //Me diz quantos números com m<=n dígitos existem.
    protected static int fB(int n) {
        int m=0;
        for (int c=n;c>=1;c--) {
            m=m+fA(c);
        }
        return m;
    }
    
    protected static String craftChamp(int n) {
        String csc="";
        for (int c=1;c<=n;c++) {
            //csc = csc.concat(Integer.toString(c));
            csc = csc + Integer.toString(c);
        }
        return csc;
    }
}
