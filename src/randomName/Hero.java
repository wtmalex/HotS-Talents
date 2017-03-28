package randomName;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class Hero {
	
	private String stats;
	private String abilities;
	private String extra;
	private String level_1_talents;
	private String level_4_talents;
	private String level_7_talents;
	private String level_10_talents;
	private String level_13_talents;
	private String level_16_talents;
	private String level_20_talents;
	
	private FileInputStream inputStream;
	
	public Hero() {
	}
	
	public String getStats() {
		return stats;
	}
	
	public String getAbilities() {
		return abilities;
	}

	public String getExtra() {
		return extra;
	}

	public String getLevel_1_talents() {
		return level_1_talents;
	}

	public String getLevel_4_talents() {
		return level_4_talents;
	}

	public String getLevel_7_talents() {
		return level_7_talents;
	}

	public String getLevel_10_talents() {
		return level_10_talents;
	}

	public String getLevel_13_talents() {
		return level_13_talents;
	}

	public String getLevel_16_talents() {
		return level_16_talents;
	}

	public String getLevel_20_talents() {
		return level_20_talents;
	}

	public FileInputStream getInputStream() { 
		return inputStream;
	}	//TODO: why do I need this?

	public void setStats(String stats) {
		this.stats = stats;
	}
	
	public void setAbilities(String abilities) {
		this.abilities = abilities;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public void setLevel_1_talents(String level_1_talents) {
		this.level_1_talents = level_1_talents;
	}

	public void setLevel_4_talents(String level_4_talents) {
		this.level_4_talents = level_4_talents;
	}

	public void setLevel_7_talents(String level_7_talents) {
		this.level_7_talents = level_7_talents;
	}

	public void setLevel_10_talents(String level_10_talents) {
		this.level_10_talents = level_10_talents;
	}

	public void setLevel_13_talents(String level_13_talents) {
		this.level_13_talents = level_13_talents;
	}

	public void setLevel_16_talents(String level_16_talents) {
		this.level_16_talents = level_16_talents;
	}

	public void setLevel_20_talents(String level_20_talents) {
		this.level_20_talents = level_20_talents;
	}

	public void setInputStream(FileInputStream inputStream) { 
		this.inputStream = inputStream;
	}	//TODO: why do I need this?
	
	private void readAndStore(String heroName) {
		String test = "TXT\\" + heroName + ".txt";
		System.out.println(test);

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
				stats = line;

				line = "Abilities:\n";
				for (int i = 0; i < 6; i++) {
					line += reader.readLine() + "\n";
				}
				abilities =line;

				line = "Level 1:\n";
				for (int i = 0; i < 4; i++) {
					line += reader.readLine() + "\n";
				}
				level_1_talents = line;

				line = "Level 4:\n";
				for (int i = 0; i < 4; i++) {
					line += reader.readLine() + "\n";
				}
				level_4_talents = line;

				line = "Level 7:\n";
				for (int i = 0; i < 4; i++) {
					line += reader.readLine() + "\n";
				}
				level_4_talents = line;

				line = "Level 10:\n";
				for (int i = 0; i < 2; i++) {
					line += reader.readLine() + "\n";
				}
				level_4_talents = line;

				line = "Level 13:\n";
				for (int i = 0; i < 4; i++) {
					line += reader.readLine() + "\n";
				}
				level_4_talents = line;

				line = "Level 16:\n";
				for (int i = 0; i < 4; i++) {
					line += reader.readLine() + "\n";
				}
				level_4_talents = line;

				line = "Level 20:\n";
				for (int i = 0; i < 4; i++) {
					line += reader.readLine() + "\n";
				}
				level_4_talents = line;

				line = "Extra:\n";
				for (int i = 0; i < 3; i++) {
					line += reader.readLine() + "\n";
				}
				extra = line;

				reader.close();
				break;
			}
		} catch (Exception e) {
			System.out.println("RIP FAGIT");
			e.printStackTrace();
		}
		System.out.println(stats);
		// one.append(hero.getStats());
		System.out.println(abilities);
		System.out.println(level_1_talents);
		System.out.println(level_4_talents);
		System.out.println(level_4_talents);
		System.out.println(level_4_talents);
		System.out.println(level_4_talents);
		System.out.println(level_4_talents);
		System.out.println(level_4_talents);
		System.out.println(extra); // TODO:if-et rakni ide (??????)
	}
	
}
