package ki305.Hryhlevych.Lab3;

import java.io.FileNotFoundException;



public class ExperimentalCat extends Cat implements Hungry {

    /**
     * Constructor
     *
     * @throws FileNotFoundException
     */
    public ExperimentalCat() throws FileNotFoundException {
        super();
        hungry = 1;

    }

    /**
     * Constructor
     *
     * @param weight
     * @param hungry
     * @throws FileNotFoundException
     */
    public ExperimentalCat(int weight, int hungry) throws FileNotFoundException {
        super(weight);
        this.hungry = hungry;
    }

    /**
     * Constructor
     *
     * @param happy
     * @param colour
     * @param species
     * @param weight
     * @param hungry
     * @throws FileNotFoundException
     */
    public ExperimentalCat(int happy, String colour, String species, int weight, int hungry) throws FileNotFoundException {
        super(happy, colour, species, weight);
        this.hungry = hungry;
    }

    private int hungry;

    /**
     * Method prints info about hungry
     */
    @Override
    public void info() {
        System.out.println("Where: at Home");
        fout.println("Where: at Home");
        super.info();
        printHungry();
    }

    /**
     * Method prints hungry of water
     */
    @Override
    public void printHungry() {
        System.out.println("Hungry: " + getHungry() + "%");
        fout.println("Hungry: " + getHungry() + "%");
    }

    /**
     * Method gets hungry of water
     */
    @Override
    public int getHungry() {
        return hungry;
    }
}
