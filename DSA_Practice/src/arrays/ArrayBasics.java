package arrays;

import java.util.Scanner;

// in that class cover all basics of array
// create, input, Output, Update
public class ArrayBasics {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Syntax
        // datatype arrayName[] = new dataType[size]

        // create array
        int arr[] = new int[10]; // array is static type ones you declare a size you can't able to change

        int number[] = {1,2,3,4};

        String[] fruits = {"mango", "orange", "apple"};

        // get input in array

        int marks[] = new int[100];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Phy = "+marks[0]);
        System.out.println("Math = "+marks[1]);
        System.out.println("phy = "+marks[2]);

        int percentage = (marks[0] + marks[2] + marks[3]) / 3;
        System.out.println("percentage is = "+percentage+"%");

    }
}
