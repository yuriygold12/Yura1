package lesson_30;

public class ModernSofa implements Sofa {
    @Override
    public void lainOn() {
        System.out.println("Лягти на ліжко стилю  Модерн");
    }

    @Override
    public void layOut() {
        System.out.println("Встати з ліжка Модерн");
    }
}
