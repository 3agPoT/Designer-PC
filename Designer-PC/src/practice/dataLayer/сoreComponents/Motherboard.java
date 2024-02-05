package practice.dataLayer.сoreComponents;

import practice.businessLogic.FeatureChecker;

/**
 * Enumeration representing different types of motherboards.
 */
public enum Motherboard implements FeatureChecker {
     ASUS_ROG_CROSSHAIR_VIII("ASUS", "ROG Crosshair VIII", "ATX", "AM4", 250, 2500),
     MSI_B450_TOMAHAWK("MSI", "B450 Tomahawk", "ATX", "AM4", 120, 7000),
     GIGABYTE_AORUS_X570("GIGABYTE", "AORUS X570", "ATX", "AM4", 200, 9500),
     ASROCK_B550_STEEL_LEGEND("ASRock", "B550 Steel Legend", "ATX", "AM4", 130, 2500),
     MSI_MAG_B560M("MSI", "MAG B560M", "Micro-ATX", "LGA 1200", 90, 5500),
     ASUS_PRIME_H410M("ASUS", "PRIME H410M", "Micro-ATX", "LGA 1200", 70, 7500);

     private String name;
     private String brand;
     private String model;
     private String formFactor;
     private int socket;
     private int cost;

     /**
      * Constructs a Motherboard object with the specified attributes.
      *
      * @param name       the name of the motherboard
      * @param brand      the brand of the motherboard
      * @param model      the model of the motherboard
      * @param formFactor the form factor of the motherboard
      * @param socket     the socket of the motherboard
      * @param cost       the cost of the motherboard
      */
     Motherboard(String name, String brand, String model, String formFactor, int socket, int cost) {
          this.name = name;
          this.brand = brand;
          this.model = model;
          this.formFactor = formFactor;
          this.socket = socket;
          this.cost = cost;
     }

     /**
      * Retrieves the name of the motherboard.
      *
      * @return the name of the motherboard
      */
     public String getName() {
          return name;
     }

     /**
      * Retrieves the brand of the motherboard.
      *
      * @return the brand of the motherboard
      */
     public String getBrand() {
          return brand;
     }

     /**
      * Retrieves the model of the motherboard.
      *
      * @return the model of the motherboard
      */
     public String getModel() {
          return model;
     }

     /**
      * Retrieves the form factor of the motherboard.
      *
      * @return the form factor of the motherboard
      */
     public String getFormFactor() {
          return formFactor;
     }

     /**
      * Retrieves the socket of the motherboard.
      *
      * @return the socket of the motherboard
      */
     public int getSocket() {
          return socket;
     }

     /**
      * Retrieves the cost of the motherboard.
      *
      * @return the cost of the motherboard
      */
     public int getCost() {
          return cost;
     }

     /**
      * Retrieves all features of the motherboard.
      *
      * @return a string representing all features of the motherboard
      */
     public String getAllFeatures() {
          return "Brand: " + brand +
                  ", Model: " + model +
                  ", Form Factor: " + formFactor +
                  ", Socket: " + socket +
                  ", Cost: " + cost + "₴";
     }
}
