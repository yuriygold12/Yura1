package HomeWork41;

import java.util.ArrayList;
import java.util.Random;

public class RunnerMetodsGenerick {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();
        int i = 0;
        while (i < 10) {
            integers.add(random.nextInt(300));
            i++;
        }
        GenerickMetods.showInfo(integers);
        GenerickMetods.bubbleSort(integers);
        GenerickMetods.showInfo(integers);


        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(32.1);
        doubles.add(3.1);
        doubles.add(2.1);
        doubles.add(12.1);
        doubles.add(42.1);


        GenerickMetods.<Double>showInfo(doubles);
        GenerickMetods.bubbleSort(doubles);
        GenerickMetods.showInfo(doubles);
        //GenerickMetods.sortingInserts(doubles);
        GenerickMetods.showInfo(doubles);
    }
}
