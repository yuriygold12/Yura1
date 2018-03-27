package HomeWorkPatternGofFactory;

public class ConcreateCreateB extends Creater {
    Product createrProduct(){
        return new ProductB();
    }
}

