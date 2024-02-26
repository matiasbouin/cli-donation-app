import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Reader {
    public ArrayList<String[]> readSTDIN(){
        ArrayList<String[]> commands = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine())
        {
            String[] command = scanner.nextLine().split(" ");
            commands.add(command);
        }
        scanner.close();
        return commands;
    }
    public ArrayList<String[]> readFile(String filePath){
        ArrayList<String[]> commands = new ArrayList<>();
        try {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String command;
        while((command = reader.readLine()) != null){
            String[] arrayOfStrings = command.split(" ");
            commands.add(arrayOfStrings);
        }
        reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return commands;
    }
}
