package ccdmy_tech_interview;

public class LinkedList {
    
    //Variables
    public Node head;

    //Constructors

    public LinkedList(){
        this.head = null;
    }

    public LinkedList(String headData)  {
        this.head = new Node(headData);
    }

    //Setters

    public void addToHead(String data)  {
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
        this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String data)  {
        Node tail = this.head;
        Node newTail = new Node(data);
        if (tail == null) {
        this.head = newTail;
        } 
        else {
            Node currentTail = this.traverse();
            currentTail.setNextNode(newTail);
        }
    }

    public String removeHead()  {
        Node removedHead = this.head;
        this.head = this.head.getNextNode();
        if (removedHead == null){
            return null;
        }
        return removedHead.data;
    }

    //Getters

    public Node traverse()   {
        Node currentNode = this.head;
        while (currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
    }

    public Node findTarget(String target){
        Node currentNode = this.head;
        while (currentNode.getNextNode() != null){
            if (target.equals(currentNode.data)){
                return currentNode;
            }
            currentNode = currentNode.getNextNode();
        }
        return null;
    }

    //Methods

    public String toString() {
        String output = "<head> ";
        Node currentNode = this.head;
        while (currentNode != null){
            output += currentNode.data+" ";
            currentNode = currentNode.getNextNode();
        }
        output+="<tail>";
        return output;
    }

    public void printList(){
        System.out.println(this.toString());
    }

    public static void main(String []args)  {

    }
}
