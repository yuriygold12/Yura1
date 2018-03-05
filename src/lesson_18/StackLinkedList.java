package lesson_18;

import java.util.Currency;

public class StackLinkedList {
    private Node firs;
    private int size;
    private Node top;

    public StackLinkedList(int size) {
        this.firs = null;
        this.size = size;
        this.top = null;
    }

    public boolean isempty() {
        return firs == null;
    }

    public boolean isfull() {
        return top != null;
    }

    public void Push(Node newNode) {
        if (!isfull()) {
            newNode.next = firs;
            firs = newNode;
        } else {
            System.out.println("Не можем додати у стек більше елементів бо стек переповниний");
        }
    }


    public Node pop() {
        if (!isempty()) {
            Node tmp = firs;
            firs = firs.next;
            return tmp;
        } else {
            System.out.println("Стек Пустий");
            return null;
        }
    }


    public Node peek() {
        if (!isempty()) {
            Node tmpCurent = firs;
            return tmpCurent;
        } else {
            System.out.println("Не можливо повернути стек пустий");
            return null;
        }

    }

    public void showStackLink() {

        Node CurrentNode = firs;
        while (CurrentNode != null) {
            CurrentNode.showNode();
            CurrentNode = CurrentNode.next;
        }
        //System.out.println("Size елементів у стеку: "+this.size);
        //System.out.println("Вивід top: ");
    }
}


