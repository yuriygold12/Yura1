package lesson_30;

public class PopArtSofa implements Sofa {
    @Override
    public void lainOn() {
        System.out.println("Лягти на ліжко стилю Поп арт Софа");
    }

    @Override
    public void layOut() {
        System.out.println("Встати з ліжка Поп арт Софа");
    }
}
