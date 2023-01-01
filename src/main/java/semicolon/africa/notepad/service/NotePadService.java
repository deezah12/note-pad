package semicolon.africa.notepad.service;

import semicolon.africa.notepad.data.model.NotePad;
import semicolon.africa.notepad.dto.request.CreateContent;

import java.util.List;

public interface NotePadService {
    void create(CreateContent createContent);
    void update(String id, CreateContent createContent);
    void delete(NotePad note);
    void delete(String id);
    List<NotePad> findAll();
    List<NotePad> findByTitle(String title);
}
