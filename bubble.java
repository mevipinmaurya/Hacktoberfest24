import java.util.Arrays;

public class BubbleSort {

    // Method to perform bubble sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Outer loop for each element
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Track if any elements were swapped

            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap if the elements are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true; // Mark that a swap occurred
                }
            }

            // If no elements were swapped, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Call bubbleSort
        bubbleSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
