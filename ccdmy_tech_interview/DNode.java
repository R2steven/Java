package ccdmy_tech_interview;

public class DNode {

    //Variables
    public String data;
    private DNode next;
    private DNode prev;

    //Constructors

    public DNode(String data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    //Setters

    public void setNextNode(DNode node){
        this.next = node;
    }

    public void setPrevNode(DNode node) {
        this.prev = node;
    }


    //Getters

    public DNode getNextNode(){
        return this.next;
    }

    public DNode getPrevNode(){
        return this.prev;
    }

    //Methods
}
