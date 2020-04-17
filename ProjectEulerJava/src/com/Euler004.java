
package com;

public class Euler004 {
    
    static int biggestPal = 0;
    
    public static void main(String[] args) {
        boolean reseta = true;
        
        for (int i=999;i>=100;i--) {
            for (int j=999;j>=100;j--) {
                if (reseta) {
                    if (checkIfPalin(i*j)) {
                        System.out.println(i + " * " + j);
                        reseta = false;
                    }
                }
            }
        }
    }
    
    protected static boolean checkIfPalin(int x) {
        boolean y = false;
        
        String xs = Integer.toString(x);
        String[] digits = new String[xs.length()];
        String[] rDigits = new String[xs.length()];
        
        for (int c=0;c < xs.length();c++) {
            digits[c] = xs.substring(c, c+1);
        }
        
        int counter = 0;
        for (int c=0;c < xs.length();c++) {
            rDigits[c] = digits[(xs.length()-1)-c]; 
            //System.out.println(digits[c] + " " + rDigits[c]);
            
            if (digits[c].equals(rDigits[c])) {
                counter++;
            }
        }
        
        if (counter == xs.length()) {
            y = true;
            System.out.println(x);
        }
        
        return y;
    }
}
