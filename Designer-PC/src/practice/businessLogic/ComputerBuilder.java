package practice.businessLogic;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * The ComputerBuilder class is responsible for building a computer configuration.
 */
public class ComputerBuilder {
     private String keyBoard;
     private String mouse;
     private String monitor;
     private String lighting;
     private String speaker;
     private String CPU;
     private String graphicsCard;
     private String hardDrive;
     private String motherBoard;
     private String RAM;
     private String powerSupply;

     /**
      * Sets the power supply of the computer.
      *
      * @param powerSupply The power supply to be set.
      * @return The ComputerBuilder instance.
      */
     public ComputerBuilder setPowerSupply(String powerSupply) {
          this.powerSupply = powerSupply;
          return this;
     }

     /**
      * Gets the power supply of the computer.
      *
      * @return The power supply of the computer.
      */
     public String getPowerSupply() {
          return powerSupply;
     }

     /**
      * Sets the keyboard of the computer.
      *
      * @param keyBoard The keyboard to be set.
      * @return The ComputerBuilder instance.
      */
     public ComputerBuilder setKeyBoard(String keyBoard) {
          this.keyBoard = keyBoard;
          return this;
     }

     /**
      * Sets the mouse of the computer.
      *
      * @param mouse The mouse to be set.
      * @return The ComputerBuilder instance.
      */
     public ComputerBuilder setMouse(String mouse) {
          this.mouse = mouse;
          return this;
     }

     /**
      * Sets the monitor of the computer.
      *
      * @param monitor The monitor to be set.
      * @return The ComputerBuilder instance.
      */
     public ComputerBuilder setMonitor(String monitor) {
          this.monitor = monitor;
          return this;
     }

     /**
      * Sets the lighting of the computer.
      *
      * @param lighting The lighting to be set.
      * @return The ComputerBuilder instance.
      */
     public ComputerBuilder setLighting(String lighting) {
          this.lighting = lighting;
          return this;
     }

     /**
      * Sets the speaker of the computer.
      *
      * @param speaker The speaker to be set.
      * @return The ComputerBuilder instance.
      */
     public ComputerBuilder setSpeaker(String speaker) {
          this.speaker = speaker;
          return this;
     }

     /**
      * Sets the CPU of the computer.
      *
      * @param CPU The CPU to be set.
      * @return The ComputerBuilder instance.
      */
     public ComputerBuilder setCPU(String CPU) {
          this.CPU = CPU;
          return this;
     }

     /**
      * Sets the graphics card of the computer.
      *
      * @param graphicsCard The graphics card to be set.
      * @return The ComputerBuilder instance.
      */
     public ComputerBuilder setGraphicsCard(String graphicsCard) {
          this.graphicsCard = graphicsCard;
          return this;
     }

     /**
      * Sets the hard drive of the computer.
      *
      * @param hardDrive The hard drive to be set.
      * @return The ComputerBuilder instance.
      */
     public ComputerBuilder setHardDrive(String hardDrive) {
          this.hardDrive = hardDrive;
          return this;
     }

     /**
      * Sets the motherboard of the computer.
      *
      * @param motherBoard The motherboard to be set.
      * @return The ComputerBuilder instance.
      */
     public ComputerBuilder setMotherBoard(String motherBoard) {
          this.motherBoard = motherBoard;
          return this;
     }

     /**
      * Sets the RAM of the computer.
      *
      * @param RAM The RAM to be set.
      * @return The ComputerBuilder instance.
      */
     public ComputerBuilder setRAM(String RAM) {
          this.RAM = RAM;
          return this;
     }

     /**
      * Gets the keyboard of the computer.
      *
      * @return The keyboard of the computer.
      */
     public String getKeyBoard() {
          return keyBoard;
     }

     /**
      * Gets the mouse of the computer.
      *
      * @return The mouse of the computer.
      */
     public String getMouse() {
          return mouse;
     }

     /**
      * Gets the monitor of the computer.
      *
      * @return The monitor of the computer.
      */
     public String getMonitor() {
          return monitor;
     }

     /**
      * Gets the lighting of the computer.
      *
      * @return The lighting of the computer.
      */
     public String getLighting() {
          return lighting;
     }

     /**
      * Gets the speaker of the computer.
      *
      * @return The speaker of the computer.
      */
     public String getSpeaker() {
          return speaker;
     }

     /**
      * Gets the CPU of the computer.
      *
      * @return The CPU of the computer.
      */
     public String getCPU() {
          return CPU;
     }

     /**
      * Gets the graphics card of the computer.
      *
      * @return The graphics card of the computer.
      */
     public String getGraphicsCard() {
          return graphicsCard;
     }

     /**
      * Gets the hard drive of the computer.
      *
      * @return The hard drive of the computer.
      */
     public String getHardDrive() {
          return hardDrive;
     }

     /**
      * Gets the motherboard of the computer.
      *
      * @return The motherboard of the computer.
      */
     public String getMotherBoard() {
          return motherBoard;
     }

     /**
      * Gets the RAM of the computer.
      *
      * @return The RAM of the computer.
      */
     public String getRAM() {
          return RAM;
     }

     /**
      * Builds the computer configuration using the provided components.
      *
      * @return The Computer instance representing the built computer.
      */
     public Computer build() {
          return new Computer(this);
     }

     /**
      * Saves the selected components to a JSON file in the "Data" folder.
      */
     public void saveComponentsToJson() {
          ObjectMapper objectMapper = new ObjectMapper();
          try {
               // Path to the Data folder
               String dataFolderPath = "Data/";
               File dataFolder = new File(dataFolderPath);

               // Check if the Data folder exists. If not, create it.
               if (!dataFolder.exists()) {
                    dataFolder.mkdirs();
               }

               // Write the selected components to JSON in the Data folder
               objectMapper.writeValue(new File(dataFolderPath + "components.json"), this);
               System.out.println("Components saved to file Data/components.json");
          } catch (IOException e) {
               e.printStackTrace();
          }
     }
}
