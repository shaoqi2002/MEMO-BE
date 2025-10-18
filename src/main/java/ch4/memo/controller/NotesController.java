package ch4.memo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch4.memo.entity.Note;
import ch4.memo.service.addNote;
import ch4.memo.service.getAllNotes;

@RestController
@RequestMapping("/api")
public class NotesController {
    @Autowired
    private getAllNotes getAllNotesService;  // 注入查询服务

    @Autowired
    private addNote addNoteService;  // 注入新增服务

    @GetMapping("/getnotes")
    public List<Note> getAllNotes() {
        return getAllNotesService.getAll();
    }
    @PostMapping("/postnote")
    public void addNote(@RequestBody Note note) {
        addNoteService.add(note);
    }
}
