package ua.com.tools;

public class SortArray {
    public static void bubbleSort(int[] arr, SortingDirection sortingDirection) {
        switch (sortingDirection) {
            case ASC -> {
                boolean isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i] < arr[i - 1]) {
                            int temp = arr[i];
                            arr[i] = arr[i - 1];
                            arr[i - 1] = temp;
                            isSorted = false;
                        }
                    }
                }
            }
            case DESC -> {
                boolean isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i] > arr[i - 1]) {
                            int temp = arr[i];
                            arr[i] = arr[i - 1];
                            arr[i - 1] = temp;
                            isSorted = false;
                        }
                    }
                }
            }
        }
    }
    public static void quickSort(int[] arr, int from, int to) {

        if (from < to) {

            int divideIndex = partition(arr, from, to);

            quickSort(arr, from, divideIndex - 1);

            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
