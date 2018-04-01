package lesson_30.Ierarxija1;

import lesson_30.*;

public class HighTechFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new HighTechChair();
    }

    @Override
    public Table createTable() {
        return new HighTechTable();
    }

    @Override
    public Sofa createSofa() {
        return new HighTechSofa();
    }
}
