package mongodb.testing.controller;

import mongodb.testing.models.StudentDetails;
import mongodb.testing.rep.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Flow")
public class ProFlow {

    @Autowired
    private StudentRepository studentRepository;

    //Create
    @PostMapping("/")
    public ResponseEntity<StudentDetails> addStudent(@RequestBody StudentDetails studentDetails) {
        StudentDetails save = this.studentRepository.save(studentDetails);
        return ResponseEntity.ok(save);
    }

    //Read
    @GetMapping("/")
    public ResponseEntity<?> getStudent() {
        return ResponseEntity.ok(this.studentRepository.findAll());
    }

    //Delete
    @DeleteMapping("/{SID}")
    public String deleteSdetailsById(@PathVariable String SID) {
        this.studentRepository.deleteById(SID);
        return "deleted";
    }

    //Update
    @PutMapping("/{SID}")
    public ResponseEntity<StudentDetails> updateStudent(@RequestBody StudentDetails studentDetails) {
        StudentDetails save = this.studentRepository.save(studentDetails);
        return ResponseEntity.ok(save);
    }
    }


