
// import java.util.*;

// public class arrays {

//     public static int findIndexLinearSearch (int[] numList, int num) {

//         for (int i = 0; i <= numList.length; i++) {
//             if (numList[i] == num) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     // public static int findIndexBinarySearch (int [] numList, int num) {

//     //     int left_index = 0;
//     //     int right_index = numList.length - 1;
        

//     //     while (left_index <= right_index) {
//     //         int middle = (left_index + right_index) / 2;

//     //         if (numList[middle] < num) {
//     //             left_index = middle + 1;
//     //         } else if (numList[middle] > num) {
//     //             right_index = middle - 1;
//     //         } else {
//     //             return middle;
//     //         }
//     //     }
//     //     return -1;
//     // }

//     public static int largestNum (int[] numList) {
//         int biggest = Integer.MIN_VALUE;

//         for (int i =0; i < numList.length; i++) {
//             if (numList[i] > biggest) {
//                 biggest = numList[i];
//             }
//         }
//         return biggest;
//     }

//     public static int smallestNum(int[] numList) {
//         int smallest = Integer.MAX_VALUE;

//         for (int index =0; index < numList.length; index++) {
//             if (numList[index] < smallest) {
//                 smallest = numList[index];
//             }
//         }
//         return smallest;
//     }

//     public static int binarySearch(int[] sortedList, int num) {
//         int left_index = 0;
//         int right_index = sortedList.length - 1;

//         while (left_index <= right_index){
//             int middle = (left_index + right_index) / 2;

//             if (sortedList[middle] < num) {
//                 left_index = middle + 1;
//             } else if (sortedList[middle] > num) {
//                 right_index = middle - 1;
//             } else {
//                 return middle;
//             }
//         }
//         return -1;
//     }

//     public static int [] reverse(int[] numList) {

//         int left_index = 0;
//         int right_index = numList.length - 1;

//         while (left_index <= right_index){
//             int temp = numList[left_index];
//             numList[left_index] = numList[right_index];
//             numList[right_index] = temp;

//             left_index += 1;
//             right_index -= 1;
//         }

//         return numList;
//     }

//     public static void pairs(int numList[]) {
//         for (int index = 0; index <= numList.length - 1; index++){
//             for (int jndex = index + 1; jndex <= numList.length - 1; jndex++) {
//                 System.out.println(numList[index] + " " + numList[jndex]);
//             }
//         }
//     }

//     public static void subArrays(int numList[]) {
//         for(int i = 0; i <= numList.length - 1; i++) {
//             int start = numList[i];
//             for (int j =i; j <numList.length; j++) {
//                 int end = j;
//                 for (int k = start; k<= end; k++) {
//                     System.out.print(numList[k] + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }

 

//     public static void main (String args[]) {
//         // int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
//         // System.out.println( findIndexLinearSearch(numbers, 10) );
//         // System.out.println( findIndexBinarySearch(numbers, 10) );

//         // int[] numList = {6, 5, 4, 3, 2, 1};
//         // System.out.println(largestNum(numList));
//         // System.out.println(smallestNum(numList));

//         // int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
//         // System.out.println(binarySearch(numbers, 12));

//         // int[] numList = {6, 5, 4, 3, 2, 1};
//         // System.out.println(binarySearch(numList, 25));

//         // int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
//         // System.out.println(Arrays.toString(reverse(numbers)));

//         // int[] numList = {6, 5, 4, 3, 2, 1};
//         // System.out.println(Arrays.toString(reverse(numList)));


//         // int[] numbers = {2, 4, 6, 8, 10};
//         // pairs(numbers);


//         int[] numbers = {2, 4, 6, 8, 10};
//         subArrays(numbers);

//     }
// }

// import java.util.*;
// public class arrays {

//     public static void subArray(int numbers[]) {
//         for (int i = 0; i <= numbers.length - 1; i++) {
//             int start = i;

//             for (int j = i; j <= numbers.length - 1; j++) {
//                 int end = j;
//                 for (start = i; start <= end; start++) {
//                     System.out.print(numbers[start]);
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }

//     public static void subArraysSum(int numbers[]) {
//         for (int i = 0; i <= numbers.length - 1; i++) {

//             for (int j = i; j <= numbers.length - 1; j++) {
//                 int subArraySum = 0;
//                 int end = j;

//                 for (int start = i; start <= end; start++) {
//                     subArraySum += numbers[start];
//                 }
//                 System.out.println(subArraySum);
//             }
//             System.err.println();
//         }
//     }

//     public static void subArraysMaxSum(int numbers[]) {
//         int subArrayMaxSum = Integer.MIN_VALUE;
//         for (int i = 0; i <= numbers.length - 1; i++) {

//             for (int j = i; j <= numbers.length - 1; j++) {
//                 int subArraySum = 0;
//                 int end = j;

//                 for (int start = i; start <= end; start++) {
//                     subArraySum += numbers[start];
//                 }
//                 if (subArrayMaxSum < subArraySum) {
//                     subArrayMaxSum = subArraySum;
//                 }
//             }
//         }
//         System.out.println(subArrayMaxSum);
//     }

//     public static void subArraysMinSum(int numbers[]) {
//         int subArrayMinSum = Integer.MAX_VALUE;

//         for (int i = 0; i<= numbers.length -1; i++) {

//             for (int j = i; j <= numbers.length - 1; j++) {
//                 int subArraySum = 0;

//                 for (int start = i; start <= j; start++) {
//                     subArraySum += numbers[start];
//                 } 
//                 if (subArraySum < subArrayMinSum)  {
//                     subArrayMinSum = subArraySum;
//                 } 

//             }
//         }
//         System.out.println(subArrayMinSum);
//     }

//     public static void main (String args[]) {
//         int[] numbers = {2, 4, 6, 8, 10};
//         subArray(numbers);
//         System.out.println();

//         subArraysSum(numbers);
//         System.out.println();

//         subArraysMaxSum(numbers);
//         System.out.println();

//         subArraysMinSum(numbers);
//         System.out.println();
//     }
// }


// import java.util.*;

// public class arrays {

//     public static int maxSubArraysum(int numbers[]) {
//         int maxSum = Integer.MIN_VALUE;
//         for (int i =0; i <= numbers.length - 1; i++) {

//             for (int j = i; j <= numbers.length-1; j++) {
//                 int subArraySum = 0;

//                 for (int start = i; start <= j; start++) {
//                     subArraySum += numbers[start];
//                 }
//                 System.out.println(subArraySum);
//                 if (subArraySum > maxSum) {
//                     maxSum = subArraySum;
//                 }
//             }
//         }
//         return maxSum;
//     }


//     public static void prefixSum(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int[] prefix = new int[numbers.length];

//         prefix[0] = numbers[0];

//         for (int i = 1; i <= prefix.length -1; i++) {
//             prefix[i] = prefix[i - 1] + numbers[i];
//         }

//         for (int i=0; i <= numbers.length-1; i++) {
//             int start = i;

//             for (int j=i; j<= numbers.length-1; j++) {
//                 int end = j;
//                 currSum = start == 0? prefix[end] : prefix[end] - prefix[start - 1];

//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println(maxSum);
//     }

//     public static void kadansAlgo(int numbers[]) {
//         int maxSum = Integer.MIN_VALUE;
//         int currSum = 0;

//         // check if all the elements inside of the array is negative?
//         // if yes return the smallest n

//         for(int i = 0; i<numbers.length; i++) {
//             currSum = Math.max(currSum + numbers[i], numbers[i]);
//             maxSum = Math.max(maxSum, currSum);
//         }
//         System.out.println(maxSum);
//     }



//     public static void main (String args[]) {

//         // int[] numbers = {1, -2, 6, -1, 3};
//         // System.out.println(maxSubArraysum(numbers));

//         // int[] numbers = {1, -2, 6, -1, 3};
//         // prefixSum(numbers);

//         int[] numbers = {-2, -3, 4, -1, -2, 1, 5, -3};
//         kadansAlgo(numbers);

//     }
// }

// trapping rain water

// public class arrays {

//     public static int trappedRainWater(int height[]) {

//         // calculate left max boundry
//         int leftMax[] = new int[height.length];
//         leftMax[0] = height[0];
//         for (int i = 1; i <height.length; i++) {
//             leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//         }

//         // calculate right max boundaty
//         int rightMax[] = new int[height.length];
//         rightMax[rightMax.length - 1] = height[height.length - 1];
//         for (int i = height.length - 2; i >= 0; i--) {
//             rightMax[i] = Math.max(height[i], rightMax[i + 1]);
//         }
//         int trappedWater = 0;

//         // loop
//         for (int i = 0; i < height.length; i++) {
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);
//             trappedWater += (waterLevel - height[i]);
//         }
//         return trappedWater;
//     }
    
//     public static void main(String[] args) {
//         int[] height = {4, 2, 0, 6, 3, 2, 5};
//         System.out.println(trappedRainWater(height));

//     }
// }

// public class arrays {

//     public static int buyAndSellStock(int prices[]) {

//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for (int i = 0; i < prices.length; i++) {
//             if (buyPrice < prices[i]) {
//                 int profit = prices[i] - buyPrice;
//                 if (profit > maxProfit) {
//                     maxProfit = profit;
//                 }
//             } else {
//                 buyPrice = prices[i];
//             }
//         }

//         return maxProfit;
//     }

//     public static void main(String[] args) {
//         int prices[] = {7, 1, 5, 3, 6, 4};
//         System.out.println(buyAndSellStock(prices));
//     }
// }


// import java.util.*;

// public class arrays {

//     public static boolean appearsTwice(int numbers[]) {
//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = i +1; j < numbers.length; j++) {
//                 if (numbers[i] == numbers[j]) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {

//         int[] nums = {1, 2, 3, 1};
//         System.out.println(appearsTwice(nums));

//         int[] numbers = {1, 2, 3, 4};
//         System.out.println(appearsTwice(numbers));

//         int[] numz = {1, 1, 1, 3, 3, 4, 4, 5, 2, 3, 1};
//         System.out.println(appearsTwice(numz));
//     }
// }