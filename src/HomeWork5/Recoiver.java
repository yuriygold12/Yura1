package HomeWork5;

public class Recoiver extends Person {
    private Goods [] goods;
    private int countgoods;

    public Recoiver(String name, String surname, Goods[] goods, int countgoods) {
        super(name, surname);
        this.goods = goods;
        this.countgoods = countgoods;
    }
}
