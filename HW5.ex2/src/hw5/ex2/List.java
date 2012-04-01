package hw5.ex2;

public class List extends SimpleList {

    /**
     * Сonstructor
     */
    public List() {
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * Addition to the end
     *
     * @param value element value
     */
    @Override
    public void addToEnd(String value) throws AlreadyExist {
        if (!exists(value)) {
            addToEnd(value);
        } else {
            throw new AlreadyExist("Alredy exist in List");

        }
    }

    /**
     * Addition to the beginning
     *
     * @param value element value
     */
    @Override
    public void addToStart(String value) throws AlreadyExist {
        if (!exists(value)) {
            addToStart(value);
        } else {
            throw new AlreadyExist("Alredy exist in List");
        }
    }

    /**
     * Get selected element value
     *
     * @param value element value
     */
    @Override
    public String getValue(int place) throws NotExist {
        if (place <= count) {
            return getValue(place);
        } else {
            throw new NotExist("Element with such id doesn't exist");
        }
    }

    /**
     * Delete selected element
     *
     * @param value element value
     */
    @Override
    public void deleteElement(String value) throws NotExist {
        if (exists(value)) {
            deleteElement(value);
        } else {
            throw new NotExist("Element that you want to deleted doesn't exist");
        }
    }
}
