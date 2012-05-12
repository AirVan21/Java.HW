package hw9.ex2;
    
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
        emptyNodeAmount = keyAmount;
        for (int i = 0; i < keyAmount; i++) {
            node[i] = new BTreeElement<>(0, null);
        }
    }
    
    /**
     * Addition to B - Tree node
     * @param key
     * @param value 
     */
    public void addToNode(int key, ValueType value) {
        
        
    }
    
    /**
     * BTreeElements mas in node
     */
    private BTreeElement<ValueType> node[];
    
    /**
     * Node filling rate
     */
    private int emptyNodeAmount;
    
    /**
     * Max key - id
     */
    private int currenMax;
}
