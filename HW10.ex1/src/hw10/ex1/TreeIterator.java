package hw10.ex1;

import java.util.Iterator;
/**
 * Cool iterator for our Tree with awesome TreeElement Stack
 * @author AirVan
 * @param <TreeValue> 
 */
public class TreeIterator<TreeValue> implements Iterator<TreeValue> {

    /**
     * Constructor
     */
    public TreeIterator(TreeElement<TreeValue> place) {
        this.place = place;
        this.way = new Stack<>();
        this.way.push(place.getValue(), place.getId(), place.getLeftSon(), place.getRightSon());
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
        // check left branch
        if (place.hasLeftSon()) {
            place = place.getLeftSon();
            way.push(place.getValue(), place.getId(), place.getLeftSon(), place.getRightSon());
            return this.next();
        }
        // check right branch
        if (place.hasRightSon()) {
            place = place.getRightSon();
            way.push(place.getValue(), place.getId(), place.getLeftSon(), place.getRightSon());
            return this.next();
        }
        // check leaf
        if (!place.hasLeftSon() && !place.hasRightSon()) {
            // medium result
            TreeElement<TreeValue> help = new TreeElement<>(way.top().getValue(), 0);
            this.remove();
            // check viewed links
            if (this.hasNext()) {
                if (place.getLeftSon() != null && place.getLeftSon().getValue() == help.getValue()) {
                    place.setLeftSon(null);
                } else {
                    if (place.getRightSon() != null) {
                        place.setRightSon(null);
                    }
                }
            }
            return help.getValue();
        }
        
        return place.getValue();
    }

    /**
     * Next step
     */
    @Override
    public void remove() {
        way.pop();
        place = way.top();
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
