package semicolon.africa.notepad.service;

import org.springframework.beans.factory.annotation.Autowired;
import semicolon.africa.NoteContentNotFoundException;
import semicolon.africa.notepad.data.model.NotePad;
import semicolon.africa.notepad.data.repository.NotePadRepo;
import semicolon.africa.notepad.dto.request.CreateContent;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class NotePadServiceImpl implements NotePadService{

    private final NotePadRepo notePadRepo;

    @Autowired public NotePadServiceImpl(NotePadRepo notePadRepo) {
        this.notePadRepo = notePadRepo;
    }

    @Override
    public void create(CreateContent createContent) {
        NotePad note = new NotePad();
        note.setTitle(createContent.getTitle());
        note.setContent(createContent.getContent());
        notePadRepo.save(note);
    }

    @Override
    public void update(String id, CreateContent createContent) {
        NotePad updateNote = new NotePad();
        if (notePadRepo.existsById(id)) {
            updateNote.setId(id);
            updateNote.setTitle(createContent.getTitle());
            updateNote.setContent(createContent.getContent());
            notePadRepo.save(updateNote);
        }
        else {
            throw new NoteContentNotFoundException("this content does not exist");
        }
    }

    @Override
    public void delete(NotePad note) {
       notePadRepo.delete(note);
    }

    @Override
    public void delete(String id) {
        notePadRepo.deleteById(id);
    }

    @Override
    public List<NotePad> findAll() {
        return notePadRepo.findAll();
    }

    @Override
    public List<NotePad> findByTitle(String title) {
        return null;
    }


}
