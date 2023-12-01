package ki305.Hryhlevych.Lab3;

class Happy {

    /**
     * Constructor
     */
    public Happy() {
        this.happies = 5;
    }

    /**
     * Constructor
     *
     * @param happies
     */
    public Happy(int happies) {
        this.happies = happies;
    }

    private int happies;

    /**
     * @return the happies
     */
    public int getHapieness() {
        return happies;
    }

    /**
     * @param happies the happies to set
     */
    public void setHapieness(int happies) {
        this.happies = happies;
    }
}
