package HomeWork40;

public class Box {
    private int width;
    private int height;
    private int depht;

    public Box(int width, int height, int depht) {
        this.width = width;
        this.height = height;
        this.depht = depht;
    }


    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depht=" + depht +
                '}';
    }
}
