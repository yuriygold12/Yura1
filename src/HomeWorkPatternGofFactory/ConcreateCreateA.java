package HomeWorkPatternGofFactory;

public class ConcreateCreateA extends Creater{
    Product createrProduct() {
        return new ProductA();
    }
}
