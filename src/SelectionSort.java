public class SelectionSort {

    public static void main(String[] args) {
        int[] nums = {2,6,1,4,9,23,16}; // array
        int size = nums.length;//length of array in size variable
        int temp = 0; //variable for sorting
        int minIndex = -1;

        System.out.println("before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for(int i = 0; i < size-1; i++) {
            minIndex = i;
            for(int j = i + 1; j < size; j++){
              if(nums[minIndex] > nums[j])
                  minIndex = j;
            }

            temp = nums[minIndex]; // this is where the swap is done
            nums[minIndex] = nums[i];
            nums[i] = temp;

            System.out.println();

            for(int num : nums) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.println("after sorting");
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
