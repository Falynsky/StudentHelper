import Calendar.StudentCalendar;
import Classbook.Menu;

/*
    This program is designed to help students organize their work and grades
*/
public class Main {

    static Menu menu = new Menu();

    public static void main(String[] args) {

        System.out.println("Welcome into StudentVerseApp! :D" +
                "\n\nToday is " + StudentCalendar.getToday()+"\t"+ StudentCalendar.getCurrentTimeUsingCalendar()+
                "\nYour important events on this week:\n\t");

        System.out.println("-----------------------------------------------------\n");
        menu.start();

    }


}