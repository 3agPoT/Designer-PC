package practice.dataLayer.Components;

import practice.businessLogic.FeatureChecker;

/**
 * Enumeration representing different types of speakers.
 */
public enum Speaker implements FeatureChecker {
     Bose_Companion_2("Bose Companion 2", "Bose", "black", 6699),
     Logitech_Z623("Logitech Z623", "Logitech", "black", 6666),
     Creative_Pebble("Creative Pebble", "Creative", "white", 1450),
     JBL_Flip_5("JBL Flip 5", "JBL", "blue", 3000),
     Harman_Kardon_Onyx_Studio("Harman Kardon Onyx Studio", "Harman Kardon", "black", 13694);

     private String name;
     private String brand;
     private String color;
     private int cost;

     /**
      * Constructs a Speaker object with the specified attributes.
      * @param name the name of the speaker
      * @param brand the brand of the speaker
      * @param color the color of the speaker
      * @param cost the cost of the speaker
      */
     Speaker(String name, String brand, String color, int cost) {
          this.name = name;
          this.brand = brand;
          this.color = color;
          this.cost = cost;
     }

     /**
      * Retrieves the name of the speaker.
      * @return the name of the speaker
      */
     public String getName() {
          return name;
     }

     /**
      * Retrieves the brand of the speaker.
      * @return the brand of the speaker
      */
     public String getBrand() {
          return brand;
     }

     /**
      * Retrieves the color of the speaker.
      * @return the color of the speaker
      */
     public String getColor() {
          return color;
     }

     /**
      * Retrieves the cost of the speaker.
      * @return the cost of the speaker
      */
     public int getCost() {
          return cost;
     }

     /**
      * Retrieves all features of the speaker.
      * @return a string representing all features of the speaker
      */
     public String getAllFeatures() {
          return "Speaker Name: " + name +
                  ", Brand: " + brand +
                  ", Color: " + color +
                  ", Cost: " + cost + "₴";
     }
}
