package hw10.ex1;

import java.util.Iterator;

/**
 * Binary Search Tree
 */
public class Tree<TreeValue> implements Iterable<TreeValue>{
    /**
     * Constructor
     */
    public Tree() {
        this.root = null;
    }
    
    /**
     * Iterator for the Tree
     * @return 
     */
    @Override
    public Iterator<TreeValue> iterator() {
        Iterator<TreeValue> treeIterator = new TreeIterator<>(root);
        return treeIterator;
    }
    
    /**
     * Add new element to the Tree
     * @param value of an element
     * @param id  of an element
     */
    public void addElement(TreeValue value, int id) {
        if (root != null) {
            constructTree(root, value, id);
        } else {
            root = new TreeElement<>(value, id);
        }
    }
    
    /**
     * Make tree with new value
     * @param place where start
     * @param value to add
     * @param id of element we wanna add
     * @return 
     */
    public void constructTree(TreeElement<TreeValue> place, TreeValue value, int id) {
        // choose right or left way
        if (place.getId() > id) {
            // add if empty
            if (place.hasLeftSon()) {
                constructTree(place.getLeftSon(), value, id);
            } else {
                TreeElement<TreeValue> help = new TreeElement<>(value, id);
                place.setLeftSon(help);
            }
            
        } else {
            if (place.getId() < id) {
                // add if empty
                if (place.hasRightSon()) {
                    constructTree(place.getRightSon(), value, id);
                } else {
                    TreeElement<TreeValue> help = new TreeElement<>(value, id);
                    place.setRightSon(help);
                }
            } else {
                //exception about 'already exist'
            }
        }
    }
    
    /**
     * Output
     */
    public void output() {
        Iterator<TreeValue> step = new TreeIterator<>(root);
        while (step.hasNext()) {
            System.out.println(" " + step.next());
        }
    }
    
    /**
     * gets root
     * @return 
     */
    public TreeElement<TreeValue> getRoot() {
        return this.root;
    }
    
    /**
     * tree root
     */
    private TreeElement<TreeValue> root;

}
