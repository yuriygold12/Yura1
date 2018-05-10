package HomeWorkPattersInformationExpert;

//import org.omg.PortableServer.POAPackage.ServantAlreadyActive;

//import javax.xml.soap.SAAJMetaFactory;
import java.time.LocalDate;
import java.util.ArrayList;

public class RunnerPatern {

    public static void main(String[] args) {
        ProductDesc product = new ProductDesc(1,"xlib",1);
        ProductDesc product1 = new ProductDesc(2,"xlib",2);
        ProductDesc product2 = new ProductDesc(3,"xlib",3);
        ProductDesc product3 = new ProductDesc(4,"xlib",4);
        ProductDesc product4 = new ProductDesc(4,"xlib",5);

        product1.showinfo();
        int price = product1.getPrice();
        System.out.println("Ціна продукту: "+ price);
        System.out.println(" ");

        SalesLineItem salesLineItem = new SalesLineItem(product,2);
        SalesLineItem salesLineItem1 = new SalesLineItem(product1,3);
        SalesLineItem salesLineItem2 = new SalesLineItem(product2 ,4);
        SalesLineItem salesLineItem3 = new SalesLineItem(product3,5);
        SalesLineItem salesLineItem4 =new SalesLineItem(product4,6);

        salesLineItem2.showinfo();
        int Subtotol = salesLineItem2.getSubTotal();
        System.out.println("Ціна товау кількіссно: "+Subtotol);
        System.out.println(" ");

        ArrayList<SalesLineItem> sale1= new ArrayList<SalesLineItem>();
        sale1.add(salesLineItem);
        sale1.add(salesLineItem1);
        sale1.add(salesLineItem2);
        sale1.add(salesLineItem3);
        sale1.add(salesLineItem4);


        Sale sale = new Sale(LocalDate.now(),LocalDate.now(),sale1);
        sale.showinfo();
        System.out.println(" ");
        double totol = sale.getTotol();
        System.out.println("Загальна вартість покупки : "+totol);
    }


}
