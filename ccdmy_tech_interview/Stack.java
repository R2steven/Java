package ccdmy_tech_interview;

public class Stack {
    

    //Variables

    public LinkedList stack;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    static final Error emptyStack = new Error("Stack is empty!");
    static final Error fullStack = new Error("Stack is full!");


    //Constructors

    public Stack(){
        this(DEFAULT_MAX_SIZE);
    }

    public Stack(int maxSize){
        this.stack = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    //methods

    public void push(String dataString){
        if (!this.hasSpace()){
            throw fullStack;
        }
        this.stack.addToHead(dataString);
        this.size++;
    }

    public String pop(){
        if (this.isEmpty()){
            throw emptyStack;
        }
        String data = this.stack.removeHead();
        this.size--;
        return data;
    }

    public String peek(){
        if (this.isEmpty()){
            return null;
        }
        return this.stack.head.data;
    }

    public boolean hasSpace(){
        return this.size<this.maxSize;
    }

    public boolean isEmpty(){
        return this.size<=0;
    }


    public static void main(String []args){

    }
}
