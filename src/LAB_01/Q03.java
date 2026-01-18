package LAB_01;

public class Q03 {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Matrix Elements with Memory Addresses:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int address = System.identityHashCode(A[i]) + j * Integer.BYTES;
                System.out.println("A[" + i + "][" + j + "] = " + A[i][j] +" , Address = " + address
                );
            }
            System.out.println();
        }
        System.out.println("Observation:");
        System.out.println("Address of A[0][1] follows immediately after A[0][0],\n" + "demonstrating Row-Major logical storage.");
    }
}
