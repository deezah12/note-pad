package semicolon.africa.notepad.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class NotePad {
    @Id
   private String id;
   private String title;
   private String content;
}
