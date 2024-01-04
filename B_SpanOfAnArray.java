import java.util.*;

public class B_SpanOfAnArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //Taking the input size to create an array
        int arraySize = scn.nextInt();

        //Creating an array of size arraySize
        int[] arr = new int[arraySize];

        //Running a for loop to take the elements of array and insert it into arr
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the element of Array");
            arr[i] = scn.nextInt();
        }

        //Initializing the Minimum and Maximum of arr as the first element
         int min = arr[0];
         int max = arr[0];

        //Running a for loop to iterate each element of array and perform comparision operation on it
        for(int i=0; i<arr.length; i++){

            //Comparing the target element with min, if it's less than min than assigning target element's value to min
            if(arr[i] < min){
                min = arr[i];
            }

            //Comparing the target element with max, if it's greater than max than assigning target element's value to max
            if(arr[i] > max){
                max = arr[i];
            }
        }

        //Calculating the Span of an array which is equivalent to the Difference between the Maximum and Minimun element of Array
        int span = max - min;

        System.out.print("Span of an array = " + span);
    }
}
