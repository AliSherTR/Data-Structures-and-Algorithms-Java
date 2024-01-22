package ArrayBasics;

public class Main {
    // 1: calculate the sum of all values in a given array
    static void calcSum(){
        int arr[] = { 3 ,5, 7 , 9 };
        int sum = 0;

        for(int el : arr) {
            sum += el;
        }
        System.out.println("The sum of all elements in the array are: " +sum);
    }

    // 2: find the greatest element in the array
    static void calcMax() {
        int arr[] = {1 , 12 ,34 ,45};
        int ans = 0;
        for( int el : arr) {
            if(el > ans) {
                ans = el;
            }
        }
        System.out.println("The greatest element in the array is: " +ans);

    }
    
    // 3: find the index of the given element in an array if not found return -1
    static void findIndex(){
        int arr[] = {1 ,3 ,4, 6 ,8};
        // int x = 10;
        int x = 8;
        int i = 0;


        for(int count = 0 ; count < arr.length ; count++) {
            if ( arr[count] == x ) {
                i = count;
                break;
            }
            else {
                i = -1;
            }
        }
        System.out.println("Returned index based on the search(linear search): " + i);
    }
    public static void main(String args[]){
        calcSum();
        calcMax();
        findIndex();
    }
}
