package LAB_01;

public class Q08 {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int m = A.length;        // number of rows
        int n = A[0].length;     // number of columns
        int size = Integer.BYTES; // size of int = 4 bytes

        int i = 1; // row index
        int j = 2; // column index

        // Simulated base address
        int baseAddress = System.identityHashCode(A[0]);

        // Row-Major Address Calculation
        int rowMajorAddress =
                baseAddress + (i * n + j) * size;

        // Column-Major Address Calculation
        int columnMajorAddress =
                baseAddress + (j * m + i) * size;

        // Simulated "actual" address using row reference
        int actualAddress =
                System.identityHashCode(A[i]) + j * size;

        System.out.println("Base Address (A[0][0]) : " + baseAddress);
        System.out.println("Row-Major Address     : " + rowMajorAddress);
        System.out.println("Column-Major Address  : " + columnMajorAddress);
        System.out.println("Actual Address        : " + actualAddress);
    }
}
