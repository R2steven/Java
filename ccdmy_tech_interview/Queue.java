package ccdmy_tech_interview;

public class Queue {
    
    // Variables
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;
    private Node tail;

    //Constructors

    public Queue()  {
        this(DEFAULT_MAX_SIZE);
    }

    public Queue(int maxSize)   {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    //Methods

    public void enqueue(String dataString)  {
        if (!this.hasSpace()){
            return;
        }
        Node newTail = new Node(dataString);
        this.tail.setNextNode(newTail);
        this.tail = newTail;
        this.size++;
    }

    public String dequeue() {
        if (this.isEmpty()){
            throw new Error("Queue is empty!");
        }
        String dataString =  this.queue.removeHead();
        this.size--;
        return dataString;
    }

    public String peek()   {
        return this.queue.head.data;
    }

    public boolean hasSpace() {
        return this.size < this.maxSize;
    }
      
    public boolean isEmpty() {
        return this.size == 0;
    }

    public static void main(String []args)  {
        Queue myQueue = new Queue();
        System.out.print("This queue has "+ myQueue.size + " nodes.");
    }
}
