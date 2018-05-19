package HomeWork39;

import java.util.ArrayList;

public class RunnerGenerick {
    public static void main(String[] args) {
        WorkGener<Integer> workwithGenerick = new IntegerNumbers();
        for (int i = 0; i < 4; i++) {
            workwithGenerick.addElement();
        }
        workwithGenerick.showinfo();
        workwithGenerick.removeElement();
        workwithGenerick.showinfo();
        workwithGenerick.insertIntoSort();
        workwithGenerick.showinfo();

        WorkGener<Double> workGener = new DoubleNumbers();
        for (int i = 0; i < 4; i++) {
            workGener.addElement();
        }
        workGener.showinfo();
        workGener.removeElement();
        workGener.showinfo();
        workGener.insertIntoSort();
        workGener.FindElement();
    }
}
