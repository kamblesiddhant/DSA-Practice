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

    public static void printIncrising(int range){
        if (range == 1){
            System.out.print(range+" ");
            return;
        }
        printIncrising(range-1);
        System.out.print(range +" ");
    }

    public static int fact(int n){

        if (n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n*fact(n-1);
        return fn;
    }

    public static int sumCalculate(int n){
        if( n == 1){
            return 1;
        }
        int sm = n + sumCalculate(n-1);
        return sm;
    }

    public static int fib(int n){
        if (n == 0 || n == 1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args){
        int range = 10;
//        printDec(range);
//        printIncrising(range);
//        System.out.print(fact(range));
//        System.out.print(sumCalculate(range));
        System.out.print(fib(range));
    }
}
