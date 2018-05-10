package lesson_39_40;

import java.util.ArrayList;

public class StuffList<T extends Number> {
    private ArrayList<T> stuff;

    public StuffList(ArrayList<T> stuff) {
        this.stuff = stuff;
    }

    public void bubbleSort() {
        int lengs = stuff.size();
        for (int i = 0; i < lengs - 1; i++) {
            for (int j = 0; j < lengs - i - 1; j++) {
                if (stuff.get(j).doubleValue() > stuff.get(j + 1).doubleValue()) {
                    T temp = stuff.get(j);
                    stuff.set(j, stuff.get(j + 1));
                    stuff.set(j + 1, temp);
                }
            }
        }
    }

    public double getAvariage() {
        double sum = 0;
        for (T item : stuff) {
            sum += item.doubleValue();
        }
        return sum / stuff.size();
    }


    //Metasumvolnuy argument abo while cart.
    public boolean sameAveraige(StuffList<?> list) {
        if (this.getAvariage() == list.getAvariage()) {
            return true;
        } else {
            return false;
        }
    }

    public void showinfo() {
        for (T item : stuff) {
            System.out.print(item.toString() + " ");
        }
        System.out.println();
    }
}
