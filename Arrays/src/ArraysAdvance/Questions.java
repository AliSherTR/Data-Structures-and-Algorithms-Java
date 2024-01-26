package ArraysAdvance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Questions {

    // 1: Given an array of size n and an integer k, find all elements in the array that appear more than n/k times.
    private void findNumberOfElement(int [] arr , int k) {
        if(k <= 0) return;
        int comparison = arr.length / k;
        List<Integer> temp = new ArrayList<Integer>();
        int count= 0;
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = i ; j < arr.length ; j++) {
                if(arr[j] == arr[i]) {
                    count++;
                }
            }
            if(count > comparison) {
                temp.add(arr[i]);
            }
            count = 0;
        }
        Collections.sort(temp);
        for (int i : temp) {
        System.out.print(i + " ");
        }

    }

    // 2- Given an integer N, find its factorial. return a list of integers denoting the digits
    // that make up the factorial of N.

    public void findFactorial(int n) {
        if(n <= 0) return;
        int factorial= 1;
        int i = 1;
        while (i <= n) {
            factorial = factorial * i;
            System.out.print(i + " ");
            i++;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Questions ob = new Questions();
        int[] arr_1 = {3, 1, 2, 2, 1, 2, 3, 3};
        ob.findNumberOfElement(arr_1, 4);
        System.out.println();
        int[] arr_2 = {9, 8, 7, 9, 2, 9, 7};
        ob.findNumberOfElement(arr_2 , 3);
        System.out.println();

        ob.findFactorial(5);
        System.out.println();
        ob.findFactorial(10);
    }
}
