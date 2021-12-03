package adapter;
import java.util.Date;
import java.util.ArrayList;

public class MedicalRecordAdapter implements MedicalRecord {
    private HealthRecord record;

    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }
    
    public String getFirstName() {
        String Name = this.record.getName();
        String[] retArray = Name.split(" ");
        return retArray[0];
    }

    public String getLastName() {
        String Name = this.record.getName();
        String[] retArray = Name.split(" ");
        return retArray[1];
    }

    public Date getBirthday() {
        return this.record.getBirthdate();
    }

    public Gender getGender() {
        String gender = this.record.getGender();
        if(gender.equalsIgnoreCase("male")) {return Gender.MALE;}
        else if(gender.equalsIgnoreCase("female")) {return Gender.FEMALE;}
        else {return Gender.OTHER;}
    }

    public void addVisit(Date date, boolean well, String description) {

    }

    public ArrayList<Visit> getVisitHistory() {
        ArrayList<String> oldHistory = this.record.getHistory();
        ArrayList<Visit> newHistory = new ArrayList<Visit>();
        
        return newHistory;
    }

    public String toString() {
        return "";
    }
}
