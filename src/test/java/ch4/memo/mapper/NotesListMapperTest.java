package ch4.memo.mapper;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ch4.memo.entity.Note;


@SpringBootTest
public class NotesListMapperTest {

    @Autowired
    private NotesListMapper notesListMapper;

    @Test
    public void testGetAllNotes() {
        List<Note> notesList = notesListMapper.getAllNotes();
        for (Note note : notesList) {
            System.out.println(note);
        }
    }

    @Test
    public void testAddNote() {
        Note newNote = new Note();
        newNote.setTime(java.time.LocalDateTime.now());
        newNote.setContent("This is a test note.");
        notesListMapper.addNote(newNote);
    }
}

