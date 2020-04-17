
package com;

public class Euler032 {
    
    static int l = 9;
    static int sum = 0;
    static int[] v = new int[200];
    static int aI=0;
    
    public static void main(String[] args) {
        
        for (int i=10;i<=99;i++) {
            for (int j=111;j<=999;j++) {
                doSumOp(i,j);
            }
        }
        
        for (int i=1;i<=9;i++) {
            for (int j=1000;j<=9999;j++) {
                doSumOp(i,j);
            }
        }
        
        System.out.println(sum);
    }
    
    protected static void doSumOp(int i, int j) {
        if (checkIfPandigital(i,j)) {
            sum = sum + (i*j);
        }
    }
    
    protected static boolean checkIfPandigital(int x, int y) {
        boolean b = false;
        boolean bb = true;
        boolean bbb = true;
        int e = 0;
        int z = x*y;
        String s = (Integer.toString(x).concat(Integer.toString(y))).concat(Integer.toString(z));
        
        if ((s.length()==l) && (checkIfZ(z)==false)) {
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
        
        if (e==l) {
            b=true;
            v[aI]=z;
            aI++;
            System.out.println("a="+x+". b="+y+". c="+z);
        }
        
        return b;
    }
    
    protected static boolean checkIfZ(int z) {
        boolean y=false;
        for (int c=0;c<v.length;c++) {
            if (z==v[c]) {
                y = true;
            }
        }
        return y;
    }
}
