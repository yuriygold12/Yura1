package lesson_18;

import HomeWork8.Person;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkList someList = new LinkList();
        someList.insertToBegin(9, 20.8);
        someList.insertToBegin(50, 89.4);
        someList.insertToBegin(5, 28.1);

        someList.displayList();
    }
}
