package ccdmy_tech_interview;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    
    // Variables

    public TreeNode root;

    // Constructors

    public Tree(TreeNode root)  {
        this.root = root;
    }

    // Setters + getters

    // Methods

    public void depthFirstTraversal(TreeNode current)   {
        System.out.print(current.data+" ");
        for (TreeNode child : current.children){
            this.depthFirstTraversal(child);
        }
    }

    public void breadthFirstTraversal() {
        TreeNode current = this.root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(current); 
        while (!queue.isEmpty()){
            current = queue.poll();
            System.out.print(current.data+" ");
            queue.addAll(current.children);
        }
    }

    public static void main(String []args){
        TreeNode treeRoot = new TreeNode("S");
        TreeNode child1 = new TreeNode("N");
        TreeNode child2 = new TreeNode("O");
        TreeNode grandchild1 = new TreeNode("W");
        TreeNode grandchild2 = new TreeNode("Y");
        treeRoot.addChild(child1);
        treeRoot.addChild(child2);
        child1.addChild(grandchild1);
        child2.addChild(grandchild2);

        // Create tree
        Tree letters = new Tree(treeRoot); 
        System.out.println(letters.root.data);

        letters.breadthFirstTraversal();
        System.out.print('\n');
        letters.depthFirstTraversal(letters.root);

    }
}
