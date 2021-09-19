package factory;
import java.util.ArrayList;

public class ContemporaryPlan extends HousePlan {
    
    public ContemporaryPlan() {
        super(5, 40, 3000);
        setMaterials();
        setFeatures();
    }

    protected void setMaterials() {

        materials = new ArrayList<String>();
        materials.add("Ceramics");
        materials.add("High-Strength Alloys");
        materials.add("Composites");
    }

    protected void setFeatures() {

        features = new ArrayList<String>();
        features.add("Oversized Windows");
        features.add("Unconventional Roofs");
        features.add("Minimalism");
        features.add("Open Floor Plan");
    }

    public String toString() {

        return "Contemporary House \n" + super.toString();
    }
}
