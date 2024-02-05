package practice.dataLayer.сoreComponents;

import practice.businessLogic.FeatureChecker;

/**
 * Enumeration representing different types of graphics cards.
 */
public enum GraphicsCard implements FeatureChecker {
     NVIDIA_GEFORCE_RTX_3090("NVIDIA GEFORCE RTX 3090", "NVIDIA", "GeForce RTX 3090", "24 GB GDDR6X", 1695, 3500),
     AMD_RADEON_RX_6900_XT("AMD RADEON RX 6900 XT", "AMD", "Radeon RX 6900 XT", "16 GB GDDR6", 2015, 12000),
     ASUS_ROG_STRIX_GTX_1660_TI("ASUS ROG STRIX GTX 1660 TI", "ASUS", "ROG Strix GTX 1660 Ti", "6 GB GDDR6", 1500, 3500),
     MSI_GAMING_X_TRIO_RTX_3080("MSI GAMING X TRIO RTX 3080", "MSI", "Gaming X Trio RTX 3080", "10 GB GDDR6X", 1710, 8000),
     GIGABYTE_AORUS_RX_5700_XT("GIGABYTE AORUS RX 5700 XT", "GIGABYTE", "AORUS RX 5700 XT", "8 GB GDDR6", 1905, 4500);

     private String name;
     private String brand;
     private String model;
     private String memory;
     private int baseClock;
     private int cost;

     /**
      * Constructs a GraphicsCard object with the specified attributes.
      * @param name the name of the graphics card
      * @param brand the brand of the graphics card
      * @param model the model of the graphics card
      * @param memory the memory of the graphics card
      * @param baseClock the base clock of the graphics card
      * @param cost the cost of the graphics card
      */
     GraphicsCard(String name, String brand, String model, String memory, int baseClock, int cost) {
          this.name = name;
          this.brand = brand;
          this.model = model;
          this.memory = memory;
          this.baseClock = baseClock;
          this.cost = cost;
     }

     /**
      * Retrieves the name of the graphics card.
      * @return the name of the graphics card
      */
     public String getName() {
          return name;
     }

     /**
      * Retrieves the brand of the graphics card.
      * @return the brand of the graphics card
      */
     public String getBrand() {
          return brand;
     }

     /**
      * Retrieves the model of the graphics card.
      * @return the model of the graphics card
      */
     public String getModel() {
          return model;
     }

     /**
      * Retrieves the memory of the graphics card.
      * @return the memory of the graphics card
      */
     public String getMemory() {
          return memory;
     }

     /**
      * Retrieves the base clock of the graphics card.
      * @return the base clock of the graphics card
      */
     public int getBaseClock() {
          return baseClock;
     }

     /**
      * Retrieves the cost of the graphics card.
      * @return the cost of the graphics card
      */
     public int getCost() {
          return cost;
     }

     /**
      * Retrieves all features of the graphics card.
      * @return a string representing all features of the graphics card
      */
     public String getAllFeatures() {
          return "Brand: " + brand +
                  ", Model: " + model +
                  ", Memory: " + memory +
                  ", Base Clock: " + baseClock + " MHz" +
                  ", Cost: " + cost + "₴";
     }
}
