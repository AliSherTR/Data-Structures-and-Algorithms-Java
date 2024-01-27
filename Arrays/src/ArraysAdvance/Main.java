package ArraysAdvance;

import java.util.Scanner;
import java.util.Arrays;
public class Main {

    // count the number of occurrence of a given element in an array
    static int countOccurrences(int [] arr , int x) {
        int count = 0;
        for(int i : arr) {
            if(i == x) {
                count++;
            }
        }
        return count;
    }

    // find the last occurrence of an element in an array. If not found return -1
    static int lastIndex(int[] arr , int x) {
        int ans = -1;
        for(int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == x ) {
                ans = i;
            }
        }

        return ans;
    }

    // count the number of elements strictly greater than x
    static int countGreaterNumbers(int [] arr , int x) {
        int count = 0;
        for(int i : arr) {
            if(i > x) {
                count++;
            }
        }
        return count;
    }

    // check if a given array is sorted or not, if sorted return true , otherwise return false
    static boolean isSorted(int [] arr) {
        boolean sorted = false;
        for(int i = 1; i < arr.length ; i++) {
            if(arr[i] >= arr[i - 1]) {
                sorted = true;
            }
            else {
                sorted = false;
                break;
            }
        }
        return sorted;
    }

    // find the smallest and largest element in the array and return a new array sorted with smallest and largest element only
    static int[] findSmallestAndLargest(int [] arr) {
        Arrays.sort(arr);
        int[] ans = { arr[0] , arr[arr.length - 1] };
        for (int i = 0 ; i < ans.length ; i++ ){
            System.out.print(ans[i] + " ");
        }
        return ans;
    }

//    Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array.
//    It is given that all array elements are distinct.
//    Note :-  l and r denotes the starting and ending index of the array.
     static int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }

        int smallest = arr[k-1];

        return smallest;
    }

    static void printArray(int[] arr) {
        for(int i = 0 ; i< arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 8;
        arr[4] = 7;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the elements in the array");
//        for(int i = 0 ; i< arr.length ; i++) {
//            arr[i] = sc.nextInt();
//        }


        // making a shallow copy of the array
//        int[] arr_2 = arr;

//        System.out.println("Original array: ");
//        printArray(arr);
//        System.out.println();
//        System.out.println("Copied Array: ");
//        printArray(arr_2);

        // making changes to a copied array
//        arr_2[0] = 0;
//        arr_2[1] = 0;
//        System.out.println("Original Array after changing the copied array: ");
//        printArray(arr);
//        System.out.println();
//        System.out.println("Copied Array after changing the copied array: ");
//        printArray(arr_2);

        //  OUTPUT:
        /* Original array:
        1 2 3 4 5
        Copied Array:
        1 2 3 4 5 Original Array after changing the copied array:
        0 0 3 4 5
        Copied Array after changing the copied array:
        0 0 3 4 5 */
        // but we don't want the original array to change

        // making a deep copy of the original array
//        int[] arr_2 = arr.clone();
//        arr_2[0] = 0;
//        arr_2[1] = 0;
//        System.out.println("Original Array after changing the copied array: ");
//        printArray(arr);
//        System.out.println();
//        System.out.println("Copied Array after changing the copied array: ");
//        printArray(arr_2);

        //OUTPUT: 
        /* Original Array after changing the copied array:
        1 2 3 4 5
        Copied Array after changing the copied array:
        0 0 3 4 5 */


//        making a deep copy of array using Arrays.copyOf(); method from array class
//        int [] arr_2 = Arrays.copyOf(arr , arr.length);
//        printArray(arr);
//        System.out.println();
//        printArray(arr_2);
//
//        arr_2[0] = 0;
//        arr_2[1] = 0;
//        System.out.println();
//        printArray(arr_2);
//        System.out.println();
//        printArray(arr);
        System.out.println("No of occurrences: " +  countOccurrences(arr , 1));
        System.out.println("Last index of 1 in array is: " + lastIndex(arr , 1));
        System.out.println("Last index of 10 in array is: " + lastIndex(arr , 10));
        System.out.println("There are total " + countGreaterNumbers(arr, 1) + " numbers in the array which are greater than 1");
        System.out.println("There are total " + countGreaterNumbers(arr, 10) + " numbers in the array which are greater than 10");
        System.out.println(("Is the given array sorted: ") + isSorted(arr));
        int [] arr_2 = {1, 5, 8 ,1 ,3 ,2};

        System.out.println(("Is the given array sorted: ") + isSorted(arr_2));


        findSmallestAndLargest(arr);
        System.out.println();
        int new_arr[] = {7 ,10 , 4  , 3  ,20 , 15};
        System.out.println("The smallest element from the left is : " + kthSmallest(new_arr  , 3));

        int[] arr_3 = {7,  10 , 4,  20  ,15 };
        System.out.println("The smallest element from the left is : " + kthSmallest(arr_3  , 4));


    }
}
