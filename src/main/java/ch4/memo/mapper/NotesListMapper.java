package ch4.memo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ch4.memo.entity.Note;


@Mapper
public interface NotesListMapper {
    List<Note> getAllNotes();
    void addNote(Note note);
}
