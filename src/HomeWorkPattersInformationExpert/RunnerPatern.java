package HomeWorkPattersInformationExpert;

//import org.omg.PortableServer.POAPackage.ServantAlreadyActive;

//import javax.xml.soap.SAAJMetaFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class RunnerPatern {

    public static void main(String[] args) {
        /*
        ProductDesc pr1 = new ProductDesc();
        ProductDesc product = new ProductDesc(1, "xlib", 1);
        ProductDesc product1 = new ProductDesc(2, "xlib13", 2);
        ProductDesc product2 = new ProductDesc(3, "xlib2", 3);
        ProductDesc product3 = new ProductDesc(4, "xlib31", 4);
        ProductDesc product4 = new ProductDesc(4, "xlib1", 5);


        Stock.addProduct(product);
        Stock.addProduct(product);
        Stock.addProduct(product);
        Stock.addProduct(product1);
        Stock.addProduct(product1);
        Stock.addProduct(product1);
        Stock.addProduct(product4);

        ArrayList<ProductDesc> prod = new ArrayList<>();
        prod = Stock.getProduct(product1,3);
        for(ProductDesc pro :prod)
        {
          pro.showinfo();
        }

        System.out.println("");
        System.out.println("Name");
        System.out.println("");

        ArrayList<ProductDesc> prod1 = new ArrayList<>();
        prod1 = Stock.getProduct("xlib",2);
        for(ProductDesc pro1 :prod1)
        {
            pro1.showinfo();
        }


        System.out.println("showinfo");
        Stock.showinfo();


        boolean stock = Stock.findProduct("xlib1");
        System.out.println("Resault: " + stock);

        boolean stock1 = Stock.findProduct(product4);
        System.out.println("Resault2: "+stock1);


        product1.showinfo();
        int price = product1.getPrice();
        System.out.println("Ціна продукту: "+ price);
        System.out.println(" ");

        SalesLineItem salesLineItem = new SalesLineItem(product,2);
        SalesLineItem salesLineItem1 = new SalesLineItem(product1,3);
        SalesLineItem salesLineItem2 = new SalesLineItem(product2 ,4);
        SalesLineItem salesLineItem3 = new SalesLineItem(product3,5);
        SalesLineItem salesLineItem4 = new SalesLineItem(product4,6);

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

        ArrayList<SalesLineItem> sale3 = new ArrayList<SalesLineItem>();
        sale3.add(salesLineItem);
        sale3.add(salesLineItem1);
        sale3.add(salesLineItem2);
        sale3.add(salesLineItem3);
        sale3.add(salesLineItem4);

        Sale sal = new Sale(LocalDate.now(),LocalDate.now(),sale3);
        CashRegister.addCheck(sal);
        CashRegister.addCheck(sale);
        Sale sav = CashRegister.searchCeck(sal);
        sav.showinfo();
        CashRegister.showCheck(sal);
        System.out.println("  Тут Інфа про всі чеки  ");
        */

        //Cтворення продукту у Складі
        Stock.creatProduct();
        Stock.creatProduct();
        Stock.creatProduct();
        Stock.creatProduct();

        //Перевірка продукту на складі і розприділення по кімнатах ти пу на складах.
        Stock.ValidityProduct();
        //Вивід скаду
        Stock.showStock();

        //Пошук по ід товару і зміна ціни перед продажем тіпа.
        Stock.RevalueGoods();
        Stock.showStock();

        System.out.println(" ");
        System.out.println("Скалад");
        System.out.println(" ");

        //Створення попупки і додавання до касово апарату.
        CashRegister.CreatNewSale();

        System.out.println(" ");
        //Друк чеків у мому випадку один чек.
        CashRegister.showCashRegisterCheking();
        System.out.println(" ");
        //Stock.showStock();
        System.out.println(" ");
    }
}
