import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        String fileName = "ender.txt";

        Path filePath = Paths.get(fileName);
        List<String> lines = Files.readAllLines(filePath);
    }
}
