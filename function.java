import java.util.*;

public class function {

    public static void printHello() {
        System.out.println("Hello World!!");
    }

    public static void printUserName(String name) {
        System.out.println("Hello " + name);
        System.out.println("Nice to meet you.");
    }

    public static void askUserName() {
        Scanner sc = new Scanner (System.in);
        System.out.print("What is your name? ");
        String name = sc.next();
        System.out.println("Hello " + name + ".");
    }

    public static int askAge() {
        Scanner sc = new Scanner (System.in);
        System.out.print("What is your age? ");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old.");
        return age;
    }

    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1);
        System.out.println(num2);
    }

    public static int product(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }

    public static int factorial(int num) {
        int ans =1;
        if (num < 0) {
            return (0);
        } for (int index = 1; index <= num; index++) {
            ans *= index;
        }
        return ans;
    }

    public static int bico(int num, int r){
        int coef = 1;
        int num_facto = factorial(num);
        int r_facto = factorial(r);
        int diff_facto = factorial(num - r);

        coef = num_facto / (r_facto * diff_facto);
        return coef;
    }

    public static int sum (int a, int b) {
        return a + b;
    }

    public static int sum (int a, int b, int c) {
        return a + b + c;
    }

    public static double sum (double a, double b) {
        return (a + b);
    }

    // public static boolean isPrime(int num) {
    //     for (int index = 2; index <= num -1 ; index++) {
    //         if (num % index == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // optimized solution;
    public static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }

        for (int index = 2; index <= Math.sqrt(num); index++) {
            if (num % index == 0){
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNum(int num){

        //going from 1 to n
        for (int index = 1; index <= num; index++) {
        
            // check if number is prime and print int;
            if (isPrime(index)){
                System.out.println(index);
            }
        }
    }


    public static void printCompNum(int num){

        //going from 1 to n
        for (int index = 1; index <= num; index++) {
            
            // check if number is prime and print int;
            if (! isPrime(index)){
                System.out.println(index);
            }
        }
    }

    public static void reverseNum(int num) {
        while (num > 0){
            int lastNum = num % 10;
            System.out.print(lastNum);
            num = num / 10;
        }
        System.out.println();
    }

    public static int binToDec(int num) {

        int ans = 0;
        int index = 0;

        while (num > 0) {
            int last_num = num % 10; // getting the last digit
            int toDecimal = (int) (last_num * Math.pow(2, index)); // conversion
            ans += toDecimal;

            num = num/10; // removing last digit
            index += 1;
        }
        return ans;
    }

    public static int dectoBin(int num) {
        int ans = 0;
        int index = 0;

        while (num > 0) {
            int lastNum = num % 2;
            ans += (int) (lastNum * (Math.pow(10, index)));
            
            num = num / 2;
            index += 1;
        }
        return ans;
    }

    // Write a Java method to compute the average of three numbers.
    public static int avgOf3(int a, int b, int c) {
        return ((a + b + c) / 3);
    }

//     Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test your
// method.
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(int num){
        int palindrome = num;
        int reverse = 0;

        while (palindrome != 0) {
            int lastNum = palindrome % 10;
            reverse = reverse * 10 + lastNum;
            palindrome = palindrome / 10;
        }
        if (num == reverse) {
            return true;
        } return false;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int last_num = num % 10;
            sum += last_num;
            num = num/10;
        }
        return sum;
    }


    public static void main(String[] args) {
        // printHello();
        // printUserName("user");
        // askUserName();
        // askAge();
        // System.out.println(sum(3, 2));

        // Scanner sc = new Scanner (System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b);
        // System.out.println(sum);

        // // swap values in java
        // int a = 2;
        // int b = 3;

        // int temp = a;
        // a = b;
        // b = temp;

        // swap(5, 100);

        // int a = 2;
        // int b = 3;

        // int prod = product(a, b);
        // System.out.println(prod);

        // int number = 2;
        // int facto = factorial(number);
        // System.out.println(facto);

        // int bico_7_3 = bico(7, 3);
        // System.out.println(bico_7_3);

        // int bico_5_2 = bico(5, 2);
        // System.out.println(bico_5_2);

        // int sum_of_2 = sum(1,2);
        // int sum_of_3 = sum(1,2,3); 
        // System.out.println(sum_of_2);
        // System.out.println(sum_of_3);

        // double sum_of_double = sum(6.9,4.5);
        // System.out.println(sum_of_double);

        // System.out.println(isPrime(256));
        // System.out.println(isPrime(81));

        // System.out.println(isPrime(23));
        // System.out.println(isPrime(29));

        // System.out.println(isPrime(2));

        // printPrimeNum(20);
        // System.out.println();
        // printCompNum(10);

        // reverseNum(123456);

        // System.out.println(binToDec(1101));
        // System.out.println(binToDec(101));
        // System.out.println(binToDec(1000));

        // System.out.println(dectoBin(10));
        // System.out.println(dectoBin(13));
        // System.out.println(dectoBin(8));
    }
} 