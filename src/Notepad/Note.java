package Notepad;

import java.time.LocalDate;

class Note {

    private String title;
    private String note;
    private LocalDate date;

    Note(String title, String note){
    setTitle(title);
    setNote(note);
    setDate();
    }
    private void setDate() {
        this.date = LocalDate.now();
    }

    LocalDate getDate() {
        return date;
    }

    String getNote() {
        return note;
    }

    private void setNote(String note) {
        if (note.isEmpty()) throw new IllegalArgumentException();
        else {
            this.note = note;
        }
    }

    String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        if (title.isEmpty()) throw new IllegalArgumentException();
        {
            this.title = title;
        }
    }
}
