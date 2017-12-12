package Home;

import java.time.LocalDate;

public class RunnerProduct {

    public static void main(String[] args) {

        Product Moloko = new Product("molocnucja", LocalDate.of(2017,11,22),
                LocalDate.of(2017,11,29),54);
        Moloko.Print();
    }
}



/**
 * 1.Product.
 * 2.Order.
 * 3.Store.
 * 4.Manager.
 * 5.Custumer.
 * 6.Payment.
 * 7.Shop
 * 8. Supplier
 * 9. Delivery
 */