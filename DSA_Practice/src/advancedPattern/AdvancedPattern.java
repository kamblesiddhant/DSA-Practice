package advancedPattern;

public class AdvancedPattern {

    public static void hollowRectangle(int range){

        for(int i=1; i<=range;i++){
            for(int j =1; j<=range; j++){
                if (i == 1|| j==1|| i==range || j==range){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void interted_roteted_half_pyramid(int range){
        for(int i=1; i<=range; i++){
            for (int j=1; j<=(range-i); j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        hollowRectangle(5);
        interted_roteted_half_pyramid(6);
    }
}
