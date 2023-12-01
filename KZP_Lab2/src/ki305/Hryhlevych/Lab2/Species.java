package ki305.Hryhlevych.Lab2;

enum FilletType
{
    SHORTHAIR,
    CURL,
    WIREHAIR,
    UNKNOWN,
};

public class Species {

    private FilletType type;

    /**
     * Constructor
     */
    public Species()
    {
        this.type = FilletType.UNKNOWN;
    }
    /**
     * Constructor
     * @param filter new filler
     */
    public Species(FilletType filter)
    {
        this.type = filter;
    }
    /**
     * Set new Filler
     * @param type new FillerType
     */
    public void setSpecies(FilletType type)
    {
        this.type = type;
    }
    /**
     * Get FillerType
     * @return FillerType
     */
    public FilletType getSpecies()
    {
        return this.type;
    }
}
