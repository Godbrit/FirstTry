public class ArrayExample {
    public static void main(String[] args) {

        Object[] i = new Object[5];   //|22|33|44|55|

        int[][] m = new int[3][];
        int[] n = new int[5];
        m[0] = n;
        for (int l = 0; l < m[0].length; l++) {
            System.out.println(m[0][l]);
        }
        int[] j = new int[3];
        j[0] = 2;
        j[1] = 3;
        j[2] = -22;
        for (int k = 0; k < j.length; k++) {
            System.out.println(j[k]);
        }

        int[] p = new int[]{5, 4, 2};
        for (int x = 0; x < p.length; x++) {
            System.out.println(p[x]);
        }

        int[] d = {5,4,2};

        for (int x = 0; x < p.length; x++) {
            System.out.println(p[x]);
        }


        int [][] v = new int [][] {{1,3},{4,5}};
        for (int b = 0; b <(v.length+1) ; b++)
        {
            for (int h = 0; h<=b ; h++) {
                System.out.println(v[b][h]);
            }

        }
        method(new int[]{322, 434, 111});
    }
        static void method(int[] c)
        {
        for (int z = 0; z < c.length ; z++) {
            System.out.println(c[z]);
        }
        }

}


