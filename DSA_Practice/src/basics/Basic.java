package basics;

import java.util.*;

public class Basic {

    public static Boolean checkPrimeNum(int num){

        for (int i=2; i<num; i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int range){
        for (int i = 1; i<=range; i++){
            if (checkPrimeNum(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void binTodec(int bin){
        int pow = 0;
        int dec = 0;

        while (bin>0){
            int last = bin%10;
            dec = dec + (last * (int)Math.pow(2, pow));
            bin = bin/10;
            pow++;
        }
        System.out.println(dec);
    }

    public static void decToBin(int dec){

        int pow = 0;
        int bin = 0;

        while(dec>0){
            int rem = dec % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));

            pow++;
            dec = dec/2;

        }
        System.out.println(bin);
    }



    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int a = sc.nextInt();

//        primeInRange(a);
//        System.out.println(checkPrimeNum(a));
//        binTodec(a);
        decToBin(a);

    }

}
