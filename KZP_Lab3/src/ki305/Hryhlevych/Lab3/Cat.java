package ki305.Hryhlevych.Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class Cat {
    public Cat() throws FileNotFoundException {
        this.happy = new Happy();
        this.colour = new Colour();
        this.species = new Species();
        this.weight = 5;
        fout = new PrintWriter(new File("Log1.txt"));
    }

    /**
     * Constructor
     *
     * @param weight
     * @throws FileNotFoundException
     */

    public Cat(int weight) throws FileNotFoundException {
        this.happy = new Happy();
        this.colour = new Colour();
        this.species = new Species();
        this.weight = weight;
        fout = new PrintWriter(new File("Log1.txt"));
    }

    /**
     * Constructor
     *
     * @param happy
     * @param colour
     * @param species
     * @param weight
     * @throws FileNotFoundException
     */
    public Cat(int happy, String colour, String species, int weight) throws FileNotFoundException {
        this.happy = new Happy(happy);
        this.colour = new Colour(colour);
        this.species = new Species(species);
        this.weight = weight;
        fout = new PrintWriter(new File("Log1.txt"));
    }

    private Happy happy;
    private Colour colour;
    private Species species;
    private int weight;
    protected PrintWriter fout;

    /**
     * Method returns weight
     *
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Method sets weight
     *
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Method implements feeding the cat
     */
    public void GiveFood() {
        happy.setHapieness(25);
        System.out.println("The cat ate");
        fout.println("The cat ate");
    }

    /**
     * Method implements stroking a cat
     */
    public void stroke() {
        happy.setHapieness(20);
        System.out.println("THE CAT IS HAPPY!!!");
        fout.println("THE CAT IS HAPPY!!!");
    }

    /**
     * Method prints info about cats Hapieness
     */
    public void printHapieness() {
        System.out.println("Hapieness: " + happy.getHapieness() + "%");
        fout.println("Hapieness: " + happy.getHapieness() + "%");
    }

    /**
     * Method prints info about colour
     */
    public void printColour() {
        System.out.println("Colour: " + colour.getDescription());
        fout.println("Colour: " + colour.getDescription());
    }

    /**
     * Method prints info about species
     */
    public void printSpecies() {
        System.out.println("Species: " + species.getDescription());
        fout.println("Species: " + species.getDescription());
    }

    /**
     * Method prints info about weight
     */
    public void printWeight() {
        System.out.println("Weight: " + getWeight());
        fout.println("Weight: " + getWeight());
    }

    /**
     * Method prints info about Cat
     */
    public void info() {
        printHapieness();
        printColour();
        printSpecies();
        printWeight();
    }

    /**
     * Method releases used recourses
     */
    public void dispose() {
        fout.close();
    }
}
