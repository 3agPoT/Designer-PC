package practice.dataLayer.Components;

import practice.businessLogic.FeatureChecker;

/**
 * Enumeration representing different keyboards.
 */
public enum Keyboard implements FeatureChecker {
     Corsair_K95_Platinum("Corsair K95 Platinum", "Corsair", "black", 9000),
     Logitech_GPro_X("Logitech GPro X", "Logitech", "white", 5000),
     Razer_BlackWidow("Razer BlackWidow", "Razer", "black", 3000),
     SteelSeries_Apex_Pro("SteelSeries Apex Pro", "SteelSeries", "white", 6500),
     ASUS_ROG_Strix_Flare("ASUS ROG Strix Flare", "ASUS", "black", 8100);

     private final String name;
     private final String brand;
     private final String color;
     private final int cost;

     /**
      * Constructs a Keyboard with the specified attributes.
      * @param name the name of the keyboard
      * @param brand the brand of the keyboard
      * @param color the color of the keyboard
      * @param cost the cost of the keyboard
      */
     Keyboard(String name, String brand, String color, int cost) {
          this.name = name;
          this.brand = brand;
          this.color = color;
          this.cost = cost;
     }

     /**
      * Retrieves the brand of the keyboard.
      * @return the brand of the keyboard
      */
     public String getBrand() {
          return brand;
     }

     /**
      * Retrieves the color of the keyboard.
      * @return the color of the keyboard
      */
     public String getColor() {
          return color;
     }

     /**
      * Retrieves the cost of the keyboard.
      * @return the cost of the keyboard
      */
     public int getCost() {
          return cost;
     }

     /**
      * Retrieves the name of the keyboard.
      * @return the name of the keyboard
      */
     public String getName() {
          return name;
     }

     /**
      * Retrieves all features of the keyboard.
      * @return a string representing all features of the keyboard
      */
     public String getAllFeatures() {
          return "Keyboard: " + name +
                  ", Brand: " + brand +
                  ", Color: " + color +
                  ", Cost: " + cost + "₴";
     }
}
