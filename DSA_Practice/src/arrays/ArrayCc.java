package arrays;

public class ArrayCc {

    public static void update(int marks[]){
        for (int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
    }

    public static void main(String[] args) {

        int marks[] = {87, 78, 90};
        update(marks);

        for(int i =0; i<marks.length;i++){
            System.out.print(marks[i]+" "); // array pass by reference that reason print updated value
        }
    }
}
