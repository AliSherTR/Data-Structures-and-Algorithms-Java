package ArraysAdvance.Lecture17;

public class Questions {

    static void printArray(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swapArray(int [] arr , int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 1) given two integers swap them using a temporary variable
    static void swapTemp(int a , int b) {
        System.out.println("Original before swapping");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    // 2) given two integers a and b swap them without using a temp variable
    static void swap(int a , int b) {
        System.out.println("Original before swapping");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a = a + b;
        b = a - b;
        a = a -b;
        System.out.println("After swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    // 3) Reverse an array consisting on integers n
    static int[] reverseArray(int[] arr){
        int n = arr.length  ; int j = 0 ;
        int [] ans = new int[n];
        int i = n- 1;
        while (i >= 0) {
            ans[j++] = arr[i];
            i--;
        }
        printArray(ans);
        return ans;
    }

    // 4) Reverse the array without creating a new array
    static void reverseInplace(int[] arr) {
        int j = arr.length - 1;
        for(int i = 0 ; i < arr.length ; i++) {
            if(i < j) {
                swapArray(arr , i , j);
                j--;
            }
        }
        printArray(arr);
    }
     // 5) Rotate the given array "a" by k steps where k is a positive integer and the value of k can be greater than the length of the array
    static int[] rotate(int[] arr , int k) {
        int n = arr.length;
        int[] ans = new int[n];
        if(k==0) return arr;
        k = k % n;
        System.out.println(k);
        int j = 0;

        for(int i = n -k ; i < n ; i++) {
            ans[j++] = arr[i];
        }
        for(int i = 0 ; i < n - k ; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {

          int a = 3;
        int b = 9;
        int[] arr = {1 , 2 , 3 ,4  ,5 };
//        reverseArray(arr);
//        swapTemp(a , b);
//        swap( a , b);
//        reverseInplace(arr);
        int[] ans = rotate(arr, 5);
        printArray(ans);
    }
}
