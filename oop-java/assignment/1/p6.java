/*Write a program in java to remove duplicate elements in an array. Eg: initial array:
[2,3,8,8,6,5,8,9,2,5,5], the output will be a sorted array i.e: [2,3,5,6,8,9].What is dynamic
method dispatch? Show with an example.*/

import java.util.ArrayList;

class p6 {

    public static void main(String args[]) {
        int arr[] = {2,3,8,8,6,5,8,9,2,5,5};

        p6 program = new p6();

        ArrayList<Integer> arr2 = program.remove_duplicates(arr);

        for (int item: arr2) {
            System.out.printf("%d ", item);
        }
    }

    boolean search(ArrayList<Integer> arr, int x) {
        boolean flag = false;
        for (int item: arr) {
            if (x == item) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    int[] sort(int[] arr) {
        int min; 
        for (int i = 0; i < arr.length - 1; i++) { 
            min = i; 
            for (int j = i + 1; j < arr.length; j++) { 
                if (arr[j] < arr[min]) {
                    min = j;
                }   
            } 
    
            if (min != i) { 
                int t = arr[min];
                arr[min] = arr[i];
                arr[i] = t;
            }
        }
        return arr;
    }

    ArrayList<Integer> remove_duplicates(int[] arr) {

        ArrayList<Integer> result = new ArrayList<Integer>();
    
        arr = sort(arr);

        for (int item: arr) {
            if (search(result, item) == false) {
                result.add(item);
            }
        }
        return result;
    }
}


