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

    static void printArray(int[] arr) {
        for(int i = 0 ; i< arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
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


    }
}
