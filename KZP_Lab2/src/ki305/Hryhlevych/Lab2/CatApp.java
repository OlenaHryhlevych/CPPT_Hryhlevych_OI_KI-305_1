package ki305.Hryhlevych.Lab2;

import ki305.Hryhlevych.Lab2.Cat;
import ki305.Hryhlevych.Lab2.Toy;
import ki305.Hryhlevych.Lab2.Species;
import ki305.Hryhlevych.Lab2.Vaccine;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class CatApp {
    /**
     *
     * @param args command line
     */
    public static void main(String[] args) {
        Cat cat = new Cat();
        Species species = new Species();
        Toy toy = new Toy();
        Vaccine vaccine = new Vaccine();

        Scanner scanner = new Scanner(System.in);
        String command = new String();
        boolean running = true;

        System.out.println("Command:\nadd toy - add toy list to cat\nadd vaccine - add vaccine list to cat\nadd species - turn species into the cat\nprint - print cat info to the file\nstop - stops the program\n\n");

        while (running)
        {
            System.out.print("Enter command:\n--> ");
            command = scanner.nextLine();

            switch (command) {
                case "add toy":
                    System.out.println("Enter list of toys");
                    while(true)
                    {
                        System.out.print("--> ");
                        command = scanner.nextLine();
                        toy.addToy(command);
                        if (command.equals(""))
                            break;
                    }
                    cat.addToy(toy);
                    break;
                case "add vaccine":
                    System.out.println("Enter list of vaccines");
                    while(true)
                    {
                        System.out.print("--> ");
                        command = scanner.nextLine();
                        vaccine.addVaccines(command);
                        if (command.equals(""))
                            break;
                    }
                    cat.addVaccine(vaccine);;
                    break;
                case "add species":
                    System.out.println("Enter species:\n1 - SHORTHAIR\n2 - CURL\n3 - WIREHAIR\n4 - UNKNOWN");
                    System.out.print("--> ");
                    command = scanner.nextLine();
                    switch (command)
                    {
                        case "1":
                            species.setSpecies(FilletType.SHORTHAIR);
                            cat.setSpecies(species);
                            break;
                        case "2":
                            species.setSpecies(FilletType.CURL);
                            cat.setSpecies(species);
                            break;
                        case "3":
                            species.setSpecies(FilletType.WIREHAIR);
                            cat.setSpecies(species);
                            break;
                        case "4":
                            species.setSpecies(FilletType.UNKNOWN);
                            cat.setSpecies(species);
                            break;
                        default:
                            System.out.println("Wrong species type!");
                            break;
                    }
                    break;
                case "print":
                    System.out.println("Enter file path:");
                    System.out.print("--> ");
                    command = scanner.nextLine();
                    try {
                        cat.openFile(command);
                        cat.printToFile();
                        cat.closeFile();
                    } catch (FileNotFoundException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    break;
                case "stop":
                    running = false;
                    System.out.println("Program stoped.");
                    break;
                default:
                    System.out.println("Wrong command! Try again.");
                    break;
            }
        }
    }
}
