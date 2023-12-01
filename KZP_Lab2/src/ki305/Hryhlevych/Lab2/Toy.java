package ki305.Hryhlevych.Lab2;

import java.util.ArrayList;
import java.util.Arrays;



public class Toy {

    private ArrayList<String> toys;

    /**
     * Constructor
     */
    public Toy()
    {
        this.toys = new ArrayList<>();
    }
    /**
     * Constructor
     * @param toy new toy
     */
    public Toy(String toy)
    {
        this();
        addToy(toy);
    }
    /**
     * Constructor
     * @param toy new toys
     */
    public Toy(String[] toy)
    {
        this();
        addToys(toys.toArray(new String[0]));
    }
    /**
     * Add toy to the object
     * @param toy new toy
     */
    public void addToy(String toy)
    {
        this.toys.add(toy);
    }
    /**
     * Add range of toys to the object
     * @param toys range of toys
     */
    public void addToys(String[] toys)
    {
        this.toys.addAll(Arrays.asList(toys));
    }
    /**
     * Get all toys
     * @return list of toys
     */
    public ArrayList<String> getList()
    {
        return this.toys;
    }

    public String toString()
    {
        String string = new String();
        for (int i = 0; i < this.toys.size(); i++)
            string += this.toys.get(i) + " ";
        return string;
    }
}
