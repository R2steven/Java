package ccdmy_tech_interview;

public class DoubleLinkedList {
  //Variables 
  public DNode head;
  public DNode tail;

  //Constructors

  public DoubleLinkedList()   {
      this.head = null;
      this.tail = null;
  }

  public DoubleLinkedList(String headData, String tailData)  {
      this.head = new DNode(headData);
      this.tail = new DNode(tailData);
  }

  //Setters

  public void addToHead(String data)  {
      DNode newHead = new DNode(data);
      DNode currentHead = this.head;
      if (currentHead != null) {
        newHead.setNextNode(currentHead);
        currentHead.setPrevNode(newHead);
      }
      this.head = newHead;
      if (this.tail == null){
        this.tail = newHead;
      }
  }

  public void addToTail(String data)  {
      DNode newTail = new DNode(data);
      DNode currentTail = this.tail;
      if (currentTail != null) {
        newTail.setPrevNode(currentTail);
        currentTail.setNextNode(newTail);
      }
      this.tail = newTail;
      if (this.head == null){
          this.head = newTail;
        }
  }

  //Getters
  public DNode Ftraverse()   {
      DNode currentNode = this.head;
      while (currentNode.getNextNode() != null){
          currentNode = currentNode.getNextNode();
      }
      return currentNode;
  }

  public DNode Rtraverse()   {
      DNode currentNode = this.tail;
      while (currentNode.getPrevNode() != null){
          currentNode = currentNode.getPrevNode();
      }
      return currentNode;
  }

  public DNode findTarget(String target, int direction){
      if (direction == 1){
          DNode currentNode = this.head;
          while (currentNode != null){
              if (target.equals(currentNode.data)){
                  return currentNode;
              }
          currentNode = currentNode.getNextNode();
          }
          return null;
      }
      else if (direction == -1 ){
          DNode currentNode = this.tail;
          while (currentNode != null){
              if (target.equals(currentNode.data)){
                  return currentNode;
              }
              currentNode = currentNode.getPrevNode();
          }
      return null;
      }
      return null;
  }

  //Methods

  public void remove(DNode node) {
    if (node!=null){
        if (node==this.head){
            this.removeHead();
        }
        else if(node==this.tail){
            this.removeTail();
        }
        else{
            DNode next = node.getNextNode();
            DNode prev = node.getPrevNode();
            next.setPrevNode(prev);
            prev.setNextNode(next);
        }
    }
  }
  
  public String removeHead()  {
      DNode removedHead = this.head;
      if (removedHead == null){
          return null;
      }
      this.head = removedHead.getNextNode();
      if (this.head == null){
        this.tail = null;
        return removedHead.data;
      }
      this.head.setPrevNode(null);
      if (removedHead == this.tail){
        this.removeTail();
      }
      
      return removedHead.data;
  }

  public String removeTail()  {
      DNode removedTail = this.tail;
      if (removedTail == null){
          return null;
      }
      this.tail = removedTail.getPrevNode();
      if (this.tail == null){
        this.head = null;
        return removedTail.data;
      }
      this.tail.setNextNode(null);
      if (removedTail == this.head){
        this.removeHead();
      }
      
      return removedTail.data;
  }

  public DNode removeByData(String data)    {
    DNode nodeToRemove = this.findTarget(data, 1);
    this.remove(nodeToRemove);
    return nodeToRemove;
  }

  public String toString() {
      String output = "<head> ";
      DNode currentNode = this.head;
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