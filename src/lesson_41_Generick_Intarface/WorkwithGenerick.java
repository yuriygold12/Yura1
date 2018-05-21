package lesson_41_Generick_Intarface;

import java.util.ArrayList;

//Ось тут розумію так Обект T який прийде чи то Продук чи то ОРдер мусить імлементити обовязково
//інтерфейс identify якшо цього не буде цей обект не зможе прийти. V - це ключ обмежень нема.
//Дальше цей клас імплементить файнабел інтерфейсь тоість тут метод файн мусить бути або реалізований
//або бути обявлений як абстрактний і повинен бути реалізований у похідному класі від цього.
public abstract class WorkwithGenerick<T extends Identify<Integer>, V> implements Findable<T, V> {

    protected ArrayList<T> numbersList;

    public WorkwithGenerick() {
        this.numbersList = new ArrayList<>();
    }

    public abstract void bublesort();

    public abstract void addElement();

    public abstract T find(V key);

    //Ось тут метод я закоментував тому що я зробив дві імплементаціі у класі ордерліст і продукт лість
    //можливо це буде і надлишковість коду але подивись у цих двох класах як там реалізація чи я правильно реаліщував.

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

    public void remove() {

    }
}
