package lesson_41_Generick_Intarface;

import java.util.Random;

public class ProductList extends WorkwithGenerick<Product, Integer> {
    @Override
    public void bublesort() {
        int lengs = numbersList.size();
        for (int i = 0; i < lengs - 1; i++) {
            for (int j = 0; j < lengs - i - 1; j++) {
                if (numbersList.get(j).getId() > numbersList.get(j + 1).getId()) {
                    Product temp = numbersList.get(j);
                    numbersList.set(j, numbersList.get(j + 1));
                    numbersList.set(j + 1, temp);
                }
            }
        }
    }

    @Override
    public void addElement() {
        Random rnd = new Random();
        numbersList.add(new Product(rnd.nextInt(48) + 3));
    }

    public Product find(Integer key) {
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i).getId() == key) {
                System.out.print("Ми знайшли елемент: " + numbersList.get(i).toString());
                System.out.println(" ");
                return numbersList.get(i);
            }
        }
        return null;
    }
}
