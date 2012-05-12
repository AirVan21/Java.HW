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
    }
    
    public void add(int key, ValueType value) {
        BTreeElement<ValueType> currentTreeElement = new BTreeElement<>(key,value);
    }

    
    private BTreeNode<ValueType> treeRoot; 
}
