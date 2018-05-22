package lesson_41_Generick_Intarface;

import java.util.ArrayList;

public abstract class WorkwithGenerick<T extends Identify<Integer>, V> implements Findable<T, V> {

    protected ArrayList<T> numbersList;

    public WorkwithGenerick() {
        this.numbersList = new ArrayList<>();
    }

    public abstract void bublesort();

    public abstract void addElement();

    public abstract T find(V key);

    /*public Order find(Integer key) {
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i).getId() == key) {
                System.out.println();
                System.out.print("Ми знайшли елемент: " + numbersList.get(i).toString());
                System.out.println(" ");
                return numbersList.get(i);
            }
        }
        return null;
    }*/

    public void showinfo() {
        System.out.println(" ");
        for (T i : numbersList) {
            System.out.println("number: " + i.toString());
        }
        System.out.println(" ");
    }

    public void remove(V key) {
        T value = find(key);
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) == value) {
                System.out.println("Remove Ob: " + numbersList.get(i).toString());
                numbersList.remove(i);
            }
        }
    }
}
