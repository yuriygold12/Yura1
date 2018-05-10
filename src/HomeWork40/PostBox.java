package HomeWork40;

public class PostBox extends Box {
    private int id;
    private int weight;

    public PostBox(int width, int height, int depht, int id, int weight) {
        super(width, height, depht);
        this.id = id;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "PostBox{" + super.toString() +
                "id=" + id +
                ", weight=" + weight +
                '}';
    }
}
