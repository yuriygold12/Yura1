package HomeWorkPattersInformationExpert;

import java.util.Objects;
import java.util.Scanner;

public class SalesLineItem {

    private ProductDesc item;
    private int quantita;


    public SalesLineItem() {
        this.item = null;
        this.quantita = 0;
    }
//11
    public SalesLineItem(ProductDesc item, int quantita) {
        this.item = item;
        this.quantita = quantita;
    }

    public SalesLineItem addSalesItem(ProductDesc product)
    {
        SalesLineItem ob = new SalesLineItem();
        ob.item = product;
        ob.quantita = 0;

        return ob;
    }

    public int getSubTotal()
    {
        int totolPrice = item.getPrice() * quantita;
        return totolPrice;
    }


    public ProductDesc getItem() {
        return item;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setItem(ProductDesc item) {
        this.item = item;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesLineItem that = (SalesLineItem) o;
        return quantita == that.quantita &&
                Objects.equals(item, that.item);
    }

    @Override
    public int hashCode() {

        return Objects.hash(item, quantita);
    }


    public void showSalenItem() {
        System.out.println("SalesLineItem:");
        item.showProductDesc();
        System.out.println("quantita: " + quantita);
        System.out.println(" ");
    }


    @Override
    public String toString() {

        return "SalesLineItem{" +
                "item=" + item +
                ", quantita=" + quantita +
                '}';
    }
}
