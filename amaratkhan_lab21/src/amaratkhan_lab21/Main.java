package amaratkhan_lab21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		Stream<String> l = Files.lines(Paths.get("lambtest.txt"));
		int result = l.mapToInt((String x) -> x.length())
		 .reduce(0,(a,b) -> a+b);
		System.out.println(result);
	}

}
