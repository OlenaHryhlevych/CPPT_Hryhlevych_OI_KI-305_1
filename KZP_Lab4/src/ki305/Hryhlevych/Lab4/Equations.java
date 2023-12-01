package ki305.Hryhlevych.Lab4;

class Equations {
    /** Method calculates the (cos(x)/sin(x)) expression
     *
     * @param x
     * @return
     * @throws CalcException
     */
    public double calculate(int x) {
        double y=0, rad;
        rad = x * Math.PI / 180.0;
        try {
            y = (Math.cos(rad) / Math.sin(rad));
//Якщо результат не є числом, то генеруємо виключення
            if ( rad % (Math.PI / 8) == 0) { package ki305.Hryhlevych.Lab4;

class Equations {
    /** Method calculates the (cos(x)/sin(x)) expression
     *
     * @param x
     * @return
     * @throws CalcException
     */
    public double calculate(int x) throws CalcException {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try {
            y = (Math.cos(rad) / Math.sin(rad));
//Якщо результат не є числом, то генеруємо виключення
            if (y == Double.NaN || y == Double.NEGATIVE_INFINITY || y == Double.POSITIVE_INFINITY ||  rad % (Math.PI / 8) == 0)
                throw new ArithmeticException();
        } catch (ArithmeticException ex) {
//створимо виключення вищого рівня з поясненням причини
//виникнення помилки
            if (rad % (Math.PI / 8) == 0)
                throw new CalcException("Exception reason: Illegal value of X for sin calculation");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        return y;
    }
}

                throw new CalcException();
            }
            else if (y == Double.NaN || y == Double.NEGATIVE_INFINITY || y == Double.POSITIVE_INFINITY ) {
            	throw new NumberException();
            }
        } catch (CalcException | NumberException ex) {
        	System.out.println(ex.getMessage());
//створимо виключення вищого рівня з поясненням причини
//виникнення помилки
          /** if (rad % (Math.PI / 8) == 0)
            *    throw new CalcException("Exception reason: Illegal value of X for sin calculation");
           * else
             *   throw new CalcException("Unknown reason of the exception during exception calculation");
             */  
        }
        return y;
    }
}
