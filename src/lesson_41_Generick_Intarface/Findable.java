package lesson_41_Generick_Intarface;

public interface Findable<T, V> {
    public T find(V key);
}
