package ArraysAdvance.Lecture16;

public class Questions {
    // 1) Find the total number of pairs in a given array whose sum is equal to a given value x
    public int TwoSum(int[] arr , int x) {
        int count = 0;
        for(int i = 0 ; i < arr.length ;i++ ){
            for(int j = i + 1 ; j < arr.length ; j++) {
                if(arr[i] + arr[j] == x) {
                    count++;
                }
            }
        }
        return count;
    }

    // 2) Program to find the number of triplets in an array whose sum is equal to a given value x

    public int TripletSum(int[] arr , int x) {
        int count = 0;

        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = i + 1 ; j < arr.length ; j++) {
                for(int k = j + 1 ; k < arr.length ; k++) {
                    if(arr[i] + arr[j] + arr[k] == x) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    // 3) Program to find a unique number in a given array
    public int UniqueNumber(int[] arr) {
        int unique = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = i + 1 ; j < arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                    break;
                }
            }
            for(int k = 0 ; k < arr.length ; k++ ) {
                if(arr[k] > 0) {
                    unique = arr[k];
                }
            }
        }
        return unique;
    }
    // 4) Program to find the second-largest element in a given array
    public int findLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] > max) {
                max = arr[i];

            }
        }
        return max;
    }
    public int secondLargest(int [] arr) {
        int max = findLargest(arr);
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = findLargest(arr);
        return secondMax;
    }

    // 5) for an array of integers return the first value that is repeating
    public int repeatingValue(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = i + 1 ; j < arr.length ; j++) {
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        Questions ob = new Questions();
        int[] arr_1 = {1 ,1 ,3 , 2 , 2 };
        System.out.println("The total pairs in the array whose sum is 3 are: " + ob.TwoSum(arr_1 , 3));
        int[] arr_2 = {1 ,1 ,2 , 3 , 1 };
        System.out.println("The total Triplets in the array whose sum is 3 are: " + ob.TripletSum(arr_2 , 3));
        int[] arr_3 = {2 , 1, 2 , 3 , 1 ,4 };
        System.out.println("Unique Number in the array is: "  + ob.UniqueNumber(arr_3));
        int[] arr_4 = {8 ,12 , 14 ,55 ,62};
        System.out.println("Second Largest element in the given array is: " + ob.secondLargest(arr_4) );
        int [] arr_5 = { 1 , 2, 3 ,4 ,1};
        System.out.println("The first repeating value in the given array is: " + ob.repeatingValue(arr_5));

    }
}
