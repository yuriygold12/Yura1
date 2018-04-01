package lesson_30.Ierarxija1;

import lesson_30.Chair;
import lesson_30.Sofa;
import lesson_30.Table;

public interface FurnitureFactory {

    public Chair createChair();

    public Table createTable();

    public Sofa createSofa();
}
