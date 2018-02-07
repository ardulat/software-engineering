import org.apache.commons.cli.*;

public class Main {

	public static void main(String[] args) {
		// create Options object
		Options options = new Options();

		options.addOption("help", false, "displays help");
		options.addOption("filename", true, "add filename");
		options.addOption("width", true, "add width");
		
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd = parser.parse( options, args);
	}

}
