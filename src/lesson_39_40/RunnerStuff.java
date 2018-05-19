package lesson_39_40;

import java.util.ArrayList;

public class RunnerStuff {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(500);
        integers.add(2);
        integers.add(300);
        integers.add(100);

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(1.0);
        doubles.add(500.3);
        doubles.add(2.4);
        doubles.add(300.6);
        doubles.add(100.7);

        StuffList<Integer> integerStuffList = new StuffList<>(integers);
        StuffList<Double> doubleStuffList = new StuffList<>(doubles);

        //StuffList<Integer> someIntegers = doubleStuffList;
        //StuffList<String> stringStuffList = new StuffList<>();
        System.out.println(integerStuffList.sameAveraige(doubleStuffList));


        System.out.println("before sort");
        integerStuffList.showinfo();
        doubleStuffList.showinfo();
        System.out.println("after sort");
        integerStuffList.bubbleSort();
        doubleStuffList.bubbleSort();
        integerStuffList.showinfo();
        doubleStuffList.showinfo();
    }
}
