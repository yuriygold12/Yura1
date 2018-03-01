package HomeWorkPattersInformationExpert;

import java.util.Objects;

public class ProductDesc {

    private String description;
    private int price;
    private int ItemId;

    public ProductDesc(int itemId, String description, int price) {
        this.ItemId = itemId;
        this.description = description;
        this.price = price;
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
        //Назар о цей метод я використовую у класі сток у методі фінд(найм) я тільки не знаю чи правильно
        //тут ця умова що нижче воно працює але чи так правильн????
        //if(descripsen == name)воно світить ти казав зі стрінгами не можна????
        if (description.equals(name)) {
            return true;
        }
        return false;
    }


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

    @Override
    public String toString() {
        return "ProductDesc{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", ItemId=" + ItemId +
                '}';
    }

    public void showinfo() {
        System.out.println("Продукт");
        System.out.println("description: " + description);
        System.out.println("price: " + price);
        System.out.println("ItemId: " + ItemId);
    }
}
