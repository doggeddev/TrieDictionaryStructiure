import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by richd_000 on 2/12/2017.
 */
public class TrieTester {

	public static void main(String[] args) {
		TrieDictionary dict = new TrieDictionary();

		try {
			readFileIntoTrie(dict);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}


	private static void readFileIntoTrie(TrieDictionary td) throws FileNotFoundException {
		Scanner inputFile = new Scanner(new FileReader("english_words100k.txt"));
		while (inputFile.hasNext()) {
			String word = inputFile.nextLine();
			if (word.length() < 3 && inputFile.hasNext())
				word = inputFile.nextLine();
			td.insert(word);
		}
		inputFile.close();


	}

}
