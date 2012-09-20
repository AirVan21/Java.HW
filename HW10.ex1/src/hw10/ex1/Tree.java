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
    public void addElement(TreeValue value, int id) throws AlreadyExistException{
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
    public void constructTree(TreeElement<TreeValue> place, TreeValue value, int id) throws AlreadyExistException{
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
                throw new AlreadyExistException("You've tried to add an element, with wrong id");
            }
        }
    }
    
    /**
     * Check element in tree or not
     * @param searchValue
     * @return 
     */
    public boolean elementExist(TreeValue searchValue) {
        Iterator<TreeValue> step = new TreeIterator<>(root);
        while (step.hasNext()) {
            if (step.next() == searchValue) {
                return true;
            }
        }
        return false;
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
