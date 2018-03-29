package HomeWorkPatternsGOFfabricMethod;

public class ChairFactory extends Factory {
    public Creatable create() {
        return new Chair();
    }
}
