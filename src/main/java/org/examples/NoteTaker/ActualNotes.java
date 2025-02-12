package org.examples.NoteTaker;


import java.util.ArrayList;
import java.util.List;

public record ActualNotes(
        String date,
        String title,
        String description,
        String category,
        String priority,
        String status,
        String tags,
        List<String> notes
) {

    public void addNotes(String note){
        if(note == null || note.isEmpty()){
            throw new IllegalArgumentException("Notes cannot be null or empty");
        }
        notes.add(note);
    }

}
