package practice.dataLayer.Components;

import practice.businessLogic.FeatureChecker;

/**
 * Enumeration representing different types of lighting.
 */
public enum Lighting implements FeatureChecker {
     Philips_Hue("Philips Hue", "Philips", "white", 800),
     Nanoleaf_LightPanels("Nanoleaf LightPanels", "Nanoleaf", "multicolor", 4700),
     LIFX_A19("LIFX A19", "LIFX", "multicolor", 1750),
     TP_Link_Kasa("TP Link Kasa", "TP-Link", "white", 2590),
     Govee_RGB_LightStrips("Govee RGB LightStrips", "Govee", "multicolor", 2500);

     private String name;
     private String brand;
     private String color;
     private int cost;

     /**
      * Constructs a Lighting object with the specified attributes.
      * @param name the name of the lighting
      * @param brand the brand of the lighting
      * @param color the color of the lighting
      * @param cost the cost of the lighting
      */
     Lighting(String name, String brand, String color, int cost) {
          this.name = name;
          this.brand = brand;
          this.color = color;
          this.cost = cost;
     }

     /**
      * Retrieves the name of the lighting.
      * @return the name of the lighting
      */
     public String getName() {
          return name;
     }

     /**
      * Sets the name of the lighting.
      * @param name the name to set
      * @return the modified Lighting object
      */
     public Lighting setName(String name) {
          this.name = name;
          return this;
     }

     /**
      * Retrieves the brand of the lighting.
      * @return the brand of the lighting
      */
     public String getBrand() {
          return brand;
     }

     /**
      * Sets the brand of the lighting.
      * @param brand the brand to set
      * @return the modified Lighting object
      */
     public Lighting setBrand(String brand) {
          this.brand = brand;
          return this;
     }

     /**
      * Retrieves the color of the lighting.
      * @return the color of the lighting
      */
     public String getColor() {
          return color;
     }

     /**
      * Sets the color of the lighting.
      * @param color the color to set
      * @return the modified Lighting object
      */
     public Lighting setColor(String color) {
          this.color = color;
          return this;
     }

     /**
      * Retrieves the cost of the lighting.
      * @return the cost of the lighting
      */
     public int getCost() {
          return cost;
     }

     /**
      * Sets the cost of the lighting.
      * @param cost the cost to set
      * @return the modified Lighting object
      */
     public Lighting setCost(int cost) {
          this.cost = cost;
          return this;
     }

     /**
      * Retrieves all features of the lighting.
      * @return a string representing all features of the lighting
      */
     public String getAllFeatures() {
          return "Lighting Name: " + name +
                  ", Brand: " + brand +
                  ", Color: " + color +
                  ", Cost: " + cost + "₴";
     }
}
