package HomeWorkPattersInformationExpert;
import java.util.Objects;
import java.util.Scanner;

public class ProductDesc {

    private String description;
    private int price;
    private int ItemId;

    public ProductDesc(int itemId, String description, int price) {
        this.ItemId = itemId;
        this.description = description;
        this.price = price;
    }

    public ProductDesc() {
        this.ItemId = 0;
        this.description = null;
        this.price = 0;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getItemId() {
        return ItemId;
    }

    public void setItemId(int itemId) {
        ItemId = itemId;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean equalsName(String name) {
        if (description.equals(name)) {
            return true;
        }
        return false;
    }

    public boolean equalsId(int id) {
        if (ItemId == id) {
            return true;
        }
        return false;
    }

    //Цей метод закоментований залишив у разі потреби.
    /*public ProductDesc creatNewProductDesc()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть id продукту: ");
        int id = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введіть назву продукту: ");
        String description = scan.nextLine();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введіть назву продукту: ");
        int price = scan.nextInt();
        ProductDesc productDesc = new ProductDesc(id,description,price);
        return productDesc;
    }
    */
    @Override
    public boolean equals(Object o) {
        //if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDesc that = (ProductDesc) o;
        return Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(description, price, ItemId);
    }

    /*@Override
    public String toString() {
        return "ProductDesc{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", ItemId=" + ItemId +
                '}';
    }
    */
    public void showProductDesc() {
        System.out.println("Продукт");
        System.out.println("description: " + description);
        System.out.println("price: " + price);
        System.out.println("ItemId: " + ItemId);
    }
}
