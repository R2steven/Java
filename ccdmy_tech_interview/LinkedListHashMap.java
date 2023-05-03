package ccdmy_tech_interview;

public class LinkedListHashMap extends DoubleLinkedList {

    public LinkedListHashMap(String headKey, String headData, String tailKey, String tailData)  {
        this.head = new NodeHashMap(headKey, headData);
        this.tail = new NodeHashMap(tailKey, tailData);
        this.head.setNextNode(this.tail);
        this.tail.setPrevNode(this.head);
    }
    
    public void addToHead(String key, String data)  {
        NodeHashMap newHead = new NodeHashMap(key,data);
        NodeHashMap currentHead = (NodeHashMap)this.head;
        if (currentHead != null) {
            newHead.setNextNode(currentHead);
            currentHead.setPrevNode(newHead);
        }
        this.head = newHead;
        if (this.tail == null){
            this.tail = newHead;
        }
    }

    public void addToTail(String key,String data)  {
        NodeHashMap newTail = new NodeHashMap(key,data);
        NodeHashMap currentTail = (NodeHashMap)this.head;
        if (currentTail != null) {
          newTail.setPrevNode(currentTail);
          currentTail.setNextNode(newTail);
        }
        this.tail = newTail;
        if (this.head == null){
            this.head = newTail;
          }
    }

    public String toString()    {
        String output = "<head> ";
      NodeHashMap currentNode = (NodeHashMap)this.head;
      while (currentNode != null){
          output += ((DNode)currentNode).data+":"+currentNode.data+" ";
          currentNode = currentNode.getNextNode();
      }
      output+="<tail>";
      return output;
    }


    public static void main(String []args){
        LinkedListHashMap myList = new LinkedListHashMap("Spring", "rain", "Summer", "sun");
        System.out.println(myList.toString());
    }
}
