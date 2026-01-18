package LAB_01;

public class Q07 {
    public static void main(String[] args) {
        int[] arr = {64,25,86,32,68,36,76,86,92,70,15,97};
        int target = 15;

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                ans = i;
        }

        System.out.println("target is at index : "+ans);
    }
}
