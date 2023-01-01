package semicolon.africa.notepad.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import semicolon.africa.notepad.data.model.NotePad;
import semicolon.africa.notepad.dto.request.CreateContent;
import semicolon.africa.notepad.service.NotePadService;


@RestController
public class NotePadController {
    @Autowired
    NotePadService notePadService;

    @PostMapping("/create/note")
    public String create(@RequestBody  CreateContent createContent){
        notePadService.create(createContent);
        return "content created successfully!";
    }

    @PutMapping("/update/note/{noteId}")
    public String update(@PathVariable String noteId, @RequestBody CreateContent createContent){
        notePadService.update(noteId, createContent);
        return "updated!";
    }

    @DeleteMapping("delete/note/{noteId}")
    public  String delete(@PathVariable String noteId){
        notePadService.delete(noteId);
        return "deleted!";
    }
    @GetMapping("/get/note")
    public NotePad get(@RequestBody NotePad note){
        notePadService.findAll();
        return note;
    }

}
