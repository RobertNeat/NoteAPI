package com.robert_neat.note_api.repository;

import com.robert_neat.note_api.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NoteDao {
    @Autowired
    private NoteRepository repository;

    public List<Note> getAllNotes(){
        List<Note> notes = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(notes::add);
        return notes;
    }

    public Optional<Note> getNoteById(Integer note_id){
        return repository.findById(note_id);
    }

    public void save(Note note){
        repository.save(note);
    }

    public void edit(Note note){
        repository.save(note);
    }

    public void delete(Integer note_id){
        repository.deleteById(note_id);
    }

    public void deleteAll(){
        repository.deleteAll();
    }
}
