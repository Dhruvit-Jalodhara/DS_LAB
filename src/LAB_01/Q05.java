package LAB_01;

public class Q05 {
    public static void main(String[] args) {
        int[] arr = {64,25,86,32,68,36,76,86,92,70,15,97};

        int min = arr[0] , max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];

            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println("Max : "+max);
        System.out.println("Min : "+min);

    }
}
