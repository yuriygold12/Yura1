package HomeWork39;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class WorkwithGenerick<T> {
    protected ArrayList<T> numbersList;

    public WorkwithGenerick() {
        this.numbersList = new ArrayList<>();
    }

    public abstract void insertIntoSort();

    public abstract void addElement();

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

    public void showinfo() {
        System.out.println(" ");
        for (T i : numbersList) {
            System.out.println("number: " + i.toString());
        }
        System.out.println(" ");
    }
}
