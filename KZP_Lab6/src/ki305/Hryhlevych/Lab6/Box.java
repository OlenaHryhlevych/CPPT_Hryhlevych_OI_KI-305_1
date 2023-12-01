package ki305.Hryhlevych.Lab6;

class Box implements Cargo {

    /**
     * Constructor
     */
    public Box() {
        this.pieces = 10;
    }

    /**
     * Constructor
     *
     * @param pieces
     */
    public Box(int pieces) {
        this.pieces = pieces;
    }

    private int pieces;

    /**
     * Method prints info about box
     */
    @Override
    public void print() {
        System.out.println("Type: box");
        System.out.println("Pieces: " + pieces + "kg");
    }

    /**
     * Method returns box's pieces
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
