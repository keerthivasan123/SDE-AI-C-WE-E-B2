package FileHandlingDemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ConfigFileProcessor {

    public static void main(String[] args) {

        Path inputFile = Path.of("demo/config/config.txt");
        Path outputDir = Path.of("demo/output");
        Path outputFile = outputDir.resolve("output.txt");

        try {
            // Create output directory if it doesn't exist
            if (!Files.exists(outputDir)) {
                Files.createDirectories(outputDir);
            }

            // Read all lines from config file
            List<String> lines = Files.readAllLines(inputFile);

            StringBuilder result = new StringBuilder();
            result.append("Processed Configuration:\n");

            for (String line : lines) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split("=");
                    result.append("Key: ")
                            .append(parts[0])
                            .append(", Value: ")
                            .append(parts[1])
                            .append("\n");
                }
            }

            // Write results to output file
            Files.writeString(outputFile, result.toString());

            System.out.println("Configuration processed successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
