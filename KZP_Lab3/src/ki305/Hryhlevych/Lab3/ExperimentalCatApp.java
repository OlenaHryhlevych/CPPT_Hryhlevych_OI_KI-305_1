package ki305.Hryhlevych.Lab3;

import java.io.FileNotFoundException;

public class ExperimentalCatApp {

    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        ExperimentalCat ct = new ExperimentalCat(200, 3);
        ct.GiveFood();
        ct.stroke();
        ct.info();
        ct.dispose();
    }
}
