package HomeWork39;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkwithGenerick<T extends Number> {
    private ArrayList<T> numbersList;

    public WorkwithGenerick() {
        this.numbersList = new ArrayList<>();
    }

    public void insertIntoSort() {
        Integer temp;
        int j;
        int length = numbersList.size();
        for (int i = 0; i < length - 1; i++) {
            if (numbersList.get(i).doubleValue() > numbersList.get(i + 1).doubleValue()) {
                T temp1 = numbersList.get(i + 1);
                numbersList.set(i + 1, numbersList.get(i));
                j = i;
                while (j > 0 && temp1.doubleValue() < numbersList.get(j - 1).doubleValue()) {
                    numbersList.set(j, numbersList.get(j - 1));
                    j--;
                }
                numbersList.set(j, temp1);
            }
        }//
    }

    private int findElement(ArrayList<T> numberlist) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число яке ви шукаете: ");
        Double value = sc.nextDouble();
        for (int i = 0; i < numberlist.size(); i++) {
            if (numberlist.get(i).equals(value)) {
                System.out.print("Ми знайшли елемент: " + numberlist.get(i).toString());
                System.out.println(" ");
                return i;
            }
        }
        return -1;
    }
//
    public void removeInArrayList() {
        int index = findElement(numbersList);
        if (index != -1) {
            System.out.println("Видаляем елемент який знайшли:"+ numbersList.get(index).toString());
            numbersList.remove(index);
        }
        else{
            System.out.println("Елемент не знайшовся");
        }
    }

    public void addElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число яке ви бажаете додати: ");
        Double value = (Double)sc.nextDouble();
        System.out.println(" ");
        numbersList.add((T)value);
    }


    public void showinfo() {
        System.out.println(" ");
        for (T i : numbersList) {
            System.out.println("number: " + i.toString());
        }
        System.out.println(" ");
    }
}
