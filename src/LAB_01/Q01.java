package LAB_01;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers of rows = ");
        int rows = sc.nextInt();

        System.out.print("Enter the numbers of cols = ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // input in row major
        System.out.println("enter the elements of array : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // output in row major
        System.out.println("Elements of array : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
