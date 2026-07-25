package arrays;

import javax.imageio.ImageReader;

public class LinearSearch {
    public static int linearSearch(int num[], int key){
        for (int i=0;i<num.length;i++){
            if (num[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] num = {1,2,4,6,8,90};
        int ans  = linearSearch(num, 4);
        System.out.println("kay in index if -1 kay not exist = "+ans);

    }
}
