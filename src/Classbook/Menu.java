package Classbook;

import Classbook.Classbook;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    static Classbook classbook = new Classbook();
    static Notepad.Menu noteMenu = new Notepad.Menu();
    Scanner scan = new Scanner(System.in);

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void start() {

        int choose;
        do {
            System.out.println("What You need? \n\t 1. Show my grades from... \n\t" +
                    " 2. Show my all grades\n\t 3. Add new subject\n\t 4. Add a new grade\n\t 5. Show my Notepad\n\t 0. Exit");

            choose = Integer.parseInt(scan.nextLine());

            switch (choose) {

                case 1:
                    System.out.println("Which subject are you interested in?\n\t");
                    String selectedSubject = scan.nextLine();
                    classbook.getGrades(selectedSubject);
                    break;

                case 2:
                    classbook.getAllGrades();
                    break;

                case 3:
                    System.out.println("Type a...\n\t");
                    System.out.print("name:   ");
                    String subjectName = scan.nextLine();
                    System.out.println("lecturer:   ");
                    String lecturer = scan.nextLine();
                    System.out.println("room:   ");
                    String room = scan.nextLine();
                    classbook.addSubject(subjectName, lecturer, room);
                    break;

                case 4:
                    System.out.println("Type a...\n\t");
                    System.out.println("subject name:   ");
                    subjectName = scan.nextLine();
                    System.out.println("grade:   ");
                    double grade = scan.nextDouble();scan.nextLine();
                    System.out.println("for what:   ");
                    String forWhat = scan.nextLine();
                    System.out.println("type: ");
                    try{
                    String type = scan.nextLine();
                    classbook.addGrade(subjectName, grade, forWhat, type);
                    }
                    catch (InputMismatchException e) {
                    System.out.println("Bledny format...");
                }
                    break;
                case 5:
                    clearScreen();
                    noteMenu.start();
                    break;


                case 0:
                    System.out.println("Bye bye...");
                    break;

                default:
                    System.out.println("You choose wrong option...");
            }
        } while (choose != 0);
    }
}
