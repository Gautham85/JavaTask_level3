package mongodb.testing.rep;

import mongodb.testing.models.StudentDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<StudentDetails, String> {
}
