package lesson_41_Generick_Intarface;

public class RunnerGenerickInterface {
    public static void main(String[] args) {
        //String name = "yura";
        //String surnamr = "bahlay";
        //System.out.println(name.compareTo(surnamr));


        WorkwithGenerick<Product, Integer> prList = new ProductList();
        for (int i = 0; i < 10; i++) {
            prList.addElement();
        }
        //System.out.println("Out of arrayList Product");
        //prList.showinfo();
        //System.out.println("Find Product");
        //System.out.println("Element id = 50 is " + prList.find(50).toString());
        //prList.remove(50);
        //System.out.println("out of after remove");
        //prList.showinfo();


        WorkwithGenerick<Order, Integer> orList = new OrderList();
        for (int i = 0; i < 10; i++) {
            orList.addElement();
        }
        System.out.println("out orders out of arrayList products");
        orList.showinfo();
        orList.remove(50);
        System.out.println("out of after remove");
        orList.showinfo();
        //System.out.println("Find Order in the arrayList orders");
        //System.out.println("Element id == 45 is: " + orList.find(45));

        /*System.out.println("Sort Products");
        prList.bublesort();
        prList.showinfo();
        System.out.println("Sorted Orders");
        orList.bublesort();
        orList.showinfo();*/
    }
}