package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class first {
	public static void main(String[] args) throws FileNotFoundException {
		File key = new File("key.txt");
		File file = new File("singleSteam.txt");
		Scanner scannerFile = new Scanner(file);

		while(scannerFile.hasNextLine()) {
			Scanner scannerKey = new Scanner(key); //create scanner for key, new every time.
			scannerKey.nextLine(); //skip title.
			char decodedLetter = 0;
			String fileCharacters = scannerFile.nextLine();
			String keyCharacters;

			while(scannerKey.hasNext()) {
				keyCharacters = scannerKey.nextLine(); //reps new Line
				if(fileCharacters.equals(keyCharacters.substring(3,10))) {
					decodedLetter = keyCharacters.charAt(0);
					scannerKey.close();
					break;
				}
			}
			System.out.print(decodedLetter);

		}
		scannerFile.close();

	}
}
