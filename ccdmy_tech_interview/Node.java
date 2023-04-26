package ccdmy_tech_interview;


public class Node {
    //Variables
  public String data;
  private Node next;

  //Constructors

  public Node(String data){
		this.data = data;
    this.next = null;
  }

  //Getters

  public Node getNextNode(){
    return this.next;
  }

  //Setters

  public void setNextNode(Node node){
    this.next = node;
  }

  //Methods

	public static void main(String[] args) {

	}
}
