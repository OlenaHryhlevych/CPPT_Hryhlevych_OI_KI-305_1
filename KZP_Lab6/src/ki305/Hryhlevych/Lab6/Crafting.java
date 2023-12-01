package ki305.Hryhlevych.Lab6;

import java.util.ArrayList;

public class Crafting<T extends Cargo> {

    /**
     * Constructor
     */
    public Crafting() {
        list = new ArrayList<T>();
    }

    ArrayList<T> list;

    /**
     * Method loads details into the products
     */
    public void load(T t) {
        list.add(t);
    }

    /**
     * Method prints info about details
     */
    public void get(int index) {
        list.get(index).print();
    }

    /**
     * Method removes details from products
     */
    public void remove(int index) {
        list.remove(index);
    }

    /**
     * Method prints summary products
     */
    public void weight() {
        int sumPieces = 0;
        for (T t : list)
            sumPieces += t.getPieces();
        System.out.println("How many products: " + sumPieces + "pieces");
    }

    /**
     * Method returns cargo with the smallest weight
     */
    public T findMin() {
        T min = list.get(0);
        for (T t : list)
            if (t.compareTo(min) == -1)
                min = t;
        return min;
    }
}
