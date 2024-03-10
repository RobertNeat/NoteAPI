package com.robert_neat.note_api.repository;

import com.robert_neat.note_api.model.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository<Note,Integer> {

}
