package HomeWorkPattersInformationExpert;

import javax.naming.PartialResultException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Stock {
    private static ArrayList<ProductDesc> products = new ArrayList<>();

    public static void addProduct(ProductDesc product) {
        if (product != null) {
            products.add(product);
        } else {
            System.out.println("Неможливо додати пустий обект");
        }
    }


    public static ArrayList<ProductDesc> getProduct(ProductDesc product, int q) {
        ArrayList<ProductDesc> products1 = new ArrayList<>();
        if (product != null && products != null) {
            for (ProductDesc pro : products) {
                if (pro.equals(product)) {
                    products1.add(pro);
                }
            }
            if (products1.size() == q) {
                for (ProductDesc prod : products1) {
                    if (prod.equals(product)) {
                        products.remove(prod);
                    }
                }
                return products1;
            }
            if(products1.size() == 0)
            {
                System.out.println("Не знайшлось даного продукту");
            }
            if (products1.size() != 0 && products1.size() != q) {
                System.out.println("На даний момент на складі така кількість знайдених продуктів: " + products1.size());
                System.out.println("Чи бажаете взяти таку кількість товару Зробыть свый вибыр 1 або 2  1 - так 2 - ні: ");
                Scanner scan = new Scanner(System.in);
                int number = scan.nextInt();
                if (number == 1) {
                    for (ProductDesc prod : products1) {
                        if (prod.equals(product)) {
                            products.remove(prod);
                        }
                    }
                    return products1;
                } else {
                    System.out.println("Ви не забажали взяти таку кількість товару");
                }
            }

        } else {
            System.out.println("Now");
        }
        //Тут у мене є питання я мушу щось повернути повертаю це бо якщо повертаю нулл то помилка якщо визиваю у мейні
        //а так я повептаю ерей лыст.
        return products;
    }


    public static ArrayList<ProductDesc> getProduct(String description, int q) {
        ArrayList<ProductDesc> products1 = new ArrayList<>();
        if (products != null) {
            for (ProductDesc i : products) {
                if (i.equalsName(description)) {
                    products1.add(i);
                }
            }
            if (products1.size() == q) {
                for (ProductDesc prod : products1) {
                    if (prod.equalsName(description)) {
                        products.remove(prod);
                    }
                }
                return products1;
            }
            if(products1.size() == 0)
            {
                System.out.println("Не знайшлось даного продукту");
            }
            if (products1.size() != 0 && products1.size() != q) {
                System.out.println("На даний момент на складі така кількість знайдених продуктів: " + products1.size());
                System.out.println("Чи бажаете взяти таку кількість товару Зробыть свый вибыр 1 або 2  1 - так 2 - ні: ");
                Scanner scan = new Scanner(System.in);
                int number = scan.nextInt();
                if (number == 1) {
                    for (ProductDesc prod : products1) {
                        if (prod.equalsName(description)) {
                            products.remove(prod);
                        }
                    }
                    return products1;
                } else {
                    System.out.println("Ви не забажали взяти таку кількість товару");
                }

            }
        } else {
            System.out.println("Now");
        }
        //Тут у мене є питання я мушу щось повернути повертаю це бо якщо повертаю нулл то помилка якщо визиваю у мейні
        //а так я повептаю ерей лыст.
        return products;
    }


    public static boolean findProduct(String name) {
        if (products != null) {
            for (ProductDesc i : products) {
                if (i.equalsName(name)) {
                    return true;
                }
            }
            System.out.println("Не знайшли продукту");
        } else {
            System.out.println("Склад пустий");
        }
        return false;
    }


    public static boolean findProduct(ProductDesc productDesc) {
        if (products != null && productDesc != null) {
            for (ProductDesc i : products) {
                if (i.equals(productDesc)) {
                    System.out.println("Найшли продукт");
                    return true;
                }
            }
            System.out.println("Не найшлий продукт");
        } else {
            System.out.println("Склад пустий");
        }
        return false;
    }


    public static void showinfo() {
        for (ProductDesc pro : products) {
            pro.showinfo();
        }
    }
}
