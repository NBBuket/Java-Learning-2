package gov.app2;

import javax.swing.*;
import java.util.Scanner;
//import java.util.logging.Logger;

public class App2 {
    //Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args){
        JFrame f = new JFrame("Shapes");
        System.out.println("Shapes are star, rectangle, triangle and circle");
        System.out.println("What would you like to draw?");
        Scanner input1 = new Scanner(System.in); //input1 takes commands
        String command = input1.nextLine();
        boolean app = true;

        while(app) {
            switch(command) {

                case "circle":
                    f.getContentPane().add(new Circle());
                    break;

                case "rectangle":
                    f.getContentPane().add(new Rectangle());
                    break;

                case "triangle":
                    f.getContentPane().add(new Triangle());
                    break;

                case "star":
                    f.getContentPane().add(new Star());
                    break;

                case "quit":
                    app = false;
                    System.out.println("Please close the Shapes window if it's open");
                    break;

                default:
                    System.out.println("Please enter a valid shape");
            }
            if (command.equals("quit")) {

                break;
            }
            else {
                f.setSize(500, 500);
                f.setVisible(true);
                f.setResizable(false);
                f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                System.out.println("Choose another shape");
                Scanner input3 = new Scanner(System.in); //input3 takes new commands
                String newCommand = input3.nextLine();
                command = newCommand;
            }

        }

    }

    //public void writeMessage(String message) {logger.info(message);}
}
