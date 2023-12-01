package ki305.Hryhlevych.Lab3;

class Colour {

    /**
     * Constructor
     */
    public Colour() {
        this.description = "redhead";
    }

    /**
     * Constructor
     *
     * @param description
     */
    public Colour(String description) {
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
