package hw10.ex1;

import java.util.Iterator;

/**
 * Binary Tree
 */
public class Tree<TreeValue> /**implements Iterable<TreeValue>*/{
    /**
     * Constructor
     */
    public Tree() {
        this.root = null;
    }
    
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
     * Iterator for the Tree
     * @return 
     *
    @Override
    public Iterator<TreeValue> iterator() {
        return new TreeIterator();
    }
    
    private class TreeIterator implements Iterator<TreeValue> {
        
        /**
         * Constructor
         *
        public TreeIterator() {
            this.way = root;
        }

        /**
         * Check opportunity to make new step 
         * @return 
         *
        @Override
        public boolean hasNext() {
            return ((this.way.getLeftSon() != null) || (this.way.getRightSon() != null));
        }

        /**
         * get's next element value
         * @return 
         *
        @Override
        public TreeValue next() {
            if (this.way.hasLeftSon()) {
                //way = this
            }
            return this.way.getValue();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
        
        private TreeElement<TreeValue> way;
        
    }*/
    
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
