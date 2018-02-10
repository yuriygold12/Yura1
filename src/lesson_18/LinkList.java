package lesson_18;

public class LinkList {
    private Node firts;

    public LinkList() {
        this.firts = null;
    }

    public void insertToBegin(int id, double value){
        Node newNode = new Node(id,value);
        newNode.next = firts;
        firts = newNode;
    }

    public void displayList(){
        System.out.println(" List (fisrt-->last): ");
        Node currentNode = firts;
        while (currentNode!=null){
            currentNode.showNode();
            currentNode = currentNode.next;
        }
    }

}
