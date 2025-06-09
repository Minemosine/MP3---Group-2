import java.util.Random;

public class InsertionSort {
    
     public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[1000];
        
        for (int i = 0; i < nums.length; i++){
            nums[i] = rand.nextInt(1000);
        }
        
        System.out.println("Before: ");
        printArray(nums);
        
        insertionSort(nums);
        
        System.out.println("\nAfter");
        printArray(nums);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
   }
}
