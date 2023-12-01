package ki305.Hryhlevych.Lab6;

public interface Cargo {

    /**
     * Method prints info about thing
     */
    public void print();

    /**
     * Method returns thing's pieces
     */
    public int getPieces();

    /**
     * Method compares current Thing with another Thing
     *
     * @param c
     */
    public int compareTo(Cargo c);
}
