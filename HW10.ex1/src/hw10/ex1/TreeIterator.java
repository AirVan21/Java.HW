package hw10.ex1;

import java.util.Iterator;

public class TreeIterator<TreeValue> implements Iterator<TreeValue> {

    /**
     * Constructor
     */
    public TreeIterator(TreeElement<TreeValue> place) {
        this.place = place;
        this.way = new Stack<>();
        this.banStack = new Stack<>();
        this.way.push(place.getValue(), place.getId());
    }

    /**
     * Check opportunity to make new step
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        return this.way.top() != null;
    }

    /**
     * get's next element value
     *
     * @return
     */
    @Override
    public TreeValue next() {
        if (place.hasLeftSon() && !checkBan(place.getLeftSon().getValue())) {
            place = place.getLeftSon();
            way.push(place.getValue(), place.getId());
            return this.next();
        }
        if (place.hasRightSon() && !checkBan(place.getRightSon().getValue())) {
            place = place.getRightSon();
            way.push(place.getValue(), place.getId());
            return this.next();
        }
        if (!place.hasLeftSon() && !place.hasRightSon()) {
            // medium result
            TreeElement<TreeValue> help = new TreeElement<>(way.top().getValue(), 0);
            this.remove();
            return help.getValue();
        }
        this.remove();
        return place.getValue();
    }

    /**
     * Next step
     */
    @Override
    public void remove() {
        this.banStack.push(way.top().getValue(), 0);
        way.pop();
        place = way.top();
    }
    
    /**
     * Check for viewed elements
     * @param check
     * @return 
     */
    private boolean checkBan(TreeValue check) {
        TreeElement<TreeValue> current = banStack.top();
        while (current != null) {
            if (current.getValue() == check) {
                return true;
            } else {
                current = current.getNext();
            }
        }
       return false; 
    }
    
    /**
     * Way on tree
     */
    private Stack<TreeValue> way;
    
    /**
     * Ban Stack
     */
    private Stack<TreeValue> banStack;
   
    /**
     * Start for search
     */
    private TreeElement<TreeValue> place;
}
