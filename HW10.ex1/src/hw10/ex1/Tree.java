package hw10.ex1;

/**
 * Binary Tree
 */
public class Tree<TreeValue> {
    /**
     * Constructor
     */
    public Tree() {
        this.root = null;
    }
    
    /**
     * addition to Tree
     * @param value of TreeElement
     * @param id of TreeElement
     */
    public void fillTreeElement(TreeElement<TreeValue> current, TreeValue value, int id) {
       // set something
    }
    
    /**
     * finds place for new element
     */
    public TreeElement<TreeValue> findPlace(int id, TreeElement<TreeValue> current) {
        if (current == null) {
            return current;
        } else {
            if (id > current.getId()) {
                this.findPlace(id, current.getRightSon());
            }
            if (id < current.getId()) {
                this.findPlace(id, current.getLeftSon());
            }     
        }
        return root;
    }
    
    /**
     * tree root
     */
    private TreeElement<TreeValue> root;
}
