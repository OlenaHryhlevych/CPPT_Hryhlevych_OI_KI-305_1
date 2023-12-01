package ki305.Hryhlevych.Lab2;

import java.util.ArrayList;
import java.util.Arrays;



public class Vaccine {

    private ArrayList<String> vaccines;

    /**
     * Constructor
     */
    public Vaccine()
    {
        this.vaccines = new ArrayList<>();
    }
    /**
     * Constructor
     * @param str new vaccine
     */
    public Vaccine(String str)
    {
        this();
        addVaccines(str);
    }
    /**
     * Constructr
     * @param args range of vaccines
     */
    public Vaccine(String[] args)
    {
        this();
        addVaccines(args);
    }
    /**
     * Add new vaccine
     * @param vaccines new vaccine
     */
    public void addVaccines(String vaccines)
    {
        this.vaccines.add(vaccines);
    }
    /**
     * Add range of vaccines
     * @param vaccines new vaccines
     */
    public void addVaccines(String[] vaccines)
    {
        this.vaccines.addAll(Arrays.asList(vaccines));
    }
    /**
     * Get list of vaccines
     * @return list of vaccines
     */
    public ArrayList<String> getList()
    {
        return this.vaccines;
    }
    /**
     * Transform vaccines to string list
     */
    public String toString()
    {
        String string = new String();
        for (int i = 0; i < this.vaccines.size(); i++)
            string += vaccines.get(i) + " ";
        return string;
    }
}
