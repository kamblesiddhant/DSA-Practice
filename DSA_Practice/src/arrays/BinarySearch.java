package arrays;

public class BinarySearch {

    public static int binarySearch(int[] num, int key){
        int mid = 0;
        int start = 0;
        int end = (num.length-1);

        for(int i=0; i<num.length; i++){
            mid = (start+end)/2;
           if (num[mid] == key){
               return mid;
           } else if (key > num[mid]) {
               start = mid + 1;
           }else {
               end = mid - 1;
           }
        }

        return mid;
    }

    public static void main(String[] args) {
        int[] num = {2,3,4,5,7,9};
        int ans = binarySearch(num, 9);
        System.out.println("the key is in "+ans+" index");
    }
}
