import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by yasta on 19.06.2016.
 */
public class Driver {
    //Random arrays
    private static int[] array0 = new int[1000];
    private static int[] array1 = new int[10];//for BogoSort
    private static int[] array2 = new int[1000];
    private static int[] array3 = new int[1000];
    private static int[] array4 = new int[1000];
    private static int[] array5 = new int[1000];
    private static int[] array6 = new int[1000];
    private static int[] array7 = new int[1000];
    private static int[] array8 = new int[1000];
    private static int[] array9 = new int[1000];
    private static int[] array10 = new int[1000];
    private static int[] array11 = new int[1000];
    private static int[] array12 = new int[1000];
    private static int[] array13 = new int[1000];

    //Resorted arrays
    private static int[] array0_0 = new int[1000];
    private static int[] array1_0 = new int[10];//for BogoSort
    private static int[] array2_0 = new int[1000];
    private static int[] array3_0 = new int[1000];
    private static int[] array4_0 = new int[1000];
    private static int[] array5_0 = new int[1000];
    private static int[] array6_0 = new int[1000];
    private static int[] array7_0 = new int[1000];
    private static int[] array8_0 = new int[1000];
    private static int[] array9_0 = new int[1000];
    private static int[] array10_0 = new int[1000];
    private static int[] array11_0 = new int[1000];
    private static int[] array12_0 = new int[1000];
    private static int[] array13_0 = new int[1000];

    public static void initArrays() {
        //Random
        Random r = new Random();
        for (int i = 0; i < 1000; i++) {
            array0[i] = r.nextInt(100);
        }
        System.arraycopy(array0, 0, array1, 0, 10);
        System.arraycopy(array0, 0, array2, 0, array0.length);
        System.arraycopy(array0, 0, array3, 0, array0.length);
        System.arraycopy(array0, 0, array4, 0, array0.length);
        System.arraycopy(array0, 0, array5, 0, array0.length);
        System.arraycopy(array0, 0, array6, 0, array0.length);
        System.arraycopy(array0, 0, array7, 0, array0.length);
        System.arraycopy(array0, 0, array8, 0, array0.length);
        System.arraycopy(array0, 0, array9, 0, array0.length);
        System.arraycopy(array0, 0, array10, 0, array0.length);
        System.arraycopy(array0, 0, array11, 0, array0.length);
        System.arraycopy(array0, 0, array12, 0, array0.length);
        System.arraycopy(array0, 0, array13, 0, array0.length);

        //Resorted
        for (int i = 0; i < 1000; i++) {
            array0_0[i] = 1000 - i;
        }
        System.arraycopy(array0_0, 0, array1_0, 0, 10);
        System.arraycopy(array0_0, 0, array2_0, 0, array0.length);
        System.arraycopy(array0_0, 0, array3_0, 0, array0.length);
        System.arraycopy(array0_0, 0, array4_0, 0, array0.length);
        System.arraycopy(array0_0, 0, array5_0, 0, array0.length);
        System.arraycopy(array0_0, 0, array6_0, 0, array0.length);
        System.arraycopy(array0_0, 0, array7_0, 0, array0.length);
        System.arraycopy(array0_0, 0, array8_0, 0, array0.length);
        System.arraycopy(array0_0, 0, array9_0, 0, array0.length);
        System.arraycopy(array0_0, 0, array10_0, 0, array0.length);
        System.arraycopy(array0_0, 0, array11_0, 0, array0.length);
        System.arraycopy(array0_0, 0, array12_0, 0, array0.length);
        System.arraycopy(array0_0, 0, array13_0, 0, array0.length);
    }


    public static void main(String[] args) {


        initArrays();

        TreeMap<Long, String> map = new TreeMap<>();
        TreeMap<Long, String> map2 = new TreeMap<>();

        //------BubbleSort-------
        long time0 = System.nanoTime();
        Sort.bubbleSort(array0);
        long time0_1 = System.nanoTime();
        map.put(time0_1 - time0, "BubbleSort");

        long time0_0 = System.nanoTime();
        Sort.bubbleSort(array0_0);
        long time0_1_0 = System.nanoTime();
        map2.put(time0_1_0 - time0_0, "BubbleSort");

        //------BogoSort-------
        long time1 = System.nanoTime();
        Sort.bogoSort(array1);
        long time1_1 = System.nanoTime();
        map.put(time1_1 - time1, "BogoSort(for 10 elements)");

        long time1_0 = System.nanoTime();
        Sort.bogoSort(array1_0);
        long time1_1_0 = System.nanoTime();
        map2.put(time1_1_0 - time1_0, "BogoSort(for 10 elements)");

        //------StoogeSort-------
        long time2 = System.nanoTime();
        Sort.stoogeSort(array2);
        long time2_1 = System.nanoTime();
        map.put(time2_1 - time2, "StoogeSort");

        long time2_0 = System.nanoTime();
        Sort.stoogeSort(array2_0);
        long time2_1_0 = System.nanoTime();
        map2.put(time2_1_0 - time2_0, "StoogeSort");

        //------QuickSort-------
        long time3 = System.nanoTime();
        Sort.quickSort(array3);
        long time3_1 = System.nanoTime();
        map.put(time3_1 - time3, "QuickSort");

        long time3_0 = System.nanoTime();
        Sort.quickSort(array3_0);
        long time3_1_0 = System.nanoTime();
        map2.put(time3_1_0 - time3_0, "QuickSort");

        //------StupidSort-------
        long time4 = System.nanoTime();
        Sort.stupidSort(array4);
        long time4_1 = System.nanoTime();
        map.put(time4_1 - time4, "StupidSort");

        long time4_0 = System.nanoTime();
        Sort.stupidSort(array4_0);
        long time4_1_0 = System.nanoTime();
        map2.put(time4_1_0 - time4_0, "StupidSort");

        //------GnomeSort-------
        long time5 = System.nanoTime();
        Sort.gnomeSort(array5);
        long time5_1 = System.nanoTime();
        map.put(time5_1 - time5, "GnomeSort");

        long time5_0 = System.nanoTime();
        Sort.gnomeSort(array5_0);
        long time5_1_0 = System.nanoTime();
        map2.put(time5_1_0 - time5_0, "GnomeSort");

        //------HeapSort-------
        long time6 = System.nanoTime();
        Sort.heapSort(array6);
        long time6_1 = System.nanoTime();
        map.put(time6_1 - time6, "HeapSort");

        long time6_0 = System.nanoTime();
        Sort.heapSort(array6_0);
        long time6_1_0 = System.nanoTime();
        map2.put(time6_1_0 - time6_0, "HeapSort");

        //------CocktailSort-------
        long time7 = System.nanoTime();
        Sort.cocktailSort(array7);
        long time7_1 = System.nanoTime();
        map.put(time7_1 - time7, "CocktailSort");

        long time7_0 = System.nanoTime();
        Sort.cocktailSort(array7_0);
        long time7_1_0 = System.nanoTime();
        map2.put(time7_1_0 - time7_0, "CocktailSort");

        //------InsertSort-------
        long time8 = System.nanoTime();
        Sort.insertSort(array8);
        long time8_1 = System.nanoTime();
        map.put(time8_1 - time8, "InsertSort");

        long time8_0 = System.nanoTime();
        Sort.insertSort(array8_0);
        long time8_1_0 = System.nanoTime();
        map2.put(time8_1_0 - time8_0, "InsertSort");

        //------SelectionSort-------
        long time9 = System.nanoTime();
        Sort.selectionSort(array9);
        long time9_1 = System.nanoTime();
        map.put(time9_1 - time9, "SelectionSort");

        long time9_0 = System.nanoTime();
        Sort.selectionSort(array9_0);
        long time9_1_0 = System.nanoTime();
        map2.put(time9_1_0 - time9_0, "SelectionSort");

        //------MergeSort-------
        long time10 = System.nanoTime();
        Sort.mergeSort(array10);
        long time10_1 = System.nanoTime();
        map.put(time10_1 - time10, "MergeSort");

        long time10_0 = System.nanoTime();
        Sort.mergeSort(array10_0);
        long time10_1_0 = System.nanoTime();
        map2.put(time10_1_0 - time10_0, "MergeSort");

        //------ShellSort-------
        long time11 = System.nanoTime();
        Sort.shellSort(array11);
        long time11_1 = System.nanoTime();
        map.put(time11_1 - time11, "ShellSort");

        long time11_0 = System.nanoTime();
        Sort.shellSort(array11_0);
        long time11_1_0 = System.nanoTime();
        map2.put(time11_1_0 - time11_0, "ShellSort");

        System.out.println("-----------------Array of Random Numbers-------------------");

        Iterator<Map.Entry<Long, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Long, String> tmp = iterator.next();
            System.out.println(tmp.getValue() + ": " + (double)tmp.getKey()/1000000+" ms");
        }


        System.out.println("----------------------Resorted Array------------------------");

        Iterator<Map.Entry<Long, String>> iterator1 = map2.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Long, String> tmp = iterator1.next();
            System.out.println(tmp.getValue() + ": " + (double)tmp.getKey()/1000000+" ms");
        }


    }
}
