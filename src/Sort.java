import java.util.Comparator;
import java.util.Random;

import static java.lang.Integer.MAX_VALUE;

/**
 * Created by yasta on 19.06.2016.
 */
public class Sort {

    //-----------------------BogoSort O(n*n!) ---------------------------

    public static void bogoSort(int[] n) {
        while (!inOrder(n)) {
            shuffle(n);
        }
    }

    private static void shuffle(int[] n) {
        Random random = new Random();
        for (int i = 0; i < n.length; i++) {
            int swapPosition = random.nextInt(n.length);
            int temp = n[i];
            n[i] = n[swapPosition];
            n[swapPosition] = temp;
        }
    }

    private static boolean inOrder(int[] n) {
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] > n[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //-----------------------StupidSort O(n^3)---------------------------

    public static void stupidSort(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i + 1] < arr[i]) {
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
                i = 0;
            } else i++;
        }
    }

    //-----------------------BubbleSort O(n^2) ---------------------------
    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //-----------------------CocktailSort O(n^2) ---------------------------

    public static void cocktailSort(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            for (int i = r; i > l; i--) {
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i - 1, i);
                }
            }
            l++;
            for (int i = l; i < r; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
            r--;
        }
    }

    //-----------------------InsertSort O(n^2) ---------------------------

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                } else break;
            }
        }
    }

    //-----------------------InsertSort O(n^2) ---------------------------

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    //-----------------------GnomeSort O(n^2)---------------------------

    public static void gnomeSort(int[] a) {
        int i = 1;
        while (i < a.length) {
            if (i == 0 || a[i - 1] <= a[i])
                i++;
            else {
                int temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;
                i--;
            }
        }
    }

    //-----------------------StoogeSort O(n^2.71) ---------------------------
    public static void stoogeSort(int[] arr) {
        stoogeAlgoritm(arr, 0, arr.length - 1);
    }

    private static void stoogeAlgoritm(int[] arr, int left, int right) {
        int temp;
        int k;
        if (arr[left] > arr[right]) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        if ((left + 1) >= right) {
            return;
        }
        k = ((right - left + 1) / 3);
        stoogeAlgoritm(arr, left, right - k);
        stoogeAlgoritm(arr, left + k, right);
        stoogeAlgoritm(arr, left, right - k);

    }

    //-----------------------QuickSort O(n*log(n))---------------------------

    public static void quickSort(int[] arr) {
        qSort(arr, 0, arr.length - 1);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void qSort(int[] array, int l, int r) {
        Random rand = new Random();
        int i = l;
        int j = r;
        int x = array[l + rand.nextInt(r - l + 1)];
        while (i <= j) {
            while (array[i] < x) {
                i++;
            }
            while (array[j] > x) {
                j--;
            }
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if (l < j) {
            qSort(array, l, j);
        }
        if (i < r) {
            qSort(array, i, r);
        }
    }

    //-----------------------HeapSort O(n*log(n))---------------------------

    public static void heapSort(int[] arr) {
        int i;
        int temp;

        for (i = arr.length / 2 - 1; i >= 0; i--) {
            shiftDown(arr, i, arr.length);
        }

        for (i = arr.length - 1; i >= 1; i--) {
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            shiftDown(arr, 0, i);
        }
    }

    private static void shiftDown(int[] arr, int i, int j) {
        boolean done = false;
        int maxChild;


        while ((i * 2 + 1 < j) && (!done)) {
            if (i * 2 + 1 == j - 1) {
                maxChild = i * 2 + 1;
            } else if (arr[i * 2 + 1] > arr[i * 2 + 2]) {
                maxChild = i * 2 + 1;
            } else {
                maxChild = i * 2 + 2;
            }
            if (arr[i] < arr[maxChild]) {
                int temp = arr[i];
                arr[i] = arr[maxChild];
                arr[maxChild] = temp;
                i = maxChild;
                i = maxChild;
            } else {
                done = true;
            }
        }
    }

    //-----------------------MergeSort O(n*log(n))---------------------------

    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            int[] first = new int[list.length / 2];
            int[] second = new int[list.length - first.length];
            System.arraycopy(list, 0, first, 0, first.length);
            System.arraycopy(list, first.length, second, 0, second.length);

            mergeSort(first);
            mergeSort(second);

            merge(first, second, list);
        }
    }

    private static void merge(int[] first, int[] second, int[] result) {

        int iFirst = 0;
        int iSecond = 0;
        int j = 0;

        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
            } else {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
    }

    //-----------------------ShellSort O(n*log(n))---------------------------

    public static void shellSort(int[] arr) {
        int d[] = {1750, 701, 301, 132, 57, 23, 10, 4, 1, 0};
        int posD = 0;
        while (d[posD] != 0) {
            int curD = d[posD];
            for (int i = curD; i < arr.length; i++) {
                int value = arr[i];
                int j = i - curD;
                for (; j >= 0; j -= curD) {
                    if (arr[j] <= value)
                        break;
                    arr[j + curD] = arr[j];
                }
                arr[j + curD] = value;
            }
            posD++;
        }
    }

}
