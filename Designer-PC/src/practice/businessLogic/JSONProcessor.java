package practice.businessLogic;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

/**
 * A class for processing JSON files related to computer components.
 */
public class JSONProcessor {

    /**
     * Loads computer components from a JSON file.
     * @param filePath the path to the JSON file
     * @return a Computer object representing the loaded components
     */
    public static Computer loadComponentsFromJson(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(filePath), Computer.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Saves computer components to a JSON file.
     * @param computer the Computer object containing components to be saved
     */
    public static void saveComponentsToJson(Computer computer) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String dataFolderPath = "Data/";
            File dataFolder = new File(dataFolderPath);
            if (!dataFolder.exists()) {
                dataFolder.mkdirs();
            }
            objectMapper.writeValue(new File(dataFolderPath + "components.json"), computer);
            System.out.println("Selected components saved to file Data/components.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
