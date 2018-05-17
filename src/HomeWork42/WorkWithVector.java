package HomeWork42;

import java.util.*;

public class WorkWithVector {
    public static void main(String[] args) {
        Vector<Integer> vector1 = new Vector<>();
        vector1.add(1);
        vector1.add(2);

        Vector<Integer> vector2 = new Vector<>();
        vector2.add(12332);
        vector2.add(2444323);

        Vector<Integer> vector = new Vector<>(25);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(5);


        System.out.println("Vector : " + vector.toString());
        vector.add(3, 111);
        System.out.println("Vector : " + vector.toString());
        vector.add(22222);
        System.out.println("Vector : " + vector.toString());
        vector.addAll(vector1);
        System.out.println("Vector : " + vector.toString());
        vector.addAll(2, vector1);
        System.out.println("Vector : " + vector.toString());
        vector.addElement(555);
        System.out.println("Vector : " + vector.toString());
        System.out.println("capacity: " + vector.capacity());
        System.out.println("contains: " + vector.contains(222));
        System.out.println("ContainsAll: " + vector.containsAll(vector2));
        int element = vector.elementAt(6);
        System.out.println("Element po indeksy: " + element);
        System.out.println("Size :" + vector.size());
        System.out.println("Equals two elements: " + vector.equals(vector));
        System.out.println("Firs element: " + vector.firstElement());
        System.out.println("Get return elent with index: " + vector.get(4));
        System.out.println("Hash cod: " + vector.hashCode());
        System.out.println("is empty: " + vector.isEmpty());
        //arraylist.clear();
        System.out.println("Vector : " + vector.toString());
        //arraylist.setSize(100);
        //System.out.println("Size: "+arraylist.size());
        vector.set(1, 19081990);
        System.out.println("Vector : " + vector.toString());
        int inexof = vector.indexOf(5434);
        System.out.println("Inexof: " + inexof);
        int indOf = vector.indexOf(5, 9);
        System.out.println("IndexOf: " + indOf);
        vector.insertElementAt(1990, 2);
        System.out.println("Vector : " + vector.toString());
        int lastelement = vector.lastElement();
        System.out.println("last element: " + lastelement);
        System.out.println("lastIndexOf: " + vector.lastIndexOf(19081990));
        System.out.println("lastIndexOfWithIndex: " + vector.lastIndexOf(111, 3));
        System.out.println("Remove: " + vector.remove(2));
        System.out.println("Vector : " + vector.toString());
        vector.remove(vector.indexOf(22222));
        System.out.println("Vector : " + vector.toString());
        //arraylist.removeAll(arraylist);
        //arraylist.removeAllElements();
        System.out.println("Vector : " + vector.toString());
        vector.removeElement(3);
        System.out.println("Vector : " + vector.toString());
        vector.removeElementAt(2);
        System.out.println("Vector : " + vector.toString());
        //arraylist.trimToSize();
        System.out.println("Vector : " + vector.toString());
        //System.out.println("capacity: " + arraylist.capacity());
        //System.out.println("Size :"+ arraylist.size());
        //System.out.println("retainAll: " + arraylist.retainAll(arraylist3));
        vector.setElementAt(1990, 1);
        System.out.println("Vector : " + vector.toString());
        Object ob[] = vector.toArray();
        for (int i = 0; i < ob.length; i++) {
            System.out.print("ob: " + ob[i] + "  ");
        }
        System.out.println(" ");
        Object ob1[] = vector.toArray(ob);
        for (int i = 0; i < ob1.length; i++) {
            System.out.print("ob: " + ob[i] + "  ");
        }
        System.out.println(" ");
        vector.ensureCapacity(50);
        System.out.println("Size : " + vector.size());
        System.out.println("capacity: " + vector.capacity());
        Integer ob2[] = new Integer[vector.size()];
        vector.copyInto(ob2);
        for (int i = 0; i < ob2.length; i++) {
            System.out.print(ob2[i] + "  ");
        }
        System.out.println(" ");
        System.out.println("Vector : " + vector.toString());
        System.out.println("Clone");
        ListIterator<Integer> listiterator = vector.listIterator();
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(listiterator.next() + "   ");
        }
        System.out.println(" ");






       /*ArrayList<Integer> arraylist3 = new ArrayList<>();
        arraylist3.add(1);
        arraylist3.add(2);

        ArrayList<Integer> arraylist2 = new ArrayList<>();
        arraylist2.add(12332);
        arraylist2.add(2444323);

        ArrayList<Integer> arraylist = new ArrayList<>(25);
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        arraylist.add(5);


        System.out.println("Vector : " + arraylist.toString());
        arraylist.add(3, 111);
        System.out.println("Vector : " + arraylist.toString());
        arraylist.add(22222);
        System.out.println("Vector : " + arraylist.toString());
        arraylist.addAll(arraylist3);
        System.out.println("Vector : " + arraylist.toString());
        arraylist.addAll(2, arraylist3);
        System.out.println("Vector : " + arraylist.toString());
        arraylist.addElement(555);
        System.out.println("Vector : " + arraylist.toString());
        System.out.println("capacity: " + arraylist.capacity());
        System.out.println("contains: " + arraylist.contains(222));
        System.out.println("ContainsAll: " + arraylist.containsAll(arraylist2));
        int element1 = arraylist.elementAt(6);
        System.out.println("Element po indeksy: " + element1);
        System.out.println("Size :" + arraylist.size());
        System.out.println("Equals two elements: " + arraylist.equals(arraylist));
        System.out.println("Firs element: " + arraylist.firstElement());
        System.out.println("Get return elent with index: " + arraylist.get(4));
        System.out.println("Hash cod: " + arraylist.hashCode());
        System.out.println("is empty: " + arraylist.isEmpty());
        //arraylist.clear();
        System.out.println("Vector : " + arraylist.toString());
        //arraylist.setSize(100);
        //System.out.println("Size: "+arraylist.size());
        arraylist.set(1, 19081990);
        System.out.println("Vector : " + arraylist.toString());
        int inexof1 = arraylist.indexOf(5434);
        System.out.println("Inexof: " + inexof1);
        int indOf1 = arraylist.indexOf(5, 9);
        System.out.println("IndexOf: " + indOf1);
        arraylist.insertElementAt(1990, 2);
        System.out.println("Vector : " + arraylist.toString());
        int lastelement1 = arraylist.lastElement();
        System.out.println("last element: " + lastelement1);
        System.out.println("lastIndexOf: " + arraylist.lastIndexOf(19081990));
        System.out.println("lastIndexOfWithIndex: " + arraylist.lastIndexOf(111, 3));
        System.out.println("Remove: " + arraylist.remove(2));
        System.out.println("Vector : " + arraylist.toString());
        arraylist.remove(arraylist.indexOf(22222));
        System.out.println("Vector : " + arraylist.toString());
        arraylist.removeAll(arraylist);
        arraylist.removeAllElements();
        System.out.println("Vector : " + arraylist.toString());
        arraylist.removeElement(3);
        System.out.println("Vector : " + arraylist.toString());
        arraylist.removeElementAt(2);
        System.out.println("Vector : " + arraylist.toString());
        arraylist.trimToSize();
        System.out.println("Vector : " + arraylist.toString());
        System.out.println("capacity: " + arraylist.capacity());
        System.out.println("Size :"+ arraylist.size());
        System.out.println("retainAll: " + arraylist.retainAll(arraylist3));
        arraylist.setElementAt(1990, 1);
        System.out.println("Vector : " + arraylist.toString());
        Object ob[] = arraylist.toArray();
        for (int i = 0; i < ob.length; i++) {
            System.out.print("ob: " + ob[i] + "  ");
        }
        System.out.println(" ");
        Object ob5[] = arraylist.toArray(ob);
        for (int i = 0; i < ob5.length; i++) {
            System.out.print("ob: " + ob5[i] + "  ");
        }
        System.out.println(" ");
        arraylist.ensureCapacity(50);
        System.out.println("Size : " + arraylist.size());
        System.out.println("capacity: " + arraylist.capacity());
        Integer ob3[] = new Integer[arraylist.size()];
        arraylist.copyInto(ob3);
        for (int i = 0; i < ob2.length; i++) {
            System.out.print(ob2[i] + "  ");
        }
        System.out.println(" ");
        System.out.println("Vector : " + arraylist.toString());
        System.out.println("Clone");
        ListIterator<Integer> listiterator1 = arraylist.listIterator();
        for (int i = 0; i < arraylist.size() ; i++) {
            System.out.print(listiterator1.next() +"   ");
        }
       */
        System.out.println(" ");
    }
}
