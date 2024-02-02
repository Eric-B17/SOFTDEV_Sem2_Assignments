import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String fileName = "src/ender.txt";

        Path filePath = Paths.get(fileName);
        List<String> lines = Files.readAllLines(filePath);

        for(var line : lines){
            System.out.println(line);
        }
        
    }
}
