
package com;

public class Euler030 {
    
    static int d = 5;
    
    public static void main(String[] args) {
        
        int total = 0;
        for (int e=2;e<=(6*( (int) (Math.pow(9, 5)) ));e++) {
            if (checkIfA(e)) {
                total = total + e;
                System.out.println(e);
            }
        }
        
        System.out.println("");
        System.out.println(total);
    }
    
    protected static boolean checkIfA(int n) {
        String s = String.valueOf(n);
        int[] di = new int[s.length()];
        int sum = 0;
        
        for (int c=0;c<s.length();c++) {
            di[c] = Integer.parseInt(s.substring(c,c+1));
            sum = sum + ((int) (Math.pow(di[c], d)));
        }
        
        return (sum==n);
    }
}
