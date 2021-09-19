package factory;
import java.util.ArrayList;

public class LogCabinPlan extends HousePlan {
    
    public LogCabinPlan() {
        super(2, 10, 1800);
        setMaterials();
        setFeatures();
    }

    protected void setMaterials() {
        
        materials = new ArrayList<String>();
        materials.add("Log Siding");
        materials.add("Board and Batten Siding");
        materials.add("White Pine");
    }

    protected void setFeatures() {

        features = new ArrayList<String>();
        features.add("Timbered Roof");
        features.add("High Insulation");
        features.add("Rustic Effect");
    }

    public String toString() {

        return "Log Cabin \n" + super.toString();
    }
}