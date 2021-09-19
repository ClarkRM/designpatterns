package factory;

public class TinyHomePlan extends HousePlan {
   
    public TinyHomePlan() {
        super(1, 5, 200);
        setMaterials();
        setFeatures();
    }

    protected void setMaterials() {
        
        this.materials.add("Lumber");
        this.materials.add("Insulation");
        this.materials.add("Metal Roofing");
        this.materials.add("Hardware");
    }

    protected void setFeatures() {

        this.features.add("Natural Light");
        this.features.add("Creative storage");
        this.features.add("Multipurpose areas");
        this.features.add("Multi-use applications");
    }

    public String toString() {

        return "" + super.toString();
    }
}
