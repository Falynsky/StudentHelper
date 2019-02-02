package Notepad;

import java.util.HashMap;
import java.util.Map;

class Notepad {

    private Map<Integer, Note> notePadList = new HashMap<>();

    void addNote(String title, String note) {
        int i = numberOfNotes();
        Note myNote = new Note(title, note);
        notePadList.put(i + 1, myNote);
    }

    void showTitleAndId() {
        for (Map.Entry<Integer, Note> p : notePadList.entrySet()) {
            System.out.println("ID:\t" + p.getKey() + "\tTitle: " + p.getValue().getTitle());
        }
    }

    void showChosenNote(int nrOfNote) {
        System.out.println("Your note \"" + notePadList.get(nrOfNote).getTitle() + " from " + notePadList.get(nrOfNote).getDate());
        System.out.println("-----------------------------------------------------");
        System.out.println(notePadList.get(nrOfNote).getNote());
    }

    int numberOfNotes() {
        return notePadList.size();
    }

    void removeNote(int nrOfNote) {
        notePadList.remove(nrOfNote);
    }
}
