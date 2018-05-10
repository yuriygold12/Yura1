package lesson_30;

public class HighTechSofa implements Sofa {
    @Override
    public void lainOn() {
        System.out.println("Лягти на ліжко стилю ХайТек");
    }

    @Override
    public void layOut() {
        System.out.println("Встати з ліжка Хай Тек");
    }
}
