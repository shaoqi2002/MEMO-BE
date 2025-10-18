package ch4.memo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch4.memo.entity.Note;
import ch4.memo.mapper.NotesListMapper;

@Service
public class addNote{

    @Autowired
    private NotesListMapper notesListMapper;
    public void add(Note note) {
        notesListMapper.addNote(note);
    }
}
