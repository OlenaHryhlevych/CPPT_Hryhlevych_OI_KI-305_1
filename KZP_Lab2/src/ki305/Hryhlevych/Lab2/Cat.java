package ki305.Hryhlevych.Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;



public class Cat {

    private Toy toy;
    private Vaccine vaccine;
    private Species species;
    private PrintWriter printWriter;
    /**
     * Constructor
     */
    public Cat()
    {
        toy = new Toy();
        vaccine = new Vaccine();
        species = new Species();
        species.setSpecies(FilletType.UNKNOWN);
    }
    /**
     * Constructor
     * @param _vaccine Vaccine object
     */
    public Cat(Vaccine _vaccine)
    {
        vaccine = _vaccine;
        species = new Species();
        toy = new Toy();
        species.setSpecies(FilletType.UNKNOWN);
    }
    /**
     * Constructor
     * @param _toy Toy object
     */
    public Cat(Toy _toy)
    {
        toy = _toy;
        vaccine = new Vaccine();
        species = new Species();
        species.setSpecies(FilletType.UNKNOWN);
    }
    /**
     * Constructor
     * @param _species Species object
     */
    public Cat(Species _species)
    {
        toy = new Toy();
        vaccine = new Vaccine();
        species = _species;
    }
    /**
     * Constructor
     * @param _vaccine Vaccine object
     * @param _toy Toy object
     * @param _species Species object
     */
    public Cat(Vaccine _vaccine, Toy _toy, Species _species)
    {
        toy = _toy;
        vaccine = _vaccine;
        species = _species;
    }
    /**
     * Set new Toy to Cat
     * @param _toy new toy object
     */
    public void setToy(Toy _toy)
    {
        this.toy = _toy;
    }
    /**
     * Add toy range to cat
     * @param _toy toy range
     */
    public void addToy(Toy _toy)
    {
        String[] liStrings = new String[_toy.getList().size()];
        for (int i = 0; i < liStrings.length; i++)
            liStrings[i] = _toy.getList().get(i);
        this.toy.addToys(liStrings);
    }
    /**
     * Set new Vaccine to Cat
     * @param _vaccine new vaccine object
     */
    public void setVaccine(Vaccine _vaccine)
    {
        this.vaccine = _vaccine;
    }
    /**
     * Add vaccine range to Cat
     * @param _vaccine new vaccine
     */
    public void addVaccine(Vaccine _vaccine)
    {
        String[] liStrings = new String[_vaccine.getList().size()];
        for (int i = 0; i < liStrings.length; i++)
            liStrings[i] = _vaccine.getList().get(i);
        this.vaccine.addVaccines(liStrings);
    }
    /**
     * Set new Species to cat
     * @param _species new species
     */
    public void setSpecies(Species _species)
    {
        this.species = _species;
    }
    /**
     * Return Cat Vaccine
     * @return cat Vaccine
     */
    public Toy getToy()
    {
        return this.toy;
    }
    /**
     * Return Cat Vaccine
     * @return Cat Vaccine
     */
    public Vaccine getVaccine()
    {
        return this.vaccine;
    }
    /**
     * Return Cat Species
     * @return Cat Species
     */
    public Species getSpecies()
    {
        return this.species;
    }
    /**
     * Open file by the path
     * @param path way to the file
     * @throws FileNotFoundException file exception
     */
    public void openFile(String path) throws FileNotFoundException
    {
        this.printWriter = new PrintWriter(new File(path));
    }
    /**
     * Print Cat info to the file
     */
    public void printToFile()
    {
        if (this.printWriter != null)
        {
            this.printWriter.write("Cat info\n");
            this.printWriter.write("Toy:\n");
            this.printWriter.write(this.toy.toString());
            this.printWriter.write("\nVaccine:\n");
            this.printWriter.write(this.vaccine.toString());
            this.printWriter.write("\nSpecies:");
            switch (this.species.getSpecies()) {
                case SHORTHAIR:
                    this.printWriter.write("SHORTHAIR");
                    break;
                case CURL:
                    this.printWriter.write("CURL");
                    break;
                case WIREHAIR:
                    this.printWriter.write("WIREHAIR");
                    break;
                default:
                    this.printWriter.write("UNKNOWN");
                    break;
            }
            this.printWriter.write("\n");
        }
    }
    /**
     * Close file.
     */
    public void closeFile()
    {
        if (this.printWriter != null)
        {
            this.printWriter.flush();
            this.printWriter.close();
        }
    }
}
