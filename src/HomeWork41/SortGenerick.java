package HomeWork41;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Random;

public class SortGenerick<T extends Number> {
    /*
        protected ArrayList<T> numbers;

        public SortGenerick(ArrayList<T> numbers) {
            this.numbers = numbers;
        }

        public SortGenerick() {
            this.numbers = new ArrayList<>();
        }
    */

    static <T extends Number>
    void sortingInserts(ArrayList<T> ob) {
        T temp;
        int j;
        int length = ob.size();
        for (int i = 0; i < ob.size(); i++) {
            if (ob.get(i).doubleValue() > ob.get(i + 1).doubleValue()) {
                T temp1 = ob.get(i + 1);
                ob.set(i + 1, ob.get(i));
                j = i;
                while (j > 0 && temp1.doubleValue() < ob.get(j - 1).doubleValue()) {
                    ob.set(j, ob.get(j - 1));
                    j--;
                }
                ob.set(j, temp1);
            }
        }
    }


    static <T extends Number>
    void bubbleSort(ArrayList<T> ob) {
        int lengs = ob.size();
        for (int i = 0; i < lengs - 1; i++) {
            for (int j = 0; j < lengs - i - 1; j++) {
                int a;
                if (ob.get(j).doubleValue() > ob.get(j + 1).doubleValue()) {
                    T temp = ob.get(j);
                    ob.set(j, ob.get(j + 1));
                    ob.set(j + 1, temp);
                }
            }
        }
    }


    static <T>
    void showInfo(ArrayList<T> ob) {
        for (T item : ob) {
            System.out.print(item.toString() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();
        int i = 0;
        while (i < 10) {
            integers.add(random.nextInt(300));
            i++;
        }
        SortGenerick.showInfo(integers);
        SortGenerick.bubbleSort(integers);
        SortGenerick.showInfo(integers);

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(32.1);
        doubles.add(3.1);
        doubles.add(2.1);
        doubles.add(12.1);
        doubles.add(42.1);
        SortGenerick.showInfo(doubles);
        SortGenerick.bubbleSort(doubles);
        SortGenerick.showInfo(doubles);
    }
}
