import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Donor> donors = new ArrayList<>();
        ArrayList<Campaign> campaigns = new ArrayList<>();
        ArrayList<Donation> donations = new ArrayList<>();
        ArrayList<String[]> commands;
        Reader reader = new Reader();
        if(args.length == 1){
            String filePath = args[0];
            commands = reader.readFile(filePath);
        } else {
            commands = reader.readSTDIN();
        }
        Processor processor = new Processor();
        processor.process(commands, donors, campaigns, donations);
        Logger logger = new Logger();
        logger.log(donors, campaigns, donations);
    }
}