
// import java.util.*;
// public class con {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int age = sc.nextInt();
//         if (age > 18) {
//             System.out.println("You are an adult.");
//         }
//         else if ((age < 20) && (age > 12)) {
//             System.out.println("You are a teenager.");
//         }
//         else {
//             System.out.println("You are a child.");
//         }
//     }
// }

// import java.util.*;
// public class con {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("What is a? ");
//         int a = sc.nextInt();

//         System.out.print("What is b? ");
//         int b = sc.nextInt();

//         if (a >= b) {
//             System.out.println("A is greater. " + a);
//         } else {
//             System.out.println("B is greater. " + b);
//         }
//     }
// }

// import java.util.*;
// public class con {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Give me a number. ");
//         int num = sc.nextInt();

//         if (num % 2 == 0) {
//             System.out.println("you game me an even number.");
//         } else {
//             System.out.println("YOU GAVE ME AN ODD NUMBER.");
//         }
//     }
// }

// import java.util.*;
// public class con {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("What is your income ");
//         double income = sc.nextDouble();

//         if (income < 500000) {
//             System.out.println("0% tax");
//         } else if ((income < 1000000) && (income > 500000)){
//             System.out.println("20% tax");
//         } else {
//             System.out.println("30% tax");
//         }
//     }
// }


// import java.util.*;
// public class con {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("What is a? ");
//         int a = sc.nextInt();

//         System.out.print("What is b? ");
//         int b = sc.nextInt();

//         System.out.print("What is c? ");
//         int c = sc.nextInt();

//         if ((a > b) && (a >c)) {
//             System.out.println("A is greatest.");
//         } else if ((b > c)){
//             System.out.println("B is greatest.");
//         } else {
//             System.out.println("C is greatest.");
//         }
//     }
// }

// import java.util.*;
// public class con {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int larger = (a > b)?a:b;

//         System.out.println(larger);
//     }
// }

// import java.util.*;
// public class con {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int number = sc.nextInt();

//         boolean answer = (number % 2 == 0)?true:false;
//         String ans = (number % 2 == 0)?"even":"odd";

//         System.out.println(answer);
//         System.out.println(ans);
//     }
// }

// import java.util.*;
// public class con {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int marks = sc.nextInt();

//         String result = (marks >= 33) ? "PASS" : "FAIL";
//         System.out.println(result);
//     }
// }

// import java.util.*;
// public class con {
//     public static void main(String args[]) {
//         int number = 4;

//         switch (number) {
//             case 1 : System.out.println("Number is one.");
//                         break;
//             case 2 : System.out.println("Number is two.");
//                         break;
//             case 3 : System.out.println("Number is three.");
//                         break;
//             default : System.out.println("Number is not one, two, or three.");
//         }
//     }
// }

// import java.util.*;
// public class con {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);

//         System.out.print("What is a? ");
//         int a = sc.nextInt();

//         System.out.print("What is b? ");
//         int b = sc.nextInt();

//         System.out.print("What is ch? ");
//         String ch = sc.next();

//         switch (ch) {
//             case "+" : System.out.println(a + b);
//                         break;
//             case "-" : System.out.println(a - b);
//                         break;
//             case "/" : System.out.println(a / b);
//                         break;
//             case "*" : System.out.println(a * b);
//                         break;
//             case "%" : System.out.println(a % b);
//                         break;
//             default : System.out.println("ERROR");
//         }
//     }
// }


//WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative.
// import java.util.*;
// public class con {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Give me a number. ");
//         int num = sc.nextInt();

//         if (num < 0) {
//             System.out.println("Negative");
//         } else {
//             System.out.println("Positive");
//         }
//     }
// }

// printsYouhaveafeverifyourtemperatureis above 100 and otherwise prints You don't have a fever.
// import java.util.*;
// public class con {
//     public static void main (String args[]) {
//         double temp = 99.5;

//         if (temp > 100) {
//             System.out.println("You have a fever.");
//         } else {
//             System.out.println("You don't have a fever.");
//         }
//     }
// }

//WriteaJavaprogramtoinputweeknumber(1-7)andprintdayofweeknameusing switch case
// import java.util.*;
// public class con {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int num = sc.nextInt();

//         switch (num) {
//             case 1 : System.out.println("Today is Sunday.");
//                         break;
//             case 2 : System.out.println("Today is Monday.");
//                         break;
//             case 3 : System.out.println("Today is Tuesday.");
//                         break;
//             case 4 : System.out.println("Today is Wednesday.");
//                         break;
//             case 5 : System.out.println("Today is Thursday.");
//                         break;
//             case 6 : System.out.println("Today is Friday.");
//                         break;
//             case 7 : System.out.println("Today is Saturday.");
//                         break;
//             default : System.out.println("Today is not a day.");
//         }
//     }
// }

//WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthatyear is a leap year or not.
// import java.util.*;
// public class con {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int year = sc.nextInt();

//         if ((year % 4 == 0) && (year % 100 != 0)) {
//             System.out.println("Leap Year");
//         } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
//             System.out.println("Leap Year");
//         } else {
//             System.out.println("Not a leap year.");
//         }
//     }
// }