package lesson_30;

public class HighTechTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Покласти на стіл стилю ХайТек");
    }

    @Override
    public void clean() {
        System.out.println("Взяти зі стола Хай Тек");
    }
}
