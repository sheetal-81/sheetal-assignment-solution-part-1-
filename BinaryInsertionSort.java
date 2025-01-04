public class BinaryInsertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 2, 3}; // Unsorted array

        // Perform binary insertion sort
        binaryInsertionSort(arr);

        // Print sorted array
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void binaryInsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // Current element to be inserted
            int left = 0;
            int right = i - 1;

            // Perform binary search to find the correct position of key
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (key < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // Shift all elements to the right to make space for key
            for (int j = i - 1; j >= left; j--) {
                arr[j + 1] = arr[j];
            }

            // Insert the key at the correct position
            arr[left] = key;
        }
    }
}
