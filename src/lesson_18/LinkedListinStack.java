package lesson_18;

import java.util.Random;

public class LinkedListinStack {

   private LinkList linkList;
   private Node first;
   //private Node top;
   private int top;
   private int size;


    public LinkedListinStack() {
        this.linkList = new LinkList();
        this.first = null;
        //this.top = null;
        this.top = -1;
        this.size = 6;
    }


    public LinkedListinStack(LinkList linkList, Node first, int top, int size) {
        this.linkList = linkList;
        this.first = first;
        this.top = top;
        this.size = size;
    }


    public boolean isempty()
    {
        return top == -1;
    }

    public boolean isfull()
    {
        return top == size-1;
    }


    public void push(Node newNode) { ;
        if (!isfull()) {
            //newNode.next = first;
            //first = newNode;
            top++;
            linkList.insertToBegin(newNode.index,newNode.value);
        }
        else
        {
            System.out.println("Стек Переповнений");
        }
    }


    public Node peek()
    {
        if(!isempty())
        {
           return first.next;
        }
        else
        {
            System.out.println("Стек пустий + Лінкед ліст пустий");
            return null;
        }
    }


    public Node pop()
    {
        if(!isempty())
        {
            Node CurentNode = first;
            //first = first.next;
            linkList.deleteFirst();
            top--;
            return CurentNode;
        }
        else
        {
            System.out.println("Неможливо видали вузол стек пустий");
            return null;
        }
    }

    public void ShowLinkedListStack()
    {
        linkList.displayList();
        System.out.println(" ");
        System.out.println("Firs: "+first);
        System.out.println("Максимальна кількість елементів у стеку: "+size);
        System.out.println("Зараз у стеку: "+top);
    }
}