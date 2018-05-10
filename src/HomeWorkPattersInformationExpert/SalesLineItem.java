package HomeWorkPattersInformationExpert;

import java.util.Objects;

public class SalesLineItem {

    private ProductDesc item;
    private int quantita;


    public SalesLineItem() {
        this.item = null;
        this.quantita = 0;
    }

    public SalesLineItem(ProductDesc item, int quantita) {
        this.item = item;
        this.quantita = quantita;
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


    public void showinfo() {
        System.out.println("SalesLineItem:");
        item.showinfo();
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
