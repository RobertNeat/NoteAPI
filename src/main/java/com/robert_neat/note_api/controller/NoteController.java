package com.robert_neat.note_api.controller;

import com.robert_neat.note_api.model.Note;
import com.robert_neat.note_api.repository.NoteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://127.0.0.1:9000")
@RestController
@RequestMapping("/note")
public class NoteController {
    @Autowired
    private NoteDao noteDao;

    //get all notes
    @GetMapping("/get-all")
    public List<Note> getAllNotes(){
        return noteDao.getAllNotes();
    }

    //get one note by id
    @GetMapping("/{note_id}")
    public Optional<Note> getNoteById(@PathVariable("note_id")Integer note_id){
        return noteDao.getNoteById(note_id);
    }

    //create new note (id is created automatically)
    @PostMapping()
    public Note createNote(@RequestBody Note note){
        return noteDao.save(note);
    }

    //update note by id in object body
    @PutMapping("/update")
    public Note updateNote(@RequestBody Note note){
        return noteDao.edit(note);
    }

    //delete note by id
    @DeleteMapping("/{note_id}")
    public void deleteNoteById(@PathVariable("note_id")Integer note_id){
        noteDao.delete(note_id);
    }

    //delete all notes
    @DeleteMapping("/delete-all")
    public void deleteAllNotes(){
        noteDao.deleteAll();
    }
}
