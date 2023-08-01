package mongodb.testing.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "StudentData")
public class StudentDetails {
    @Id
    private String SID;
    private String SName;
    private String DOB;
    private String SBranch;
    private float GPA;

    public StudentDetails(String SID, String SName, String DOB, String SBranch, float GPA) {
        this.SID = SID;
        this.SName = SName;
        this.DOB = DOB;
        this.SBranch = SBranch;
        this.GPA = GPA;
    }

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getSBranch() {
        return SBranch;
    }

    public void setSBranch(String SBranch) {
        this.SBranch = SBranch;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(Float GPA) {
        this.GPA = GPA;
    }
}

