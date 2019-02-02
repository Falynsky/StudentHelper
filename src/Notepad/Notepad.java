package Notepad;

import java.util.HashMap;
import java.util.Map;

public class Notepad {

    Map<Integer, Note> notePadList = new HashMap<>();

    public void addNote(String title, String note) {
        int i = numberOfNotes();
        Note myNote = new Note(title, note);
        notePadList.put(i+1, myNote);
    }

    public void showTitleAndId() {
        for (Map.Entry<Integer, Note> p : notePadList.entrySet()) {
            System.out.println("ID:\t" + p.getKey() + "\tTitle: " + p.getValue().getTitle());
        }
    }

    public void showChosenNote(int nrOfNote) {
        System.out.println("Your note \"" + notePadList.get(nrOfNote).getTitle() + " from " + notePadList.get(nrOfNote).getDate());
        System.out.println("-----------------------------------------------------");
        System.out.println(notePadList.get(nrOfNote).getNote());
    }

    public int numberOfNotes() {
        int i = 0;
        for (Map.Entry<Integer, Note> p : notePadList.entrySet()) {
            i++;
        }
        return i;
    }

    public void removeNote(int nrOfNote){
        notePadList.remove(nrOfNote);
    }
}
