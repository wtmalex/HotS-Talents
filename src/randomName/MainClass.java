package randomName;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {

	public void readAndStore(String heroName) {
		String test = "TXT\\" + heroName + ".txt";
		System.out.println(test);

		Hero hero = new Hero(); // Creating new Hero object

		try {
			File myFile = new File(test);
			FileReader fileReader = new FileReader(myFile);
			BufferedReader reader = new BufferedReader(fileReader); // "Connecting"
																	// to the
																	// TXT file

			while (true) { // Read X lines, store it in line, and set to Hero
							// object

				String line = "Stats:\n";
				for (int i = 0; i < 7; i++) {
					line += reader.readLine() + "\n";
				}
				hero.setStats(line);

				line = "Abilities:\n";
				for (int i = 0; i < 6; i++) {
					line += reader.readLine() + "\n";
				}
				hero.setAbilities(line);

				line = "Level 1:\n";
				for (int i = 0; i < 4; i++) {
					line += reader.readLine() + "\n";
				}
				hero.setLevel_1_talents(line);

				line = "Level 4:\n";
				for (int i = 0; i < 4; i++) {
					line += reader.readLine() + "\n";
				}
				hero.setLevel_4_talents(line);

				line = "Level 7:\n";
				for (int i = 0; i < 4; i++) {
					line += reader.readLine() + "\n";
				}
				hero.setLevel_7_talents(line);

				line = "Level 10:\n";
				for (int i = 0; i < 2; i++) {
					line += reader.readLine() + "\n";
				}
				hero.setLevel_10_talents(line);

				line = "Level 13:\n";
				for (int i = 0; i < 4; i++) {
					line += reader.readLine() + "\n";
				}
				hero.setLevel_13_talents(line);

				line = "Level 16:\n";
				for (int i = 0; i < 4; i++) {
					line += reader.readLine() + "\n";
				}
				hero.setLevel_16_talents(line);

				line = "Level 20:\n";
				for (int i = 0; i < 4; i++) {
					line += reader.readLine() + "\n";
				}
				hero.setLevel_20_talents(line);

				line = "Extra:\n";
				for (int i = 0; i < 3; i++) {
					line += reader.readLine() + "\n";
				}
				hero.setExtra(line);

				reader.close();
				break;
			}
		} catch (Exception e) {
			System.out.println("RIP FAGIT");
			e.printStackTrace();
		}
		System.out.println(hero.getStats());
		// one.append(hero.getStats());
		System.out.println(hero.getAbilities());
		System.out.println(hero.getLevel_1_talents());
		System.out.println(hero.getLevel_4_talents());
		System.out.println(hero.getLevel_7_talents());
		System.out.println(hero.getLevel_10_talents());
		System.out.println(hero.getLevel_13_talents());
		System.out.println(hero.getLevel_16_talents());
		System.out.println(hero.getLevel_20_talents());
		System.out.println(hero.getExtra()); // TODO:if-et rakni ide, hogy az
												// Extra n�lk�li hero ne
												// adjon null-t
	}

	public String readTestText(String heroName) {
		String test = "TXT\\" + heroName + ".txt";
		System.out.println(test);
		String line = null;

		Hero hero = new Hero(); // Creating new Hero object
		StringBuffer stringBuffer = new StringBuffer();

		try {
			File myFile = new File(test);
			FileReader fileReader = new FileReader(myFile);
			BufferedReader reader = new BufferedReader(fileReader); 
			 
			  while((line=reader.readLine())!=null){
			 
			   stringBuffer.append(line).append("\n");
			  }
			   
			  //System.out.println(stringBuffer);
		} catch (Exception e) {
			System.out.println("RIP FAGIT");
			e.printStackTrace();
		}
		line = stringBuffer.toString();
		return line;
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Hots_UI.fxml"));
		System.out.println("asd"); // I NEED FOR BECAUSE OF REASONS FFS THIS
									// DOESNT MAKE ANY SENSE
		//readTestText();
		stage.setTitle("FXML Welcome");
		stage.setScene(new Scene(root, 800, 600));
		stage.setResizable(false);
		stage.show();

	}
}
