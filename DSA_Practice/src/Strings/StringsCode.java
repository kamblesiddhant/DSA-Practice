package Strings;

public class StringsCode {

    public static boolean chechPelindrome(String str){
        boolean isPelindrome = true;

        for (int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) == str.charAt(str.length()-1-i)){
                isPelindrome = true;
            }else{
                isPelindrome = false;
            }
        }
        return isPelindrome;
    }

    public static float getPath(String path){

        int x = 0 , y = 0;

        for (int i = 0; i<path.length(); i++){
            char dir = path.charAt(i);

            //south
            if (dir == 'S'){
                y--;
            }
            //North
            else if (dir == 'N') {
                y++;
            }
            //West
            else if (dir == 'W') {
                x--;
            }else {
                x++;
            }
        }

        float X2 = x*x;
        float Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }

    public static String printSustring(String str, int si, int ei){

        String subString = "";

        for (int i = si; i<ei; i++){
            subString += str.charAt(i);
        }

        return subString;
    }

    public static void printLargestString(){
        String fruits[] = {"apple", "banana", "mango"};
        String largest = fruits[0];

        for (int i = 1; i<fruits.length; i++){
            if (largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }

    public static String toUpperCase(String str){

        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) == ' ' && i <str.length() - 1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compress(String str){
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count > 1){
                newStr.append(count.toString());
            }
        }

        return newStr.toString();
    }

    public static void main(String[] args){
//        System.out.println(chechPelindrome("mom"));
//        System.out.println(getPath("WNEENESENNN"));
//        System.out.println(printSustring("Siddhant", 0, 2));
//        printLargestString();
//        String str = "my name is siddhant ";
//        System.out.println(toUpperCase(str));

        String str = "aaabbbbbccc";
        System.out.println(compress(str));
    }
}

