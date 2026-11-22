package resursion;

public class RecursionBasics {

    public static void printDec(int range){

        if (range==1){
            System.out.print(range);
            return;
        }

        System.out.print(range+" ");
        printDec(range-1);
    }

    public static void main(String[] args){
        int range = 10;
        printDec(range);

    }
}
