package lesson_41_Generick_Intarface;

//Тут якраз ми і реалізовую інтерфйс бо там у класі дженерік Ворк стоіть обмеження якщо цього не буде то туди обект цього не зможе
//прийти .
public class Order implements Identify<Integer> {
    private int id;

    public Order(int id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                '}';
    }
}
