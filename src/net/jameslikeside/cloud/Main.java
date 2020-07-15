package net.jameslikeside.cloud;

import java.util.Scanner;

public class Main {

    public void initCloud(){
        System.out.println("FreshCloud Starting");
        Scanner scanner = new Scanner(System.in);
        String answer;

        while(true){
            answer = scanner.nextLine();

            if(answer.equalsIgnoreCase("help")){
                ListCommandsHelp();
            } else if(answer.equalsIgnoreCase("stop")){
                System.out.println("FreshCloud Stopping");
                System.exit(0);
                break;
            } else if(answer.equalsIgnoreCase("setup")){
                System.out.println("Test");
            } else {
                System.out.println("Unknown command. Please type 'help' to view all available commands!");
            }
        }
    }

    void ListCommandsHelp() {
        System.out.println("All commands:" +
                "\nhelp - Shows all the commands" +
                "\nstop - Stops this cloud instance" +
                "\nsetup - Starts the cloud setup service");
    }

}
