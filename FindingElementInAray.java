import java.util.*;

public class FindingElementInAray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Number to be Searched in Array");

        // Taking the element's value from user that we have to find in the array
        int num = scn.nextInt();

        System.out.println("Enter the Size of Array");

        //Taking the input size to create an array
        int arraySize = scn.nextInt();

        //Creating an array of size arraySize
        int[] arr = new int[arraySize];

        //Running a for loop to take the elements of array and insert it into arr
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element of Array");
            arr[i] = scn.nextInt();
        }

        //Initializing a variable to be returned based on the element's presence in array
        // Initially assigning the value = -1 to variable --> foundAt
        int foundAt = -1;

        // Checking that the element whose value is equal to the num, is present in the arr. If element is found assign its index to variable --> foundAt  and break the execution to return statement
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                foundAt = i;
                break;
            }
        }
        System.out.println("The searched element is found at index --> " + foundAt);
    }
}
