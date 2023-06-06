package ccdmy_tech_interview;

import java.util.ArrayList;

public class TreeNode {

    // Variables

    public Object data;
    public ArrayList<TreeNode> children;

    // Constructors

    public TreeNode(Object data)    {
        this(data,new ArrayList<TreeNode>());
    }

    public TreeNode(Object data, ArrayList<TreeNode> children)  {
        this.data = data;
        this.children = children;
    }

    // Setters + getters

    public void addChild(TreeNode child)    {
        this.children.add(child);
    }

    public void addChild(Object childData)    {
        this.children.add(new TreeNode(childData));
    }

    public void removeChild(TreeNode childToRemove)   {
        if (this.children.isEmpty()){
            return;
        }
        else if(this.children.contains(childToRemove)){
            this.children.remove(childToRemove);
        }
        else{
            for (TreeNode child:this.children)  {
                child.removeChild(childToRemove);
            }
        }
    }

    public void removeChild(Object targetData)  {
        if (this.children.isEmpty()){
            return;
        }
        for (TreeNode child : this.children){
            if (child.data == targetData){
                this.children.remove(child);
                return;
            }
            child.removeChild(targetData);
        }

    }

    // Methods



    public static void main(String []args){
        TreeNode root = new TreeNode("test");
        System.out.println( root.data);
    }
    
}
