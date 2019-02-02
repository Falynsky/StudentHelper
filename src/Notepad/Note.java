package Notepad;

import java.time.LocalDate;

public class Note {

    private String title;
    private String note;
    private LocalDate date;

    public Note(String title, String note){
    setTitle(title);
    setNote(note);
    setDate();
    }
    public void setDate() {
        this.date = LocalDate.now();
    }

    public LocalDate getDate() {
        return date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        if (note.isEmpty() || note == null) throw new IllegalArgumentException();
        else {
            this.note = note;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.isEmpty() || title == null) throw new IllegalArgumentException();
        {
            this.title = title;
        }
    }
}
