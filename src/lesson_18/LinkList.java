package lesson_18;

import javax.naming.PartialResultException;
import javax.swing.plaf.ColorUIResource;
import java.io.FileReader;
import java.net.StandardSocketOptions;

public class LinkList {
    private Node firts;
    private StackLinkedList stackLinkedList;

    public LinkList() {
        this.firts = null;
        this.stackLinkedList = new StackLinkedList(6 );
    }

    //Вставити на початок.
    public void insertToBegin(int id, double value){
        Node newNode = new Node(id,value);
        newNode.next = firts;
        firts = newNode;
        if(!stackLinkedList.isfull())
        {
            stackLinkedList.Push(firts);
        }
        else
        {
            System.out.println("у стек елемент не додасся бо переповнений");
        }
    }

    //Видалити з початку.
    public Node deleteFirst()
    {
        Node tmpNode = firts;
        if(tmpNode!=null)
        {
            firts = firts.next;
        }

        if(!stackLinkedList.isempty())
        {
            stackLinkedList.pop();
        }
        return tmpNode;
    }

    //Метод FInd.
    /*public Node Find(int id)
    {
        Node tmpCurrent = firts;
        Node tmpValue = null;
        while(tmpCurrent.index !=id)
        {
            tmpCurrent = tmpCurrent.next;
        }
        if(tmpValue !=null)
        {
        return tmpValue = tmpCurrent;
        }
        else
        {
        return null;
        }
    }
    */


    public StackLinkedList getStackLinkedList() {
        return stackLinkedList;
    }

    //Метод FInd.Версія - 2.
    public Node Find(int id)
    {
        Node tmpCurrent = firts;
        Node tmpValue = null;
        while(tmpCurrent.next !=null)
        {
            if(tmpCurrent.index == id)
            {
                tmpValue = tmpCurrent;
            }
            tmpCurrent = tmpCurrent.next;
        }
        if(tmpValue!= null)
        {
            return tmpValue;
        }
        else
        {
            return null;
        }
    }

    //Видалити по id.
    public Node delete(int id)
    {
        Node currentNode = firts;
        Node prevNode = firts;
        while(currentNode.index !=id)
        {
            if(currentNode.next == null)
            {
                System.out.println("element not found");
                return null;
            }
            else
            {
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        if(currentNode == firts)
        {
            firts = firts.next;
        }
        else
        {
            prevNode.next = currentNode.next;
        }
        return currentNode;
    }

    //Добавити після якогось елементу.
     public void AddNewAfttenAllament(int id)
     {
         Node tmpValue = new Node(12,13);
         Node CurrentNode = firts;
         Node prevNode = null;
         if(CurrentNode!=null) {
             while (CurrentNode.index != id) {
                 CurrentNode = CurrentNode.next;
                 if(CurrentNode.next == null) { break; }
             }
         }
         else
         {
             System.out.println("Списук на даний момент пустий додаем елемент");
                 tmpValue.next = firts;
                 firts = tmpValue;
                 CurrentNode = firts;
         }
             if(CurrentNode.index == id && CurrentNode !=null) {
                 prevNode = CurrentNode;
                 tmpValue.next = CurrentNode.next;
                 prevNode.next = tmpValue;
             }
             else
             {
                 System.out.println("Не знайшлося елементу з даним елементом тому не додаем після якогось елемета");
             }
     }

    //Добавити перед якогось елементу.
    public void AddNewBefforeAllament(int id)
    {
        Node tmpValue = new Node(123,134);
        Node CurrentNode = firts;
        Node prevNode = firts;
        if(CurrentNode!=null) {
            while (CurrentNode.index != id) {
                prevNode = CurrentNode;
                CurrentNode = CurrentNode.next;
                if (CurrentNode == null) { break; }
            }
        }
        else
        {
            System.out.println("Список Пустий додаем елемент)))");
            tmpValue.next = firts;
            firts = tmpValue;
            CurrentNode = firts;
        }
            if (CurrentNode != firts && CurrentNode.index == id) {
                prevNode.next = tmpValue;
                tmpValue.next = CurrentNode;
            }
            if (CurrentNode == firts && CurrentNode.index == id) {
                tmpValue.next = CurrentNode;
                firts = tmpValue;
            }
            if(CurrentNode != firts && CurrentNode.index != id && CurrentNode == firts && CurrentNode.index != id){
                System.out.println();
                System.out.println("Не знайшлося елементу з айді що додати перед цим елементом");
            }
    }


    //Вивід Списку.
    public void displayList(){
        System.out.print("\nList (fisrt-->last): ");
        Node currentNode = firts;
        while (currentNode!=null){
            currentNode.showNode();
            currentNode = currentNode.next;
        }
    }
}
