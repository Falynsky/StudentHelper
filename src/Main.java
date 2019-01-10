/*
    This program is designed to help students organize their work and grades
*/
public class Main {

    static StudentCalendar calendar = new StudentCalendar();

    public static void main(String[] args) {

        System.out.println("Welcome into StudentVerseApp! :D" +
                "\n\nToday is " + calendar.today +
                "\nYour important events in this week:\n\t"
        );
    }

    public void addEvent(){

    }
}
   /* public void showImportantEvents() {
        int counter = Events.importanCounter;
        while (counter != 0) {
            System.out.println("");
            counter--;
        }
    }
    */