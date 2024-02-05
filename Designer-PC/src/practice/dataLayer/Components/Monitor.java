package practice.dataLayer.Components;

import practice.businessLogic.FeatureChecker;

/**
 * Enumeration representing different types of monitors.
 */
public enum Monitor implements FeatureChecker {
     ASUS_TUF_GAMING("ASUS TUF Gaming", "ASUS", "27-inch", "1920x1080", 5600),
     DELL_UltraSharp("DELL UltraSharp", "DELL", "24-inch", "2560x1440", 25000),
     LG_UltraGear("LG UltraGear", "LG", "32-inch", "3840x2160", 15600),
     HP_Pavilion("HP Pavilion", "HP", "27-inch", "1920x1080", 6000),
     Acer_Predator("Acer Predator", "Acer", "35-inch", "3440x1440", 50000);

     private String name;
     private String brand;
     private String size;
     private String resolution;
     private int cost;

     /**
      * Constructs a Monitor object with the specified attributes.
      * @param name the name of the monitor
      * @param brand the brand of the monitor
      * @param size the size of the monitor
      * @param resolution the resolution of the monitor
      * @param cost the cost of the monitor
      */
     Monitor(String name, String brand, String size, String resolution, int cost) {
          this.name = name;
          this.brand = brand;
          this.size = size;
          this.resolution = resolution;
          this.cost = cost;
     }

     /**
      * Retrieves the name of the monitor.
      * @return the name of the monitor
      */
     public String getName() {
          return name;
     }

     /**
      * Retrieves the brand of the monitor.
      * @return the brand of the monitor
      */
     public String getBrand() {
          return brand;
     }

     /**
      * Retrieves the size of the monitor.
      * @return the size of the monitor
      */
     public String getSize() {
          return size;
     }

     /**
      * Retrieves the resolution of the monitor.
      * @return the resolution of the monitor
      */
     public String getResolution() {
          return resolution;
     }

     /**
      * Retrieves the cost of the monitor.
      * @return the cost of the monitor
      */
     public int getCost() {
          return cost;
     }

     /**
      * Retrieves all features of the monitor.
      * @return a string representing all features of the monitor
      */
     public String getAllFeatures() {
          return "Monitor Name: " + name +
                  ", Brand: " + brand +
                  ", Size: " + size +
                  ", Resolution: " + resolution +
                  ", Cost: " + cost + "₴";
     }
}
