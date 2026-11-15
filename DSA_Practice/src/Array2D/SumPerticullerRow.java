package Array2D;

public class SumPerticullerRow {
    public static void main(String[] args){

        int sum = 0;
        int array[][] = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};

        for (int i =0; i<array[0].length; i++){
            sum += array[1][i];
        }
        System.out.print(sum);
    }

}
