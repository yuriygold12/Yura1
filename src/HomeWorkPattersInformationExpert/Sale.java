package HomeWorkPattersInformationExpert;

//import javax.xml.bind.SchemaOutputResolver;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

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
        this.salesitem = null;
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

    public void showinfo() {
        System.out.println("Sale))");
        System.out.println("data: " + data);
        System.out.println("time: " + time);
        for(SalesLineItem i : salesitem)
        {
            System.out.println("salesitem: " + salesitem);
        }

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

