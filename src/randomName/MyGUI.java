package randomName;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyGUI extends Application {

	@FXML
	private Stage theStage;
	@FXML
	private Scene scene1, scene2, scene3, scene4, scene5, scene6, scene7, scene8, scene9;

	@FXML
	private Button buttonBack, buttonLevel1, buttonLevel4, buttonLevel7, buttonLevel10, buttonLevel13, buttonLevel16,
			buttonLevel20;

	//@FXML
	//private AnchorPane GuiAnchor, AsdasdAnchor;

	/*@FXML
	private ListView<String> heroNames;
	ObservableList<String> names = FXCollections.observableArrayList("Abathur", "Alarak", "Anub'arak", "Artanis",
			"Arthas", "Auriel", "Azmodan", "Brightwing", "Chen", "Cho", "Chromie", "Dehaka", "Diablo", "E.T.C.",
			"Falstad", "Gall", "Gazlowe", "Greymane", "Gul'Dan", "Illidan", "Jaina", "Johanna", "Kael'thas", "Kerrigan",
			"Kharazim", "Leoric", "Li Li", "Li-Ming", "Lt. Morales", "Lunara", "Malfurion", "Medivh", "Muradin",
			"Murky", "Nazeboo", "Nova", "Raynor", "Reghar", "Rexxar", "Sgt. Hammer", "Sonya", "Stitches", "Sylvanas",
			"Tassadar", "The Butcher", "The Lost Vikings", "Thrall", "Tracer", "Tychus", "Tyrael", "Tyrande", "Uther",
			"Valla", "Xul", "Zagara", "Zarya", "Zeratul"); */

	@FXML
	ObservableList<String> buttons = FXCollections.observableArrayList("button00", "button01", "button02", "button03",
			"button04", "button05", "button06", "button07", "button08", "button10", "button11", "button12", "button13",
			"button14", "button15", "button16", "button17", "button18", "button20", "button21", "button22", "button23",
			"button24", "button25", "button26", "button27", "button28", "button30", "button31", "button32", "button33",
			"button34", "button35", "button36", "button37", "button38", "button40", "button41", "button42", "button43",
			"button44", "button45", "button46", "button47", "button48", "button50", "button51", "button52", "button53",
			"button54", "button55", "button56", "button57", "button58", "button60", "button61", "button62", "button63",
			"button64", "button65", "button66", "button67", "button68");

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("HotS_UI.fxml"));
		scene1 = new Scene(root, 900, 700);

		System.out.println("asd"); // I NEED FOR BECAUSE OF REASONS FFS

		stage.setScene(scene1);
		stage.setResizable(false);
		stage.show();

	} // mouseTransparent="true" for SplitPane

	public void ButtonClicked(ActionEvent e) throws Exception {	//TODO: fixIDs for everything, + create the FXML files
		// From the default UI to the Abilities
		if (buttons.contains(((Button) e.getSource()).getId())) {
			System.out.print("Currently in Abilities_UI with " + ((Button) e.getSource()).getId() + "\n");
			WindowInit(scene2, e, "Abilities_UI.fxml");

			// To Level 1 Talents
		} else if (e.getSource() == buttonLevel1) {
			System.out.print("Currently in Level 1 with " + ((Button) e.getSource()).getId() + "\n");
			WindowInit(scene3, e, "Level1_UI.fxml");

			// To Level 4 Talents
		} else if (e.getSource() == buttonLevel4) {
			System.out.print("Currently in Level 4 with " + ((Button) e.getSource()).getId() + "\n");
			WindowInit(scene4, e, "Level4_UI.fxml");

			// To Level 7 Talents
		} else if (e.getSource() == buttonLevel7) {
			System.out.print("Currently in Level 7 with " + ((Button) e.getSource()).getId() + "\n");
			WindowInit(scene5, e, "Level7_UI.fxml");

			// To Level 10 Talents
		} else if (e.getSource() == buttonLevel10) {
			System.out.print("Currently in Level 10 with " + ((Button) e.getSource()).getId() + "\n");
			WindowInit(scene6, e, "Level10_UI.fxml");

			// To Level 13 Talents
		} else if (e.getSource() == buttonLevel13) {
			System.out.print("Currently in Level 13 with " + ((Button) e.getSource()).getId() + "\n");
			WindowInit(scene7, e, "Level13_UI.fxml");

			// To Level 16 Talents
		} else if (e.getSource() == buttonLevel16) {
			System.out.print("Currently in Level 16 with " + ((Button) e.getSource()).getId() + "\n");
			WindowInit(scene8, e, "Level16_UI.fxml");

			// To Level 20 Talents
		} else if (e.getSource() == buttonLevel20) {
			System.out.print("Currently in Level 20 with " + ((Button) e.getSource()).getId() + "\n");
			WindowInit(scene9, e, "Level20_UI.fxml");

			// Back to Default UI
		} else if (e.getSource() == buttonBack) {
			System.out.print("Currently in HotS_UI with " + ((Button) e.getSource()).getId() + "\n");
			WindowInit(scene1, e, "HotS_UI.fxml");
		}
	}

	public void startThisShit(String[] args) {
		Application.launch(args);
	}
	
	public void WindowInit(Scene newscene, ActionEvent e, String newWindow) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource(newWindow));
			newscene = new Scene(root, 900, 700);
			Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			app_stage.setScene(newscene);
			
		} catch (IOException exception) {
			System.out.println("ERROR IN WindowInit!!!!!");
			exception.printStackTrace();
		}
	}
}
