package practice.dataLayer.Components;

import practice.businessLogic.FeatureChecker;

/**
 * Enumeration representing different types of mice.
 */
public enum Mouse implements FeatureChecker {
     Logitech_GPro_X("Logitech GPro X", "Logitech", "purple", 9999),
     Razer_DeathAdder("Razer DeathAdder", "Razer", "black", 1500),
     SteelSeries_Rival("SteelSeries Rival", "SteelSeries", "black", 1300),
     Corsair_Dark_Core("Corsair Dark Core", "Corsair", "dark", 3899),
     Microsoft_IntelliMouse("Microsoft IntelliMouse", "Microsoft", "white", 3400);

     private String name;
     private String brand;
     private String color;
     private int cost;

     /**
      * Constructs a Mouse object with the specified attributes.
      * @param name the name of the mouse
      * @param brand the brand of the mouse
      * @param color the color of the mouse
      * @param cost the cost of the mouse
      */
     Mouse(String name, String brand, String color, int cost) {
          this.name = name;
          this.brand = brand;
          this.color = color;
          this.cost = cost;
     }

     /**
      * Retrieves the brand of the mouse.
      * @return the brand of the mouse
      */
     public String getBrand() {
          return brand;
     }

     /**
      * Retrieves the color of the mouse.
      * @return the color of the mouse
      */
     public String getColor() {
          return color;
     }

     /**
      * Retrieves the cost of the mouse.
      * @return the cost of the mouse
      */
     public int getCost() {
          return cost;
     }

     /**
      * Retrieves the name of the mouse.
      * @return the name of the mouse
      */
     public String getName() {
          return name;
     }

     /**
      * Retrieves all features of the mouse.
      * @return a string representing all features of the mouse
      */
     public String getAllFeatures() {
          return "Mouse Name: " + name +
                  ", Brand: " + brand +
                  ", Color: " + color +
                  ", Cost: " + cost + "₴";
     }
}
