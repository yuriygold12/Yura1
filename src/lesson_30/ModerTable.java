package lesson_30;

public class ModerTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Покласти на стіл стилю Модерн");
    }

    @Override
    public void clean() {
        System.out.println("Взяти зі стола Модерн");
    }
}
