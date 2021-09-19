package factory;

/**
 * A class to initialize the house plan of the user's choosing
 * @author Robbie Clark
 */
public class HousePlanFactory {

    /**
     * A method that takes in a user-entered string and matches it to a house plan
     * @param type The string the user passes in that corresponds to a specific house plan
     * @return The houseplan that corresponds to the user's choice
     */
    public static HousePlan createHousePlan(String type) {
        
        HousePlan housePlan;

        if(type.equalsIgnoreCase("log cabin")) {
            
            housePlan = new LogCabinPlan();
        } else if (type.equalsIgnoreCase("tiny home")) {
            
            housePlan = new TinyHomePlan();
        } else {
            
            housePlan = new ContemporaryPlan();
        }

        return housePlan;
    }

}