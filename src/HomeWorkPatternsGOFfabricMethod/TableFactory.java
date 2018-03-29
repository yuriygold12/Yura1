package HomeWorkPatternsGOFfabricMethod;

public class TableFactory extends Factory {
    public Creatable create() {
        return new Table();
    }
}
