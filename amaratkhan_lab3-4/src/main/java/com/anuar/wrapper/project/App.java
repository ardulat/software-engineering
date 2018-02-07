package com.anuar.wrapper.project;

import java.io.BufferedReader;
import java.io.FileReader;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.text.WordUtils;

public class App 
{
    private static BufferedReader br;

	public static void main( String[] args )
    {
    		Options options = new Options();

		options.addOption("help", false, "displays help");
		options.addOption("filename", true, "add filename");
		options.addOption("width", true, "add width");
		
		CommandLineParser parser = new DefaultParser();
		try {
			CommandLine cmd = parser.parse(options, args);
			
			if(cmd.hasOption("help")) {
				// automatically generate the help statement
				HelpFormatter formatter = new HelpFormatter();
				formatter.printHelp( "wrapper", options );
			}
			
			if(cmd.hasOption("filename") && cmd.hasOption("width")) {
			    String filename = cmd.getOptionValue("filename");
			    Integer width = Integer.parseInt(cmd.getOptionValue("width"));
				System.out.println(cmd.getOptionValue("filename"));
			    System.out.println(cmd.getOptionValue("width"));
			    
			    br = new BufferedReader(new FileReader(filename));
			    
			    String sCurrentLine;
			    String text = "";
				while ((sCurrentLine = br.readLine()) != null) {
					text += sCurrentLine;
				}
				System.out.println(WordUtils.wrap(text, width));
				System.out.println("Number of words = " + wordCount(text).toString());
			}
			else {
				System.out.println("Please provide enough arguments.");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }

    public static Integer wordCount(String text) {
    		String[] words = text.split("\\s+");
		return words.length;
	}

}
