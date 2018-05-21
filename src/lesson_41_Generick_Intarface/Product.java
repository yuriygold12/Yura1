package lesson_41_Generick_Intarface;

public class Product implements Identify<Integer> {
    private int id;

    public Product(int id) {
        this.id = id;
    }

    //Класи ордер і продук і любий інший мусить імлементити тоість реалізовувати методи що опреділені в інтерфейсі ідентіфіті.
    //потім цей метод ми викликаем у методі файн.
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                '}';
    }
}
