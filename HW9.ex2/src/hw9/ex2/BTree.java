package hw9.ex2;

/**
 * B - Tree
 */
public class BTree<ValueType> {

    /**
     * Constructor
     *
     * @param nodeAmount amount of keys in every tree node
     */
    public BTree(int keyAmount) {
        treeRoot = new BTreeNode<>(keyAmount);
        currentNode = treeRoot;
    }
    
    /**
     * Addition
     * @param key
     * @param value 
     */
    public void addToTree(int key, ValueType value) {
        if(currentNode.mayAdd()) {
            currentNode.addToNode(key, value);
        } else {
            
        }
    }

    
    private BTreeNode<ValueType> treeRoot; 
    
    private BTreeNode<ValueType> currentNode;
}
