package practice.dataLayer.сoreComponents;

import practice.businessLogic.FeatureChecker;

/**
 * Enumeration representing different types of power supplies.
 */
public enum PowerSupply implements FeatureChecker {
     CORSAIR_RM850X("CORSAIR_RM850X", "Corsair", "RM850X", "850W", "80+ Gold", 1500),
     EVGA_SUPERNOVA_750("EVGA_SUPERNOVA_750", "EVGA", "SuperNOVA 750", "750W", "80+ Platinum", 1700),
     SEASONIC_FOCUS_PLUS_GOLD_650("SEASONIC_FOCUS_PLUS_GOLD_650", "Seasonic", "Focus Plus Gold 650", "650W", "80+ Gold", 1000),
     THERMALTAKE_TOUGHPOWER_GRAND_RGB_850("THERMALTAKE_TOUGHPOWER_GRAND_RGB_850", "Thermaltake", "Toughpower Grand RGB 850", "850W", "80+ Platinum", 2000),
     COOLER_MASTER_MWE_750_GOLD("COOLER_MASTER_MWE_750_GOLD", "Cooler Master", "MWE 750 Gold", "750W", "80+ Gold", 1200);

     private String name;
     private String brand;
     private String model;
     private String wattage;
     private String efficiency;
     private int cost;

     /**
      * Constructs a PowerSupply object with the specified attributes.
      *
      * @param name       the name of the power supply
      * @param brand      the brand of the power supply
      * @param model      the model of the power supply
      * @param wattage    the wattage of the power supply
      * @param efficiency the efficiency rating of the power supply
      * @param cost       the cost of the power supply
      */
     PowerSupply(String name, String brand, String model, String wattage, String efficiency, int cost) {
          this.name = name;
          this.brand = brand;
          this.model = model;
          this.wattage = wattage;
          this.efficiency = efficiency;
          this.cost = cost;
     }

     /**
      * Retrieves the name of the power supply.
      *
      * @return the name of the power supply
      */
     public String getName() {
          return name;
     }

     /**
      * Retrieves the brand of the power supply.
      *
      * @return the brand of the power supply
      */
     public String getBrand() {
          return brand;
     }

     /**
      * Retrieves the model of the power supply.
      *
      * @return the model of the power supply
      */
     public String getModel() {
          return model;
     }

     /**
      * Retrieves the wattage of the power supply.
      *
      * @return the wattage of the power supply
      */
     public String getWattage() {
          return wattage;
     }

     /**
      * Retrieves the efficiency rating of the power supply.
      *
      * @return the efficiency rating of the power supply
      */
     public String getEfficiency() {
          return efficiency;
     }

     /**
      * Retrieves the cost of the power supply.
      *
      * @return the cost of the power supply
      */
     public int getCost() {
          return cost;
     }

     /**
      * Retrieves all features of the power supply.
      *
      * @return a string representing all features of the power supply
      */
     public String getAllFeatures() {
          return "Brand: " + brand +
                  ", Model: " + model +
                  ", Wattage: " + wattage +
                  ", Efficiency: " + efficiency +
                  ", Cost: " + cost + "₴";
     }
}
