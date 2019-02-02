package Notepad;

import java.util.Scanner;

public class Menu {

    final static String enter = "\n";
    /*
        1. Dodaj nową notatkę
        2. Edytuj notatkę
        3. Usuń notaktę
     */
    static Scanner scan = new Scanner(System.in);
    Notepad notepad = new Notepad();

    public void start() {

        int choose;
        do {
            System.out.println("What You need? \n\t 1. Add a new note \n\t" +
                    " 2. Show a note\n\t 3. Remove a note\n\t 0. Go back...");

            choose = Integer.parseInt(scan.nextLine());

            switch (choose) {

                case 1:
                    System.out.println("What's the title?\n\t");
                    String title = scan.nextLine();
                    System.out.println("\nUntil END on the new line.\nType your note:\t");
                    String newLine = "";
                    String note = "";
                    while (!newLine.equals("END")) {
                        newLine = scan.nextLine();
                        if (!newLine.equals("END")) {
                            note += newLine;
                            note += enter;
                        }
                    }
                    notepad.addNote(title, note);

                    break;

                case 2:
                    if (notepad.numberOfNotes() == 0) System.out.println("No notes in the NotePad");
                    else {
                        System.out.println("Which one do You want to read?\n\n");

                        notepad.showTitleAndId();
                        int nrOfNote = Integer.parseInt(scan.nextLine());
                        notepad.showChosenNote(nrOfNote);
                    }
                    break;

                case 3:
                    System.out.println("Which one do You want to read?\n");
                    notepad.showTitleAndId();
                    int nrOfNote = Integer.parseInt(scan.nextLine());
                    notepad.removeNote(nrOfNote);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("You choose wrong option...");
            }
        } while (choose != 0);
    }
}
