package ArraysAdvance.Lecture16;

public class Questions {

    // 4) Program to find a unique number in a given array
    public int UniqueNumber(int[] arr) {
        int unique = 0;
        System.out.println(arr.length);
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


    public static void main(String[] args) {
        Questions ob = new Questions();
        int[] arr = {2 , 1, 2 , 3 , 1 ,4 };
        System.out.println("Unique Number in the array is: "  + ob.UniqueNumber(arr));
    }
}
