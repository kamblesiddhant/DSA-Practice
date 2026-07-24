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

    public static void main(String[] args) {
        hollowRectangle(5);
    }
}
