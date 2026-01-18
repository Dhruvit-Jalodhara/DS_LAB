package LAB_01;

public class Q06 {
    public static void main(String[] args) {
        int[] arr = {64,25,86,32,68,36,76,86,92,70,15,97};

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        float avg = (float)sum / arr.length ;
        System.out.println("Average of all elements = " + avg);
    }
}
