package arrays;

public class MaximumSum {

    public static void printMaxSum(int arr[]){
        int cs =0;
        int ms = Integer.MIN_VALUE;
        for (int i=0; i< arr.length;i++){
            cs = cs + arr[i];
            if (cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Maximum sum = "+ms);
    }

    public static void main(String[] args) {

        int[] arr ={1,4,-1,-3,6,8};
        printMaxSum(arr);

    }
}
