package practice.dataLayer.сoreComponents;

import practice.businessLogic.FeatureChecker;

/**
 * Enumeration representing different types of hard drives.
 */
public enum HardDrive implements FeatureChecker {
     SAMSUNG_970_EVO("SAMSUNG 970 EVO", "Samsung", "970 EVO", "NVMe SSD", 1000, 2200),
     WESTERN_DIGITAL_BLACK("WESTERN DIGITAL BLACK", "Western Digital", "Black", "HDD", 4000, 1500),
     SEAGATE_BARRACUDA("SEAGATE BARRACUDA", "Seagate", "Barracuda", "HDD", 2000, 1000),
     KINGSTON_A2000("KINGSTON A2000", "Kingston", "A2000", "NVMe SSD", 500, 800),
     CRUCIAL_MX500("CRUCIAL MX500", "Crucial", "MX500", "SATA SSD", 1000, 1200),
     TOSHIBA_P300("TOSHIBA P300", "Toshiba", "P300", "HDD", 3000, 900);

     private String name;
     private String brand;
     private String model;
     private String type;
     private int capacityGB;
     private int cost;

     /**
      * Constructs a HardDrive object with the specified attributes.
      * @param name the name of the hard drive
      * @param brand the brand of the hard drive
      * @param model the model of the hard drive
      * @param type the type of the hard drive
      * @param capacityGB the capacity of the hard drive in gigabytes
      * @param cost the cost of the hard drive
      */
     HardDrive(String name, String brand, String model, String type, int capacityGB, int cost) {
          this.name = name;
          this.brand = brand;
          this.model = model;
          this.type = type;
          this.capacityGB = capacityGB;
          this.cost = cost;
     }

     /**
      * Retrieves the name of the hard drive.
      * @return the name of the hard drive
      */
     public String getName() {
          return name;
     }

     /**
      * Retrieves the brand of the hard drive.
      * @return the brand of the hard drive
      */
     public String getBrand() {
          return brand;
     }

     /**
      * Retrieves the model of the hard drive.
      * @return the model of the hard drive
      */
     public String getModel() {
          return model;
     }

     /**
      * Retrieves the type of the hard drive.
      * @return the type of the hard drive
      */
     public String getType() {
          return type;
     }

     /**
      * Retrieves the capacity of the hard drive in gigabytes.
      * @return the capacity of the hard drive in gigabytes
      */
     public int getCapacityGB() {
          return capacityGB;
     }

     /**
      * Retrieves the cost of the hard drive.
      * @return the cost of the hard drive
      */
     public int getCost() {
          return cost;
     }

     /**
      * Retrieves all features of the hard drive.
      * @return a string representing all features of the hard drive
      */
     public String getAllFeatures() {
          return "Hard Drive Name: " + name +
                  ", Brand: " + brand +
                  ", Model: " + model +
                  ", Type: " + type +
                  ", Capacity: " + capacityGB + " GB" +
                  ", Cost: " + cost + "₴";
     }
}
