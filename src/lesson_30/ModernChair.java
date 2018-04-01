package lesson_30;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Сісти на стілець стилулю Модерн");
    }

    @Override
    public void move() {
        System.out.println("Встати зі стільця стилю Модерн");
    }
}
