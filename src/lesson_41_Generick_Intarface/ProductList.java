package lesson_41_Generick_Intarface;

import java.util.Random;

//Клас не дженерік але суперклас дженеалізований і я тут де інтежер передаю ключ а тут де продукт типу туди піде обект
//класу любого іншого який можна реалізувати чи посилка чи ще щось але він обовязково повинене реалізовувати дженеріалізований інтерфей
//identifity.
public class ProductList extends WorkwithGenerick<Product, Integer> {
    //Як ось тут.
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
        //Ось тут так як як внас обмеження а силка у ранері скажем так абстрактного класу вказуе на обект продукт ліст
        //то визиваеться цей метод і відносно я так розумію я можу створити іпродук і нічо інше  у ордері орде ще і тому що у супер класс
        //те що з зверху я передаю продукт.extends<Product,Integet>
        numbersList.add(new Product(rnd.nextInt(48) + 3));
    }

    //Ось тут я повертаю продукт.боя реалізовую метод який обявлений як абстактний у супер класі.
    //У класі ордерЛіст я повертаю Ордер.Тут просто не можу повернути ордер а там не можу повернути продукт.
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
