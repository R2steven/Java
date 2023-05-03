package ccdmy_tech_interview;

public interface LinkedListBase {
    public void addToHead(String data);
    public void addToTail(String data);
    public String removeHead();
    public NodeBase traverse();
    public NodeBase findTarget(String target);
}
