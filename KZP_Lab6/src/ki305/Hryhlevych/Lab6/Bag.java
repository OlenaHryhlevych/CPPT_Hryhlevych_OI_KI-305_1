package ki305.Hryhlevych.Lab6;

class Bag implements Cargo {

    /**
     * Constructor
     */
    public Bag() {
        this.pieces = 10;
    }

    /**
     * Constructor
     *
     * @param pieces
     */
    public Bag(int pieces) {
        this.pieces = pieces;
    }

    private int pieces;

    /**
     * Method prints info about bag
     */
    @Override
    public void print() {
        System.out.println("Type: bag");
        System.out.println("Weight: " + pieces + "kg");
    }

    /**
     * Method returns bag's pieces
     */
    @Override
    public int getPieces() {
        return pieces;
    }

    /**
     * Method compares current cargo with another cargo
     */
    @Override
    public int compareTo(Cargo c) {
        if (this.pieces < c.getPieces())
            return -1;
        if (this.pieces == c.getPieces())
            return 0;
        return 1;
    }
}
