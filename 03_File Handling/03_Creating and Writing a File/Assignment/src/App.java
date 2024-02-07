import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String fileName = "src/starter.txt";
        String newFileName = "src/ender.txt";

        Path filePath = Paths.get(fileName);
        List<String> lines = Files.readAllLines(filePath);

        FileWriter fileWriter = new FileWriter(newFileName, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        for(var line : lines){      

        writer.append(line);
        writer.append("\n");
        }
        writer.close();

    }
}
