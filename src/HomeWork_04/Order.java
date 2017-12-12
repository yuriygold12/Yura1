package HomeWork_04;

public class Order {
    int id;
    Product []products;
    Custumer custumer;
    int totolcountproducts;
    Paiment paiment;

    public Order(int id, Product[] products, Custumer custumer, int totolcountproducts, Paiment paiment) {
        this.id = id;
        this.products = products;
        this.custumer = custumer;
        this.totolcountproducts = totolcountproducts;
        this.paiment = paiment;
    }
}
