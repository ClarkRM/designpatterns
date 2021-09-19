package factory;
import java.util.ArrayList;

public class TinyHomePlan extends HousePlan {
   
    public TinyHomePlan() {
        super(1, 5, 200);
        setMaterials();
        setFeatures();
    }

    protected void setMaterials() {
        
        materials = new ArrayList<String>();
        materials.add("Lumber");
        materials.add("Insulation");
        materials.add("Metal Roofing");
        materials.add("Hardware");
    }

    protected void setFeatures() {

        features = new ArrayList<String>();
        features.add("Natural Light");
        features.add("Creative storage");
        features.add("Multipurpose areas");
        features.add("Multi-use applications");
    }

    public String toString() {

        return "Tiny Home \n" + super.toString();
    }
}
