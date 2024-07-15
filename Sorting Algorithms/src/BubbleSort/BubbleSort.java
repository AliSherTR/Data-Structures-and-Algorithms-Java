package BubbleSort;

public class BubbleSort {
    static void bubbleSort(int[] arr) {

        int i, j , temp , n = arr.length;
        boolean swapped = false;

        for(i = 0 ; i < n -1 ; i++) {
            swapped = true;

            for(j = 0 ; j < n - i - 1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if(swapped == false) break;
        }
    }

    public static void printArray(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}
