import commands.*;
import prompt.Prompt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Prompt prompt= new Prompt();
        String comment;
        while (true){
            System.out.print(prompt);
            comment = in.next();
            switch (comment){
                case "$cwd":
                    new Cwd(prompt).operation();
                    break;
                case "reset":
                    new Reset(prompt).operation();
                    break;
                case "dir":
                    new Dir().operation();
                    break;
                case "tree":
                    new Tree().operation();
                    break;
                case "cd":
                    new Cd(in.next()).operation();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println(comment + " Unknown commend");
            }


        }
    }
}
