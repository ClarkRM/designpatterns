package factory;

public class LogCabinPlan extends HousePlan {
    
    public LogCabinPlan() {
        super(2, 10, 1800);
        setMaterials();
        setFeatures();
    }

    protected void setMaterials() {
        
        this.materials.add("Log Siding");
        this.materials.add("Board and Batten Siding");
        this.materials.add("White Pine");
    }

    protected void setFeatures() {

        this.features.add("Timbered Roof");
        this.features.add("High Insulation");
        this.features.add("Rustic Effect");
    }

    public String toString() {

        return "" + super.toString();
    }
}
