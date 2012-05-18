package hw9.ex2;

import java.util.ArrayList;

/**
 * Class for B - Tree nodes
 */
public class BTreeNode<ValueType> {

    /**
     * Construcor
     *
     * @param keyAmount amount of BTreeElements in the node
     */
    public BTreeNode(int keyAmount) {
        currentMax = 0;
        emptyNodeAmount = keyAmount;
        this.keyAmount = keyAmount;
    }
    
    /**
     * Addition to B - Tree node
     * @param key
     * @param value 
     */
    public void addToNode(int key, ValueType value) {
        for (int i = 0; i < this.keyAmount; i++) {
        }
    }
    
    /**
     * Check for correct new element addition
     */
    public boolean mayAdd() {
        return emptyNodeAmount != 0;
    }
    
    /**
     * BTree node's sons
     */
    private BTreeNode<ValueType> sons;
    
    /**
     * BTreeElements mas in node
     */
    private ArrayList<ValueType> nodeMas;
    
    /**
     * Node filling rate
     */
    private int emptyNodeAmount;
    
    /**
     * Max key - id
     */
    private int currentMax;
    
    /**
     * Key amount
     */
    private int keyAmount;
}
