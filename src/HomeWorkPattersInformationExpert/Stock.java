package HomeWorkPattersInformationExpert;

import javax.naming.PartialResultException;
import java.util.ArrayList;

public class Stock {
    private static ArrayList<ProductDesc> products = new ArrayList<>();

    public static void addProduct(ProductDesc product)
    {
     if(product!=null)
     {
         products.add(product);
     }
     else
     {
         System.out.println("Неможливо додати пустий обект");
     }
    }


    public static ArrayList<ProductDesc> getProduct(ProductDesc product,int q)
    {
        if(product!=null&& products!=null)
        {
            int countProduct = 0;
            for(ProductDesc i : products)
            {
                if(i == product)
                {
                    ArrayList<ProductDesc> products1 = new ArrayList<>();
                    products1.add(i);
                    countProduct++;
                    if(countProduct == q)
                    {
                        for(ProductDesc I : products)
                        {
                            if(I == product)
                            {
                                products.remove(I);
                            }
                        }
                        return products1;
                    }
                }
            }
            if(countProduct == 0)
            {
                System.out.println("Такого обенкту взагалі немає на складі");
            }
        }
            return null;
    }






    public static boolean findProduct(String name)
    {
        if(products!=null)
        {
            for(ProductDesc i : products)
            {
                if(name == i.getDescription())
                {
                    return true;
                }
            }
        }
        else
        {
            System.out.println("Склад пустий");
        }
        return false;
    }


    public static boolean findProduct(ProductDesc productDesc)
    {
        if(products!=null && productDesc!=null)
        {
            ArrayList<ProductDesc> prod = new ArrayList<>();
            for(ProductDesc i : products)
            {
                if(i == productDesc)
                {
                    return true;
                }
            }
        }
        else
        {
            System.out.println("Склад пустий");
        }
        return false;
    }
}
