package lesson_18;

import HomeWork8.Person;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkList someList = new LinkList();
        //StackLinkedList stackLink = new StackLinkedList(10);
        //someList.insertToBegin(9, 20.8);
        //someList.insertToBegin(50, 89.4);
        //someList.insertToBegin(5, 28.1);
        //someList.insertToBegin(11, 28.1);
        //someList.insertToBegin(11, 28.1);
        //someList.insertToBegin(11, 28.1);
        //someList.insertToBegin(11, 28.1);
        Node TmpNode = someList.deleteFirst();
        //TmpNode.showNode();
        System.out.println(" ");
        StackLinkedList ob = someList.getStackLinkedList();
        ob.showStackLink();
        System.out.println(" ");
        Node Tmp1Node = ob.peek();
        //Tmp1Node.showNode();
        System.out.println(" ");
        //someList.deleteFirst();
        someList.displayList();
        //someList.delete(9);
        //someList.displayList();
        //someList.deleteFirst();
        //Node nod = someList.Find(12);
        //System.out.println("Вивід знайденого елемента");
        //nod.showNode(); //Чому ось тут я не можу вивести????????Запитатию.
        /*System.out.println();
        LinkList someList1 = new LinkList();
        //Додавання після знайденого емента
        someList1.AddNewAfttenAllament(5);
        someList1.displayList();
        someList.displayList();
        someList.AddNewAfttenAllament(501);
        someList.displayList();
        someList.AddNewAfttenAllament(122);
        someList.displayList();
        someList.AddNewAfttenAllament(93);
        someList.displayList();
        System.out.println();
        System.out.println("Beffore");
        someList.AddNewBefforeAllament(124);
        someList.displayList();
        someList.AddNewBefforeAllament(55);
        someList.displayList();
        someList.AddNewBefforeAllament(96);
        someList.displayList();
        //Додавання перед знайденим елементом.
        someList1.AddNewBefforeAllament(11);
        someList1.displayList();
*/
    }
}
