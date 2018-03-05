package HomeWorkPattersInformationExpert;

//import javax.xml.bind.SchemaOutputResolver;
import HomeWork3.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Sale {
    private LocalDate data;
    private LocalDate time;
    private ArrayList<SalesLineItem> salesitem;

    public Sale(LocalDate data, LocalDate time, ArrayList<SalesLineItem> salesitem) {
        this.data = data;
        this.time = time;
        this.salesitem = salesitem;
    }

    public Sale() {
        this.data = LocalDate.now();
        this.time = LocalDate.now();
        this.salesitem = new ArrayList<>();
    }

    public void addSaleLineItem()
    {
        SalesLineItem sale1 = new SalesLineItem();
        System.out.println("Введіть скільки ви продуктів бажаете знайти: ");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        ArrayList<SalesLineItem> salesLineItems = new ArrayList<SalesLineItem>();
        for(int i = 0;i < count;i++)
        {
            System.out.println("Знайдіть товар по id який ви бажаете додати у покупку: ");
            Scanner scan1 = new Scanner(System.in);
            int id = scan1.nextInt();
            ProductDesc ob = Stock.FindProduct(id);
            salesLineItems.add(sale1.addSalesItem(ob));
        }
        data = LocalDate.now();
        time = LocalDate.now();
        salesitem = salesLineItems;
    }

    public double getTotol()
    {
        double SumaTotol = 0;
        for(SalesLineItem i : salesitem)
        {
            SumaTotol+=i.getSubTotal();
        }
        return SumaTotol;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public void setSalesitem(ArrayList<SalesLineItem> salesitem) {
        this.salesitem = salesitem;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return Objects.equals(data, sale.data) &&
                Objects.equals(time, sale.time) &&
                Objects.equals(salesitem, sale.salesitem);
    }

    @Override
    public int hashCode() {

        return Objects.hash(data, time, salesitem);
    }

    public void showSale() {
        System.out.println("Sale))");
        System.out.println("data: " + data);
        System.out.println("time: " + time);
        for(SalesLineItem i : salesitem)
        {
            i.showSalenItem();
        }
        System.out.println("");
    }

    @Override
    public String toString() {

        return "Sale{" +
                "data=" + data +
                ", time=" + time +
                ", salesitem=" + salesitem+
                '}';
    }
}

