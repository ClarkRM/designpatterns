package adapter;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

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
       this.record.addHistory(date, well, description);
    }

    public ArrayList<Visit> getVisitHistory() {
        ArrayList<String> oldHistory = this.record.getHistory();
        ArrayList<Visit> newHistory = new ArrayList<Visit>();
        for(int i = 0; i < oldHistory.size(); i++) {
            String oldVisit = oldHistory.get(i);
            String[] oldVisitSplit = oldVisit.split("\n");
            // line 0- Visit: ...
            // line 1- Well visit: ...
            // line 2- comments
            
            String[] retArray1 = oldVisitSplit[0].split(" "); //split the day of the week from the actual number date
            String sDay = retArray1[2].substring(0,2);
            String sMonth = retArray1[3].substring(0,2);
            int day = Integer.parseInt(sDay);
            int month = Integer.parseInt(sMonth);
            int year = Integer.parseInt(retArray1[4]);
            
            Calendar myCalendar = new GregorianCalendar(year, month - 1, day);

            Boolean well;
            String[] retArray2 = oldVisitSplit[1].split(" ");
            if(retArray2[2].equalsIgnoreCase("true")) {well = true;}
            else {well = false;}

            String[] retArray3 = oldVisitSplit[2].split(": ");
            String comment = retArray3[1];
            newHistory.add(new Visit(myCalendar.getTime(), well, comment));
            
        }
        
        return newHistory;
    }


    public String toString() {
        ArrayList<Visit> history = getVisitHistory();
        Gender gender = getGender();
        String genderString = gender.toString();
        genderString = genderString.substring(0,1).toUpperCase() + genderString.substring(1).toLowerCase();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String birthday = simpleDateFormat.format(getBirthday());
        
        String ret = "***** "+ getFirstName() + " " + getLastName() + " *****\n";
        ret += "Birthday: " + birthday + "\n";
        ret += "Gender: " + genderString+ "\n";
        ret += "Medical Visit History: \n";

        if(history.size() == 0){
            ret += "No visits yet";
        } else {
            for(Visit visit : history){
                ret += visit.toString() + "\n";
            }
        }
        return ret;
    }
}
