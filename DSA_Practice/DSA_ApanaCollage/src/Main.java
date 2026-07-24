import javax.swing.plaf.synth.SynthLookAndFeel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int factorial(int n){
        int f = 1;

        for (int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    }

    public static int binCoeff(int n, int r){

        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int bincoeff = n_fact / (r_fact * nmr_fact);
        return bincoeff;
    }

    public static boolean checkPrime(int n){

        boolean isPrime = true;
        for (int i=2; i<=n-1; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void primeInRange(int n){

        for(int i=1; i<=n;i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void binTodec(int bin){
        int dinnum = bin;
        int decNum = 0;
        int pow =0;
        while (bin > 0){
            int lastdeg = bin % 10;
            decNum = decNum + (lastdeg * (int)Math.pow(2, pow));
            bin = bin /10;
            pow++;
        }
        System.out.println("convert bin "+dinnum+" to decimal is "+decNum);
    }

    public static void decTobin(int dec){

        int decNum = dec;
        int pow = 0;
        int bin = 0;

        while (dec > 0){
            int rem = dec % 2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
            dec = dec/2;
        }
        System.out.println("Convert Dec "+decNum+" to bin "+bin);
    }

    public static void main(String[] args) {

//        int ans = binCoeff(5,2);
//        System.out.println(ans);
//        boolean isPrime =  checkPrime(10);
//        System.out.println("number is prime "+isPrime);
//        primeInRange(50);

        binTodec(110111);
        decTobin(55);
    }
}