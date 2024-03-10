package com.robert_neat.note_api;

import com.robert_neat.note_api.model.Note;
import com.robert_neat.note_api.repository.NoteDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class NoteApiApplicationTests {

	@Autowired
	private NoteDao noteDao;

	@Test
	void contextLoads() {
		Note note = new Note();
		note.setTitle("Note_Title");
		note.setDescription("Note_Description");
		note.setDate(new Date());
		noteDao.save(note);
	}

}
