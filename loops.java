
// import java.util.*;
// public class loops {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         System.out.print("Give me a number countdown. ");
//         int num = sc.nextInt();
//         int i = 0;
//         while (i <= num) {
//             System.out.println(i);
//             i += 1;
//         }
//     }
// }


// import java.util.*;
// public class loops {
//     public static void main (String args[]) {
//         int index = 0;
//         while (index < 10) {
//             System.out.println("Hello World." + index);
//             index += 1;
//         }
//     }
// }

// import java.util.*;
// public class loops {
//     public static void main(String args[]) {
//         int index = 1;
//         while (index <= 10) {
//             // System.out.print(index);
//             System.out.println(index);
//             index += 1;
//         }
//     }
// }

// import java.util.*;
// public class loops {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Give me a num. ");
//         int num = sc.nextInt();
//         int index = 1;

//         while (index <= num) {
//             System.out.println(index);
//             index += 1;
//         }
//     }
// }

// import java.util.*;
// public class loops {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Give me a num. ");
//         int num = sc.nextInt();
//         int index = 0;
//         int sum = 0;

//         while (index <= num) {
//             sum += index;
//             index += 1;
//         }
//         System.out.println(sum);
//     }
// }

// import java.util.*;
// public class loops {
//     public static void main (String args[]) {

//         for (int i = 1; i <= 3; i++){
//             System.out.println("Hello for loop");
//         }
//         System.out.println();

//         int i = 1;
//         while (i <= 3) {
//             System.out.println("Hello while loop");
//             i += 1;
//         }
//     }
// }

// import java.util.*;
// public class loops {
//     public static void main (String args[]) {
//         for (int i = 1; i <= 4; i++) {
//             System.out.println("* * * *");
//         }
//     }
// }


// import java.util.*;
// public class loops {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Give me a number. ");
//         String num = sc.next();

//         String ans = "";

//         for (int i = num.length() - 1 ; i >= 0; i--) {
//             ans += num.charAt(i);
//         }
//         System.out.println(ans);
//     }
// }

// import java.util.*;
// public class loops {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Give me a number.");
//         int num = sc.nextInt();

//         // for (int i = 0; i <= 3; i++) {
//         //     int lastNum = num % 10;
//         //     num = num / 10;
//         //     System.out.print(lastNum);
//         // }

//         while (num > 0) {
//             int lastNum = num % 10;
//             num = num / 10;
//             System.out.print(lastNum);
//         }
//     }
// }

// import java.util.*;
// public class loops {
//     public static void main (String args[]) {
//         for (int i = 1; i <= 5; i++) {
//             if (i == 3) {
//                 break;
//             }
//             System.out.println(i);            
//         }
//     }
// }


// import java.util.*;
// public class loops {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Give me a number. ");
//         int num = sc.nextInt();
//         System.out.println(num);

//         while (true) {
//             System.out.print("Give me a number. ");
//             num = sc.nextInt();
//             System.out.println(num);

//             if (num % 10 == 0) {
//                 break;
//             }
//         }
//         System.out.print("Finally :)");

//     }
// }

// import java.util.*;
// public class loops {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Give me a number.");
//         int num = sc.nextInt();

//         for (int i = 1; i <= num; i ++) {
//             if ((i == 3) || (i == 5)) {
//                 continue; //skipping 3 and 5 
//             }
//             System.out.println(i);
            
//         }
//     }
// }

// import java.util.*;
// public class loops {
//     public static void main (String args[]){
//         Scanner sc = new Scanner (System.in);

//         do {
//             int n = sc.nextInt();

//             if (n % 10 == 0) {
//                 continue ;
//             }

//             System.out.println(n);
//         } while (true);
//     }
// }


// import java.util.*;
// public class loops{
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int num = sc.nextInt();

//         boolean isPrime = true;

//         for (int i = 2; i <= Math.sqrt(num); i ++) {
//             if (num % i == 0) {
//                 isPrime = false;
//             }
//         }

//         if (isPrime == true) {
//             System.out.println("Number is prime.");
//         } else {
//             System.out.println("Number is not prime.");
//         }
//     }
// }

// public class loops {
//     public static void main (String args[]) {
//         for (int i = 0; i <5; i++) {
//             System.out.println("Hello");
//             i += 2;
//         }
//     }
// }

// Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers

// import java.util.Scanner;
// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Give me a number. ");
//         int num = sc.nextInt();

//         int index = 1;
//         int evenSum = 0;
//         int oddSum = 0;

//         while (index <= num) {
//             if (index % 2 == 0) {
//                 evenSum += index;
//             } else {
//                 oddSum += index;
//             }
//             index += 1;
//         }
//         System.out.println("Odd sum is " + oddSum);
//         System.out.println("Even sum is " + evenSum);
//     }
// }

// Write a program to find the factorialof any number entered by the user.
// import java.util.*;
// public class loops {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Give me a number.");
//         int num = sc.nextInt();
//         int index = 1;
//         int factorial = 1;

//         while (index <= num) {
//             factorial *= index;
//             index += 1;
//         }
//         System.out.println("Factorial is " + factorial);
//     }
// }

// WriteaprogramtoprintthemultiplicationtableofanumberN,enteredbytheuser
// import java.util.*;
// public class loops {
//     public static void main (String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int num = sc.nextInt();

//         for (int index = 1; index <= 10; index++) {
//             System.out.println(num + "*" + index + "=" + (num * index));
//         }
//     }
// }

