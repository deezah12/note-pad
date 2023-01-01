package semicolon.africa.notepad.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import semicolon.africa.notepad.data.model.NotePad;

@Repository
public interface NotePadRepo extends MongoRepository<NotePad, String> {

}
