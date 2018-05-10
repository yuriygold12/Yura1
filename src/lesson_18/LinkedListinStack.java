package lesson_18;

import java.util.Random;

public class LinkedListinStack {

    private LinkList linkList;
    private Node top;
    private int size;


    public LinkedListinStack() {
        this.linkList = new LinkList();
        this.top = null;
        this.size = 6;
    }

    public LinkedListinStack(LinkList linkList, Node top, int size) {
        this.linkList = linkList;
        this.top = top;
        this.size = size;
    }


    public boolean isempty() {
        return top == null;
    }

    public boolean isfull() {
        Node CurrentNode = top;
        int count = 0;
        while (CurrentNode != null) {
            count++;
            CurrentNode = CurrentNode.next;
        }
        if (count == size) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Node newNode) {

        if (!isfull()) {
            System.out.println("Додаем елемент");
            newNode.next = top;
            top = newNode;
            linkList.insertToBegin(newNode.index, newNode.value);
        } else {
            System.out.println("Стек Переповнений");
        }
    }

    public Node peek() {
        if (!isempty()) {
            return top;
        } else {
            System.out.println("Стек пустий + Лінкед ліст пустий");
            return null;
        }
    }

    public Node pop() {
        if (!isempty()) {
            Node CurentNode = top;
            top = top.next;
            linkList.deleteFirst();
            return CurentNode;
        } else {
            System.out.println("Неможливо видали вузол стек пустий");
            return null;
        }
    }

    public void ShowLinkedListStack() {

        linkList.displayList();
        if (linkList != null && top != null) {
            System.out.println(" ");
            System.out.println("Firs: " + top.value);
            //System.out.println("Максимальна кількість елементів у стеку: "+size);
        }
    }
}