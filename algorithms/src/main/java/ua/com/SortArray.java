package ua.com;

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
}
