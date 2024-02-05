package practice.dataLayer.сoreComponents;

import practice.businessLogic.FeatureChecker;

/**
 * Enumeration representing different types of CPUs (Central Processing Units).
 */
public enum CPU implements FeatureChecker {
     INTEL("Intel", "Core i9", "3.6 GHz", 8, 16, 25000),
     RYZEN("Ryzen", "Ryzen 9 5950X", "4.9 GHz", 16, 32, 20000),
     ARM("ARM", "Cortex-A76", "2.8 GHz", 8, 8, 16000),
     APPLE_M1("Apple M1", "M1", "3.2 GHz", 8, 8, 6000),
     QUALCOMM("Qualcomm", "Snapdragon 888", "2.84 GHz", 8, 24, 5900),
     IBM_POWER("IBM Power", "POWER9", "3.8 GHz", 12, 24, 800),
     NVIDIA_TEGRA("NVIDIA Tegra", "X1", "1.9 GHz", 4, 4, 15000);

     private String name;
     private String model;
     private String clockSpeed;
     private int cores;
     private int threads;
     private int cost;

     /**
      * Constructs a CPU object with the specified attributes.
      * @param name the name of the CPU manufacturer
      * @param model the model of the CPU
      * @param clockSpeed the clock speed of the CPU
      * @param cores the number of CPU cores
      * @param threads the number of CPU threads
      * @param cost the cost of the CPU
      */
     CPU(String name, String model, String clockSpeed, int cores, int threads, int cost) {
          this.name = name;
          this.model = model;
          this.clockSpeed = clockSpeed;
          this.cores = cores;
          this.threads = threads;
          this.cost = cost;
     }

     /**
      * Retrieves the name of the CPU manufacturer.
      * @return the name of the CPU manufacturer
      */
     public String getName() {
          return name;
     }

     /**
      * Retrieves the model of the CPU.
      * @return the model of the CPU
      */
     public String getModel() {
          return model;
     }

     /**
      * Retrieves the clock speed of the CPU.
      * @return the clock speed of the CPU
      */
     public String getClockSpeed() {
          return clockSpeed;
     }

     /**
      * Retrieves the number of CPU cores.
      * @return the number of CPU cores
      */
     public int getCores() {
          return cores;
     }

     /**
      * Retrieves the number of CPU threads.
      * @return the number of CPU threads
      */
     public int getThreads() {
          return threads;
     }

     /**
      * Retrieves the cost of the CPU.
      * @return the cost of the CPU
      */
     public int getCost() {
          return cost;
     }

     /**
      * Retrieves all features of the CPU.
      * @return a string representing all features of the CPU
      */
     public String getAllFeatures() {
          return "CPU Name: " + name +
                  ", Model: " + model +
                  ", Clock Speed: " + clockSpeed +
                  ", Cores: " + cores +
                  ", Threads: " + threads +
                  ", Cost: " + cost + "₴";
     }
}
