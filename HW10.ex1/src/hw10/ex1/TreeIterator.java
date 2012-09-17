package hw10.ex1;

import java.util.Iterator;

public class TreeIterator<TreeValue> implements Iterator<TreeValue> {

    /**
     * Constructor
     */
    public TreeIterator(TreeElement<TreeValue> place) {
        this.place = place;
        this.way = new Stack<>();
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
        if (this.place.hasLeftSon()) {
            place = place.getLeftSon();
            way.push(place.getValue(), place.getId());
        } else {
            if (this.place.hasRightSon()) {
                place = place.getRightSon();
                way.push(place.getValue(), place.getId());
            } else {
                this.remove();
            }
        }
        return this.place.getValue();
    }

    /**
     * Next step
     */
    @Override
    public void remove() {
        way.pop();
    }
    
    /**
     * Way on tree
     */
    private Stack<TreeValue> way;
   
    /**
     * Start for search
     */
    private TreeElement<TreeValue> place;
}
