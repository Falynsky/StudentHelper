/*
    This program is designed to help students organize their work and grades
*/
public class Main {

    static StudentCalendar calendar = new StudentCalendar();
    static Classbook classbook = new Classbook();

    public static void main(String[] args) {

        System.out.println("Welcome into StudentVerseApp! :D" +
                "\n\nToday is " + calendar.today +
                "\nYour important events in this week:\n\t");

        classbook.addSubject("Matma","Wojciechowski", "B403");
        classbook.addSubject("WDI","Boryczka", "B4");

        classbook.addGrade("Matma",4.0,"Calki","Kolos 1");
        classbook.addGrade("Matma",4.5, "Pochodne", "Kolos 2");
        classbook.addGrade("Matma", 5.0, "Calki", "Kolos 1");

        classbook.addGrade("WDI",5.0,"Dodawanie i odejmowanie bin","Kolos 1");

        classbook.getGrades("Matma");

        classbook.getAllGrades();

    }
}