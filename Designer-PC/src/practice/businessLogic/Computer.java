package practice.businessLogic;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a computer object with various components.
 */
public class Computer {
    @JsonProperty("keyBoard")
    private String keyBoard;

    @JsonProperty("mouse")
    private String mouse;

    @JsonProperty("monitor")
    private String monitor;

    @JsonProperty("lighting")
    private String lighting;

    @JsonProperty("speaker")
    private String speaker;

    @JsonProperty("CPU")
    private String CPU;

    @JsonProperty("graphicsCard")
    private String graphicsCard;

    @JsonProperty("hardDrive")
    private String hardDrive;

    @JsonProperty("motherBoard")
    private String motherBoard;

    @JsonProperty("RAM")
    private String RAM;

    @JsonProperty("powerSupply")
    private String powerSupply;

    /**
     * Default constructor required for Jackson ObjectMapper.
     */
    public Computer() {
    }

    /**
     * Constructs a computer object using a builder pattern.
     *
     * @param computerBuilder the computer builder to construct the computer object
     */
    public Computer(ComputerBuilder computerBuilder) {
        this.keyBoard = computerBuilder.getKeyBoard();
        this.mouse = computerBuilder.getMouse();
        this.monitor = computerBuilder.getMonitor();
        this.lighting = computerBuilder.getLighting();
        this.speaker = computerBuilder.getSpeaker();
        this.CPU = computerBuilder.getCPU();
        this.graphicsCard = computerBuilder.getGraphicsCard();
        this.hardDrive = computerBuilder.getHardDrive();
        this.motherBoard = computerBuilder.getMotherBoard();
        this.RAM = computerBuilder.getRAM();
        this.powerSupply = computerBuilder.getPowerSupply();
    }

    /**
     * Returns a string representation of the computer object.
     *
     * @return a string containing the details of the computer components
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CPU: ").append(CPU).append("\nGraphics Card: ").append(graphicsCard).append("\nHard Drive: ").append(hardDrive)
                .append("\nMotherboard: ").append(motherBoard).append("\nRAM: ").append(RAM).append("\nPowerSupply: ").append(powerSupply);

        if (keyBoard != null) {
            sb.append("\nKeyboard: ").append(keyBoard);
        }
        if (mouse != null) {
            sb.append("\nMouse: ").append(mouse);
        }
        if (monitor != null) {
            sb.append("\nMonitor: ").append(monitor);
        }
        if (speaker != null) {
            sb.append("\nSpeaker: ").append(speaker);
        }
        if (lighting != null) {
            sb.append("\nLighting: ").append(lighting);
        }

        return sb.toString();
    }
}
