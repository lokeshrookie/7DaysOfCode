package Recursion.Level1;

public class PrintNumberTillN {
    public static void main(String[] args) {
        int number = 54;
        System.out.println(productOfDigits(number));
    }
    public static void printNto1(int number){
        if(number == 0) return;
        System.out.println(number);
        printNto1(number-1);
    }
    public static void print1toN(int number){
        if(number == 0) return;
        print1toN(number-1);
        System.out.println(number);
    }

 // factorial means product of Nto1 numbers
    public static int factorial(int number){
        if(number == 1 || number == 0) return 1;
        return number * factorial(number-1);
    }

    // sum of N to 1 numbers
    public static int sumOfNto1(int number){
        if(number == 0 ) return  0;
        return  number + sumOfNto1(number-1);
    }

    // sum of digits of a number
    public static int sumOfDigits(int number){
        if(number == 0) return number;
        return number%10 + sumOfDigits(number/10);
    }

    // product of digits of a number
    public static int productOfDigits(int number){
        if(number%10 == number) return number; // if last digit is 5, then it will return 5.
        return number%10 * productOfDigits((number/10));
    }

    
}
