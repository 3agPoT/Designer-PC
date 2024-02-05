package practice.dataLayer.сoreComponents;

import practice.businessLogic.FeatureChecker;

/**
 * Enumeration representing different types of RAM (Random Access Memory).
 */
public enum RAM implements FeatureChecker {
     CORSAIR_VENGEANCE("Corsair", "Vengeance", "DDR4", "32GB", 3200, 150, 6500),
     KINGSTON_HYPERX("Kingston", "HyperX", "DDR4", "16GB", 3600, 80, 2000),
     CRUCIAL_BALLISTIX("Crucial", "Ballistix", "DDR4", "32GB", 3000, 120, 2700),
     G_SKILL_RIPJAWS("G.Skill", "Ripjaws", "DDR4", "64GB", 3600, 200, 3900),
     SAMSUNG_DDR4("Samsung", "DDR4", "DDR4", "8GB", 2400, 50, 4500),
     HYNIX_SODIMM("Hynix", "SODIMM", "DDR4", "16GB", 2666, 70, 8900);

     private String name;
     private String brand;
     private String series;
     private String type;
     private int capacity;
     private int speed;
     private int cost;

     /**
      * Constructs a RAM object with the specified attributes.
      *
      * @param name     the name of the RAM
      * @param brand    the brand of the RAM
      * @param series   the series of the RAM
      * @param type     the type of the RAM
      * @param capacity the capacity of the RAM
      * @param speed    the speed of the RAM
      * @param cost     the cost of the RAM
      */
     RAM(String name, String brand, String series, String type, int capacity, int speed, int cost) {
          this.name = name;
          this.brand = brand;
          this.series = series;
          this.type = type;
          this.capacity = capacity;
          this.speed = speed;
          this.cost = cost;
     }

     public String getName() {
          return name;
     }

     public String getBrand() {
          return brand;
     }

     public String getSeries() {
          return series;
     }

     public String getType() {
          return type;
     }

     public int getCapacity() {
          return capacity;
     }

     public int getSpeed() {
          return speed;
     }

     public int getCost() {
          return cost;
     }

     /**
      * Retrieves all features of the RAM.
      *
      * @return a string representing all features of the RAM
      */
     public String getAllFeatures() {
          return "Brand: " + brand +
                  ", Series: " + series +
                  ", Type: " + type +
                  ", Capacity: " + capacity +
                  ", Speed: " + speed + " MHz" +
                  ", Cost: " + cost + "₴";
     }
}
