package SelectionSort;

public class SelectionSort {

    

    public void sort(int [] arr) {
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++) {
        int min_index = i;
        // find the minimum element
        for(int j = i + 1; j < n ; j++) {
            if (arr[j] < arr[min_index]) {
                min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }



//


    void printArray(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        ob.printArray(arr);
    }
}
