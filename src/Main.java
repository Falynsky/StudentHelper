/*
    This program is designed to help students organize their work and grades
*/
public class Main {

    static StudentCalendar calendar = new StudentCalendar();
    static Menu menu = new Menu();

    public static void main(String[] args) {

        System.out.println("Welcome into StudentVerseApp! :D" +
                "\n\nToday is " + StudentCalendar.today +
                "\nYour important events on this week:\n\t");

        System.out.println("-----------------------------------------------------\n");
        menu.start();

    }


}