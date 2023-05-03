package ccdmy_tech_interview;

public interface LinkedListBaseDouble extends LinkedListBase {
    public void addToTail(String data);
    public DNode Rtraverse();
    public String removeTail();
    public void remove(NodeBaseDouble node);
    public DNode removeByData(String data);
    public NodeBase findTarget(String target, int direction);
}
