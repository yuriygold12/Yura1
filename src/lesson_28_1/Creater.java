package lesson_28_1;

public abstract class Creater {
    public abstract Product createrProduct();
    public void RealisationProduct() {
        Product product = createrProduct();
        product.dosometing();
    }
}
