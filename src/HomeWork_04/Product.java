package HomeWork_04;

import java.time.LocalDate;

public class Product {
    String name;
    String marka;
    LocalDate datemanifacture;
    LocalDate enddate;

    public Product(String name, String marka, LocalDate datemanifacture, LocalDate enddate) {
        this.name = name;
        this.marka = marka;
        this.datemanifacture = datemanifacture;
        this.enddate = enddate;
    }
}
