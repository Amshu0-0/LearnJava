
// import java.util.*;
// public class advpatt {

//     public static String hollowRectangle(int length, int breadth) {
//         String ans = "";
//         for (int index = 1; index <= length; index++) {
//             if ((index == 1) || index == length) {
//                 for (int jndex = 1; jndex <= breadth; jndex++) {
//                     ans += "* ";
//                 }
//             } else {
//                 for (int jndex = 1; jndex <= breadth; jndex++) {
//                     if ((jndex == 1) || jndex == breadth) {
//                         ans += "* ";
//                     } else {
//                         ans += "  ";
//                     }
//                 }
//             } ans += "\n";
//         }
//         return ans;
//     }

//     public static void hollow_rectangle(int totRows, int totCols) {
//         for (int row = 1; row <= totRows; row++ ) {
//             for (int col = 1; col <= totCols; col++) {
//                 if (row == 1 || row == totRows || col == 1 || col == totCols) {
//                     System.out.print("0");
//                 } else {
//                     System.out.print(" ");
//                 }  
//             }
//             System.out.println();
//         }
//     }

//     public static void main (String args[]) {

//         Scanner sc = new Scanner (System.in);
//         System.out.print("Give me the length of the rectangle. ");
//         int length = sc.nextInt();

//         System.out.print("Give me the breadth of the rectangle. ");
//         int breadth = sc.nextInt();

//         System.out.println(hollowRectangle(length, breadth));

//         hollow_rectangle(3, 4);
//     }
// }

// import java.util.*;

// public class advpatt {

//     public static String halfPyramid(int row) {
//         String ans = "";
//         for (int index = 1; index <= row; index++) {
//             for (int space = 1; space <= row; space++) {
//                 if (space <= row - index) {
//                     ans += " ";
//                 } else {
//                     ans += "*";
//                 }
//             }
//             ans += "\n";
//         }
//         return ans;
//     }
//     public static void main (String args[]) {
//         System.out.println(halfPyramid(4));
//     }
// }

// import java.util.*;

// public class advpatt {

//     public static String halfPyramid(int row) {
//         String ans = "";
//         for (int index = 1; index <= row; index++) {

//             for (int space = 1; space <= row - index; space++) {
//                 ans += " ";
//             }
//             for (int star = 1; star <= index; star++) {
//                 ans += "*";
//             }
//             ans += "\n";
//         }
//         return ans;
//     }
//     public static void main (String args[]) {
//         System.out.println(halfPyramid(4));
//     }
// }

// import java.util.*;

// public class advpatt {

//     public static void numHalfPyramid(int rows) {
//         for (int index = 0; index < rows; index++) {
//             for (int jndex = 1; jndex <= rows - index; jndex++) {
//                 System.out.print(jndex);
//             }
//             System.out.println();
//         }
//     }

//     public static void main (String args[]) {
//         numHalfPyramid(5);
//     }

// }

// import java.util.*;
// public class advpatt {

//     public static void floydTriangle(int rows) {
//         int number = 1;
//         for (int index = 1; index <= rows; index++) {
//             for (int jndex = 1; jndex <= index; jndex++) {
//                 System.out.print(number + " ");
//                 number += 1;
//             }
//             System.out.println();
//         } 
//     }

//     public static void main (String args[]) {
//         floydTriangle(5);
//     }
// }

// import java.util.*;
// public class advpatt {

//     public static void zeroOneTriangle(int row) {
//         boolean isOne = true;
//         boolean isZero = true;

//         for (int index = 1; index <= row; index++) {
//             for (int jndex = 1; jndex <= index; jndex++){

//                 if (index % 2 == 1) {
//                     if (isOne) {
//                         System.out.print(1 + " ");
//                         isOne = false;
//                     } else {
//                         System.out.print(0 + " ");
//                         isOne = true;
//                     }
//                 } else {
//                     if (isZero) {
//                         System.out.print(0 + " ");
//                         isZero = false;
//                     } else {
//                         System.out.print(1 + " ");
//                         isZero = true;
//                     }
//                 }
//             }

//             System.out.println();
//             isOne = true;
//             isZero = true;
//         }
//     }

//     public static void main (String args[]) {
//         zeroOneTriangle(5);
//     }
// }

// import java.util.*;

// public class advpatt {

//     public static void butterfly (int row) {
//         //top half
//         for (int index = 1; index <= row; index++){
//             // stars = i
//             for (int jndex = 1; jndex <= index; jndex++) {
//                 System.out.print("* ");
//             }
//             //spaces = 2(n-1)
//             for (int jndex = 1; jndex <= 2 * (row - index); jndex++) {
//                 System.out.print("  ");
//             }
//             // stars = i
//             for (int jndex = 1; jndex <= index; jndex++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//         //bottom half
//         for (int index = row; index >= 1; index--){
//             // stars = i
//             for (int jndex = 1; jndex <= index; jndex++) {
//                 System.out.print("* ");
//             }
//             //spaces = 2(n-1)
//             for (int jndex = 1; jndex <= 2 * (row - index); jndex++) {
//                 System.out.print("  ");
//             }
//             // stars = i
//             for (int jndex = 1; jndex <= index; jndex++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main (String args[]) {
//         butterfly(5);
//     }
// }

// import java.util.*;
// public class advpatt {

//     public static void rhombus(int row) {
//         for (int index = 1; index <= row; index++){
//             for (int jndex = 1; jndex <= row - index + 1; jndex++) {
//                 System.out.print(" ");
//             }
//             for (int jndex = 1; jndex <= row; jndex++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         rhombus(5);
//     }
// }

// import java.util.*;
// public class advpatt {
//     public static void hollowRhombus(int row){
//         for (int index =1; index <= row; index++) {
//             for (int jndex = 1; jndex <= row - index + 1; jndex++) {
//                 System.out.print(" ");
//             }
//             for (int jndex = 1; jndex <= row; jndex++) {
//                 if (jndex == 1 || jndex == row || index == 1 || index == row) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String args[]) {
//         hollowRhombus(5);
//     }
// }

// import java.util.*;
// public class advpatt {

//     public static void diamond(int row){
//         for (int index = 1; index <= row; index++) {
//             for (int jndex = 1; jndex <= row - index; jndex++) {
//                 System.out.print("  ");
//             }
//             for (int jndex = 1; jndex <= 2 * index - 1; jndex++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//         for (int index = row; index >= 1; index--) {
//             for (int jndex = 1; jndex <= row - index; jndex++) {
//                 System.out.print("  ");
//             }
//             for (int jndex = 1; jndex <= 2 * index - 1; jndex++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         diamond(4);
//     }
// }