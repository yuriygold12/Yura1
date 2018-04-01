package HomeWorkPattersInformationExpert.Serializacija;

import HomeWorkPattersInformationExpert.Pattern_Information_Expert_Stock_CashRegister.ProductDesc;

import java.util.ArrayList;

public class SerializetionTest {
    private static ArrayList<ProductDesc> productDescs = new ArrayList<>();

    public static void main(String[] args) {
        productDescs.add(new ProductDesc(1, "ddasda", 2));
        productDescs.add(new ProductDesc(12, "yuea", 21));
        Serializator.saveData("src/HomeWorkPattersInformationExpert/products.txt", productDescs);
        productDescs = (ArrayList<ProductDesc>) Serializator.loadData("src/HomeWorkPattersInformationExpert/products.txt");
        for (ProductDesc product : productDescs) {
            System.out.println(product.toString());
        }
    }
}
