package Sorting;

// Time compexity of bubble sort is O(n^2)
// No space complexity bcz we are not using any extra space (Space complexity is constant) = O(1)
public class BubbleSort {
    void sortBubble(int[] array) {
        // Using loop for the iterations
        for (int turn = 0; turn < array.length - 1; turn++) {
            for (int j = 1; j < (array.length - 1) - turn; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    int BinarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

int [] array = {1,43,55,232,5664,64223,-12,-23,0,-423};
int target = 232;


    }

}
