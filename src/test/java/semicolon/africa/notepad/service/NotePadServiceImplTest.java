package semicolon.africa.notepad.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import semicolon.africa.notepad.data.model.NotePad;
import semicolon.africa.notepad.dto.request.CreateContent;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NotePadServiceImplTest {

    private final NotePadService notePadService;

    @Autowired
    public NotePadServiceImplTest(NotePadService notePadService) {
        this.notePadService = notePadService;
    }

    private NotePad notePad;

    @BeforeEach
    void setUp() {
    notePad = new NotePad();
    }

    @Test
    void create(){
        CreateContent createContent = new CreateContent();
        createContent.setTitle("my life");
        createContent.setContent("i love me");
        notePadService.create(createContent);

        assertEquals(1, notePadService.findAll().size());

    }
    @Test
    void update(){}
}