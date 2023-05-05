package ccdmy_tech_interview;

public class NodeHashMap extends DNode {

    String key = super.data;
    String data;

    public NodeHashMap(String key, String data){
        super(key);
        this.data = data;
    }

    public NodeHashMap getNextNode(){
        return (NodeHashMap)super.getNextNode();
    }

    public NodeHashMap getPrevNode(){
        return (NodeHashMap)super.getNextNode();
    }
}
