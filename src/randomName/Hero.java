package randomName;

import java.io.FileInputStream;

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
	}

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
	}
	
}
