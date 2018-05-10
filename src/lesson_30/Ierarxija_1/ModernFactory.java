package lesson_30.Ierarxija_1;

import lesson_30.*;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModerTable();
    }
//
    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
