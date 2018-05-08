package HomeWork39;

import HomeWork9.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkwithGenerick<T extends Number> {
    private ArrayList<T> numbersList;

    public WorkwithGenerick() {
        this.numbersList = new ArrayList<>();
    }

    public WorkwithGenerick(ArrayList<T> numbersList) {
        this.numbersList = numbersList;
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
        }
    }


    public void findElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число яке ви шукаете: ");
        double value = sc.nextDouble();
        int cntArray = numbersList.size();
        if (cntArray > 0) {
            for (int i = 0; i < cntArray - 1; i++) {
                if (numbersList.get(i).doubleValue() == value) {
                    T values = numbersList.get(i);
                    System.out.print("Ми знайшли елемент: " + values.toString());
                }
            }
        } else {
            System.out.println("ArrayList pustuy");
        }
    }


    public void removeInArrayList() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число яке ви ажаете видалити: ");
        double value = sc.nextDouble();
        int count = numbersList.size();
        for (int i = 0; i < count - 1; i++) {
            if (numbersList.get(i).doubleValue() == value) {
                T values = numbersList.get(i);
                System.out.print("Ми видаляєио елемент: " + values.toString());
                numbersList.remove(values);

            }
        }
    }


    public void addElement() {
        Scanner sc = new Scanner(System.in);
        int count = numbersList.size();
        System.out.println("Введіть число яке ви бажаете додати");
        Person pr = new Person();

        //TODO T<-->Integer
        //numbersList.add((Integer)sc.nextInt());

    }


    public void showinfo() {
        for (T i : numbersList) {
            System.out.println("number: " + i.toString());
        }
        System.out.println();
    }


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(205);
        numbers.add(20);
        numbers.add(13);
        numbers.add(100);
        numbers.add(33);
        numbers.add(44);
        WorkwithGenerick<Integer> sorting = new WorkwithGenerick<>(numbers);
        sorting.showinfo();
        //System.out.println("Додаем елемент");
        //sorting.addElement();
        //sorting.showinfo();
        System.out.println("Шукаем елемент: ");
        sorting.findElement();
        System.out.println("Видаляем елемент");
        sorting.removeInArrayList();
        sorting.showinfo();
        System.out.println("Сортуем елементи");
        sorting.insertIntoSort();
        sorting.showinfo();
    }
}
