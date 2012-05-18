package controlwork2;

/**
 * @author AirVan
 */
public class ControlWork2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> list = new List<>();
        list.addToEnd("a", 5);
        list.addToEnd("b", 1);
        list.addToEnd("c", 2);
        list.addToEnd("d", 8);
        Comparator<String> compare = new Comparator<>();
        Sort<String> bubble = new Sort<>(list, compare);
        List<String> list2 = bubble.getSortedList();
        list2.output();
    }
}
