public class Set {
    static int max(int a[]) {
        int m = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        return (m);
    }

    static int min(int a[]) {
        int n = a[0];
        for (int k = 0; k < a.length; k++) {
            if (a[k] < n) {
                n = a[k];
            }
        }
        return (n);
    }

    static void sort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted Array is as: ");
        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);
        }
    }

    public static int[][] addArrays(int[][] a, int[][] b) {

        int rows = a.length;
        int cols = a[0].length;
        int[][] c = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int k = 0; k < c.length; k++) {
            for (int l = k + 1; l < c.length; l++) {
                if (c[k] != c[l]) {
                    c[k] = c[l];
                }
            }
        }
        return (c);
    }

    public static int[] arraySu(int[][] array) {
        int[] sums = new int[6];
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    sums[0] += array[i][j];
                }
                if (i == n - 1) {
                    sums[1] += array[i][j];
                }
                if (j == 0) {
                    sums[2] += array[i][j];
                }
                if (j == n - 1) {
                    sums[3] += array[i][j];
                }
                if (i == j) {
                    sums[4] += array[i][j];
                }
                if (i + j == n - 1) {
                    sums[5] += array[i][j];
                }
            }
        }
        return sums;
    }

    public static int[] union(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            int t = 0;
            for (int k = 0; k < arr1.length; k++) {
                if (arr2[j] == arr1[k]) {
                    t++;
                    break;
                }
            }
            if (t == 0) {
                System.out.println(arr2[j]);
            }
        }
        return null;
    }

    public static int[] intersection(int[] a, int[] b) {
        int[] it = new int[5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == a[j]) {
                    break;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] x = new int[] { 5, 3, 2, 6, 1 };
        int[] y = new int[] { 1, 2, 3, 4, 7 };
        int[][] m = new int[][] { { 2, 4, 1 }, { 3, 0, 9 }, { 8, 7, 6 } };
        System.out.println(max(new int[] { 4, 5, 9, 8, 10 }));
        System.out.println(min(new int[] { 4, 5, 9, 8, 10 }));
        Set.sort(x);
        int[] sum = arraySu(m);
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
        int n[] = Set.union(x, y);
        for (int t = 0; t < n.length; t++) {
            System.out.print(n[t] + ", ");
        }
        int mm[] = intersection(x, y);
        for (int j = 0; j < m.length; j++) {
            System.out.println(m[j]);
        }
    }
}