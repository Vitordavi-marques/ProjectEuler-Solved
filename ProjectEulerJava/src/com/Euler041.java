package com;

public class Euler041 {
    
    static int l = 10;
    static boolean[] z = new boolean[l+1];
    static int[] x = new int[l+1];
    
    public static void main(String[] args) {
        
        for (int d=1;d<=7;d++) {
            x[7] = d;

            for (int e=1;e<=7;e++) {
                x[6] = e;

                for (int f=1;f<=7;f++) {
                    x[5] = f;

                    for (int g=1;g<=7;g++) {
                        x[4] = g;

                        for (int h=1;h<=7;h++) {
                            x[3] = h;

                            for (int i=1;i<=7;i++) {
                                x[2] = i;

                                for (int j=1;j<=7;j=j+2) {
                                    x[1] = j;
                                    String ss=formS();
                                    if (checkIfPandigital(ss)) {
                                        if (checkIfPrime(Integer.parseInt(ss))) {
                                            System.out.println(ss);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    protected static String formS() {
        String s = "";
        for (int k=7;k>=1;k--) {
            s=s.concat(Integer.toString(x[k]));
        }
        return s;
    }
    
    protected static boolean checkIfPandigital(String s) {
        boolean yy = true;
        boolean xx;
        int k=0;
        
        for (int m=1;m<=7;m++) {
            for (int n=1;n<=7;n++) {
                if (yy) {
                    if (Integer.parseInt(s.substring(n-1,n)) == m) {
                        yy=false;
                        k++;
                    }
                }
            }
            yy=true;
        }
        xx = (k==7);
        return xx;
    }
    
    protected static boolean checkIfPrime(int n) {
        boolean b = true;
        boolean rs = true;
        if ((((n%2==0) && (n>2)) || ((n%5==0) && (n>5))) || (n==1)) {
            b = false;
        }
        if (((n%2==1) && (n>5))) {
            for (int c=2;c<=Math.ceil( Math.sqrt(n) );c++) {
                if (rs) {
                    if (n%c == 0) {
                        rs = false;
                        b = false;
                    }
                }
            }
        }
        return b;
    }
}
