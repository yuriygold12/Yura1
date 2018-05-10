package HomeWork40;

public class Parcel extends PostBox {
    private String client;

    public Parcel(int width, int height, int depht, int id, int weight, String client) {
        super(width, height, depht, id, weight);
        this.client = client;
    }

    @Override
    public String toString() {
        return "Parcel{" + super.toString() +
                "client='" + client + '\'' +
                '}';
    }
}

