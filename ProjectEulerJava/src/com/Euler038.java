package com;

public class Euler038 {
    
    static int l = 9;
    static int bP = 0;
    
    public static void main(String[] args) {
        
        for (int n=9;n>1;n--) {
            for (int c=1;c<=10000;c++) {
                String p = calcCPan(c,n);
                
                if (checkIfCPan(p)) {
                    if (Integer.parseInt(p)>bP) {
                        bP = Integer.parseInt(p);
                    }
                }
            }
        }
        
        System.out.println(bP);
    }
    
    protected static String calcCPan(int x, int n) {
        int[] xa = new int[n];
        String s="";
        for (int c=0;c<n;c++) {
            xa[c] = x*(c+1);
            s = s.concat(Integer.toString(xa[c]));
        }
        
        return s;
    }
    
    protected static boolean checkIfCPan(String s) {
        boolean b = false;
        boolean bb = true;
        boolean bbb;
        int e = 0;
        
        if ((s.length()==l)) {
            for (int c=1;c<=l;c++) {
                if (bb) {
                    bbb=true;
                    
                    for (int d=1;d<=l;d++) {
                        if (bbb) {
                            
                            if (Integer.parseInt(s.substring(d-1,d)) == c) {
                                bbb=false;
                                e++;
                            }
                        }
                    }
                    if (bbb) {
                        bb=false;
                    }
                }
            }
        }
        
        b = (e==l);
        return b;
    }
}
