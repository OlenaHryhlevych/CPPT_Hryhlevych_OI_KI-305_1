package ki305.Hryhlevych.Lab4;

class CalcException extends ArithmeticException {

    /**
     * Constructor
     */
    public CalcException() {
    }

    /**
     * Constructor
     *
     * @param cause
     */
    public CalcException(String cause) {
        super(cause);
    }
}
