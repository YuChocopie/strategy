import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sorter<E> {
    public static <E> void bubbleSort(E[] data, Comparable<E> comparable) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (comparable.compareTo(data[j], data[j + 1]) > 0) { // swap
                    E temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
/*
    void selectionSortInts(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIdx]) { // swap
                    minIdx = j;
                }
            }
            int temp = data[minIdx];
            data[minIdx] = data[i];
            data[i] = temp;
        }
    }


    void selectionSortStrings(String[] data2) {
        for (int i = 0; i < data2.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < data2.length; j++) {
                if (data2[j].compareTo(data2[minIdx]) < 0) { // swap
                    minIdx = j;
                }
            }
            String temp = data2[minIdx];
            data2[minIdx] = data2[i];
            data2[i] = temp;
        }
    }

    void printInts(int[] data) {
        for (int i : data) {
            System.out.println(i);
        }
    }

    void printStrings(String[] data2) {
        for (String i : data2) {
            System.out.println(i);
        }
    }
    
    void printDates(Date[] data3) {
        for (Date d : data3) {
            System.out.println(d);
        }
    }
 */
}
