package HomeWork39;

import java.util.ArrayList;

public class RunnerGenerick {
    public static void main(String[] args) {
        WorkwithGenerick workwithGenerick = new WorkwithGenerick();
        workwithGenerick.addElement();
        workwithGenerick.addElement();
        workwithGenerick.addElement();
        workwithGenerick.addElement();
        workwithGenerick.addElement();
        System.out.println("Вивід даних");
        workwithGenerick.showinfo();
        workwithGenerick.removeInArrayList();
        workwithGenerick.showinfo();
        System.out.println("Сортуем елементи");
        workwithGenerick.insertIntoSort();
        workwithGenerick.showinfo();
    }
}
