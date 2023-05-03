package ccdmy_tech_interview;

public class DNode implements NodeBaseDouble {

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

    public void setNextNode(NodeBase node){
        this.next = (DNode)node;
    }

    public void setPrevNode(NodeBaseDouble node) {
        this.prev = (DNode)node;
    }


    //Getters

    public DNode getNextNode(){
        return this.next;
    }

    public DNode getPrevNode(){
        return this.prev;
    }

    //Methods

    public static void main(String []args){

    }
}
