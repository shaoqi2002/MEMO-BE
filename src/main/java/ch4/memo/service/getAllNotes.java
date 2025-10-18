package ch4.memo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch4.memo.entity.Note;
import ch4.memo.mapper.NotesListMapper;
@Service
public class getAllNotes {

    @Autowired
    private NotesListMapper notesListMapper;

    public List<Note> getAll() {
        return notesListMapper.getAllNotes();
    }
}
