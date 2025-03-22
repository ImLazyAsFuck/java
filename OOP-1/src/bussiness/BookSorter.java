package bussiness;

import entity.Book;

import java.util.List;
import java.util.Random;

public class Method{
    public static void quickSort(List<Book> books, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(books, left, right);
            quickSort(books, left, pivotIndex - 1);
            quickSort(books, pivotIndex + 1, right);
        }
    }

    private static int partition(List<Book> books, int left, int right) {
        Book pivot = books.get(right);
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (books.get(j).compareTo(pivot) < 0) {
                i++;
                swap(books, i, j);
            }
        }
        swap(books, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
