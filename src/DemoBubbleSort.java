import java.sql.SQLOutput;

public class DemoBubbleSort {
    //In bubble sort you compare 2 values and swap.

    public static void main(String[] args) {
    //create an unsorted array of integer to be sorted
        int[] nums = {6,5,3,8,7,4};
        int size = nums.length; //initialization of size and temp variables
        int temp = 0;

        System.out.println("Array before sort");
        //iterate over nums using enhanced for loop
        for(int num : nums){
            System.out.print(num + " ");//print out the unsorted arrays
        }
        // using the basic for loop iterate over the size of array using the index
        for(int i = 0; i < size; i++) { //this forloop is responsible for the number of iterations or passes

            for (int j = 0; j < size-i-1; j++) { //the inner loop is responsible for the swapping
                if(nums[j] > nums[j+1]) { //if 1st value is > sec value then swap
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.println();
            for(int num : nums){
                System.out.print(num + " "); //this prints out the steps of how bubble sort takes 2 values and swap them over iterations until its all sorted.
            }
        }

        System.out.println();
        System.out.println("after sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();

    }

}
