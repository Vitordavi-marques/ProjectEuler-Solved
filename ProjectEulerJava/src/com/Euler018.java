
package com;

public class Euler018 {
    
    static final String s = "75"+
                     "9564"+
                     "174782"+
                     "18358710"+
                     "2004824765"+
                     "190123750334"+
                     "88027773076367"+
                     "9965042806167092"+
                     "414126568340807033"+
                     "41487233473237169429"+
                     "5371446525439152975114"+
                     "701133287773177839681757"+
                     "91715238171491435850272948"+
                     "6366046889536730731669874031"+
                     "046298272309709873933853600423";
    
    static int[][] dMatrix = new int[15][15];
    
    public static void main(String[] args) {
        
        sepIntoArray();
        for (int g=dMatrix.length;g>1;g--) {
            divIntoT(g);
        }
    }
    
    protected static void divIntoT(int r) {
        for (int c=1;c<=r-1;c++) {
            setD(r-1,c, checkBigT(getD(r-1,c), getD(r,c), getD(r,c+1) ));
            System.out.println(getD(r-1,c));
        }
    }
    
    protected static int checkBigT(int m, int m1, int m2) {
        int s1 = m+m1;
        int s2 = m+m2;
        
        if (s1 > s2) {
            return s1;
        } else {
            return s2;
        } 
    }
    
    protected static void sepIntoArray() {
        int c=1;
        
        for (int x=1;x<=dMatrix.length;x++) {
            for (int y=1;y<=x;y++) {
                setD(x,y, Integer.parseInt( s.substring((2*c)-2, ((2*c))) ) );
                //System.out.println(getD(x,y));
                c++;
            }
        }
    }
    
    public static int getDy(int x) {
        int zz = 0;
        
        for (int e=1;e<=dMatrix.length;e++) {
            if (getD(x,e) != 0) {
                zz++;
            }
        }
        
        return zz;
    }

    public static int getD(int x, int y) {
        return dMatrix[x-1][y-1];
    }
    
    public static void setD(int x, int y, int v) {
        dMatrix[x-1][y-1] = v;
    }
}
