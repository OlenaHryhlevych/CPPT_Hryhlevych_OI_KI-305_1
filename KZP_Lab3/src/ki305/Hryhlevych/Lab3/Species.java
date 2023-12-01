package ki305.Hryhlevych.Lab3;

class Species {

    /**
     * Constructor
     */
    public Species() {
        this.description = "Scottish Fold";
    }

    /**
     * Constructor
     *
     * @param description
     */
    public Species(String description) {
        this.description = description;
    }

    private String description;

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
}
